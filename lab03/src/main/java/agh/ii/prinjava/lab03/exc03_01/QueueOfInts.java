package agh.ii.prinjava.lab03.exc03_01;

public interface QueueOfInts {

    /**
     * function to add a node at the bottom of the queue
     * @param x: value of the node added
     */
    void enqueue(int x);

    /**
     * Remove the first node from the queue and return its value
     * @return int : value of the first node
     *
     * @throws IllegalStateException : When you try to remove a node from an empty queue
     */
    int dequeue();

    /**
     *check if the queue is empty
     * @return boolean: true if the list is empty and false if not
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * function allowing to keep track of the number of node in the queue
     * @return int :  number of node present in the queue
     */
    int numOfElems();

    /**
     * Similar to enqueue but doesn't remove the node from the queue
     * @return int : value of the first node of the queue
     *
     * @throws IllegalStateException: when you try to return the value of an empty queue
     */
    int peek();
}
