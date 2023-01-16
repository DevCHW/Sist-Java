package my.day06.d.Switch;

import java.util.Scanner;



public class Main_switch {

	public static void main(String[] args) {
		/*
		  첫번째 정수 입력 => 10
		  두번째 정수 입력 => 4
		  사칙연산자 선택(+ - * /) => + - * /
		  
		  10+4 = 14
		  10+4 = 6
		  10*4 = 40
		  10/4 = 2.5	  		 
		 */
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("첫번째 정수 입력 =>");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 정수 입력=>");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("사칙연산자 선택(+ - * /) => ");
		String operator = sc.nextLine(); // "+" "-" "*" "/" "몰라"
		
		String result = "";
		
		// === switch 문 === //
		
		switch (operator) { // switch( ) 괄호 속에는 byte 타입, short타입, int, char 타입, String 타입은 가능
							// switch( ) 괄호 속에는 long 타입, float 타입,double 타입, String을 제외한 객체타입은 불가함.
			case "+": //operator 값이 "+" 와 같다라면 
				result = String.valueOf(num1+num2);
				
				break; // break; 뜻은 switch(operator) { } 부분을 빠져나가라는 뜻이다.
				
			case "-": //operator 값이 "-" 와 같다라면 
				result = String.valueOf(num1-num2);
				break; // break; 뜻은 switch(operator) { } 부분을 빠져나가라는 뜻이다.
			case "*": //operator 값이 "*" 와 같다라면 
				result = String.valueOf(num1*num2);
				break; // break; 뜻은 switch(operator) { } 부분을 빠져나가라는 뜻이다.
			case "/": //operator 값이 "/" 와 같다라면 
				if(num2 != 0)
				result = String.valueOf((double)num1/num2);
				else
				result = "분모에는 0이 올 수 없습니다.";
				break; // break; 뜻은 switch(operator) { } 부분을 빠져나가라는 뜻이다.
				
			 
			default: // operator 값이 "+" 도 아니고 "-" 도 아니고 "*" 도 아니고 "/" 와 같다라면 if문의 else
				System.out.println(">> 사칙연산자(+ - * /)만 선택하세요 !! <<");
			//	break;
				
			/*	
				sc.close();
				return; //main() 메소드 안에서 return;을 만나면 프로그램을 종료하라는 뜻이다.
			*/
				
			//또는
				System.exit(0);
				
		}// end of switch (operator) -------
		
		//삼항연산자
		/*
		  	변수선언 = (조건식)?값1:값2;
		  	
		  	변수를 선언하고 나서 값을 부여하고자 할 때 사용되어지는데
		  	조건식이 참 이라면 변수에 값1을 대입해주고,
		  	만약에 조건식이 거짓 이라면 변수에 값2 를 대입해준다.
	
		 */
		result = ( "/".equals(operator) && num2 == 0)?result : num1 + operator + num2 + " = " + result;
				
		System.out.println(result);
				/*
				  10 + 4 = 14r
				  10 + 4 = 6
				  10 * 4 = 40
				  10 / 4 = 2.5	  		 
				 */
		
		}catch(NumberFormatException e) {
			
			System.out.println(">>> 정수만 입력하세요 !! <<<");
		}
		
		sc.close();
		
	}

}
