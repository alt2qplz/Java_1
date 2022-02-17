package ru.savelichev.homework2;

public class Wall implements Obstacle {
  int height;

  public Wall(int height) {
    this.height = height;
  }

  @Override
  public boolean overcome(Runnable obj) {
    return obj.jump(this);
  }
}
