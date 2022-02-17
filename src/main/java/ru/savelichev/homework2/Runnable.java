package ru.savelichev.homework2;

public interface Runnable {
  boolean run(Road road);
  boolean jump(Wall wall);

  String getRunnerName();
}
