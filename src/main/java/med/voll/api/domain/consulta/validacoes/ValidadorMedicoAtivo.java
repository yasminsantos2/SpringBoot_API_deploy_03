package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private MedicoRepository repository;

    @Override
    public void validar(DadosAgendamentoConsulta dados) {

        // se não informou médico, não valida aqui (outro validador cuida disso)
        if (dados.idMedico() == null) {
            return;
        }

        Boolean medicoAtivo = repository.findAtivoById(dados.idMedico());

        // se for null ou false, consideramos inativo
        if (medicoAtivo == null || !medicoAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com médico inativo");
        }
    }
}
