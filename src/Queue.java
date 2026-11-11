/**
 * Implementation of a generic Queue that implements Queue_Iter and extends ArrayList
 * Inheriting from ArrayList allows me to use ArrayList's methods without having to write them myself.
 */
import java.util.*;
public class Queue<E> extends ArrayList<E> implements Queue_Iter<E> {
    /**
     * Calls ArrayList constructor to construct an empty ArrayList to hold the Queue.
     */
    protected Queue() {
        super();
    }
    /**    (non-Javadoc)
     * @see Queue_Iter#enqueue(java.lang.Object)
     */
    @Override 
    public void enqueue(E element) {
        this.add(element);
    }
    /**    (non-Javadoc)
     * @see Queue_Iter#dequeue()
     */
    @Override 
    public E dequeue() {
        if (this.isEmpty()) return null;
        E x = this.get(0);
        this.remove(0);
        return x;
    }
    /**    (non-Javadoc)
     * @see Queue_Iter#peek()
     */
    @Override 
    public E peek() {
        if (isEmpty()) return null;
        return this.get(0);
    }
    /**    (non-Javadoc)
     * @see java.util.ArrayList#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        /**
         * I used ArrayLists's isEmpty() method.
         */
        return super.isEmpty();
    }
    /**    (non-Javadoc)
     * @see Traversable_Iter#getSize()
     */
    @Override
    public int getSize() {
        return this.size(); 
    }
    /**    (non-Javadoc)
     * @see Traversable_Iter#alterEl(java.lang.Object, java.lang.Object)
     */
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
    /**    (non-Javadoc)
     * @see Traversable_Iter#printEls()
     */
    @Override 
    public void printEls(){
        for (Object element: this){
            System.out.println((E) element);
        }
    }
}