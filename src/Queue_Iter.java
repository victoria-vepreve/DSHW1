/**
 * Since methods in an interface are public and abstract by default, I do not explicitly declare them as being such.
 * I extend Iterable in order to traverse through my data utilizing already written code.
 * Queue_Iter
 * @param <E>
 */
public interface Queue_Iter<E> extends Traversable_Iter<E>{
    void enqueue(E element);
    E dequeue();
    E peek();
}
