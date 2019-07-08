package com.mutlucelep.ctci.a002removeDups;

import com.mutlucelep.ctci.utils.ListNode;

import java.util.HashSet;

/**
 * Book:
 * =====
 * Cracking the Coding Interview - Chapter 2 - Linked Lists
 * <p>
 * Desc:
 * =====
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */

public class Solution {

    void deleteDups(ListNode n) {
        HashSet<Integer> set = new HashSet<>();

        ListNode previous = null;

        while (n != null) {
            if (set.contains(n.getVal())) {
                previous.setNext(n.getNext());

            } else {
                set.add(n.getVal());
                previous = n;
            }
            n = n.getNext();
        }
    }

  
}
