package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

public interface StackOfInts {

    /**Function removing the last int added to the stack
     *
     */
    int pop();

    /**Function adding an int to the stack
     *
     */
    void push(int x);

    /**
     * function returning a boolean depending on the state of the stack
     * if the stack is empty it returns True
     * else it returns False
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * function return the number of int in the stack
     */
    int numOfElems();

    /**
     * Function returning the last int added to the stack
     */
    int peek();
}
