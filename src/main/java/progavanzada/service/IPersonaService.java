package progavanzada.service;
import java.util.List;
import java.util.Optional;

import progavanzada.model.Persona;

import java.util.List;



public interface IPersonaService {
	List<Persona> personalistar();
	Persona encontrarId(int id);
	void eliminar(int id);
	void guardar(Persona e);
	void actualizar(Persona e);
}
