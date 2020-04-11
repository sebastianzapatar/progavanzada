package pruebasjpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import progavanzada.model.Persona;
import progavanzada.repository.PersonaRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("root-context.xml");
		Persona w=new Persona();
		w.setId(1);
		w.setNombre("Monica");
		w.setApellido("Castaneda Riascos");
		w.setTelefono("3148514223");
		PersonaRepository l=context.getBean("PersonaRepository",PersonaRepository.class);
		l.save(w);
		context.close();
	}

}
