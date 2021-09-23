package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {

    @Test
    void isEncapsulated() {
        HelloEncapsulation enDemo = new HelloEncapsulation(1);
        int x = enDemo.getPropVal();
        x = x + 1;
        assertEquals(1, enDemo.getPropVal());
        enDemo.setPropVal(x);
        assertEquals(2, enDemo.getPropVal());
    }
}