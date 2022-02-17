package ru.savelichev.lesson1;

import ru.savelichev.lesson1.animal.Animal;
import ru.savelichev.lesson1.animal.Cat;
import ru.savelichev.lesson1.animal.Dog;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        int c; //к локальной переменной нельзя обращаться до присвоения ей значения
        final int x = 10; //final делает из переменной константу, но его ещё можно применять в классах и методах

        Cat cat2 = new Cat("Murzik", "Black", 4);
        Cat cat = new Cat("Barsik", "White", 2);

        Animal dog = new Dog("Bobik", "black", 2);

        cat.info();
        cat2.info();

        cat.voice(); //срабатывает ближайший метод по иерахии с таким же названием и таким же набором аргументов

        dog.voice();

//        Cat.doSomething();

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.clear();


        // MainApp$1
        Animal animal = new Animal() {
            @Override
            public void voice() {

            }
        };

        Animal[] catsAndDogs = {
            new Cat("Barsik", "White", 2),
            new Dog("Sharik", "Black", 4),
        };

        for (Animal obj: catsAndDogs) {
            obj.voice();
        }

        Animal myCat = new Cat("Whiskas", "Grey", 2);

        //тут нужен обязательный каст к коту
        ((Cat)myCat).catMethod();

        Animal myCatDog = new Cat("Whiskas", "Grey", 2);

        //можно проверить принадлежит ли объект к тому или иному классу
        if (myCatDog instanceof Cat) {
            ((Cat)myCatDog).catMethod();
        } else {
            System.out.println("This is not a cat");
        }

        Object obj = new Cat("Whiskas", "Grey", 2);
        System.out.println(obj); //метод класса Object - выводит называние класса и hashCode в hex формате
        //public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }

        Box box1 = new Box("Green", 2);
        Box box2 = new Box("Green", 2);

        System.out.println(box1.equals(box2));

        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());


    }
}
