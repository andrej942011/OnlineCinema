package org.example;

public class Viewer {
    private String name;
    private int age;
    private int viewed;

    public int getAge() {
        return age;
    }

    public int getViewed() {
        return viewed;
    }

    public String getName() {
        return name;
    }

    public Viewer(String name, int age, int viewed){
        this.name = name;
        this.age = age;
        this.viewed = viewed;
    }
}
