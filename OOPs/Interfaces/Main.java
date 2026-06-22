package JavaBootcamp.OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine e = new Car();

        e.start();
        e.stop();

        MediaPlayer m = new Car();
        m.startMusic();
        m.changeMusic();
    }
}
