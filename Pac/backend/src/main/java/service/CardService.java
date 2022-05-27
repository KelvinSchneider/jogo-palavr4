package service;

import modelDto.Card;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {

    public List<Card> getCardPack(){
        return createCardAndCardPack();
    }

    public List<Card> createCardAndCardPack(){
        List<Card> cardList = new ArrayList<>();

        cardList.add(new Card(1L, new String[]{"P", "I"}));
        cardList.add(new Card(2L, new String[]{"I", "D"}));
        cardList.add(new Card(3L, new String[]{"N", "F"}));
        cardList.add(new Card(4L, new String[]{"O", "V"}));
        cardList.add(new Card(5L, new String[]{"F", "V"}));
        cardList.add(new Card(6L, new String[]{"A", "J"}));
        cardList.add(new Card(7L, new String[]{"A", "B"}));
        cardList.add(new Card(8L, new String[]{"A", "B"}));
        cardList.add(new Card(9L, new String[]{"A", "B"}));
        cardList.add(new Card(10L, new String[]{"A", "B"}));
        cardList.add(new Card(11L, new String[]{"A", "B"}));
        cardList.add(new Card(12L, new String[]{"A", "B"}));
        cardList.add(new Card(13L, new String[]{"A", "B"}));
        cardList.add(new Card(14L, new String[]{"A", "B"}));
        cardList.add(new Card(15L, new String[]{"A", "B"}));
        cardList.add(new Card(16L, new String[]{"A", "B"}));
        cardList.add(new Card(17L, new String[]{"A", "B"}));
        cardList.add(new Card(18L, new String[]{"A", "B"}));
        cardList.add(new Card(19L, new String[]{"A", "B"}));
        cardList.add(new Card(20L, new String[]{"A", "B"}));
        cardList.add(new Card(21L, new String[]{"A", "B"}));
        cardList.add(new Card(22L, new String[]{"A", "B"}));
        cardList.add(new Card(23L, new String[]{"A", "B"}));
        cardList.add(new Card(24L, new String[]{"A", "B"}));
        cardList.add(new Card(25L, new String[]{"A", "B"}));
        cardList.add(new Card(26L, new String[]{"A", "B"}));
        cardList.add(new Card(27L, new String[]{"A", "B"}));
        cardList.add(new Card(28L, new String[]{"A", "B"}));
        cardList.add(new Card(29L, new String[]{"A", "B"}));
        cardList.add(new Card(30L, new String[]{"A", "B"}));
        cardList.add(new Card(31L, new String[]{"A", "B"}));
        cardList.add(new Card(32L, new String[]{"A", "B"}));
        cardList.add(new Card(33L, new String[]{"A", "B"}));
        cardList.add(new Card(34L, new String[]{"A", "B"}));
        cardList.add(new Card(35L, new String[]{"A", "B"}));
        cardList.add(new Card(36L, new String[]{"A", "B"}));
        cardList.add(new Card(37L, new String[]{"A", "B"}));
        cardList.add(new Card(38L, new String[]{"A", "B"}));
        cardList.add(new Card(39L, new String[]{"A", "B"}));
        cardList.add(new Card(40L, new String[]{"A", "B"}));
        cardList.add(new Card(41L, new String[]{"A", "B"}));
        cardList.add(new Card(42L, new String[]{"A", "B"}));
        cardList.add(new Card(43L, new String[]{"A", "B"}));
        cardList.add(new Card(44L, new String[]{"A", "B"}));
        cardList.add(new Card(45L, new String[]{"A", "B"}));
        cardList.add(new Card(46L, new String[]{"A", "B"}));
        cardList.add(new Card(47L, new String[]{"A", "B"}));
        cardList.add(new Card(48L, new String[]{"A", "B"}));
        cardList.add(new Card(49L, new String[]{"A", "B"}));
        cardList.add(new Card(50L, new String[]{"A", "B"}));
        cardList.add(new Card(51L, new String[]{"A", "B"}));
        cardList.add(new Card(52L, new String[]{"A", "B"}));
        cardList.add(new Card(53L, new String[]{"A", "B"}));
        cardList.add(new Card(54L, new String[]{"A", "B"}));
        cardList.add(new Card(55L, new String[]{"A", "B"}));

        return cardList;

    }


}
