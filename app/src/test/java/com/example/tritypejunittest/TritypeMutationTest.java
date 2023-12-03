package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriangOne() {
        TritypMutantOne tri = new TritypMutantOne();
        //原始代码这里应该是4，但mutationOne为2才通过
        assertEquals(2, tri.Triang(3, 3, 7));

    }

    @Test
    public void testTriangTwo() {
        TritypMutantTwo tri = new TritypMutantTwo();
        //原始代码这里应该是4，但mutationTwo为2才通过
        assertEquals(2, tri.Triang(3, 3, 6));

    }
}
