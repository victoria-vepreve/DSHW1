import java.util.*;
/**
 * Implementation of a generic Deque that implements Deque_Iter and extends ArrayList
 * Inheriting from ArrayList allows me to use ArrayList's methods without having to write them myself.
 */

public class Deque<E> extends ArrayList< E> implements Deque_Iter<E> {
    /**
     * Implementation of a generic Deque that implements Deque_Iter and extends ArrayList
     * Inheriting from ArrayList allows me to use ArrayList's methods without having to write them myself.
     */
    protected Deque() {
        super();
    }
    /**    (non-Javadoc)
     * @see Deque_Iter#push_front(java.lang.Object)
     */
    @Override
    public void push_front(E element) {
        this.add(0, element);
    }
    /**    (non-Javadoc)
     * @see Deque_Iter#push_back(java.lang.Object)
     */
    @Override
    public void push_back(E element) {
        this.add(element);
    }
    /**    (non-Javadoc)
     * @see Deque_Iter#pop_front()
     */
    @Override
    public E pop_front() {
        if (isEmpty()) return null;
        E x = this.get(0);
        this.remove(0);
        return x;
    }
    /**    (non-Javadoc)
     * @see Deque_Iter#pop_back()
     */
    @Override
    public E pop_back() {
        if (isEmpty()) return null;
        E x = this.get(this.size() -1);
        this.remove(this.size()-1);
        return x;
    }
    /**    (non-Javadoc)
     * Checks if the data structure is empty.
     * @return true if it is empty, false if it is not.
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
     * Returns the number of elements in the data structure at the moment that it is called.
     * @return size of the data structure
     * @see Traversable_Iter#getSize()
     */
    @Override
    public int getSize() {
        return this.size(); 
    }
    /**    (non-Javadoc)
     * Iterates through the data structure and replaces a value any time it is found
     * @param oldValue value to be replaces
     * @param newValue value to replace oldValue with
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
     * Prints all elements in the data structure
     * @see Traversable_Iter#printEls()
     */
    @Override 
    public void printEls(){
        for (Object element: this){
            System.out.println((E) element);
        }
    }
}