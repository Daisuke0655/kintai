package org.example.Domain;

import lombok.Value;

@Value
public class StartTime {
    Hour startHours;
    Minute startMinutes;

    public Time convertToMinutes() {
        return new Time(startHours.getValue() * 60 + startMinutes.getValue());
    }
}
