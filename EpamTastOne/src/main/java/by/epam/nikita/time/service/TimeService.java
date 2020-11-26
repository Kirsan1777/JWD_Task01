package by.epam.nikita.time.service;

import by.epam.nikita.time.entity.Time;

public class TimeService {
    public Time calculateTime(int allTime){
        int seconds = allTime % 60;
        int minutes = allTime / 60;
        int hours = minutes / 60;
        minutes %= 60;
        return new Time(hours, minutes, seconds);
    }
}
