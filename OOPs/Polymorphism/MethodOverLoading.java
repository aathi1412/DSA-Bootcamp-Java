package JavaBootcamp.OOPs.Polymorphism;

public class MethodOverLoading {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        sum();
        sum(a, b);
        sum(a, b, c);

        // Same method name with different parameters.
    }

    private static void sum() {
        System.out.print("add nums: ");
        System.out.println(100 + 50 + 50);
    }

    private static void sum(int a, int b) {
        System.out.print("add two nums: ");
        System.out.println(a + b);
    }

    private static void sum(int a, int b, int c) {
        System.out.print("add three nums: ");
        System.out.println(a + b + c);
    }
}
