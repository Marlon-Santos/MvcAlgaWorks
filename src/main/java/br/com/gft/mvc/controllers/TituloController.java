package br.com.gft.mvc.controllers;

import br.com.gft.mvc.model.StatusEnum;
import br.com.gft.mvc.model.Titulo;
import br.com.gft.mvc.model.TituloResourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("titulo")
public class TituloController {
    @Autowired
    private TituloResourse tituloResourse;

    @GetMapping("/novo")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("tituloIncluir");
        return mv;
    }

    @PostMapping("/incluir")
    public ModelAndView salvar(Titulo titulo){
        tituloResourse.save(titulo);
        ModelAndView mv = new ModelAndView("tituloIncluir");
        mv.addObject("mensagem","formulario enviado com sucesso :)");
        
        return mv;
    }
    @ModelAttribute("statusEnum")
    public List<StatusEnum> statusEnum(){
        return Arrays.asList(StatusEnum.values());
    }
    
}
