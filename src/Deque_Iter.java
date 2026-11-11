/**
 * Since methods in an interface are public and abstract by default, I do not explicitly declare them as being such.
 * I extend Iterable in order to traverse through my data utilizing already written code.
 * Deque_Iter
 * @param <E>
 */
public interface Deque_Iter<E> extends Traversable_Iter<E>{
    void push_front(E element);
    void push_back(E element);
    E pop_front();
    E pop_back();
}
