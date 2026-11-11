import java.util.*;
/**
 * Implementation of a generic Stack that implements Stack_Iter and extends ArrayList
 * Inheriting from ArrayList allows me to use ArrayList's methods without having to write them myself
 * @param <E> generic type 
*/

public class Stack<E> extends ArrayList<E> implements Stack_Iter<E> {
    /**
    * Calls ArrayList constructor to construct an empty ArrayList to hold the Stack like how it is done in the default Java Stack.
    */
    protected Stack() {
        super();
    }
    /**   
     * Adds element to top of stack
     * @param element element that the user wants to add
     * @see Stack_Iter#push(java.lang.Object)
     */
    @Override
    public void push(E element) {
        this.add(element);
    }
    /**   
     * Removes and returns element at the top of stack.
     * @return the removed element if there is an element being removed, and null if the stack is empty
     * @see Stack_Iter#pop()
     */
    @Override 
    public E pop() {
        if (this.isEmpty()) return null;
        E x = this.get(this.size() - 1);
        this.remove(this.size()-1);
        return x;
    }
    /**   
     * Shows the element at the top of the stack without removing it.
     * @return the element at the top, or null if the stack is empty
     * @see Stack_Iter#top()
     */
    @Override 
    public E top() {
        if (isEmpty()) return null;
        return this.get(this.size()-1);
    }
    /**    
     * Checks whether the stack is empty
     * @return true if there are no elements, false otherwise
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
     * Gets the number of elements in the stack.
     * @return the integer size of the stack
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