package my.day04.b.scanner;

import java.util.Scanner;

public class Main_Scanner1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			// System.in 은 입력장치(키보드)를 말한다.
			// System.out 은 출력장치(모니터)를 말한다.
			
			// Scanner sc 는 키보드에서 입력된 문자열을 읽어들이는 객체이다.
		
		System.out.print("문장을 입력하세요 ->" );

		String inputStr = sc.nextLine();
		
			/*
			 	sc.nextLine(); 은 키보드로부터 입력받은 문장을 읽어들이는 것인데
			 	엔터(종결신호)까지 모두 읽어들인 후 스캐너 버퍼에 아무것도 남기지 않는다.
			 */
		System.out.println("입력한 문장 =>" + inputStr);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("첫번째 정수를 입력하세요 =>");
		int inputNum_1 = sc.nextInt();  // 10 10공백 10엔터
	        // 10 30엔터
			/*	
			byte jumsu = sc.nextByte(); 1~100까지니깐 Byte
			short st = sc.nextShort();
			long ln = sc.nextLong();
			*/    
			/*
			sc.nextInt(); 는 정수(int)를 읽어들이는 것인데 
			종결자가 공백 또는 엔터이다.
			종결자(공백 또는 엔터) 앞까지의 입력해준 정수를 읽어온다.
			sc.nextInt(); 을 사용하면 스캐너(sc)버퍼에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라
			그대로 남아 있게 된다. 
			*/
		sc.nextLine();  // 스캐너(sc)버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.
		System.out.println(">> 첫번째 입력한 정수 : " + inputNum_1);
		
		System.out.print("두번째 정수를 입력하세요 => ");
		int inputNum_2 = sc.nextInt();
		sc.nextLine();  // 스캐너(sc)버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.
		System.out.println(">> 두번째 입력한 정수 : " + inputNum_2);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("첫번째 실수를 입력하세요 => ");
		double inputDbl_1 = sc.nextDouble(); 
			// float ft = sc.nextFloat();
			/*
			sc.nextDouble(); 는 실수(double)를 읽어들이는 것인데 
			종결자가 공백 또는 엔터이다.
			종결자(공백 또는 엔터) 앞까지의 입력해준 실수를 읽어온다.
			sc.nextDouble(); 을 사용하면 스캐너(sc)버퍼에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 
			그대로 남아 있게 된다. 
			*/
		sc.nextLine();  // 스캐너(sc)버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.
		System.out.println(">> 첫번째 입력한 실수 : " + inputDbl_1); 
		
		System.out.print("두번째 실수를 입력하세요 => ");
		double inputDbl_2 = sc.nextDouble(); 
		sc.nextLine();  // 스캐너(sc)버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.
		System.out.println(">> 두번째 입력한 실수 : " + inputDbl_2);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("첫번째 단어를 입력하세요 => ");
		String inputWord_1 = sc.next(); // 안녕 하세요 호호호엔터
			/*
			sc.next(); 는 단어를 읽어들이는 것인데 
			종결자가 공백 또는 엔터이다.
			종결자(공백 또는 엔터) 앞까지의 입력해준 문자열을 읽어온다.
			sc.next(); 을 사용하면 스캐너(sc)버퍼에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 
			그대로 남아 있게 된다. 
			*/
		sc.nextLine();  // 스캐너(sc)버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.
		System.out.println(">> 첫번째 입력해준 단어 : " + inputWord_1);
		
		System.out.print("두번째 단어를 입력하세요 => ");
		String inputWord_2 = sc.next();
		sc.nextLine();  // 스캐너(sc)버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.
		System.out.println(">> 두번째 입력해준 단어 : " + inputWord_2);
		
		sc.close();
		
		System.out.println("\n>>> 프로그램 종료 <<<");
		
		}
		
	}