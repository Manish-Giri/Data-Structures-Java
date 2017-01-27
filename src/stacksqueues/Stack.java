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
}
