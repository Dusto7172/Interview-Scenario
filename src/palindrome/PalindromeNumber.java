package palindrome;

public class PalindromeNumber {
public static void main(String[] args) {
	
	int a =15451;
	int temp=a;
	int rev=0,rem;
	
	while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	
	if(a==rev) {    
		   System.out.println("palindrome number ");    
	}else {    
		   System.out.println("not palindrome");    
		}  
}
}