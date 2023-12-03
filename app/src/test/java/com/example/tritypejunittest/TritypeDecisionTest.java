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
public class TritypeDecisionTest {

    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        //整体为假
        assertEquals(2, tri.Triang(3, 3, 2));
        //整体为真
        assertEquals(4, tri.Triang(-1, -1, -1));
    }
}
