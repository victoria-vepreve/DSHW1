/**
 * Since methods in an interface are public and abstract by default, I do not explicitly declare them as being such.
 * I extend Iterable in order to traverse through my data utilizing already written code.
 * Additionally, I added methods to alter elements as well as print elements, as was specified in the instructions.
 * Traversable_Iter
 * @param <E>
 */

public interface Traversable_Iter<E> extends Iterable<E>{
    boolean isEmpty();
    int getSize();
    void alterEl(E oldValue, E newValue);
    void printEls(); 
}