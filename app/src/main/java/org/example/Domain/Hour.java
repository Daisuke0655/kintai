package org.example.Domain;

import lombok.Value;
@Value
public class Hour {
    int value;

    public Hour(int value){
        if(value < 0 || value > 59){
            throw new IllegalArgumentException("Hours must be between 0 and 23");
        }
        this.value = value;
    }
}
