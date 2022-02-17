package ru.savelichev.homework1.animal;

public abstract class Animal {
  protected String name;
  public static int count;

  public Animal(String name) {
    this.name = name;
    count++;
  }

  public String getName() {
    return name;
  }

  public abstract void run(int distance);

  public abstract void swim(int distance);
}
