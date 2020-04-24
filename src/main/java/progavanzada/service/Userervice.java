package progavanzada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Usuario;
import progavanzada.repository.UserRepository;

@Service
public class Userervice implements IUserService {
	@Autowired
	UserRepository users;
	@Override
	public void guadar(Usuario usuario) {
		// TODO Auto-generated method stub
		users.save(usuario);
	}

}
