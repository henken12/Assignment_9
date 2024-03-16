package Assignment9;

public class ArrayQueueImpl {

        private int[] arr = new int[10];
        private int front = -1;
        private int rear = 0;

        public boolean isEmpty() {
            return front == -1;
        }

        public int size() {
            if (isEmpty()) return 0;
            return rear - front;
        }

        public void enqueue(int obj) {
            if (rear == arr.length) {
                resize();
            }
            arr[rear++] = obj;
            if (front == -1) {
                front = 0;
            }
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int item = arr[front];
            if (front == rear - 1) {
                front = -1;
                rear = 0;
            } else {
                front++;
            }
            return item;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }

        private void resize() {
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, front, newArr, 0, rear - front);
            arr = newArr;
            rear -= front;
            front = 0;
        }

}
