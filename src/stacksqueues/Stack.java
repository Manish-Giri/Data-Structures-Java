package stacksqueues;

/**
 * Created by manishgiri on 1/26/17.
 */
public class Stack {

    //private members
    private int maxSize;
    //to point to top of stack always
    private int top;
    //array used to build the stack
    private int[] stackArray;

    //constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; //empty stack at the start
    }

    //stack methods
    //add item to stack
    public void push(int item) {
        //to add an item, first increment top, then add new item at new top
        stackArray[++top] = item;
    }

    //pop item from top of stack - LIFO
    public int pop() {
        //to remove an item - first get item from cell pointed to by top, then reduce top
        return stackArray[top--];
    }

    //peek - display item at top of stack, without removing it
    public int peek() {
        return stackArray[top];
    }

    
}