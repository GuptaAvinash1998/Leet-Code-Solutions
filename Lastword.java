package com;

public class Lastword {
	
	public int lengthOfLastWord(String s) {
      
		String[] words = s.split(" ");//splits the string into different words, the split depends on the white space
        
        if(words.length == 0){
            return 0;
        }
		String last = words[words.length-1];//gets the last word
		int len = last.length();//returns the length of the last word
		return len;
    }
	public static void main(String[] args) {
		
		Lastword lw = new Lastword();
		
		String word = " ";
		
		int lastlen = lw.lengthOfLastWord(word);
		
		System.out.println("The length of the last word in the string " + word + " is " + lastlen);
	}
}
