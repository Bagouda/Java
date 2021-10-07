package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBasedImplTest {

    // Create an empty queue
    private final QueueOfInts queueOfInts = QueueOfIntsFtry.create(QueueOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
        System.out.println("Setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void newQueueIsEmpty() {
        System.out.println("newQueueIsEmpty");
        assertTrue(queueOfInts.isEmpty());
        queueOfInts.enqueue(1);
        assertFalse(queueOfInts.isEmpty());
        queueOfInts.dequeue();
        assertTrue(queueOfInts.isEmpty());
    }

    @Test
    void enqueue() {
        System.out.println("enqueue");
        queueOfInts.enqueue(1);
        assertEquals(1,queueOfInts.peek());
        queueOfInts.enqueue(10);
        assertEquals(1,queueOfInts.peek());

    }

    @Test
    void dequeue() {
        System.out.println("dequeue");
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(11);
        assertEquals(1,queueOfInts.dequeue());
        assertEquals(10,queueOfInts.dequeue());
        assertEquals(11,queueOfInts.dequeue());
    }

    @Test
    void numOfElems() {
        System.out.println("numOfElems");
        assertEquals(0,queueOfInts.numOfElems());
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(10);
        assertEquals(2,queueOfInts.numOfElems());
        queueOfInts.dequeue();
        assertEquals(1,queueOfInts.numOfElems());


    }

    @Test
    void peek() {
        System.out.println("peek");
        queueOfInts.enqueue(1);
        assertEquals(1,queueOfInts.peek());
        queueOfInts.enqueue(10);
        assertEquals(1,queueOfInts.peek());
        queueOfInts.enqueue(15);
        assertEquals(1,queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(10,queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(15,queueOfInts.peek());
    }
}
