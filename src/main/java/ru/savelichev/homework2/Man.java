package ru.savelichev.homework2;

public class Man implements Runnable {
  private final String name;
  static final private int maxRunLength = 500;
  static final private int maxJumpHeight = 3;

  public Man(String name) {
    this.name = name;
  }

  public String getRunnerName() {
    return name;
  }

  @Override
  public boolean run(Road road) {
    if (road.length <= maxRunLength) {
      System.out.println(name + " преодолел дистанцию в " + road.length );
      return true;
    } else {
      System.out.println(name + " не смог преодолеть дистанцию в " + road.length );
      return false;
    }
  }

  @Override
  public boolean jump(Wall wall) {
    if (wall.height <= maxJumpHeight) {
      System.out.println(name + " преодолел высоту в " + wall.height );
      return true;
    } else {
      System.out.println(name + " не смог преодолеть высоту в " + wall.height );
      return false;
    }
  }
}
