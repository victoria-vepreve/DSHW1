import java.util.*;
public interface Deque_Iter<E> {
    public void push_front(E node);
    public void push_back(E node);
    public E pop_front();
    public E pop_back();
}
