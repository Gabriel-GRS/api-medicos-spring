package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;


// Criando vínculo no banco
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    
}
