import java.util.*;
public class Queue<E> extends ArrayList<E> implements Queue_Iter<E> {
    /**
     * 
     */
    protected Queue() {
        super();
    }
    @Override 
    public void enqueue(E element) {
        this.add(element);
    }
    @Override 
    public E dequeue() {
        if (this.isEmpty()) return null;
        E x = this.get(0);
        this.remove(0);
        return x;
    }
    @Override 
    public E peek() {
        if (isEmpty()) return null;
        return this.get(0);
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