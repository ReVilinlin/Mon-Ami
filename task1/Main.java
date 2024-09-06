package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mursic", 5, 200);
        Cat cat1 = new Cat("Maxic", 2, 200);
        Dog dog = new Dog("bobic ", 1, 500, 10);
        Tigar tigar = new Tigar("Klementin", 4, 1000, 5);
        Rabbit rabbit = new  Rabbit("Krolik",2,38);
        Tushkanchik tushkanchik = new Tushkanchik("Tuskanchic",2,25);
        Fox fox =  new Fox ("Fox",2,65);

        Animal[] animals = {cat, cat1, dog, tigar};
        for (Animal a : animals) {
            a.run(200);
            a.swim(10);
            System.out.println();
        }

        Mammal[] mammals = {fox,tushkanchik,rabbit};
        for (Mammal a : mammals) {
            a.pregnancy();
            System.out.println();
        }

        System.out.println("Котов "+ ((Cat)animals[0]).count);
        System.out.println("Собак "+ ((Dog)animals[2]).count);
        System.out.println("Тигров "+ ((Tigar)animals[3]).count);


    }


}

