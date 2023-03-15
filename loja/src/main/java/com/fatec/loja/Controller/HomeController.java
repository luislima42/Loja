package com.fatec.loja.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home/{nome}")
    public String home(@PathVariable String nome, ModelMap model){
    model.addAttribute("nome", nome);
        return "home";
    }
}

