package progavanzada.service;

import java.util.List;

import progavanzada.model.Persona;

public interface IPersonaService {
	List<Persona> listarpersonas();
	Persona encontrarporId(int id);
	List<Persona> listarpornombre(String nombre);
	void guardar(Persona persona);
}
