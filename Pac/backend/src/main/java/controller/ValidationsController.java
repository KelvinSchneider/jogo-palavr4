package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/front/validations")
public class ValidationsController {

    // retorna "baralho" com todas as cartas
    @GetMapping
    public boolean getCardPack(@PathVariable final String word){
        return false;
    }

}
