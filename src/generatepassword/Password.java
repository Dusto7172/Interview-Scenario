package generatepassword;

import java.util.Random;

public class Password {
public static void main(String[] args) {
	
	int length = 8;
	System.out.println(generatePassword(length));
}
public static char[] generatePassword(int length){
	
	String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacter="!@#$%^&*";
	
	String combinedChars = upperCaseLetters + lowerCaseLetters + numbers + specialCharacter;
	
	Random random = new Random();
	char password[]=new char[length];
	 
	
	
	for(int i =0; i< length ; i++) {
        password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
     }
	return password;
	
}
}
