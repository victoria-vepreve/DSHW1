import java.util.*;

/**
 * Main app class. Contains all methods for the user to interact with the Stack, Queue, and Deque classes.
 * Nested while loops with if-else statements allow the user to interact with the program.
 * mainuserclass
 */
public class mainuserclass {
    /**
     * Main way for the user to interact with the program. Allows the user to use the Stack, Queue, and Deque data structures.
     * Data structures are initialized with the Object type in order to accept any object.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stack<Object> stack = new Stack<>();
        Queue<Object> queue = new Queue<>();
        Deque<Object> deque = new Deque<>();
        while (true){
            System.out.println("Choose a data structure or to stop.");
            System.out.println("1) Stack");
            System.out.println("2) Queue");
            System.out.println("3) Deque");
            System.out.println("4) Quit");
            System.out.println("5) Automatic Demonstration");

            String user = sc.nextLine();

            if(user.equals("1")){
                stackUser(sc, stack);
            }
            else if (user.equals("2")){
                queueUser(sc, queue);
            }
            else if (user.equals("3")){
                dequeUser(sc, deque);
            }
            else if (user.equals("4")){
                System.out.println("Quit.");
                break;
            }
            else if (user.equals("5")){
                test(stack,queue,deque);
            }
            else{
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * Automatically populates and depopulates all data structures in order to show that the program works.
     * Separated into its own method in order to only run when prompted by the user.
     * 
     * @param stack the instance of Stack being tested
     * @param queue the instance of Queue being tested
     * @param deque the instance of Deque being tested
     */
    protected static void test(Stack<Object> stack, Queue<Object> queue, Deque<Object> deque){
        System.out.println("Auto Test In Progress:");

        System.out.println("Stack Populating");
        stack.push("Stack E1");
        stack.push("Stack E2");
        stack.push("Stack E3");
        System.out.println("Stack size: " + stack.getSize());

        System.out.println("Queue Populating");
        queue.enqueue("Queue E1");
        queue.enqueue("Queue E2");
        queue.enqueue("Queue E3");
        System.out.println("Queue size: " + queue.getSize());

        System.out.println("Deque Populating");
        deque.push_back("Deque EMiddle");
        deque.push_front("Deque EFront");
        deque.push_back("Deque EBack");
        System.out.println("Deque size: " + deque.getSize());

        System.out.println("Stack Depopulating");
        while (!stack.isEmpty()){
            System.out.println("Popped: " + stack .pop());
        }

        System.out.println("Queue Depopulating");
        while (!queue.isEmpty()){
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Deque Depopulating");
        while (!deque.isEmpty()){
            /**
             * Both pops are utilized in order to showcase them working.
             */
            if (deque.getSize() % 2 == 0){
                System.out.println("Front Popped: " + deque.pop_front());
            }
            else{
                System.out.println("Back Popped: " + deque.pop_back());
            }
        }

        System.out.println("All structures have been populated and depopulated.");


    }
    /**
     * User interaction with Stack.
     * Allows for operations such as push, pop, top, print, alter element, and check size.
     * @param <E> the generic type
     * @param sc the Scanner for user input
     * @param stack the Stack instance being modified
     */
    protected static <E> void stackUser(Scanner sc, Stack<E> stack){
        while (true) { 
            System.out.println("Choose an action.");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Top");
            System.out.println("4) Print");
            System.out.println("5) Alter Element");
            System.out.println("6) Check Size");
            System.out.println("7) Stop");

            String user = sc.nextLine();

            if(user.equals("1")){
                System.out.print("Enter element:");
                stack.push((E) sc.nextLine());
            }
            else if (user.equals("2")){
                stack.pop();
                System.out.println("Element popped.");
            }
            else if (user.equals("3")){
                System.out.println("Top: " + stack.top());
            }
            else if (user.equals("4")){
                System.out.println("Elements Of Stack:");
                stack.printEls();
            }
            else if (user.equals("5")){
                System.out.println("Which value would you like to change?");
                E oldVal = (E) sc.nextLine();
                System.out.println("Enter what you want the replacement to be.");
                E newVal = (E) sc.nextLine();
                stack.alterEl(oldVal, newVal);
            }
            else if (user.equals("5")){
                System.out.println(stack.getSize());
            }
            else if (user.equals("6")){
                System.out.println("Stopped.");
                break;
            }
            else{
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * User interaction with Queue.
     * Allows for operations such as enqueue, dequeue, peek, print, alter, and check size
     * @param <E> generic type
     * @param sc the Scanner for user input
     * @param queue the Queue instance being modified
     */
    protected  static <E> void queueUser(Scanner sc, Queue<E> queue){
        while (true) { 
            System.out.println("Choose an action.");
            System.out.println("1) Enqueue");
            System.out.println("2) Dequeue");
            System.out.println("3) Peek");
            System.out.println("4) Print");
            System.out.println("5) Alter Element");
            System.out.println("6) Check Size");
            System.out.println("7) Stop");

            String user = sc.nextLine();

            if(user.equals("1")){
                System.out.print("Enter element: ");
                queue.enqueue((E) sc.nextLine());
            }
            else if (user.equals("2")){
                queue.dequeue();
                System.out.println("Dequeued.");
            }
            else if (user.equals("3")){
                System.out.println("Peek:" + queue.peek());
            }
            else if (user.equals("4")){
                System.out.println("Elements Of Stack:");
                queue.printEls();
            }
            else if (user.equals("5")){
                System.out.println("Which value would you like to change?");
                E oldVal = (E) sc.nextLine();
                System.out.println("Enter what you want the replacement to be.");
                E newVal = (E) sc.nextLine();
                queue.alterEl(oldVal, newVal);
            }
            else if (user.equals("6")){
                System.out.println(queue.getSize());
            }
            else if (user.equals("7")){
                System.out.println("Stopped.");
                break;
            }
            else{
                System.out.println("Invalid input.");
            }
        }

    }
    /**
     * User interaction with Deque.
     * Allows for operations such as push front/back, pop front/back, print, alter, and check size
     * @param <E> generic type
     * @param sc the Scanner for user input
     * @param deque the Deque instance being modified
     */
    protected  static <E> void dequeUser(Scanner sc, Deque<E> deque){
        while (true) { 
            System.out.println("Choose an action.");
            System.out.println("1) Push Front");
            System.out.println("2) Push Back");
            System.out.println("3) Pop Front");
            System.out.println("4) Pop Back");
            System.out.println("5) Print");
            System.out.println("6) Alter Element");
            System.out.println("7) Check Size");
            System.out.println("8) Stop");

            String user = sc.nextLine();

            if(user.equals("1")){
                System.out.println("Enter element: ");
                deque.push_front((E) sc.nextLine());
            }
            else if (user.equals("2")){
                System.out.println("Enter element: ");
                deque.push_back((E) sc.nextLine());
            }
            else if (user.equals("3")){
                deque.pop_front();
                System.out.println("Front popped.");
            }
            else if (user.equals("4")){
                deque.pop_back();
                System.out.println("Back popped.");
            }
            else if (user.equals("5")){
                System.out.println("Elements Of Stack:");
                deque.printEls();
            }
            else if (user.equals("6")){
                System.out.println("Which value would you like to change?");
                E oldVal = (E) sc.nextLine();
                System.out.println("Enter what you want the replacement to be.");
                E newVal = (E) sc.nextLine();
                deque.alterEl(oldVal, newVal);
            }
            else if (user.equals("7")){
                System.out.println(deque.getSize());
            }
            else if (user.equals("8")){
                System.out.println("Stopped.");
                break;
            }
            else{
                System.out.println("Invalid input.");
            }
        }

    }
}
