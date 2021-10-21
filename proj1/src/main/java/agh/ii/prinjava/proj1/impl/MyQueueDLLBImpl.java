package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems = new DLinkList<>();

    /**
     * number_node is an integer representing the number of nodes in the queue
     */
    private int number_node = 0;


    /**
     * enqueue add a node at the end of the queue
     * @param x the value of the node to add
     */
    @Override
    public void enqueue(E x) {
        this.elems.addLast(x);
        this.number_node ++;
    }

    /**
     * dequeue delete and return the value of the first node of the queue
     * @return the value of the first node of the queue
     */
    @Override
    public E dequeue() {

        this.number_node --;
        return this.elems.removeFirst();
    }

    /**
     * return the number of node in the queue
     * @return the number of node
     */
    @Override
    public int numOfElems() {
        return this.number_node;
    }

    /**
     * return the value of the first node of the queue without removing it
     * @return the value of the first node of the queue
     */
    @Override
    public E peek() {
        return  elems.peek_node(elems.first);
    }
}
