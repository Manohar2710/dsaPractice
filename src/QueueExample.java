import java.util.Arrays;

public class QueueExample {
    public void runExample() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        queue.enqueue(50);
        System.out.println("Peeked value "+ queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
//        queue.show();
    }



    static class Queue {
        int front = 0;
        int rear;
        int size;
        int[] arr;
        Queue() {
            front = 0;
            rear = -1;
            size = 0;
            arr = new int[4];
        }


        public void enqueue(int i) {
            if(isFull()) {
                throw new RuntimeException("Queue is full");
            } else {
                rear = (rear+1) % 4;
                arr[rear] = i;
                size++;
            }

        }
        public boolean isFull() {
            return size == 4;
        }
        public int peek() {
            return arr[front];
        }
//        public void show() {
//            for(int i = front; i < size ; i++) {
//                System.out.println(arr[i]+ " ");
//            }
//        }

        public int dequeue() {
            int data = arr[front];
            if(isEmpty()) {
                throw new RuntimeException("Queue is empty");
            } else {
                front = (front+1)%4;
                size--;
            }

            return data;
        }

        private boolean isEmpty() {
            return size == 0;
        }
    }

}
