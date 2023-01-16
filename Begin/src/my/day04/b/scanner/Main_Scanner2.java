package my.day04.b.scanner;

//import java.util.InputMismatchException;
//import java.util.Scanner;
//또는
import java.util.*;
//위의 뜻은 java.util 패키지에 있는 클래스를 모두 쓰겠다는 뜻 와일드키*

public class Main_Scanner2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		try {
			int inputNum = sc.nextInt(); // 123
										 // 안녕하세요
			sc.nextLine();
			
			
			System.out.println("입력한 정수 : " + inputNum);
		} catch(InputMismatchException e) {
			// 여기가 예외처리를 해주는 곳이다.
			System.out.println("\n>>> 정수만 입력하세요!! <<<\n");
			e.printStackTrace();
		}
		
		sc.close();
		
		
	}

}
