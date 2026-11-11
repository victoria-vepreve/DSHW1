/**
 * Interface that defines the Queue data structures. I extended Traversable_Iter to inherit its methods to traverse and modify.
 * Queue_Iter
 * @param <E> generic type of elements
 */
public interface Queue_Iter<E> extends Traversable_Iter<E>{
    /**
     * Adds an element to the back of the queu
     * @param element element that will be added to the queue
     */
    void enqueue(E element);
    /**
     * Removes and returns the element at the front of the queue
     * @return the removed element if it is present, or null if the queue is empty
     */
    E dequeue();
    /**
     * Retrieves the element at the front of the queue without removing it
     * @return the front element if it is present, or null if the queue is empty
     */
    E peek();
}
