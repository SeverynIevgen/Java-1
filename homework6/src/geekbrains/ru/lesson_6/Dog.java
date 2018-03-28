package geekbrains.ru.lesson_6;

public class Dog extends Animal {

    @Override
    public boolean run(int x) {
       return x < 500;
    }

    @Override
    public boolean swim(int x) {
        return x < 10;
    }

    @Override
    public boolean jump(float x) {
        return x < 0.5;
    }
}
