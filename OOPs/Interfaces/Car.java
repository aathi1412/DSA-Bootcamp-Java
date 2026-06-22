package JavaBootcamp.OOPs.Interfaces;

public class Car implements Engine, InteriorDesign, MediaPlayer{

    @Override
    public void startMusic() {
        System.out.println("Start Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music");
    }

    @Override
    public void changeMusic() {
        System.out.println("Change Music");
    }

    @Override
    public void openSunRoof() {
        System.out.println("Opening Sun Roof");
    }

    @Override
    public void openDoor() {
        System.out.println("Opening Door");
    }

    @Override
    public void start() {
        System.out.println("Starting Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }

    @Override
    public void engineType() {
        System.out.println("Engine Type: Petrol");
    }
    
}
