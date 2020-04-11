package progavanzada.service;
import java.util.List;
import java.util.Optional;

import progavanzada.model.Persona;
public interface IPersonaService {
	void insertarPersona(Persona persona);
	List<Persona> ListarTodos();
	Optional buscarporId(int id);
	
}
