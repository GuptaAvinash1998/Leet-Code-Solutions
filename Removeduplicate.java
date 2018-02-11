package com;

public class Removeduplicate {

	public int removeDuplicates(int[] nums) {
		
		int len = nums.length;
		
		int i = 0;
		
		if(len == 0 || len == 1) {
			return len;
		}
		
		int j = 0;
		
		for(i=0;i<len-1;i++) {
			
			if(nums[i] != nums[i+1]) {
				nums[j++] = nums[i];
			}
			
		}
		
		nums[j++] = nums[len-1];
		return j;
	}
	
	public static void main(String[] args) {
		
		Removeduplicate rd = new Removeduplicate();
		
		int[] array = {1,1,2,3,4,4,5,6,7,8,8};
		
		System.out.println("Array length before removeDupicates: " + array.length);
		
		int newlen = rd.removeDuplicates(array);
		
		System.out.println("Array length after removeDupicates: " + newlen);

	}

}
