package com.mutlucelep.ctci.a001stringRotation;

/**
 * Book:
 * =====
 * Cracking the Coding Interview - Chapter 1 - Arrays and Strings
 * <p>
 * Desc:
 * =====
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring
 * (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */

public class Solution {

    public boolean isSubstring(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String subStringX = "", subStringY = "";
        for (int i = 1; i <= s2.length(); i++) { //You should be carefull to iterate through the string, so it should start from 1 not 0
            String y = s2.substring(0, i);
            if (s1.indexOf(y) >= 0) {
                subStringY = y;
                subStringX = s2.substring(i, s2.length());

                continue;
            } else {
                if (s1.equals(subStringX + subStringY)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean anotherSolution(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s2);
        stringBuilder.append(s2);
        String s2s2 = stringBuilder.toString();
        if (s2s2.contains(s1)) {
            return true;
        }

        return false;
    }

    //I misunderstood the question, so the correct answer:

    public boolean correctAnswer(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s2);
        stringBuilder.append(s2);
        String s2s2 = stringBuilder.toString();

        if(isSubstring(s2s2,s1)){
            return true;
        }
        return false;
    }
}
