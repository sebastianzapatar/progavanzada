package progavanzada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progavanzada.model.Persona;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
