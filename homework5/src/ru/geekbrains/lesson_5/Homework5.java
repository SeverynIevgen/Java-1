package ru.geekbrains.lesson_5;

public class Homework5 {

    public static void main(String[] args) {

//      Создать массив из 5 сотрудников:
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivan Ivanov", "Teacher", "ivivanov@gmail.com",
                    "+7(912)345-67-89", 25000, 45);
        empArray[1] = new Employee("Petr Petrov", "Engineer", "pepetrov@gmail.com",
                    "+7(923)456-78-90", 35000, 40);
        empArray[2] = new Employee("Vasiliy Vasiliev", "Manager", "vavasiliev@gmail.com",
                    "+7(934)567-89-01", 20000, 41);
        empArray[3] = new Employee("Fedor Fedorov", "Lawyer", "fefedorov@gmail.com",
                    "+7(945)678-90-12", 30000, 50);
        empArray[4] = new Employee("Nikolay Nikolaev", "Actor", "ninikolaev@gmail.com",
                    "+7(956)789-01-23", 40000, 35);
//      С помощью цикла вывести информацию только о сотрудниках старше 40 лет:
        for (int i = 0; i < Employee.countEmloyees; i++) {
                if (empArray[i].getAge() > 40) empArray[i].printInfo();
        }
    }
}
