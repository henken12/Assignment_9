package Assignment9;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();


        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);


        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }


        System.out.println("Dequeue from empty queue: " + queue.dequeue());
    }

}
