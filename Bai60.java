package baitap;

import java.util.Scanner;

public class Bai60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     System.out.print("Input a Sentence: ");
		 String line = in.nextLine();
		 String[] words = line.split("[ ]+");
		 System.out.println("Penultimate word: "+words[words.length - 2]);

	}

}
