package com;

public class Squareroot {

	public int mySqrt(int x) {
		
		int square_root = (int)Math.sqrt(x);
		return square_root;
        
    }
	public static void main(String[] args) {
		
		Squareroot sr = new Squareroot();
		
		int num = 69;
		
		int root = sr.mySqrt(num);
		
		System.out.println("The square root of " + num + " is " + root);

	}

}
