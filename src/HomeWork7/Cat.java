package HomeWork7;

class Cat extends Animals {
    protected static int cats = 0;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        ++cats;
    }

    void swim(int range) {
        System.out.println(this.name + " шипит и убегает ");
    }

    void run(int range) {
        if (range > 200) {
            System.out.println(this.name + " пробежал 200 метров и устал");
        } else {
            System.out.println(this.name + " пробежал " + range + " метров");
        }

    }

    static void showInfo() {
        System.out.println("Кошек создано - " + cats);
    }
}

