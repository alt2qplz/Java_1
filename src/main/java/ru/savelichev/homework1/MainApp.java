package ru.savelichev.homework1;

import ru.savelichev.homework1.animal.Animal;
import ru.savelichev.homework1.animal.Cat;
import ru.savelichev.homework1.animal.Dog;

public class MainApp {
  public static void main(String[] args) {
    Animal[] animals = new Animal[] {
        new Cat("Meow"),
        new Dog("Gav3"),
        new Cat("Meow3"),
        new Dog("Gav2"),
        new Cat("Meow2"),
        new Dog("Gav"),
        new Dog("Gav5"),
    };

    for (Animal animal: animals) {
      System.out.println(animal.getName());

      animal.run(100);
      animal.run(300);
      animal.run(600);

      animal.swim(50);
      animal.swim(150);
      System.out.println("");
    }

    System.out.println("Animals count: " + Animal.count);
    System.out.println("Dogs count: " + Dog.count);
    System.out.println("Cats count: " + Cat.count);
  }
}
