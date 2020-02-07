package br.com.gft.mvc.controllers;

import br.com.gft.mvc.model.Titulo;
import br.com.gft.mvc.model.TituloResourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private TituloResourse tituloResourse;
    @GetMapping("/")
    public ModelAndView listTitulos(){
        List<Titulo> titulos = tituloResourse.findAll();
        ModelAndView mv = new ModelAndView("home","listTitulos", titulos);
        return mv;
    }
}
