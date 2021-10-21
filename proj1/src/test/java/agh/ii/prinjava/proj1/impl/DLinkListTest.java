package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     *We test addFirst by adding node and peeking the first node to see if the values correspond
     */
    @Test
    void addFirst() {
        System.out.println("Test addFirst");
        dLinkList.addFirst(1);
        assertEquals(1 , dLinkList.peek_node(dLinkList.first));
        dLinkList.addFirst(2);
        assertEquals(2 , dLinkList.peek_node(dLinkList.first));

    }

    /**
     * We test addLast by adding node and peeking the last node to see if the values correspond
     */
    @Test
    void addLast() {
        System.out.println("Test addLast");
        dLinkList.addLast(1);
        assertEquals(1 , dLinkList.peek_node(dLinkList.last));
        dLinkList.addLast(2);
        assertEquals(2 , dLinkList.peek_node(dLinkList.last));
    }

    /**
     * we test removeFirst by trying to use it on an empty list
     * then by using addFirst and removeFirst and looking if value correspond
     */
    @Test
    void removeFirst() {
        System.out.println("Test removeFirst");
        assertNull( dLinkList.removeFirst());
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        assertEquals(2 , dLinkList.removeFirst());
        assertEquals(1 , dLinkList.removeFirst());

    }

    /**
     * we test removeLast by trying to use it on an empty list
     * then by using addLast and removeLast and looking if value correspond
     */
    @Test
    void removeLast() {
        System.out.println("Test removeLast");
        assertNull( dLinkList.removeLast());
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        assertEquals(2 , dLinkList.removeLast());
        assertEquals(1 , dLinkList.removeLast());
    }

}