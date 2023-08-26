package co.edu.uts.appdemo.Controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.uts.appdemo.models.Usuario;



@Controller
@RequestMapping("/app")
public class indexController {
    
    @GetMapping({"/index","/"," ","","/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){
        model.addAttribute("titulo","perfil usuario");
        
        Usuario usuario = new Usuario();
        usuario.setNombre("Frank");
        usuario.setApellido("Jaimes");
        //usuario.setEmail("fsjaimes@uts.edu.co");
        

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Steven");
        usuario2.setApellido("Pedrozo");
        usuario2.setEmail("fsjaimes@uts.edu.co");

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Stefanny");
        usuario3.setApellido("Quintero");
        usuario3.setEmail("Squintero@uts.edu.co");

        Usuario usuario4 = new Usuario();
        usuario4.setNombre("Daniel");
        usuario4.setApellido("Prada");
        //usuario4.setEmail("Dprada@uts.edu.co");

        Usuario usuario5 = new Usuario();
        usuario5.setNombre("Carmen");
        usuario5.setApellido("Florez");
        usuario5.setEmail("Cflorez@uts.edu.co");
        model.addAttribute("usuario5", usuario5);

        //Agregamos los usuarios a la vista
        model.addAttribute("usuario", usuario);
        model.addAttribute("usuario2", usuario2);
        model.addAttribute("usuario3", usuario3);
        model.addAttribute("usuario4", usuario4);
       
        return "perfil";
    }
}
