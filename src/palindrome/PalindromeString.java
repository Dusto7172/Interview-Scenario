package palindrome;

public class PalindromeString {
public static void main(String[] args) {
	String s1="Level",revs1 ="";
	System.out.println("Printing Obj:"+s1);
	s1=s1.toLowerCase();
	System.out.println("Printing Obj by using lowercase Method:"+s1);
	int s1Lenght = s1.length();
	for(int i =(s1Lenght-1);i>=0;i--) {
		revs1=revs1+s1.charAt(i);
	}
		if(s1.equals(revs1)) {
			System.out.println(s1 + " is a Palindrome String.");
		}else {
			System.out.println(s1 + " is not a Palindrome String.");
		}
	}

}
