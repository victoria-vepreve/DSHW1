/**
 * Since methods in an interface are public and abstract by default, I do not explicitly declare them as being such.
 * I extend Iterable in order to traverse through my data utilizing already written code.
 * Additionally, I added methods to alter elements as well as print elements, as was specified in the instructions.
 * Traversable_Iter
 * @param <E> generic type
 */

public interface Traversable_Iter<E> extends Iterable<E>{
    /**
     * Checks if the data structure is empty.
     * @return true if it is empty, false if it is not.
     */
    boolean isEmpty();
    /**
     * Returns the number of elements in the data structure at the moment that it is called.
     * @return size of the data structure
     */
    int getSize();
    /**
     * Iterates through the data structure and replaces a value any time it is found
     * @param oldValue value to be replaces
     * @param newValue value to replace oldValue with
     */
    void alterEl(E oldValue, E newValue);
    /**
     * Prints all elements in the data structure
     */
    void printEls(); 
}