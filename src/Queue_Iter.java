/**
 * Interface that defines the Queue data structures. I extended 
 * Queue_Iter
 * @param <E>
 */
public interface Queue_Iter<E> extends Traversable_Iter<E>{
    void enqueue(E element);
    E dequeue();
    E peek();
}
