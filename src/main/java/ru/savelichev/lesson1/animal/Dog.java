package ru.savelichev.lesson1.animal;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }


    //эта аннотация необязательная, но это подстраховка
    //но она делает две вещи
    //1. показывает что этот метод был переопределен
    //2. если это не будет переопределением, то будет ошибка
    @Override
    public void voice() {
        System.out.println(name + ": gav-gav!");
    }
}
