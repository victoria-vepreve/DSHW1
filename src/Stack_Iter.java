/**
 * 
 * Interface that defines the Stack data structure. I extended Traversable_Iter to inherit its methods to traverse and modify.
 * Stack_Iter
 * @param <E> generic type
 */
public interface Stack_Iter<E> extends Traversable_Iter<E>{
    /**
     * Adds element to top of stack
     * @param element element that the user wants to add
     */
    void push(E element); 
    /**
     * Removes and returns element at the top of stack.
     * @return the removed element if there is an element being removed, and null if the stack is empty
     */
    E pop();
    /**
     * Shows the element at the top of the stack without removing it.
     * @return the element at the top, or null if the stack is empty
     */
    E top();
}
