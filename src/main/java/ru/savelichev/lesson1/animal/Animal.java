package ru.savelichev.lesson1.animal;

//абстрактный класс
//нельзя создать экземпляр абстрактного класса

//все классы в яве наследуются от класса Object, либо по цепочке, либо напрямую
public abstract class Animal extends Object {
    protected String name;
    String color;
    int age;

    //конструкторы могут отличаться не только набором заполняемых полей, но и например брать инфу из разных мест
    //например из файла, потока, облака и так далее

    public Animal() {
        this.name = "unknown";
        this.color = "unknown";
        this.age = 1;
    }
//
//    public Animal(String name) {
//        this.name = name;
//        this.color = "unknown";
//        this.age = 1;
//    }
//
//    public Animal(String name, String color) {
//        this.name = name;
//        this.color = color;
//        this.age = 1;
//    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    //final в методе запрещает подклассам переопределять этот метод
    public final void info() {
        System.out.println(name + " " + color + " " + age);
    }

    //абстрактный метод может содержаться только у абстрактного класса
    //наследники этого класса будут обязаны определить этот метод
    //можно не определять, только если он сам (наследник) тоже будет абстрактным
    public abstract void voice();

}
