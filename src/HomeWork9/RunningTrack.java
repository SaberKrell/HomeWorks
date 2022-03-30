package HomeWork9;

public class RunningTrack implements Crossable{

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void cross(Actions athlete) {
        athlete.run(length);
    }
}
