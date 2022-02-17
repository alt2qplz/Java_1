package ru.savelichev.homework1.animal;

public class Cat extends Animal {
  public static int count;

  public Cat(String name) {
    super(name);
    count++;
  }

  @Override
  public void run(int distance) {
    if (distance <= 200) {
      System.out.println("Cat " + name + " run " + distance + "m");
    } else {
      System.out.println("Cat " + name + " can't run " + distance + "m");
    }
  }

  @Override
  public void swim(int distance) {
    System.out.println("Cat " + name + " can't swim");
  }
}
