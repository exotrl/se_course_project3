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
public class TritypeMCDCTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        //t x x  =>t   表示 条件1为true    条件2任意   条件3任意，最后结果为true（下面的可类比）
        assertEquals(4, tri.Triang(-1, 3, 2));
        //f t x  =>t   表示 条件1为false    条件2为true   条件3任意，最后结果为true（下面的可类比）
        assertEquals(4, tri.Triang(3, -1, -1));
        //f f t  =>t
        assertEquals(4, tri.Triang(3, 3, -1));
        //f f f  =>f
        assertEquals(2, tri.Triang(3, 3, 2));
        //以上实例  满足所有condition都取到true和false，并且满足最终结果也取到true和false
    }
}
