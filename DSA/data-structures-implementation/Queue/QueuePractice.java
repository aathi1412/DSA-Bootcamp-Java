package Queue;

public class queue2 {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        Queue q2 = new Queue(5);
        Queue q = new Queue(10);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        q2.enqueue(6);
        q2.enqueue(7);
        q2.enqueue(8);
        q2.enqueue(9);
        q2.enqueue(10);

//        practice - 1:

        while( !q1.isEmpty() && !q2.isEmpty() ){
            int a = q1.dequeue();
            int b = q2.dequeue();
            if(a % 2 == 0){
                q.enqueue(a + b);
            }
            else if(a%2 != 0){
                q.enqueue(a-b);
            }
            else{
                q.enqueue(q2.dequeue());
            }

        }
        if(!q1.isEmpty()){
            while (!q1.isEmpty()) {
                q.enqueue(q1.dequeue());
            }
        }
        else{
            while (!q2.isEmpty()) {
                q.enqueue(q2.dequeue());
            }
        }
        q.display();

//        practice - 2:

        int k =9;

        while(!q1.isEmpty() && !q2.isEmpty()){
            int a = q1.dequeue();
            int b = q2.dequeue();
            int sum = a+b;
            if(sum == k){
                q.enqueue(a);
                q.enqueue(b);
            }
        }
        q.display();

//        practice - 3:

        boolean flag = false;
        while(!q1.isEmpty() && !q2.isEmpty()){
            int a = q1.dequeue();
            int b = q2.dequeue();
            int sum = a+b;

             if(isoptimus_prime(sum)){
                 q.enqueue(sum);
                 flag = true;
             }  
        }
        if(flag)
            q.display();
        else
            System.out.print("null ");

    }

    public static  boolean isoptimus_prime(int m){
        if(m < 2) return false;
        for (int i = 2; i < m/2; i++) {
            if(m % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
