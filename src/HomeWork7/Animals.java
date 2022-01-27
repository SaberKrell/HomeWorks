package HomeWork7;


import java.util.Random;

public abstract class Animals {
    static Animals[] animals = new Animals[10];
    private static int animalsCount = 0;
    protected String name;
    protected int age;
    protected String color;
    static Random random = new Random();

    public static int random() {
        return random.nextInt(700);
    }

    public Animals(String name, int age, String color) {
        this.name = name;
        this.color = color;
        this.age = age;
        animals = new Animals[0];
    }

    abstract void swim(int var1);

    abstract void run(int var1);

    static void showInfo() {
        animalsCount = Dog.dogs + Cat.cats;
        System.out.println("Всего создано животных - " + animalsCount);
        Cat.showInfo();
        Dog.showInfo();
    }

    void sleep() {
        System.out.println(this.name + " спит ");
    }
}
