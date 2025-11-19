package med.voll.api.infra;

import med.voll.api.domain.usuario.Usuario;
import med.voll.api.domain.usuario.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class UserInitializer {

    @Bean
    CommandLineRunner initUser(UsuarioRepository repository) {
        return args -> {

            String login = "ana.souza@voll.med";
            String senhaPura = "123456";
            var encoder = new BCryptPasswordEncoder();

            if (repository.findByLogin(login) == null) {
                String senhaCriptografada = encoder.encode(senhaPura);

                Usuario u = new Usuario(login, senhaCriptografada);
                repository.save(u);

                System.out.println("\n✅ Usuário inicial criado com sucesso!");
                System.out.println("➡ Login: " + login);
                System.out.println("➡ Senha: " + senhaPura);
            } else {
                System.out.println("\nℹ Usuário inicial já existe, nada a fazer.");
            }
        };
    }
}
