package stack;

public class BubbleSortUsingStack {
    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray(5);
        StackUsingArray s1 = new StackUsingArray(5);
        StackUsingArray temp = new StackUsingArray(5);

        s1.push(34);
        s1.push(3);
        s1.push(31);
        s1.push(98);
        s1.push(23);

        while (!s1.isEmpty() ) {
            if(!temp.isEmpty()){
                while(s1.pop() > s1.peek()){
                    temp.push(s1.peek());
                }
            }
        }

        temp.display();
        
        
    }
}
