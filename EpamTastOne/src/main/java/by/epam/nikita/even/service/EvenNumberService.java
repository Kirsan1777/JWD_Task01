package by.epam.nikita.even.service;

import java.util.List;

public class EvenNumberService {

    public boolean checkEvenNumber(List<Integer> numbers){
        int count = 0;
        for(Integer i : numbers){
            if(i % 2 == 0){
                count++;
            }
        }
        return count >= 2;
    }
}
