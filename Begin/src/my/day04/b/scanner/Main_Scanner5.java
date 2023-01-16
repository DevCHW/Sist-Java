package my.day04.b.scanner;

import java.util.Scanner;

public class Main_Scanner5 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = "";		
		try {
		
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		inputStr = sc.nextLine();
		
		int num1 = Integer.parseInt(inputStr);
		
		System.out.print("두번째 정수를 입력하세요 : ");
		inputStr = sc.nextLine();
		
		int num2 = Integer.parseInt(inputStr);
		
		Calculator calc = new Calculator();
		System.out.println(num1+"+"+num2+"="+calc.plus(num1, num2));
		// 10+4 = 14
		System.out.println(num1+"-"+num2+"="+calc.minus(num1, num2));
		// 10 - 4 = 6
		System.out.println(num1+"*"+num2+"="+calc.multiply(num1, num2));
		// 10*4 = 40
		
		if(num2 != 0) {
			System.out.println(num1+"/"+num2+"="+calc.divide(num1, num2));
		}
		else {
			System.out.println(">>> 나누기 할때는 분모에 0 이 들어올 수 없습니다. <<<");
		}
		
		}catch(NumberFormatException e) {
			System.out.println(">>> " + inputStr + "은(는) 정수가 아니므로 정수만 입력하세요!! <<<");						
		}
		
		sc.close();
	}

}
