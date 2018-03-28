package geekbrains.ru.lesson_6;

public class Homework6 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Cat cat1 = new Cat("Murka");
        Animal dog2 = new Dog();
        Animal cat2 = new Cat("Muska");
        System.out.println("This dog can run: " + dog1.run(150));
        System.out.println(cat1.name + " can swim: " + cat1.swim(2));
        System.out.println("This dog can jump: " + dog2.jump(1));
        System.out.println("This cat can jump: " + cat2.jump(1.6F));
    }
}
