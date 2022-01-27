package HomeWork7;

class Dog extends Animals {
    protected static int dogs = 0;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        ++dogs;
    }

    void swim(int range) {
        if (range > 10) {
            System.out.println(this.name + " проплыл 10 метров и устал");
        } else {
            System.out.println(this.name + " проплыл " + range + " метров");
        }

    }

    void run(int range) {
        if (range > 500) {
            System.out.println(this.name + " пробежал 500 метров и устал");
        } else {
            System.out.println(this.name + " пробежал " + range + " метров");
        }

    }

    static void showInfo() {
        System.out.println("Собак создано - " + dogs);
    }
}
