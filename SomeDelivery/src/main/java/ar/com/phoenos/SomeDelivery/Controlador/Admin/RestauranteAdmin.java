package ar.com.phoenos.SomeDelivery.Controlador.Admin;

import ar.com.phoenos.SomeDelivery.Entidades.Restaurante;
import ar.com.phoenos.SomeDelivery.Repositorios.SucursalRepository;
import ar.com.phoenos.SomeDelivery.Service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/resto")
public class RestauranteAdmin {
    @Autowired
    RestauranteService restauranteService;


    @GetMapping("/nuevo")
    public String nuevoRestaurante(Model model){
        model.addAttribute("restaurante",new Restaurante());
        return "admin/restaurante/resto_nuevo";
    }

    @PostMapping("/nuevo")
    public String mNew(@ModelAttribute("restaurante") Restaurante restaurante, SessionStatus status){
        try {
            restauranteService.nuevo(restaurante);
            status.setComplete();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:nuevo";
    }
}
