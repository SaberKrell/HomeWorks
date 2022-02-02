package HomeWork7;


public class Main {
    public static void main(String[] args) {
        Animals animals[] = {
                new Dog("Бок", 140, "черный"),
                new Cat("Борис", 3, "черный"),
                new Cat("Гаврик", 7, "серый"),
                new Cat("Барсик", 2, "белый"),
                new Dog("Борбик", 10, "серый"),
        };
        Plate plate = new Plate(100);

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].run(Animals.random()));
            System.out.println(animals[i].satietyInfo());
            System.out.println(animals[i].eat(plate));
            System.out.println(animals[i].satietyInfo());
            System.out.println("Еды в тарелке осталось: " + plate.plateInfo());
        }
        System.out.println();
        plate.setFoodQuantity(200);
        System.out.println(plate.plateInfo());
        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].swim(Animals.random()));
            System.out.println(animals[i].satietyInfo());
            System.out.println(animals[i].eat(plate));
            System.out.println(animals[i].satietyInfo());
            System.out.println("Еды в тарелке осталось: " + plate.plateInfo());
        }
    }
}
