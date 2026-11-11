import java.util.*;
/**
 * Implementation of a generic Queue that implements Queue_Iter and extends ArrayList
 * Inheriting from ArrayList allows me to use ArrayList's methods without having to write them myself.
 * @param <E> generic type
*/

public class Queue<E> extends ArrayList<E> implements Queue_Iter<E> {
    /**
     * Calls ArrayList constructor to construct an empty ArrayList to hold the Queue.
     */
    protected Queue() {
        super();
    }
    /**   
     * Adds an element to the back of the queue
     * @param element element that will be added to the queue
     * @see Queue_Iter#enqueue(java.lang.Object)
     */
    @Override 
    public void enqueue(E element) {
        this.add(element);
    }
    /**   
     * Removes and returns the element at the front of the queue
     * @return the removed element if it is present, or null if the queue is empty
     * @see Queue_Iter#dequeue()
     */
    @Override 
    public E dequeue() {
        if (this.isEmpty()) return null;
        E x = this.get(0);
        this.remove(0);
        return x;
    }
    /**    
     * Retrieves the element at the front of the queue without removing it
     * @return the front element if it is present, or null if the queue is empty
     * @see Queue_Iter#peek()
     */
    @Override 
    public E peek() {
        if (isEmpty()) return null;
        return this.get(0);
    }
    /** 
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
    /**  
     * Returns the number of elements in the data structure at the moment that it is called.
     * @return size of the data structure
     * @see Traversable_Iter#getSize()
     */
    @Override
    public int getSize() {
        return this.size(); 
    }
    /**  
     * Iterates through the data structure and replaces a value any time it is found
     * @param oldVal value to be replaces
     * @param newVal value to replace oldVal with
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
    /**   
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