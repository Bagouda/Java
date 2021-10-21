package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems = new DLinkList<>();
    /**
     * number_node represente the number of node in the stack
     */
    private int number_node = 0;


    /**
     * remove the first node of the stack and return its value
     * @return the value of the first node being deleted
     */
    @Override
    public E pop() {
        this.number_node --;
        return this.elems.removeFirst();
    }

    /**
     * add a node at the beginning of the stack
     * @param x the value of the node being added
     */
    @Override
    public void push(E x) {
        this.number_node ++;
        this.elems.addFirst(x);

    }

    /**
     * return the number of node in the stack
     * @return the number of node
     */
    @Override
    public int numOfElems() {
        return this.number_node;
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
