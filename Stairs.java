package com;

public class Stairs { //The total ways to climbing 1 step is 1 and 2 is 2, but 3 is 1 + 2 and 4 is 1 + 3 so the approach is very similar to finding the Fibonacci sequence so this is its application
	
	int total = 0;
	int n1 = 0;
	int n2 = 1;
	
	public int climbStairs(int n) {
		
		if(n > 0) {
			
			total = n1 + n2;
			n1 = n2;
			n2 = total;
			
			climbStairs(n-1);
		}else {
			return 0;
		}
		
		return total;
    }
	
	public static void main(String[] args) {
		
		Stairs s = new Stairs();
		
		int num = 4;
		
		int ways = s.climbStairs(num);
		
		System.out.println("The number of ways to climb " + num + " stairs is " + ways);
	}

}
