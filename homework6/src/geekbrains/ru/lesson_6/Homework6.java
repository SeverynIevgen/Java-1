package geekbrains.ru.lesson_6;

public class Homework6 {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", 450, 12, 0.6F);
        Animal dog2 = new Dog("Barbos", 350, 9, 0.5F);
        Dog dog3 = new Dog("Simba", 400, 15, 0.4F);
        Animal dog4 = new Dog("Jackson", 500, 10, 1.5F);
        Cat cat1 = new Cat("Murka", 300, 2, 1);
        Animal cat2 = new Cat("Muska", 200, 1, 2.5F);
        Animal[] animals = new Animal[6];
        animals[0] = dog1;
        animals[1] = dog2;
        animals[2] = dog3;
        animals[3] = dog4;
        animals[4] = cat1;
        animals[5] = cat2;

        System.out.println(dog1.name + " can run: " + dog1.run(150));
        System.out.println(cat1.name + " can swim: " + cat1.swim(2));
        System.out.println(((Dog)dog2).name + " can jump: " + dog2.jump(1));
        System.out.println(((Dog)dog4).name + " can jump: " + cat2.jump(1.6F));

        System.out.println("Name of cat 1 is " + cat1.name);
        System.out.println("Name of cat 2 is " + ((Cat)cat2).name);

        int run = 400;
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i + 1) + " can run: " + animals[i].run(run));
        }
    }
}
