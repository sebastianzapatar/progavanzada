package progavanzada.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Persona;
import progavanzada.repository.PersonaRepository;
@Service
public class PersonaService implements IPersonaService {

	
	@Autowired
	private PersonaRepository repo;
	@Override
	public List<Persona> personalistar() {
		// TODO Auto-generated method stub
		List<Persona> w=repo.findAll();
		return w;
	}

	@Override
	public Persona encontrarId(int id) {
		// TODO Auto-generated method stub
		Persona k=repo.findById(id);
		return k;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public void guardar(Persona e) {
		// TODO Auto-generated method stub
		repo.save(e);

	}

	@Override
	public void actualizar(Persona e) {
		// TODO Auto-generated method stub
		repo.save(e);

	}

}
