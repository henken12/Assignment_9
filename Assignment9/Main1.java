package Assignment9;

public class Main1 {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        
        stack.push(1);
        stack.push(2);
        stack.push(3);


        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


        System.out.println("Pop from empty stack: " + stack.pop());
    }


}
