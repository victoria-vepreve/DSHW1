/**
 * Interface that defines the Deque data structure. I extended Traversable_Iter to inherit its methods to traverse and modify.
 * @param <E> the generic type of element
 */
public interface Deque_Iter<E> extends Traversable_Iter<E>{
    /**
     * Adds an element to the front of the deque
     * @param element the element that will be added
     */
    void push_front(E element);
    /**
     * Adds an element tothe back of the deeue
     * @param element the element that will be added
     */
    void push_back(E element);
    /** 
     * Removies and returns the element at the front of the deque
    */
    E pop_front();
    /**
     * Removes and returns the element at the back of the deque
     * @return the removed element if there is an element present, or null if the deque is empty
     */
    E pop_back();
}
