package Stack;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Output: Top element: 30

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 30
        System.out.println("Top element after pop: " + stack.peek()); // Output: Top element: 20

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Output: Is stack empty? false

        // Search for an element
        System.out.println("Position of 10: " + stack.search(10)); // Output: Position of 10: 2
    }
}

   
