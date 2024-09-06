package org.example;

public class Animal {
    private String name;
    private int age;

    private int maxRunDist;
    private int maxSwimDist;


    public Animal(String name, int age, int maxRunDist, int maxSwimDist ){
        this.name = name;
        this.age = age;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void run(int dist){
        System.out.println(this.name + " пробежал "+ dist+ " метров");
    }

    public void swim(int swimDist){
        if (swimDist<= this.maxSwimDist){
        System.out.println(this.name + " проплыл "+ swimDist+ " метров");
    }
        else{
            System.out.println(this.name +" утонул");
        }

    }

}

