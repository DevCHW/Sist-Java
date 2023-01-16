package my.day04.b.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Scanner3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("1. 첫번째 정수 입력 : ");
			int num1 = sc.nextInt();	//10
										//안녕
			sc.nextLine();
			
			System.out.print("2. 두번째 정수 입력 : ");
			int num2 = sc.nextInt();	//20
										//안녕
			sc.nextLine();
			
			System.out.print(num1 + "+" + num2 + "=" + (num1+num2));
			//10 + 20 = 30
		} catch(InputMismatchException e) {
			System.out.println(">> (은)는 정수가 아니므로 정수만 입력하세요!!");
		}		
		
		sc.close();
		
	}

}
