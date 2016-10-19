package stringsexample;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentance: ");
		String message = input.nextLine();
		String modMessage = message.replace('e', '@');
		System.out.println(modMessage);
		input.close();

		String[] words = stringToWords(message);
		
		printStringArray(words);

	}

	public static String[] stringToWords(String message) {
		String[] words = new String[100];
		int oldPos = 0, pos = 0, i = 0;

		while (pos >= 0) {
			pos = message.indexOf(' ', oldPos);
			if (pos > 0) {
				words[i] = message.substring(oldPos, pos);
			} else {
				words[i] = message.substring(oldPos);
			}
			oldPos = pos + 1;
			i++;
		}

		return words;
	}
	
	public static void printStringArray (String [] arr)
	{
		for (String s : arr) {
			if (s == null)
				break;
			System.out.println(s);
		}
		
	}

}
