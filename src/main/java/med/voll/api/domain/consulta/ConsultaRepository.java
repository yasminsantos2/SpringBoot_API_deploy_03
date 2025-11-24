package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    // Verifica se já existe consulta para esse médico na data/horário
    boolean existsByMedicoIdAndData(Long medicoId, LocalDateTime data);

    // Verifica se já existe consulta para esse paciente entre dois horários
    boolean existsByPacienteIdAndDataBetween(Long pacienteId,
                                             LocalDateTime primeiroHorario,
                                             LocalDateTime ultimoHorario);
}
