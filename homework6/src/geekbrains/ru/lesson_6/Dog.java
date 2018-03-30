package geekbrains.ru.lesson_6;


import java.util.Random;

class Dog extends Animal {

    private static Random random = new Random();

    String name;
    int run;
    int swim;
    int jump;
    Dog (String name, int run, int swim, float jump) {
        super(run, swim, jump);
        this.name = name;
    }

    @Override
    boolean run(int x) {
       return x < 300 + random.nextInt(300);
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
