package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.ARRAY_B);

    @BeforeEach
    void setUp() {
        System.out.println("Test linkedlist setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test linkedlist tearDown");
    }

    @Test
    void newStackIsEmpty() {
        assertTrue(stackOfInts.isEmpty());
        stackOfInts.push(1);
        assertFalse(stackOfInts.isEmpty());
        stackOfInts.pop();
        assertTrue(stackOfInts.isEmpty());

    }

    @Test
    void pop() {
        System.out.println("Pop test");
        stackOfInts.push(1);
        stackOfInts.push(10);
        assertEquals(10,stackOfInts.pop());
        assertEquals(1, stackOfInts.pop());
    }

    @Test
    void push() {
        System.out.println("Push test");
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.peek());
        stackOfInts.push(3);
        assertEquals(3, stackOfInts.peek() );
    }

    @Test
    void numOfElems() {
        System.out.println("numOfElems test");
        assertEquals(0, stackOfInts.numOfElems());
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.numOfElems());
        stackOfInts.pop();
        assertEquals(0, stackOfInts.numOfElems());
        stackOfInts.pop();
        assertEquals(0, stackOfInts.numOfElems());
    }

    @Test
    void peek() {
        System.out.println("Peek test");
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.peek());
        stackOfInts.push(10);
        assertEquals(10, stackOfInts.peek());
        stackOfInts.pop();
        assertEquals(1, stackOfInts.peek());

    }
}