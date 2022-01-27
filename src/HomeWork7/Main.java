package HomeWork7;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Борбик", 10, "серый");
        Dog dog1 = new Dog("Бок", 140, "черный");
        dog.run(Animals.random());
        dog.swim(Animals.random());
        dog1.run(Animals.random());
        dog1.swim(Animals.random());
        Cat cat = new Cat("Борис", 3, "черный");
        Cat cat1 = new Cat("Кузя", 7, "серый");
        Cat cat2 = new Cat("Барсик", 2, "белый");
        cat.swim(Animals.random());
        cat.run(Animals.random());
        cat1.run(Animals.random());
        cat2.run(Animals.random());
        Animals.showInfo();
        cat.sleep();
    }
}
