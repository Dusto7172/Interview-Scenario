package countoccurrencesofaword;

import java.util.Arrays;

public class CountOccurrencesOfAWord {
	public static void main(String[] args) {
		String str = "The greatest glory in living lies not in never falling, but in rising every time we fall.";
		String word = "in";
		String[] temp = str.split(" ");
		System.out.println(Arrays.toString(temp));
		System.out.printf("%-10s%s \n", "word", "count");
		int count=0;
		for(int i=0;i<temp.length; i++) {
			if(word.equals(temp[i]))
				count++;		
		}
		System.out.printf("%-10s%02d \n", word, count);
	}

	
}
