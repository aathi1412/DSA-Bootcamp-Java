

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        if(s == s1) System.out.println("tere");

    }
}
