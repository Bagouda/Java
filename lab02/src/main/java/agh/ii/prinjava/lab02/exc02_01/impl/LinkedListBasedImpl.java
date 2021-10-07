package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {


    /**Function to remove the last int added to the stack
     *throw an error if the stack is empty
     */
    @Override
    public int pop() {
        if(numOfElems == 0)
            throw new IllegalStateException("The stack is empty");


        numOfElems --;
        Node temp_node = last_node;
        last_node = last_node.next;
        return temp_node.elem;
    }

    /**Function to add an int to the stack
     *
     */
    @Override
    public void push(int x) {
        Node new_node = new Node(x);
        if(numOfElems != 0){
            new_node.next = last_node;
        }
        last_node = new_node;
        numOfElems ++;
    }

    /**
     * function return the number of int in the stack
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * Function returning the last int added to the stack
     * throw a nullPointerException if empty
     */
    @Override
    public int peek() {
        if( last_node == null)
            throw new IllegalStateException("The stack is empty");
        return last_node.elem;


    }


    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }

    private Node last_node;
    private int numOfElems = 0;
}
