package HomeWork7;


import java.util.Random;

public abstract class Animals {
    static Animals[] animals = new Animals[10];
    private static int animalsCount = 0;
    protected String name;
    protected int age;
    protected String color;
    static Random random = new Random();
    protected int satiety;

    public static int random() {
        return random.nextInt(700);
    }

    public Animals(String name, int age, String color) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    abstract String swim(int var1);

    abstract String run(int var1);

    static String showInfo() {
        animalsCount = Dog.showInfoDog() + Cat.showInfoCat();
        return "Всего создано животных - " + animalsCount +
                ", кошек - " + Cat.showInfoCat() +
                ", собак - " + Dog.showInfoDog();
    }
    public String satietyInfo(){
        return "Выносливость "+ name+"а" + " = " + satiety + "%";
    }

    public String eat(Plate i){
        int hunger = 100 - satiety;
        if( satiety == 100) return name + " Не голоден";
        else if ( i.plateInfo() > hunger ){
            i.getFoodQuantity(hunger);
            satiety += hunger;
            return name + " сьел " + hunger + " еды";
        } else return name + " не стал есть, положите больше еды!";
    }
}
