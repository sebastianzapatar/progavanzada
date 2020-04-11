package progavanzada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Persona;
import progavanzada.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {
	@Autowired
	PersonaRepository perso;
	@Override
	public List<Persona> listarpersonas() {
		// TODO Auto-generated method stub
		return perso.findAll();
	}

	@Override
	public Persona encontrarporId(int id) {
		// TODO Auto-generated method stub
		return perso.findById(id);
	}

	@Override
	public List<Persona> listarpornombre(String nombre) {
		// TODO Auto-generated method stub
		return perso.findByNombre(nombre);
	}

	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		perso.save(persona);
	}

}
