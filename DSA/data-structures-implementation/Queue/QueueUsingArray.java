package Queue;

public class Queue {
    private int front, rear = -1;
    private int[] queue;
    int SIZE, maxsize;

    public Queue(int Size){
        SIZE = Size;
        queue = new int[SIZE];
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return rear == SIZE-1;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("enqueue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        queue[++rear] = data;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("dequeue is empty");
            return -1;
        }
        int val = queue[front];
        if(front == rear){
            front = rear = -1; // reset queue
        } else {
            front++;
        }
        return val;
    }
    public int poll(){
        return dequeue();
    }
    public void display(){
        if(isEmpty()){
             System.out.println("display queue is empty");
            return ;
        }
        for (int i = front; i <= rear ; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
