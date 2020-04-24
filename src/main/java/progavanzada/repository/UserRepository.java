package progavanzada.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progavanzada.model.Usuario;


@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {

}
