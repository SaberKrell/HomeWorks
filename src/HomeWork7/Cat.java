package HomeWork7;

class Cat extends Animals {
    private static int cats = 0;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        satiety = 100;
        ++cats;
    }

    public String swim(int range) {
        sleep();
        return name + " Не умеет плавать, поэтому лег спать";
    }

    public String run(int range) {
        if(satiety > 50) {
            if ( range >= 200 ) {
                this.satiety -= 20;
                return name + " пробежал 200 метров и теперь очень голоден, накормите его";
            } else {
                this.satiety -= 10;
                return name + " пробежал " + range + " метров";
            }
        }
        return name+ " не может бежать пока вы его не покормите";
    }
    public int sleep(){
        return satiety -= 30;
    }
    static int showInfoCat() {
        return cats;
    }

}

