package progavanzada.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HttpServletBean;

import progavanzada.model.Estudiante;
import progavanzada.model.Persona;
import progavanzada.model.Usuario;
import progavanzada.service.IPersonaService;
import progavanzada.service.IUserService;





@Controller
public class HomeController {
	@Autowired
	private IPersonaService personas;
	
	@Autowired
	private IUserService users1;
	
	
	/*@Autowired
	private BCryptPasswordEncoder encoder;*/
	@RequestMapping(value= "/home", method=RequestMethod.GET)
	public String HomePage(Model model) {
		List<Persona> estudiantes=personas.listarpersonas();

		model.addAttribute("estudiantes",estudiantes);
		return "home";
	}
	@RequestMapping(value="/insertarUsuario")
	public String insertarusuario() {
		return "formuser";
	}
	@PostMapping(value="/guardaru")
	public String guardaru(Model model, @RequestParam("id") int id, @RequestParam("username") 
	String username,	@RequestParam("password") String password, 
	@RequestParam("activo") int Activo)
	{
		
		Usuario k=new Usuario(id,username,password, Activo);
		//String pass=encoder.encode(password);
		//k.setPassword(pass);
		users1.guadar(k);
		System.out.println(k);
		List<Persona> estudiantes=personas.listarpersonas();
		model.addAttribute("estudiantes",estudiantes);
		return "home";
	}
	@GetMapping(value="/insertarpersona")
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
	public String guardar(Model model, @RequestParam("id") int id, @RequestParam("nombre") 
	String nombre,	@RequestParam("apellido") String apellido, 
	@RequestParam("telefono") int telefono, @RequestParam("imagen") MultipartFile multiPart, 
	HttpRequest request)
	{
		String nombreImagen="imagen.jpg";
		Persona w=new Persona(id,nombre,apellido,telefono,nombreImagen);
		personas.guardar(w);
		List<Persona> estudiantes=personas.listarpersonas();
		model.addAttribute("estudiantes",estudiantes);
		return "home";
	}
	@RequestMapping(value="eliminar/{id}")
	public String eliminar(@PathVariable("id") int id,Model model) {
		personas.eliminar(id);

		List<Persona> estudiantes=personas.listarpersonas();

		model.addAttribute("estudiantes",estudiantes);
		return "redirect:/home";
	}

	@GetMapping(value="/edit/{id}")
	public String editar(@PathVariable("id") int id,Model model) {
		Persona eldato=personas.encontrarporId(id);
		model.addAttribute("estudiante",eldato);
		return "editar";
	}
	@PostMapping(value="/guardar1")
	public String guardar(Model model, @RequestParam("id") int id, @RequestParam("telefono") 
	int telefono)
	{
		Persona eldato=personas.encontrarporId(id);
		eldato.setTelefono(telefono);
		personas.guardar(eldato);
		List<Persona> estudiantes=personas.listarpersonas();

		model.addAttribute("estudiantes",estudiantes);
		return "home";
	}
	/*@GetMapping(value="/logout")
	public String logout(HttpServletBean request){
		SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
		logoutHandler.setClearAuthentication(true);
		return "redirect:/login";
	}*/

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
