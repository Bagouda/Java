package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems = new DLinkList<>();


    /**
     * enqueue add a node at the end of the queue
     * @param x the value of the node to add
     */
    @Override
    public void enqueue(E x) {
        this.elems.addLast(x);
    }

    /**
     * dequeue delete and return the value of the first node of the queue
     * @return the value of the first node of the queue
     */
    @Override
    public E dequeue() {
        return this.elems.removeFirst();
    }

    /**
     * return the number of node in the queue
     * @return the number of node
     */
    @Override
    public int numOfElems() {
        return elems.numElem();
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
