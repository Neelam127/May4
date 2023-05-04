
package com.cg1;

import java.util.ArrayList;
import java.util.TreeSet;

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 */
public class Solution3 {
	
	public int searchInsert(int[] nums, int target) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        set.add(target);

        ArrayList<Integer> arr=new ArrayList<>(set);

        return arr.indexOf(target);
    }

}
