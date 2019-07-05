package com.mutlucelep.ctci.a001isUnique;

import java.util.HashMap;
import java.util.Map;

/**
 * Book:
 * =====
 * Cracking the Coding Interview
 *
 * Desc:
 * =====
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

public class Solution {
  public boolean isUnique(String str) {
    if (str.length() > 128) {
      return false;
    }
    boolean[] char_set = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);
      if (char_set[val])
        return false;
      char_set[val] = true;
    }
    return true;
  }
}
