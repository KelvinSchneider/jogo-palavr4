package controller;

import modelDto.Card;
import service.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/front/cardPack")
public class CardPackController {

    @Resource
    private CardService cardService;

    // retorna "baralho" com todas as cartas
    @GetMapping
    public List<Card> getCardPack(){
        return cardService.getCardPack();
    }

}
