package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void perimeter() {
        int w = 2, h = 2;
        Rectangle rectangle = new Rectangle(w,h,true);

        assertEquals(8,rectangle.perimeter());
        assertEquals(4,rectangle.area());
    }
}