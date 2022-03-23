package generatepassword;

import java.util.Random;

public class PasswordUsingIf {
	public static void main(String[] args) {

		System.out.println(byUsingIfElseLadder(1,8));
		System.out.println(byUsingIfElseLadder(2,8));
		System.out.println(byUsingIfElseLadder(3,8));
		
	}
	public static char[] byUsingIfElseLadder(int strength,int length) {
		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacter="!@#$%^&*";
		
		String combination1 = upperCaseLetters + lowerCaseLetters;
		String combination2 = combination1 + numbers;
		String combination3 = combination2 + specialCharacter;
		
		Random r = new Random();
		
		char [] password = new char[length];
		for(int i=0;i<length;i++) {
			if(strength==1) {
				password[i]=combination1.charAt(r.nextInt(combination1.length()));
			}
			if(strength==2) {
				password[i]=combination2.charAt(r.nextInt(combination2.length()));
			}
			if(strength==3) {
				password[i]=combination3.charAt(r.nextInt(combination3.length()));
			}
		}
		
		return password;
	}

}
