package progavanzada.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Persona;
import progavanzada.repository.PersonaRepository;


@Service
public class PersonaService implements IPersonaService {
	@Autowired
	private static PersonaRepository perso;
	@Override
	public void insertarPersona(Persona persona) {
		// TODO Auto-generated method stub
		perso.save(persona);
	}

	@Override
	public List<Persona> ListarTodos() {
		// TODO Auto-generated method stub
	
		return perso.findAll();
	}

	@Override
	public Optional buscarporId(int id) {
		// TODO Auto-generated method stub
		Optional<Persona> o=perso.findById(id);
		
		return o;
	}

}
