package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")    
    public String inicio(Model model)
    {
        var texto = "Semana 4";
        return "index";
    }
    
}
