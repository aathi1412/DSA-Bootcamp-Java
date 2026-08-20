package LinkedList;

public class dd {
    private Node Head;
    private Node Tail;

// Node class
    public class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    // Add
    public void add(int data){
        Node node = new Node(data);
        if(Head == null){
            Head = node;
            Tail = Head;
            return;
        }

        Node curr = Head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
        curr.next.prev = curr;
        Tail = curr.next;
        
    }

    //Add First
    public void addFirst(int data){
        Node node = new Node(data);
        if(Head == null){
            Head = node;
            Tail = Head;
            return;
        }

        node.next = Head;
        Head.prev = node;
        Head = node;
    }

    //Add Last
    public void addLast(int data){
        add(data);

    }

    //Add in Index
    public void addToIndex(int data, int idx){
        Node node = new Node(data);
        if(Head == null){
            Head = node;
            Tail = Head;
            return;
        }
        if(idx == 1){
            addFirst(data);
            return;
        }

        Node curr = Head;
        try {
            for(int i = 1; i < idx-1; i++){
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next.prev = node;
            node.prev = curr;
            curr.next = node;
        }
        catch (Exception e) {
            System.out.print("Index larger than list size");
        }
    }

    //Delete
    public void delete(){
        if(Head == null){
            System.out.print("LL is Empty");
            return;
        }
        Node curr = Head;
        Node prev = null;

        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        Tail = prev;
    }

    //Delete First
    public void deleteFirst(){
        if(Head == null){
            System.out.print("LL is Empty");
            return;
        }

        Head = Head.next;
        Head.prev = null;
    }

    //Delete Last
    public void deleteLast(){
        delete();
    }

    //Delete in Index
    public void deleteToIndex(int idx){
        if(Head == null){
            System.out.print("LL is Empty");
            return;
        }
        if(idx == 1){
            deleteFirst();
            return;
        }
        Node curr = Head;
        Node prev = null;
        try {
            for(int i = 1; i < idx; i++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            curr.next.prev = prev;
        }
        catch (Exception e) {
            System.out.println("Index larger than list size");
        }
    }

    public void displayFromHead(){
        Node curr = Head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public void displayFromTail(){
        Node tail = Tail;

        while(tail != null){
            System.out.print(tail.data + " -> ");
            tail = tail.prev;
        }
        System.out.println();
    }

    public void reverse(){
        Tail = Head;
        Node left = null;
        Node right = Head;

        while(right != null){
            Node temp = right.next;
            right.next = left;
            right.prev = temp;
            if(left != null) left.prev = right;
            left = right;
            right = temp;
        }
        Head = left;
        Head.prev = null;
    }

}
