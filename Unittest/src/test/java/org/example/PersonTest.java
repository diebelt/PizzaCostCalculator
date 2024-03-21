package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    void testEquals() {
        Person p1 = new Person("John", "Down");
        Person p2 = new Person("John", "Down");

        assertEquals(p1, p2);
    }

    @Test
    void testHashCode() {
    }
}
