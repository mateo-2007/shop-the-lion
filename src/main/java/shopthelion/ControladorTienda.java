package com.shopthelion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorTienda {

    @GetMapping("/")
    public String index() {
        return "index"; // Esto busca el archivo index.html en la carpeta templates
    }
}