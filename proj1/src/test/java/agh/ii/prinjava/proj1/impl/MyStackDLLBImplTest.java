package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    /**
     * We test pop first by trying it on an empty stack, then by adding value and popping them
     */
    @Test
    void pop() {
        System.out.println("Test Pop");
        assertNull(stackOfInts.pop());
        stackOfInts.push(1);
        assertEquals(1,stackOfInts.pop());
        stackOfInts.push(2);
        stackOfInts.push(3);
        assertEquals(3,stackOfInts.pop());
        assertEquals(2,stackOfInts.pop());

    }

    /**
     * we test push by puhsing value to the stack and verifying the values correspond using peek
     */
    @Test
    void push() {
        System.out.println("Test Push");
        stackOfInts.push(1);
        assertEquals(1,stackOfInts.peek());
        stackOfInts.push(2);
        assertEquals(2,stackOfInts.peek());
    }

    /**
     * we test numOfElems by pushing and popping element and verifying numOfElems match the reality
     */
    @Test
    void numOfElems() {
        System.out.println("Test NumOfElems");
        assertEquals(0,stackOfInts.numOfElems());
        stackOfInts.push(1);
        assertEquals(1,stackOfInts.numOfElems());
        stackOfInts.push(1);
        assertEquals(2,stackOfInts.numOfElems());
        stackOfInts.pop();
        assertEquals(1,stackOfInts.numOfElems());
    }

    /**
     * we test peek by pushing and popping node and checking if the value returned by peek correspond
     */
    @Test
    void peek() {
        System.out.println("Test Peek");
        stackOfInts.push(1);
        assertEquals(1,stackOfInts.peek());
        stackOfInts.push(2);
        assertEquals(2,stackOfInts.peek());
        stackOfInts.pop();
        assertEquals(1,stackOfInts.peek());
    }
}