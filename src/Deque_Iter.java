/**
 * I inherited Traversable_Iter to inherit its methods to traverse and modify.
 * @param <E>
 */
public interface Deque_Iter<E> extends Traversable_Iter<E>{
    void push_front(E element);
    void push_back(E element);
    E pop_front();
    E pop_back();
}
