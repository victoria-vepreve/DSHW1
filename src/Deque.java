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
        return this.size(); 
    }
    @Override 
    public void alterEl(E oldVal, E newVal){
        ListIterator<E> iterator = this.listIterator();
        while (iterator.hasNext()){
            E element = (E) iterator.next();
            if ((element != null) && (element.equals(oldVal))){
                iterator.set(newVal);
            }
        }
    }
    @Override 
    public void printEls(){
        for (Object element: this){
            System.out.println((E) element);
        }
    }
}