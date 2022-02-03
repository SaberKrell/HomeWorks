package HomeWork7;

class Dog extends Animals {
    private static int dogs = 0;

    public Dog( String name, int age, String color ) {
        super( name, age, color );
        satiety = 100;
        ++dogs;
    }

    public String swim(int range) {
       if(satiety > 50) {
           if ( range > 10 ) {
               satiety -= 20;
               return name + " проплыл 10 метров и теперь хочет есть, накормите его";
           } else {
               this.satiety -= 10;
               return name + " проплыл " + range + " метров";
           }
       }
       return name+ " не может плыть пока вы его не покормите";
    }

    public String run(int range) {
        if(satiety > 50) {
            if ( range >= 500 ) {
                satiety -= 20;
                return this.name + " пробежал 500 метров и теперь очень голоден, накормите его";
            } else {
                satiety -= 10;
                return name + " пробежал " + range + " метров";
            }
        }
        return name+ " не может бежать пока вы его не покормите";
    }

    static int showInfoDog() {
        return dogs;
    }

}
