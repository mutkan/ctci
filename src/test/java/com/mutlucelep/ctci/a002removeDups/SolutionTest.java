package com.mutlucelep.ctci.a002removeDups;


import com.mutlucelep.ctci.utils.ListNode;
import com.mutlucelep.ctci.utils.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();


    @Test
    public void testDeleteDups_IfNodeNull(){
        ListNode head = null;
        ListNode expected = null;

        solution.deleteDups(head);

        assertEquals(head, expected);
    }

    @Test
    public void testDeleteDups_1(){
        int[] headArray = {1,1,2};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1,2};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        solution.deleteDups(head);

        assertTrue(ListNodeUtils.equals(head, expected));
    }

    @Test
    public void testDeleteDups_2(){
        int[] headArray = {1,1,2,2};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1,2};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        solution.deleteDups(head);

        assertTrue(ListNodeUtils.equals(head, expected));
    }

    @Test
    public void testDeleteDups_3(){
        int[] headArray = {1,1,2,3,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1,2,3};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        solution.deleteDups(head);

        assertTrue(ListNodeUtils.equals(head,expected));
    }

}
