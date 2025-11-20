package med.voll.api.infra.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import med.voll.api.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuarioRepository repository;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        var tokenJWT = recuperarToken(request);

        System.out.println("=== SECURITY FILTER ===");
        System.out.println("Rota: " + request.getMethod() + " " + request.getRequestURI());

        if (tokenJWT == null) {
            System.out.println("Nenhum token JWT foi enviado.");
        } else {
            System.out.println("Token recebido (JWT): " + tokenJWT);
            try {
                var subject = tokenService.getSubject(tokenJWT);
                System.out.println("Subject extraído do token: " + subject);

                var usuario = repository.findByLogin(subject);
                System.out.println("Usuário encontrado: " + (usuario != null ? usuario.getClass() : "null"));

                var authentication = new UsernamePasswordAuthenticationToken(
                        usuario, null, usuario.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            } catch (Exception e) {
                System.out.println("ERRO AO VALIDAR TOKEN: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }
        }

        filterChain.doFilter(request, response);
    }

    private String recuperarToken(HttpServletRequest request) {
        var authorizationHeader = request.getHeader("Authorization");
        System.out.println("Header Authorization: " + authorizationHeader);
        if (authorizationHeader != null) {
            return authorizationHeader.replace("Bearer ", "");
        }
        return null;
    }
}