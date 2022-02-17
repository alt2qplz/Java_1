package ru.savelichev.homework2;

public class Main {
  public static void main(String[] args) {
    Runnable[] runners = {
        new Man("Петя"),
        new Cat("Мурзик"),
        new Robot("Мегатрон")
    };

    Obstacle[] obstacles = {
        new Wall(1),
        new Road(10),
        new Wall(3),
        new Road(20),
        new Wall(5),
        new Road(30),
        new Wall(10),
        new Road(150),
        new Wall(15),
        new Road(5000),
    };

    System.out.println("Всего препятствий: " + obstacles.length + "\n");

    for (Runnable runner: runners) {
      System.out.println(runner.getRunnerName() + " пошел! :)");

      int count = 0;
      for (Obstacle obstacle: obstacles) {
        if (!obstacle.overcome(runner)) break;
        count++;
      }

      System.out.println(runner.getRunnerName() + " преодолел: " + count + "\n");
    }
  }
}
