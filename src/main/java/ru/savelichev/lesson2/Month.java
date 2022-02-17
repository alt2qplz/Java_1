package ru.savelichev.lesson2;

public enum Month {
  JANUARY(1, "Январь"), FEBRUARY(2, "Февраль"), MARCH(3, "Март");

  private int number;
  private String rusName;

  public int getNumber() {
    return number;
  }

  public String getRusName() {
    return rusName;
  }

  Month(int number, String rusName) {
    this.number = number;
    this.rusName = rusName;
  }
}
