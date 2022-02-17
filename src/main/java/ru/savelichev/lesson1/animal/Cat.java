package ru.savelichev.lesson1.animal;

//если класс final, то от него нельзя наследоваться
//например нельзя наследоваться от String, так как он final
public final class Cat extends Animal {
    //private = доступ только из этого класса
    //default + доступ из пакета, где лежит класс
    //protected + доступ из наследника, где бы он не находился
    //public + доступ откуда угодно (нежелательно)
    //стараемся делать мин. уровень доступа

    //static = у всех объектов значение этого поля, будет одинаковым
    //соответственно при изменении поля, оно изменится у всех объектов
    //подвязывается к классу и не требует наличия объекта, для работы с ним
    //правильней обращаться к статическим полям через класс, а не экземпляр класса

//    private String name; //null
//    private String color;
//    private int age; //при инициализации полей класса, поля получают значения по умолчанию в зависимости от типа поля (int = 0)
    //boolean будет false

//    static int field1;
//    static int field2;
//
//    //статический блок инициализации
//    static {
//        field1 = 1;
//        field2 = 2;
//    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void meow() {
        System.out.println(name + " meow");
    }

//    public void info() {
//        System.out.println(name + " " + color + " " + age);
//    }
//
//    //подвязывается к классу, как и static свойство
//    //можно вызывать у класса
//    //статик, только к статик
//    public static void doSomething() {
//        System.out.println("123");
//    }

    @Override
    public void voice() {
        System.out.println(name + " meow");
    }

    public void catMethod() {
        System.out.println("catMethod"); // чисто кошачий метод
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
