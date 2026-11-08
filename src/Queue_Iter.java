import java.util.*;
public interface Queue_Iter<E> {
    public void enqueue(E node);
    public E dequeue();
    public E peek();
}
