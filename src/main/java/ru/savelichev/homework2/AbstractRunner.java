package ru.savelichev.homework2;

public abstract class AbstractRunner implements Runnable{
  private final String name;
  private final int maxRunLength;
  private final int maxJumpHeight;

  public AbstractRunner(String name, int maxRunLength, int maxJumpHeight) {
    this.name = name;
    this.maxRunLength = maxRunLength;
    this.maxJumpHeight = maxJumpHeight;
  }

  public String getRunnerName() {
    return name;
  }

  public final boolean run(Road road) {
    if (road.length <= maxRunLength) {
      System.out.println(name + " преодолел дистанцию в " + road.length );
      return true;
    } else {
      System.out.println(name + " не смог преодолеть дистанцию в " + road.length );
      return false;
    }
  }

  public final boolean jump(Wall wall) {
    if (wall.height <= maxJumpHeight) {
      System.out.println(name + " преодолел высоту в " + wall.height );
      return true;
    } else {
      System.out.println(name + " не смог преодолеть высоту в " + wall.height );
      return false;
    }
  }
}
