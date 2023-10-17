package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TabuadaController {

    @RequestMapping("/tabuada")
    public String calcula(
        @RequestParam("numero") int num,
        Model ui
    ) {
        ui.addAttribute("valor", num);
        return "tabuada";
    }
}
