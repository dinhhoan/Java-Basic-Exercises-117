package code;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		int so= Scan.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(so + "*" + (i+1)+ "=" + (so*(i+1)));
		}
	}

}
