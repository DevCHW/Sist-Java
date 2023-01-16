package my.day06.a.wrapper;

import java.util.Scanner;

/*
=== *** wrapper 클래스 *** ===

------------------------------------------------
  기본자료형(원시형, primitive)     wrapper 클래스
------------------------------------------------
 byte                           Byte 
 short                          Short
 int                            Integer  
 long                           Long
 char                           Character
 float                          Float
 double                         Double
 boolean                        Boolean 
 ------------------------------------------------
 
  기본자료형(원시형)은 데이터 저장 및 4칙연산 에서만 사용하는 것이고, 
 wrapper 클래스는  데이터 저장 및 4칙연산 뿐만아니라 
  아주 다양한 기능의 메소드가 제공되므로 다방면으로 사용되어진다. 
*/

public class Main_wrapper {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println("ch => " + ch);	//ch => a
		System.out.println(ch+1);  			//(int)ch + 1 == (int)'a' + 1 ==> 97 + 1 ==> 98
		System.out.println((char)(ch-32)); 	//'A' 대문자와 소문자의 간격은 32이기 때문에 a에서 A로 됨.
		
		System.out.println("\n=========================================\n");
		
	//	Character chr = new Character('a');
	//	또는 
		
		System.out.println("char 타입으로 소문자,대문자 변형하기");
		
		Character chr = 'a';
		System.out.println("chr => " + chr);	// chr => a
		System.out.println(chr + 1); // (int)chr + 1 ==> (int)'a' + 1 ==> 97 + 1 ==> 98
		System.out.println( (char)(chr-32) );// A		
		System.out.println( (char)('a'-32) );// A	
		
		System.out.println("\n=========================================\n");
		
		System.out.println(Character.toUpperCase('a')); // A
		System.out.println(Character.toUpperCase('A')); // A
		System.out.println(Character.toUpperCase(97));	//65 파라미터에 int를 넣으면 리턴타입도 int로 나온다.
		System.out.println(Character.toUpperCase(65));	//65
		
		System.out.println("\n=========================================\n");
		
		System.out.println(Character.toLowerCase('A')); // a
		System.out.println(Character.toLowerCase('a')); // a
		System.out.println(Character.toLowerCase(97));	//97 파라미터에 int를 넣으면 리턴타입도 int로 나온다.
		System.out.println(Character.toLowerCase(65));	//97
		
		
		
		char ch2 = 'C';	//67
		
				
		// C는 대문자 입니다.
		
		if(ch2>=65 && ch2 <= 90) { // 대문자 인지 알아본다.
			// char 타입은 비교연산자(==  !=  >  <  >=  <=)를 만나면 자동적으로 int 타입으로 형변환 되어진다.
			System.out.println(ch2+" 는 대문자 입니다.");			
		}
		else if(97 <= ch2 && ch2 <= 122) { //소문자 인지 알아본다.
			System.out.println(ch2+" 는 소문자 입니다.");						
		}
		else if(48 <= ch2 && ch2 <= 57) { //숫자 인지 알아본다.
			System.out.println(ch2+" 는 숫자 입니다.");						
		}
		else {
			System.out.println(ch2 + " 는 특수문자 입니다.");
		}
		
		
		System.out.println("\n=========================================\n");
		
		if(Character.isUpperCase(ch2)) { // 대문자 인지 알아본다.
			// char 타입은 비교연산자(==  !=  >  <  >=  <=)를 만나면 자동적으로 int 타입으로 형변환 되어진다.
			System.out.println(ch2+" 는 대문자 입니다.");			
		}
		else if(Character.isLowerCase(ch2)) { //소문자 인지 알아본다.
			System.out.println(ch2+" 는 소문자 입니다.");						
		}
		else if(Character.isDigit(ch2)) { //숫자 인지 알아본다.
			System.out.println(ch2+" 는 숫자 입니다.");						
		}
		else {
			System.out.println(ch2 + " 는 특수문자 입니다.");
		}
		
		// C 는 대문자 입니다.
		
		///////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n=========================================\n");
		
		Scanner sc = new Scanner(System.in);
		
		
		String str = "Korea";
		//			  01234
		char ch1 = str.charAt(0);	//'K' 
		System.out.println(ch1); 	//'K'
		
		ch1 = str.charAt(1);	//'o' 
		System.out.println(ch1); 	//'o'
		
		
		System.out.print("한 글자만 입력하세요 >>");
		ch1 = sc.nextLine().charAt(0); 
		
		
		
		
		if(Character.isUpperCase(ch1)) {
			
			System.out.println(ch1+" 는 대문자 입니다.");			
		}
		else if(Character.isLowerCase(ch1)) {
			System.out.println(ch1+" 는 소문자 입니다.");						
		}
		else if(Character.isDigit(ch1)) { 
			System.out.println(ch1+" 는 숫자 입니다.");						
		}
		else {
			System.out.println(ch1 + " 는 특수문자 입니다.");
		}
		
		
		System.out.println("\n=========================================\n");
		
		System.out.println("== 오토박싱,오토언박싱 에 대해서 알아봅니다. ==");
		
		/*
		 	Boxing(박싱, 포장을 하는 것)이란?
		 	==> 기본자료형(boolean, byte, short, int, long, char, float, double)으로 되어진 변수를 
		 		객체타입인 Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)타입의 객체로 만들어 주는 것을 말한다.
		 */
			int a1 = 10;
			Integer a2 = new Integer(a1);	//Boxing(박싱)
			System.out.println("a2 => " + a2); //a2 => 10
			
			int b1 = 10;
			Integer b2 = b1;	//Auto Boxing(박싱)
			System.out.println("b2 => " + b2); //b2 => 10
			
			
		/*
	 		UnBoxing(언박싱, 포장을 푸는 것)이란?
	 		==>Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)로 되어진 객체를
	 		   기본자료형(boolean, byte, short, int, long, char, float, double)으로 만들어 주는 것.   	 		
		 */
			Integer a3 = new Integer(20);
			int a4 = a3.intValue();                   // UnBoxing(언박싱)
			System.out.println("a4 => " + a4);        //a4 => 20
			
			int a5 = new Integer(20);				  //Auto UnBoxing(오토 언박싱)
			System.out.println("a5 => " + a5);   	  //a5 => 20
			
			Double db1 = new Double(1.234567);
			double db2 = db1.doubleValue();	          //UnBoxing(언박싱)
			System.out.println("db2 => " + db2);      //db2 => 1.234567
			
			
			double db3 = new Double(1.234567);        // Auto UnBoxing(오토 언박싱)
			System.out.println("db3 => "+db3);        // 1.234567
	
		sc.close();
	
	}

}
