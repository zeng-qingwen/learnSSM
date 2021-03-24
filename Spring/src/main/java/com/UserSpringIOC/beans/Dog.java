package com.UserSpringIOC.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dog {
    public void speak(){
        System.out.println("wang---");
    }
}
