package countfromgivenstring;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="Heart";
		String s2="Earth";
		System.out.println("Printing Obj");
		System.out.println(s1);
		System.out.println(s2);
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println("Printing Obj by using lowercase method");
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.length() ==s2.length()) {
			char[] charArray1=s1.toCharArray();
			char[] charArray2=s2.toCharArray();
            System.out.println("convert strings to char array");
			System.out.println(Arrays.toString(charArray1));
			System.out.println(Arrays.toString(charArray2));
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result=Arrays.equals(charArray1,charArray2);
			
			if(result) {
				System.out.println(s1 + " and " + s2 + " are anagram.");
			}else{
				System.out.println(s1 + " and " + s2 + " are not anagram.");
			}		
	}
}

}
