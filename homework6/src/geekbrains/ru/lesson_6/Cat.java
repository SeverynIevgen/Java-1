package geekbrains.ru.lesson_6;

class Cat extends Animal {

    String name;
    int run;
    int swim;
    int jump;
    Cat (String name, int run, int swim, float jump) {
        super(run, swim, jump);
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
