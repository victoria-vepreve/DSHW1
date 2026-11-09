import java.util.*;

public class mainuserclass {
    /**
     * Main way for the user to interact with the program. Allows the user to use the Stack, Queue, and Deque data structures.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /**
         * I used instances of Object so each can accept the same data structure type.
         */
        Stack<Object> stack = new Stack<>();
        Queue<Object> queue = new Queue<>();
        Deque<Object> dequeue = new Deque<>();
        while (true){
            System.out.println("Choose a data structure or to stop.");
            System.out.println("1) Stack");
            System.out.println("2) Queue");
            System.out.println("3) Deque");
            System.out.println("4) Stop");

            String user = sc.nextLine();

            if(user.equals("1")){
                stackUser(sc, stack);
            }
            else if (user.equals("2")){
                queueUser(sc, queue);
            }
            else if (user.equals("3")){
                dequeUser(sc, dequeue);
            }
            else if (user.equals("4")){
                System.out.println("Stopped.");
                break;
            }
            else{
                System.out.println("Invalid input.");
            }
        }
    }

    protected static <E> void stackUser(Scanner sc, Stack<E> stack){
        while (true) { 
            System.out.println("Choose an action.");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Top");
            System.out.println("4) Print");
            System.out.println("5) Check Size");
            System.out.println("6) Stop");

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
                for (E element: stack){
                    System.out.println(element);
                }
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
    protected  static <E> void queueUser(Scanner sc, Queue<E> queue){
        while (true) { 
            System.out.println("Choose an action.");
            System.out.println("1) Enqueue");
            System.out.println("2) Dequeue");
            System.out.println("3) Peek");
            System.out.println("4) Print");
            System.out.println("5) Check Size");
            System.out.println("6) Stop");

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
                for (E element: queue){
                    System.out.println(element);
                }
            }
            else if (user.equals("5")){
                System.out.println(queue.getSize());
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
    protected  static <E> void dequeUser(Scanner sc, Deque<E> deque){
        while (true) { 
            System.out.println("Choose an action.");
            System.out.println("1) Push Front");
            System.out.println("2) Push Back");
            System.out.println("3) Pop Front");
            System.out.println("4) Pop Back");
            System.out.println("5) Print");
            System.out.println("6) Check Size");
            System.out.println("7) Stop");

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
                for (E element: deque){
                    System.out.println(element);
                }
            }
            else if (user.equals("6")){
                System.out.println(deque.getSize());
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
}
