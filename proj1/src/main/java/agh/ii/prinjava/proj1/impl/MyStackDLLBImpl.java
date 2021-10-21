package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems = new DLinkList<>();


    /**
     * remove the first node of the stack and return its value
     * @return the value of the first node being deleted
     */
    @Override
    public E pop() {
        return this.elems.removeFirst();
    }

    /**
     * add a node at the beginning of the stack
     * @param x the value of the node being added
     */
    @Override
    public void push(E x) {
        this.elems.addFirst(x);

    }

    /**
     * return the number of node in the stack
     * @return the number of node
     */
    @Override
    public int numOfElems() {
        return this.elems.numElem();
    }

    /**
     * return the value of the first node without removing it
     * @return the value of the first node
     */
    @Override
    public E peek() {
        return elems.peek_node(elems.first);
    }
}
