package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * we test enqueue by adding element and peeking. Then we see if value match
     */
    @Test
    void enqueue() {
        System.out.println("test Enqueue");
        queueOfInts.enqueue(1);
        assertEquals(1,queueOfInts.peek());
        queueOfInts.enqueue(2);
        assertEquals(1,queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(2,queueOfInts.peek());


    }

    /**
     * We test dequeue first by dequeueing an empty list.
     * Then by queueing and dequeuing value and seeing if value match
     */
    @Test
    void dequeue() {
        System.out.println("test Dequeue");
        assertNull(queueOfInts.dequeue());
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        assertEquals(1,queueOfInts.dequeue());
        queueOfInts.enqueue(3);
        assertEquals(2,queueOfInts.dequeue());
        assertEquals(3,queueOfInts.dequeue());
    }

    /**
     * we tst numOfElems by queueing and dequeuing element and checking if the number of node correspond to the reality
     */
    @Test
    void numOfElems() {
        System.out.println("test NumOfElems");
        assertEquals(0,queueOfInts.numOfElems());
        queueOfInts.enqueue(1);
        assertEquals(1,queueOfInts.numOfElems());
        queueOfInts.enqueue(2);
        assertEquals(2,queueOfInts.numOfElems());
        queueOfInts.dequeue();
        assertEquals(1,queueOfInts.numOfElems());
        queueOfInts.enqueue(1);
        assertEquals(2,queueOfInts.numOfElems());
    }

    /**
     * We test peek by queueing value and seeing if peek return the correct value
     */
    @Test
    void peek() {
        System.out.println("test Peek");
        assertNull(queueOfInts.peek());
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        assertEquals(1,queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(2,queueOfInts.peek());

    }
}