package stack;

import java.util.Scanner;

public class StackUsingArray {
    Scanner s = new Scanner(System.in);
    private int top;
    int SIZE;
    private int[] stack;
    private int maxSize;

    public StackUsingArray(int SIZE){
        top =-1;
        this.SIZE = SIZE;
        stack = new int[SIZE];
        maxSize = SIZE-1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("stack overflow");
        }
        stack[++top] = data;
    }

     public int pop(){
        if(isEmpty()){
            System.out.println("pop stack underflow");
        }
        return stack[top--];
    }


     public int peek(){
        if(isEmpty()){
            System.out.println("peek stack underflow");
            return top;
        }
        return stack[top];
    }


    public void display(){
        if(isEmpty()){
            System.out.println("display stack underflow");
        }

        for (int i = top; i >= 0 ; i--) {
            System.out.print(stack[i]+" ");
        }
    }


    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }


    public boolean isFull(){
        if(SIZE == maxSize){
            return true;
        }
        return false;
    }
}
