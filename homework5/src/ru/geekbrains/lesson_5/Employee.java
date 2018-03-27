package ru.geekbrains.lesson_5;

//  1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//      Конструктор класса должен заполнять эти поля при создании объекта;
public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    static int countEmloyees; //Модификатор default, так как класс находится в том же пакете.
    Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        countEmloyees++;
    }

    public int getAge() {
        return age;
    }

//  Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль:
    void printInfo() { //Модификатор default, так как класс находится в том же пакете.
        System.out.println("Name: " + name + ",\tposition: " + position
                + ",\temail: " + email + ",\tphone number: " + phoneNumber
                + ",\tsalary: " + salary + " rub,\tage: " + age + " years.");
    }

}
