package my.day06.e.Switch;

public class Sungjuk {

	//field
	String hakbun;
	String name;
	int kor;
	int eng;
	int math;
	
	
	//method
	
	int total() {	//총점을 알려주는 메소드
		return kor+eng+math;
	}
	float avg() {	//평균(소수점 1째 자리까지 보여주고 반올림 함)을 알려주는 메소드
		return (Math.round(total()/3.0f*10))/10.0f;
	}
	
//		avg() ==> 100.0 "A"
//			  ==>  98.6 "A"		89.5"B"
//			  ==>  91.5 "A"		81.5"B"		
//			  ==>  90.0 "A"		80.0"B"
	
	
	
	char grade() {
		char result;
		int avg = (int)avg()/10;
		
		switch (avg) {	// switch( ) 괄호 속에는 byte 타입, short타입, int, char 타입, String 타입은 가능
							// switch( ) 괄호 속에는 long 타입, float 타입,double 타입, String을 제외한 객체타입은 불가함. 
		case 10:			
		case 9:
			result = 'A';
			break;
		case 8:
			result = 'B';
			break;
		case 7:
			result = 'C';
			break;
		case 6:
			result = 'D';
			break;
		default:
			result = 'F';
			break;
		}
		return result;
	}
	
	// 상품을 알려주는 메소드
	/*
	 	상품
	 	학점이 "A" 이라면 "놀이공원이용권, 치킨, 피자, 아이스크림"
	 	학점이 "B" 이라면 "치킨,피자,아이스크림"
	 	학점이 "C" 이라면 "피자,아이스크림"
	 	학점이 "D" 이라면 "아이스크림"
	 	학점이 "F" 이라면 "꿀밤3대"
	 */
	
	String gift() {
		String gift = "";
		
		switch (grade()) {
		
		case 'A':
			gift += "놀이공원이용권, ";
			
		case 'B':
			gift += "치킨, ";
			
		case 'C':
			gift += "피자, ";
		
		case 'D':
			gift += "아이스크림"; //할당연산자를 통한 스위치문 처리
			
			break;
		default:
			gift = "꿀밤";
			break;
		}
		
		return gift;
	}
	
	
	
	
	
	
	
	
}
