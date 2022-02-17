package ru.savelichev.homework2;

public class Robot implements Runnable {
  private final String name;
  static final private int maxRunLength = 1000;
  static final private int maxJumpHeight = 10;

  public Robot(String name) {
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
