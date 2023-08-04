package com.leetcode;

public class ArraySign {
	public int arraySign(int[] nums) {
        double result=1;
        for(int i=0;i<nums.length;i++){
            result=result*nums[i];
        }
        if(result<0){
            return -1;
        }
        else if(result>0){
            return 1;
        }
        return 0;
    }
	

}
