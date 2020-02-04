package br.com.gft.mvc.controllers;

import br.com.gft.mvc.model.Titulo;
import br.com.gft.mvc.model.TituloResourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("titulo")
public class HomeController {
    @Autowired
    private TituloResourse tituloResourse;

    @GetMapping("/novo")
    public String home(){
        return "main";
    }

    @PostMapping("/incluir")
    public String salvar(Titulo titulo){
        tituloResourse.save(titulo);
        return "main";
    }
}
