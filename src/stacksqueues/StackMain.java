package stacksqueues;

/**
 * Created by manishgiri on 1/27/17.
 */
public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        //add 5 items
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());

        //add another item - should error
        stack.push(60);

        System.out.println(stack.peek());

        //delete 5 items
        while(!stack.isEmpty()) {
            System.out.println("Deleted = " + stack.pop());
        }

        //System.out.println(stack.peek());

    }
}
