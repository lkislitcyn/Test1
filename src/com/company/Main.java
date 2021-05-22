package com.company;

public class Main {

    public static void main(String[] args) {
	int ArrayTo[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	//System.out.println(c=a+b);
	Solution test = new Solution();
	int BackArr[]=test.twoSum(ArrayTo,29);
	System.out.println (BackArr[0]+" "+BackArr[1]); //поставить проверку на null
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,ArrayBack[]=new int[2];
        if (nums == null || nums.length == 0) {
            return null;
        } else {
        for (i=0;i<nums.length-1;i++)
        for (j=0;j<nums.length;j++)
            if (i!=j && i!=nums.length)
            if ((nums[i]+nums[j])==target) {ArrayBack[0]=i;ArrayBack[1]=j;return ArrayBack; }

        }
    return null;
    }
}