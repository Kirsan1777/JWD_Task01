package by.epam.nikita.perfect.service;

public class PerfectNumberService {

    public boolean checkPerfectNumber(int number){
        int sumDivider = checkDivider(number);
        return number == sumDivider;
    }

    public int checkDivider(int number){
        int sumDivider = 0;
        for(int i= 1; i < number; i++){
            if(number % i == 0){
                sumDivider = sumDivider + i;
            }
        }
        return sumDivider;
    }
}
