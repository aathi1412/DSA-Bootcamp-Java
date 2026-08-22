package stack;

public class ex2 {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        Stack s1 = new Stack(5);
        Stack s2 = new Stack(5);
        Stack s3 = new Stack(10);

        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);
        s1.push(10);

        s2.push(1);
        s2.push(3);
        s2.push(5);
        s2.push(7);
        s2.push(9);

//        practice - 1: Sum

        while (!s1.isEmpty() && !s2.isEmpty()) {
            int sum = 0;
            int a = s1.pop();
            int b = s2.pop();

            sum = a+b;
            s.push(sum);
        }

        s.display();

//        practice - 2:

        while(!s1.isEmpty() && !s2.isEmpty()){
            s.push(s1.pop());
            s.push(s2.pop());
        }
        s.display();
        System.out.println();


        while(!s.isEmpty() && !s3.isFull()){
           s3.push(s.pop());
        }
        
        s3.display();
    }

//    practice - 3:

    while (!s1.isEmpty() && !s2.isEmpty()) {

        int a = s1.pop();
        int b = s2.pop();
        int sum = a+b;

        if (sum % 2 == 0) {
            s.push(a);
            s.push(b);
        } else {
            s.push(b);
            s.push(a);

        }
    }
         while(!s.isEmpty() && !s3.isFull()){
        s3.push(s.pop());
    }

        s3.display();
}
