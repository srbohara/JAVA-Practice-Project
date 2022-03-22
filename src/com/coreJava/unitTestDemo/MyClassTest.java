package com.coreJava.unitTestDemo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class MyClassTest {
    MyClass myClass=new MyClass();
    @Test
    void add() {
        assertEquals(4,myClass.simpleAddition(2,2));
        assertNotEquals(10,myClass.simpleAddition(5,6));
        assertFalse(myClass.simpleAddition(2,2) == 5 );
        assertTrue("TrueCondition", myClass.simpleAddition(2,2)==4);

    }
    @Test
    void multiply() {
        assertEquals("10*5*3 must be 150",150, myClass.multiplication(10, 5,3));
    }


}

