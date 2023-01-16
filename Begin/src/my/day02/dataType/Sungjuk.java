package my.day02.dataType;

public class Sungjuk {
	/*
	   === *** 자료형 *** ===

	       ※ 자료형의 종류

	   1. 원시형 타입(Primitive Type)

	   1.1  정수형(byte, short, int, long)
	    -- 자바에서 정수형의 기본타입은 int 이다.
	     -- 그러므로 정수형의 값이 -2,147,483,648 ~ 2,147,483,647 범위를 벗어난 것이라면 반드시 숫자뒤에 소문자 l 또는 대문자  L 을 붙여야 한다.  
	            
	      byte (1byte == 8bit)  : -2^7  ~ 2^7-1  ==> -128 ~ 127 
	      short(2byte == 16bit) : -2^15 ~ 2^15-1 ==> -32,768 ~ 32,767
	      int  (4byte == 32bit) : -2^31 ~ 2^31-1 ==> -2,147,483,648 ~ 2,147,483,647  
	      long (8byte == 64bit) : -2^63 ~ 2^63-1 ==> -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807         
	            
	   
	   1.2 실수형(float, double) 
	       float(4byte)  : 단정밀도   소수점이하 7자리까지 표현됨.   135.3246235
	      double(8byte) : 배정밀도   소수점이하 15~16자리까지 표현됨. 135.3246234502345642
	    -- 자바에서 실수형의 기본타입은 double 이다. 
	      그러므로 실수값을 float 형태로 나타내기 위해서는 실수뒤에 반드시 소문자 f 또는 대문자 F를 붙여야 한다. 
	            
	        
	   1.3 문자형(char)
	      char : 자바는 유니코드 체계를 사용하므로
                 문자형 타입인 char 는 2byte 이며, 범위는 0 ~ 65535 이다.
                 그래서 char 타입에는 문자 1개 또는 숫자(0~65535)도 올 수 있다.              
	                               
	           UNICODE 표 참조 
	           http://www.tamasoft.co.jp/en/general-info/unicode.html                     
	        
	        === !!! 꼭 기억합시다 !!! ===
	        int(4byte) 아래의 크기인  byte(1byte), short(2byte), char(2byte) 타입이 
	             사칙연산(+ - * /)을 만나면 자동적으로 int 타입으로 자동 형변환이 발생된다.
	        
	        'A' => 65     'a' => 97
	        'B' => 66     'b' => 98
	        'C' => 67     'c' => 99
	        
	        '대문자' + 32 => 소문자에 해당하는 숫자
	        '소문자' - 32 => 대문자에 해당하는 숫자
	        
	        '0' => 48
	        '1' => 49
	        '2' => 50
	        '9' => 57
	        ' ' => 32
	        
	        
	   1.4 참(true) 또는 거짓(false)을 담아주는 boolean 타입 
	   -- 크기가 1byte 이다.
	        
	           
	   2. 참조형 타입(Reference Type)
	      --> 클래스 객체(==object ==instance) 타입   
	      --> 메모리상에 저장되어진 객체의 메모리 주소를 참조하는 것이다.
	      --> 참조형 타입(Reference Type) 메모리상에 크기는 4byte 를 차지한다.  

	           
	 */
	   
	   // === 속성, property, attribute, field === 
	   
	 /*   
	   ※ === 변수의 명명규칙 ===
	    1. 변수명의 길이에는 제한이 없다. 
	    2. 대,소문자 구분이 있다.
	    3. 첫글자가 숫자는 안된다. 
	    4. 특수문자는 '_' 와 '$' 만 사용이 가능하다.
	    5. 예약어(예 package, import, public, class, String, int, float ....)는 변수명으로 사용불가하다.  
	    6.<권장사항이지 규칙은 아니다> 첫글자는 소문자로 시작하고 단어와 단어가 결합된 경우이라면 두번째 단어는 대문자로 시작하는것이 일반적이다.
	
	 		단어와 단어가 결합된 경우 => mypoint
	 							  myPoint  (카멜기법)	
								  my_point (스네이크기법)
	 */
	
		String hakbun; // null 학번 String
		String name;   // null 학생명  String
		byte kor; 	   //0  국어(0~100)  숫자(정수) (1byte) -128 ~ 127
		byte eng; 	   //0  영어(0~100)  숫자(정수) (1byte) -128 ~ 127
		byte math;     //0  수학(0~100)  숫자(정수) (1byte) -128 ~ 127
		
		char hakjum;    //' '학점 'A' 'B' 'C' 'D' 'F'
		
		void show_sungjuk() {
			short total =(short)(kor+eng+math);		 
			/*
			 	자바에서 그 데이터 타입이 byte 또는 short 또는 char 인 변수가
			 	사칙연산(+ - * /)을 만나면 자동적으로 그 변수의 데이터 타입은 int로 변하게 되어있다.!!!!!
			
			 kor+eng+math ==> 자동적으로 int 타입으로 형변환(casting)
			 (short)(kor+eng+math) ==> 강제 형변환
			 */
			double avg1 = (double)total / 3;
						// 실수/정수  ==>실수
						// 263.0/3 ==> 87.666666666667
						// 261.0/3 ==> 87.0
			float avg1_1 = (float)total / 3;
						// 실수/정수 ==> 실수
						// 263.0/3 ==> 87.666664
						// 261.0/3 ==> 87.0
						
			double avg2 = total / 3.0;
						// 정수/실수  ==>실수
						// 263/3.0 ==> 87.666666666667
						// 261/3.0 ==> 87.0
			
			float avg2_2 = total / 3.0f;
						// 정수/실수  ==>실수
						// 263/3.0f ==> 87.666664
						// 261/3.0f ==> 87.0
						
			double avg3 = (double)total / 3;
						// 실수/실수  ==>실수
						// 263.0/3.0 ==> 87.666666666667
						// 261.0/3.0 ==> 87.0
			
			float avg3_3 = (float)total / 3;
			
				// 정수/정수 는 정수 가 나온다. 암기사항!!!!!!
				// 예를 들어 10/4 은 실수인 2.5가 아니라 2.5에서 소수인 0.5를 잘라버린 정수인 2가 나온다
				// 즉, 10/4는 몫인 2가 나온다.
			
				// 263/3 ==> 87.666666666667 ==> 87
				// 261/3 ==> 87
			
			long money = 2300000000L;
				// 자바에서 정수는 기본적으로 int 타입을 취하므로 long 타입으로 나타내려면
				// 숫자 뒤에 L 또는 소문자 l을 붙여줘야 한다.
			
			String star = "";
			
			if (avg1 >= 90) {
				hakjum = 'A';					
			}
			else if(avg1 >= 80) {
				hakjum = 'B';
			}
			else if(avg1 >= 70) {
				hakjum = 'C';
			}
			else if(avg1 >= 60) {
				hakjum = 'D';
			}
			
			else {
				hakjum = 'F';
			}
		
			
			
			if(hakjum == 'A') {
				star = "★★★★★";
			}
			else if(hakjum == 'B') {
				star = "★★★★";
			}
			else if(hakjum == 'C') {
				star = "★★★";
			}
			else if(hakjum == 'D') {
				star = "★★";
			}
			else if(hakjum == 'F'){
				star = "★";
			}
			
			
			
			System.out.println("=== 성적결과 ===\n"
								 +"1. 학번 : "+ hakbun +"\n"
								 +"2. 성명 : "+ name +"\n"
								 +"3. 국어 : "+ kor +"\n"
								 +"4. 영어 : "+ eng +"\n"
								 +"5. 수학 : "+ math +"\n"
								 +"6. 총점 : "+ total +"\n"
								 +"7. 평균1 : "+ avg1 +"\n"
								 +"8. 평균2 : "+ avg2 +"\n"
								 +"9. 평균3 : "+ avg3 +"\n"
								 +"7_1. 평균1_1 : "+ avg1_1 +"\n"								 
								 +"8_2.평균2_2 : "+ avg2_2 +"\n"								
								 +"9_3.평균3_3 : "+ avg3_3 +"\n"
								 +"10.금액 : "+ money +"\n"
								 +"11.학점 : "+ hakjum +"\n"
								 +"12.별점 : "+ star +"\n");								    	
	
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// === 문자형(char) 타입 === //
		// 자바는 char 타입을 표현할 때 unicode 를 사용한다.
		
		char ch1 = 52572; //'최';
		char ch2 = 65; 		//'A'
		char ch3 = 'a'; 	//'a'
		char ch4 = 'a' + 1; 	// 97 + 1 ==> 98	
		char ch5 = (char)(ch4 - 1); 	// 98 - 1 ==> 97
		char ch6 = 9829; //유니코드 테이블 보고 10진수로 변환해서 쓴거임, char 타입은 유니코드로 쓰기때문에
		char ch6_2 = '\u2665';
		
		
		System.out.println("\n================문자형=================\n");
		System.out.println("ch1 : " + ch1);	// ch1 : '서'
		System.out.println("ch2 : " + ch2); // ch2 : 'A'
		System.out.println("ch3 : " + ch3); // ch3 : 'a'
		System.out.println("ch4 : " + ch4); // ch4 : 'b'
		System.out.println("ch5 : " + ch5); // ch5 : 'a'
		System.out.println("ch6 : " + ch6); // ch6 : ♥
		System.out.println("ch6_2 : " + ch6_2); // ch6_2 : ♥
		
		
		
		System.out.println("\n==============boolean 형===================\n");
		
		boolean bool = false; // true ==> , false ==> 거짓
				
		if(bool) {
			System.out.println("현재 bool 변수의 값은 true 입니다.");
		}	
		else {
			System.out.println("현재 bool 변수의 값은 false 입니다.");
		}
				
	}
}

	
		
		

