package service;

import modelDto.Words;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordsService {

    public List<Words> createWords(){
        List<Words> wordsList = new ArrayList<>();

        wordsList.add(new Words(1L, "abas"));
        wordsList.add(new Words(2L, "Abel"));
        wordsList.add(new Words(3L, "abra"));
        wordsList.add(new Words(4L, "abre"));
        wordsList.add(new Words(5L, "abri"));
        wordsList.add(new Words(6L, "abro"));
        wordsList.add(new Words(7L, "Acab"));
        wordsList.add(new Words(8L, "acha"));
        wordsList.add(new Words(9L, "acha"));
        wordsList.add(new Words(10L, "ache"));
        wordsList.add(new Words(11L, "acho"));
        wordsList.add(new Words(12L, "acne"));
        wordsList.add(new Words(13L, "Acre"));
        wordsList.add(new Words(14L, "acua"));
        wordsList.add(new Words(15L, "acua"));

        return wordsList;
    }


}
