package org.example.Domain;

import lombok.Value;

@Value
public class EndTime {
    Hour endHours;
    Minute endMinutes;

    public Time convertToMinutes() {
        return new Time(endHours.getValue() * 60 + endMinutes.getValue());
    }
}
