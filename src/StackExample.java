
public class StackExample {

    public void runExample() {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(20);
        stack.push(30);

        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.printStack();
    }

    public class Stack {
        int[] arr = new int[5];
        int top;
        int size = 0;

        // Non Parameterised constructor to initialize stack
        Stack() {
            size = arr.length;
            top = -1;
        }

        // function to push a element to stack
        public void push(int i) {
            top++;
            if(top < size )
                arr[top] = i;
            else
                System.out.println("Stack Over-flow");
        }

        //function to print all stack elements
        public void printStack() {
            for (int num: arr) {
                System.out.print(num+" ");
            }
            System.out.println();
        }

        // function to pop the last element in stack
        public int pop() {
            if(top > -1) {
                int popedElement = arr[top];
                arr[top-- ] = 0;
                return popedElement;
            }
            else
                System.out.println("Stack under-flow");
            return 0;
        }

        // function to get the last element in stack 
        public int peek() {
            return arr[top];
        }
    }
}

