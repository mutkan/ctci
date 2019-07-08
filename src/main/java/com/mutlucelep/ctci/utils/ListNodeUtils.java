package com.mutlucelep.ctci.utils;

public class ListNodeUtils {

    public static ListNode createListFromArray(int[] nums){
        ListNode head = null;

        for(int i = nums.length-1;i>=0;i--){
            ListNode temp = new ListNode(nums[i]);
            temp.next = head;
            head = temp;
        }

        return head;
    }

    public static boolean equals(ListNode n1, ListNode n2){
        boolean isEqual = false;
        if(n1 == null && n2 == null){
            isEqual = true;
        }

        while(n1 != null && n2 != null && n1.val == n2.val){
            n1 = n1.next;
            n2 = n2.next;
        }

        if(n1 == null && n2 == null){
            isEqual = true;
        }

        return isEqual;
    }
}
