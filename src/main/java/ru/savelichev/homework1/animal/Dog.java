package ru.savelichev.homework1.animal;

public class Dog extends Animal {
  public static int count;

  public Dog(String name) {
    super(name);
    count++;
  }

  @Override
  public void run(int distance) {
    if (distance <= 500) {
      System.out.println("Dog " + name + " run " + distance + "m");
    } else {
      System.out.println("Dog " + name + " can't run " + distance + "m");
    }
  }

  @Override
  public void swim(int distance) {
    if (distance <= 100) {
      System.out.println("Dog " + name + " swim " + distance + "m");
    } else {
      System.out.println("Dog " + name + " can't swim " + distance + "m");
    }
  }
}
