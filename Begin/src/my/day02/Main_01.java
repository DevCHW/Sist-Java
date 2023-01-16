package my.day02;

import my.util.MyUtil;

public class Main_01 {

	String id = "superman"; // String 은 문자열 타입
							// 인스턴스 변수 id에 대한 초기화를 "superman" 으로 했다라고 부른다.
	String pwd; // 멤버변수에 초기화를 하지 않으면 클래스타입은 자동적으로 null 로 초기화된다.
	String name; //
	String email;
	int age;   // int 는 정수 타입
				// 인스턴스 변수 age 에 초기화를 하지 않으면 정수타입(byte, short, int, long)은 자동적으로 0으로 초기화 된다.
	
	double height; // double 은 실수 타입
					// 인스턴스 변수 height 에 초기화를 하지 않으면 실수타입(float, double)은 0.0으로 초기화 된다.
	char grade; //char 는 글자 개만 나타내는 타입	
				//인스턴스 변수 grade 에 초기화를 하지 않으면 char 타입은 자동적으로 ' '로 초기화 된다.
	
	/*
	 	멤버변수 => instance 변수와 static 변수를 합친것을 멤버변수라고 부른다.	 	
	 */
	
	void showInfo_1() {
		
		int hopeMoney = 6000;  // 지역변수(local variable)
							  // 지역변수(local variable)는 { } 내에서만 사용되는 것으로써 { }를 벗어나는 순간
							  // 삭제가 되어버린다.
							  // local variable은 반드시 초기화를 해주어야 한다. 만약에 초기화를 안해주면 오류가 발생한다.
		
		
		System.out.println("===="+name+"님의 회원정보====\n"
				+ "1. 아이디 : "+id+"\n"
				+ "2. 비밀번호 : "+pwd+"\n"
				+ "3. 성명 : "+name+"\n"
				+ "4. 이메일 : "+email+"\n"
				+ "5. 나이 : "+age+"세\n"
				+ "6. 신장 : "+height+"cm\n"
				+ "7. 등급 : "+grade+"\n"
				+ "8. 희망연봉 : "+hopeMoney+"만원\n");		
	}
	
	String showInfo_2() {
		
		int hopeMoney = 7000;
		
		return "===="+name+"님의 회원정보====n"
				+ "1. 아이디 :"+id+"\n"
				+ "2. 비밀번호 : "+pwd+"\n"
				+ "3. 성명 : "+name+"\n"
				+ "4. 이메일 : "+email+".com\n"
				+ "5. 나이 : "+age+"세\n"
				+ "6. 신장 : "+height+"\n"
				+ "7. 등급 : "+grade+"\n"
				+ "8. 희망연봉 : "+hopeMoney+"만원";
		
	}
	
	
	public static void main(String[] args) {
		
		Main_01 ma1 = new Main_01(); // 인스턴스화(== 객체생성)
		
		System.out.println("ma1.id => " + ma1.id);
		System.out.println("ma1.pwd => " + ma1.pwd);
		System.out.println("ma1.name => " + ma1.name);
		System.out.println("ma1.email => " + ma1.email);
		System.out.println("ma1.age => " + ma1.age);
		System.out.println("ma1.height => " + ma1.height);
		System.out.println("ma1.grade => " + ma1.grade);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		ma1.id = "leess";
		ma1.pwd = "abcd";
		ma1.name = "이순신";
		ma1.email = "leess@naver.com";
		ma1.age = 27;
		ma1.height = 182.7;
		ma1.grade = 'A';
		
		ma1.showInfo_1();
		
		/*
		 	====이순신님의 회원정보====
		 	1. 아이디 : leess
		 	2. 비밀번호 : abcd
		 	3. 성명 : 이순신
		 	4. 이메일 : leess@naver.com
		 	5. 나이 : 27세
		 	6. 신장 : 182.7cm
		 	7. 등급 : A
		 	8. 희망연봉 : 6000만원
		 */
		
		System.out.println(ma1.showInfo_2());
		
		Main_01 ma2 = new Main_01(); // 인스턴스화(==객체생성)
		
		ma2.id = "eomjh";
		ma2.pwd = "qwer1234";
		ma2.name = "엄정화";
		ma2.email = "eomjh@gmail.com";
		ma2.age = 35;
		ma2.height = 162.7;
		ma2.grade = 'B';
		
		String info = ma2.showInfo_2();
		System.out.println(info);
		/*
	 	====엄정화님의 회원정보====
	 	1. 아이디 :eomjh
	 	2. 비밀번호 : qwer1234
	 	3. 성명 : 엄정화
	 	4. 이메일 : eomjh@naver.com
	 	5. 나이 : 35세
	 	6. 신장 : 162.7cm
	 	7. 등급 : B
	 	8. 희망연봉 : 6000만원
	 */
		ma2.showInfo_1();
		
		System.out.println("\n===========================\n");
		
		System.out.println("종료시각 : " + MyUtil.currentTime());
		
		// 종료시각 : 2022-05-31 14:35:40
	}

}
