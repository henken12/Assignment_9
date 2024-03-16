package Assignment9;

import org.w3c.dom.Node;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return top.data;
    }

}


