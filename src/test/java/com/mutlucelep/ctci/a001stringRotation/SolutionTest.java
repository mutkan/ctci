package com.mutlucelep.ctci.a001stringRotation;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();


    @Test
    public void testIsSubstring_NotEqualLength() {
        assertFalse(solution.isSubstring("abc","abcde"));
    }

    @Test
    public void testIsSubstring_Substring(){
        assertTrue(solution.isSubstring("waterbottle", "erbottlewat"));
    }

    @Test
    public void testIsSubstring_NotSubstring(){
        assertFalse(solution.isSubstring("waterbottle", "waterelttob"));
        assertFalse(solution.isSubstring("waterbottle", "erbottletaw"));
    }


    @Test
    public void testAnotherSolution_NotEqualLength() {
        assertFalse(solution.anotherSolution("abc","abcde"));
    }

    @Test
    public void testAnotherSolution_Substring(){
        assertTrue(solution.anotherSolution("waterbottle", "erbottlewat"));
    }

    @Test
    public void testAnotherSolution_NotSubstring(){
        assertFalse(solution.anotherSolution("waterbottle", "waterelttob"));
        assertFalse(solution.anotherSolution("waterbottle", "erbottletaw"));
    }
}
