package palindrome;

public class ReverseString {
	public static void main(String args[]){

	      String str= "Anna";
	      str = str.toLowerCase();
	      StringBuffer sb = new StringBuffer(str);
	      sb.reverse();
	      String data = sb.toString();
	      if(str.equals(data)){
	         System.out.println("Given String is palindrome");
	      }else{
	         System.out.println("Given String is not palindrome");
	      }
	   }
}
