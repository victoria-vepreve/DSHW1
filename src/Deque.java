import java.util.*;
public class Deque<E> extends ArrayList< E> implements Deque_Iter<E> {
    protected Deque() {
        super();
    }

    @Override
    public void push_front(E element) {
        this.add(0, element);
    }

    @Override
    public void push_back(E element) {
        this.add(element);
    }

    @Override
    public E pop_front() {
        if (isEmpty()) return null;
        E x = this.get(0);
        this.remove(0);
        return x;
    }

    @Override
    public E pop_back() {
        if (isEmpty()) return null;
        E x = this.get(this.size() -1);
        this.remove(this.size()-1);
        return x;
    }
    @Override
    public boolean isEmpty() {
        /**
         * I used ArrayLists's isEmpty() method.
         */
        return super.isEmpty();
    }
    @Override
    public int getSize() {
        return 0; // Placeholder return value  
    }
}