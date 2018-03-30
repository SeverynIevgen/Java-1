package geekbrains.ru.lesson_6;

class Animal {

    int run;
    int swim;
    int jump;
    Animal (int run, int swim, float jump) {
        super();
    }


    boolean run(int x) {
        return x < 100;
    }
    boolean swim(int x) {
        return x < 5;
    }
    boolean jump(float x) {
        return x < 1;
    }
}
