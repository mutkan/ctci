package com.mutlucelep.ctci.a001isUnique;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class SolutionTest {
  private Solution solution = new Solution();


  @Test
  public void testIsUnique_EmptyString() {
    assertTrue(solution.isUnique(""));
  }

  @Test
  public void testIsUnique_UniqueString(){
    assertTrue(solution.isUnique("abcde"));
  }

  @Test
  public void testIsUnique_NonUniqueString(){
    assertFalse(solution.isUnique("abbcde"));
  }

  @Test
  public void testIsUnique_NotUniqueAtFirst(){
    assertFalse(solution.isUnique("aabcde"));
  }

  @Test
  public void testIsUnique_NotUniqueAtEnd(){
    assertFalse(solution.isUnique("abcdee"));
  }
}