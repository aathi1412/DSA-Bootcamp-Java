package LinkedList;

public class Linked_lists {
    
    private Node Head;
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public void add(int data){
        Node newnode = new Node(data);

        if(Head == null){
            Head = newnode;
            return;
        }
        Node current = Head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    public void addFirst(int data){
        Node newnode = new Node(data);
        if(Head == null){
            Head = newnode;
        }
        else{
            newnode.next = Head;
            Head = newnode;
        }
    }
    
    public void addindex(int data, int i){ 
        Node newnode = new Node(data);
        if(Head == null){
           Head = newnode;
            return;
        }
        Node current = Head;
        for (int j = 0; j < i-1; j++) {
            current = current.next;
        }
        newnode.next = current.next;
        current.next = newnode;
    }


    public void remove(){
        
         if(Head.next == null){
            Head = null;
         }
         else{
             Node previous = Head;
            while (previous.next.next != null) {
            previous = previous.next;
         }
         previous.next = null;
         }  
    }
    public void removefirst(){
        Node current = Head;
        Head = Head.next;
        current = null;
        
    }

    public void removeindex(int i){ 
        if(Head == null){
            System.out.println("Empty");
            return;
        }
        Node current = Head;
        for (int j = 0; j < i-1; j++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void display(){
        Node current = Head;
         while (current != null) {
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void addLast(int data){
        add(data);
    }

    public int size(){
        if(Head == null){
            return 0;
        }
        int count=0;
        Node current = Head;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public int Sum(){ 
        if(Head == null){
            System.out.println("Empty");
            return 0;
        }
        Node current = Head;
        int sum = 0;
        
        for (int j = 0; j < size() ; j++) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }
    
}
