package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

public class LinkedListBasedImpl implements QueueOfInts {

    /**
     * function to add a node at the bottom of the queue
     * @param x: value of the node added
     */
    @Override
    public void enqueue(int x) {

        Node new_node = new Node(x,first,last);
        if(numOfElems == 0){
            first = new_node;
            last = new_node;
        }
        last.next = new_node;
        last = new_node;
        numOfElems ++;

    }

    /**
     * Remove the first node from the queue and return its value
     * @return int : value of the first node
     *
     * @throws IllegalStateException : When you try to remove a node from an empty queue
     */
    @Override
    public int dequeue() {
        if(numOfElems == 0)
            throw new IllegalStateException("The queue is empty");
        Node temp_node = first;
        if (first.next != null)
            first =  first.next;
        numOfElems --;
        return temp_node.elem;

    }

    /**
     * function allowing to keep track of the number of node in the queue
     * @return int :  number of node present in the queue
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * Similar to enqueue but doesn't remove the node from the queue
     * @return int : value of the first node of the queue
     *
     * @throws IllegalStateException: when you try to return the value of an empty queue
     */
    @Override
    public int peek() {
        if (first == null)
            throw new IllegalStateException("The queue is empty");
        return first.elem;
    }

    /**
     * allow us to create node to simulate the queue.
     */
    private static class Node {
        int elem;
        Node next;
        Node prev;

        public Node(int elem, Node next, Node prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node first = null;
    private Node last = null;

    private int numOfElems = 0;
}
