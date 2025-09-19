package org.example.Domain;

import lombok.Value;

@Value
public class WorkTime {
    StartTime startTime;
    EndTime endTime;
    DayString dayString;

    public TotalTime getTotalTime() {
        Time startMinute = startTime.convertToMinutes();
        Time endMinute = endTime.convertToMinutes();
        return new TotalTime(new Time(endMinute.getValue() - startMinute.getValue()));
    }
}
