package org.example;

public abstract class Mammal {
    private String name;
    private int age;

    private int day;


    public Mammal (String name, int age, int day ){
        this.name = name;
        this.age = age;
        this.day = day;

    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void pregnancy(){
        System.out.println(this.name + " вынашивает "+ this.day+ " дней");
    }


}
