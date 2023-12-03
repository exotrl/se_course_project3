package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 使用的decision
 * if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
 *         {
 *             triOut = 4;
 *             return (triOut);
 *         }
 */
public class TritypeConditionTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        //Side1 <= 0为真
        assertEquals(4, tri.Triang(-1, 3, 2));
        //Side1 <= 0为假
        assertEquals(2, tri.Triang(3, 3, 2));
        //Side2 <= 0为真
        assertEquals(4, tri.Triang(3, -1, 2));
        //Side2 <= 0为假
        assertEquals(2, tri.Triang(3, 3, 2));
        //Side3 <= 0为真
        assertEquals(4, tri.Triang(3, 3, -1));
        //Side3 <= 0为假
        assertEquals(2, tri.Triang(3, 3, 2));

    }
}
