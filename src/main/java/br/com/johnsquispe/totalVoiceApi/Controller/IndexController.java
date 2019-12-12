package br.com.johnsquispe.totalVoiceApi.Controller;

import br.com.johnsquispe.totalVoiceApi.api.endpoints.totalVoice.ChamadaApi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping("/app")
    public ModelAndView app(){
        ModelAndView mv = new ModelAndView("interface");
        return mv;
    }

    @PostMapping("/chamada")
    public String chamar() throws Exception {
        ChamadaApi chamada = new ChamadaApi();
        return chamada.realizaChamadaEntreDoisNumeros("11987906887","11987906887");
    }

}
