package com.UserSpringIOC.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@NoArgsConstructor
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> habbys;
    private Map<String,String> card;
    private Set<String> game;
    private String wife;
    private Properties info;
}
