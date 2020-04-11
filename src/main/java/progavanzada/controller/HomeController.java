package progavanzada.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import progavanzada.model.Estudiante;
import progavanzada.model.Persona;
import progavanzada.service.IPersonaService;



@Controller
public class HomeController {
	@Autowired
	private IPersonaService personas;
	@RequestMapping(value= "/home", method=RequestMethod.GET)
	public String HomePage(Model model) {
		List<Persona> estudiantes=personas.listarpersonas();

		model.addAttribute("estudiantes",estudiantes);
		return "home";
	}
	@RequestMapping(value="/insertarpersona")
	public String insertar() {
		return "insertarpersona";
	}
	@RequestMapping(value="/detalle")
	public String DatosProfe(Model modelo) {
		String nombre="Sebastian Zapata R";
		int edad=31;
		int salario=0;//:(
		modelo.addAttribute("nombre",nombre);
		modelo.addAttribute("edad",edad);
		modelo.addAttribute("salario", salario);
		return "detalle";
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Principal(Model model) {
		List<Persona> estudiantes=personas.listarpersonas();

		model.addAttribute("estudiantes",estudiantes);
		return "home";
	}
	@PostMapping(value="/guardar")
	public String guardar(@ModelAttribute Persona persona, BindingResult result, Model model)
	{
		
		personas.guardar(persona);
		List<Persona> estudiantes=personas.listarpersonas();

		model.addAttribute("estudiantes",estudiantes);
		return "home"; 
	}
	public static List<Estudiante> listaEstudiantes(){
		List<Estudiante> estudiantes=new ArrayList<Estudiante>();
		Estudiante e1=new Estudiante("Monica", "Castaneda", "Bogota",1);
		Estudiante e2=new Estudiante("Sebastian","Zapata","Bogota",10);
		Estudiante e3=new Estudiante("Santiago","Aya","No me acuerdo",2);
		Estudiante e4=new Estudiante("Dennis","Gonzalez","Bajo un puente",3);
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		estudiantes.add(e4);
		return estudiantes;
	}
}
