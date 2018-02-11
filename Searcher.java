package com;

public class Searcher {
	
	public int searchInsert(int[] nums, int target) {
		
		int temp = 0;
		int len = nums.length;
		
		for(int i=0;i<len;i++) {
			if(nums[i] == target) {
				System.out.println("element found ");
				return i;
			}
		}
		
		if(target < nums[0]) {//first element check
				
			return 0;
		}
			
		if(target > nums[len-1]) {//last element check
			
			return len;
		}
		
		for(int i=0;i<len;i++) { //in between
			
			if(i+1 < len) {
				
				if(target > nums[i] && target < nums[i+1]) {
					return i+1;
				}
			}
		}
		
		return temp;
	}
        

	public static void main(String[] args) {
		
		Searcher s = new Searcher();
		 int array[] = {1,2,3,4,5,7};
		 int num = 6;
		 
		 num = s.searchInsert(array, num);
		 System.out.println("target found at index " + num);
		 
		 

	}

}
