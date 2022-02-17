package ru.savelichev.lesson2;

public class Main {
  public static void main(String[] args) {
    Month[] months = Month.values();

    for (Month month : months) {
      System.out.println(month.getRusName() + " это " + month.getNumber() + " месяц в году.");
    }
  }
}
