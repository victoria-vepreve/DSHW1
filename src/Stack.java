//Implement support for all data types (instanceof)
import java.util.*;
public class Stack<E> extends ArrayList<E> implements Stack_Iter<E> {
    /**
    * Calls ArrayList constructor to construct an empty ArrayList to hold the Stack like how it is done in the default Java Stack.
    */
    protected Stack() {
        super();
    }
    @Override
    public void push(E element) {
        this.add(element);
    }
    @Override 
    public E pop() {
        if (this.isEmpty()) return null;
        E x = this.get(this.size() - 1);
        this.remove(this.size()-1);
        return x;
    }
    
    @Override 
    public E top() {
        if (isEmpty()) return null;
        return this.get(this.size()-1);
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