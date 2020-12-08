package org.example;

import java.util.ArrayList;

public class Viewer {
    private String name;
    private int age;
    private ArrayList<Cinema> cinemaArray;

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Cinema> getCinemaArray() {
        return cinemaArray;
    }

    public Viewer(String name, int age, ArrayList<Cinema> cinemas){
        this.name = name;
        this.age = age;
        this.cinemaArray = cinemas;
    }
}
