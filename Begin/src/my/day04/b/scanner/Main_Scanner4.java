package my.day04.b.scanner;


import java.util.Scanner;

public class Main_Scanner4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr ="";
		
		try {
			System.out.print("1. 첫번째 정수 입력 : ");
			inputStr = sc.nextLine();	// "10"
										// "안녕"
										// 문자열 "안녕" 을 int 타입으로 변경하고자 할 때 java.lang.NumberFormatException 발생된다.
			int num1 = Integer.parseInt(inputStr);
			//문자열 "10" 을 int 타입인 10으로 변경하기
			
			System.out.print("2. 두번째 정수 입력 : ");
			inputStr = sc.nextLine(); // "20"
									  // "하세요"
			Integer.parseInt(inputStr); // 문자열 "20" 을 int 타입인 20으로 변경하기
										// 문자열 "하세요" 을 int 타입으로 변경하고자 할 때 java.lang.NumberFormatException 발생된다.
			int num2 = Integer.parseInt(inputStr); 
			
			System.out.print(num1 + "+" + num2 + "=" + (num1+num2));
			//10 + 20 = 30
		}catch(NumberFormatException e) {
			System.out.println(">> " + inputStr + " (은)는 정수가 아니므로 정수만 입력하세요!!");
			e.printStackTrace();
		}
			
		sc.close();
		
	}

}
