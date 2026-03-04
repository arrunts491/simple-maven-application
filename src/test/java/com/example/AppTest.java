package com.example;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    App app = new App();

    public void testAdd() {
        assertEquals(5, app.add(2,3));
    }

    public void testSubtract() {
        assertEquals(2, app.subtract(5,3));
    }

    public void testMultiply() {
        assertEquals(6, app.multiply(2,3));
    }

    public void testDivide() {
        assertEquals(2, app.divide(6,3));
    }
}
