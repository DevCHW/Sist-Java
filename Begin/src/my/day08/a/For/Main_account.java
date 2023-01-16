package my.day08.a.For;

import java.util.Scanner;

public class Main_account {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== 통장개설 합니다.==\n");
		
		Account ac = new Account();
		ac.register_account(sc);
		
		ac.showInfo();
		
		
		sc.close();
	}

}
