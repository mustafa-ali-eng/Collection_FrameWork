import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack  stack = new Stack();
        stack.push(1);
        stack.push("Ali");
        stack.push(null);
        stack.push(3456.676f);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search("Ali"));




    }
}
