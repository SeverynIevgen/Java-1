package geekbrains.ru.lesson_6;

public class Cat extends Animal {

    public String name;
    Cat (String name) {
        this.name = name;
    }

    @Override
    public boolean run(int x) {
        return x < 200;
    }

    @Override
    public boolean swim(int x) {
        return false;
    }

    @Override
    public boolean jump(float x) {
        return x < 2;
    }
}
