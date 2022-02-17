package ru.savelichev.homework2;

public class Road implements Obstacle {
  int length;

  public Road(int length) {
    this.length = length;
  }

  @Override
  public boolean overcome(Runnable obj) {
    return obj.run(this);
  }
}
