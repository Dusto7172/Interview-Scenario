package generatepassword;

import java.util.Random;

public class Otp {
	public static void main(String[] args) {
		int length = 6;
		System.out.println(otp(length));
		
	}
  public static char[] otp(int length) {
	  String numbers ="0123456789";
	  Random r = new Random();
	  char [] otp = new char[length];
	  
	  for(int i=0;i<length;i++) {
		  otp[i]=numbers.charAt(r.nextInt(numbers.length()));
	  }
	  
	 return otp;
	  
  }
}
