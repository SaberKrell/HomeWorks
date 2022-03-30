package HomeWork9;

public class Main {

    public static void main(String[] args) {

        Actions[] athletes = {
                new Human(700, 150),
                new Cat(100, 200),
                new Robot(500, 0),
                new Cat(120, 210),
                new Human(1500, 120)
        };

        Crossable[] equipments = {
                new Wall(50),
                new RunningTrack(500),
                new Wall(70)
        };

        for (Actions athlete : athletes) {
            for (Crossable equipment: equipments) {
                equipment.cross(athlete);
            }
        }
    }
}
