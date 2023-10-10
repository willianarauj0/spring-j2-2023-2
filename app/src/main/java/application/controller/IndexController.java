package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(
        Model model,
        @RequestParam("nome") String pNome) {
        model.addAttribute("nome", pNome);
        return "home";
    }

    @RequestMapping("/soma")
    public String soma() {
        return "form-soma";
    }

    
    public String soma(
        Model model,
        @RequestParam("numA") int numA,
        @RequestParam("numB") int numB) {

        int resultado = numA + numB;
        model.addAttribute("resultado", resultado);
        return "resultado-soma";
    }
}

