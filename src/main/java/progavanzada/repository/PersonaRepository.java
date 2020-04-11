package progavanzada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progavanzada.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
	Persona findById(int id);
	List<Persona> findByNombre(String nombre);
}
