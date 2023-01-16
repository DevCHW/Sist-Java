package my.day03.a.constructor;

public class Main_Member {

	public static void main(String[] args) {
		
		
		// 기본생성자로 Member 클래스 인스턴스(객체) 생성하기
		Member hongMbr = new Member();
		
		hongMbr.userid = "hongkd";
		hongMbr.passwd = "abcd";
		hongMbr.name = "홍길동";
		hongMbr.age = 30;
		hongMbr.point = 100;

		System.out.println(hongMbr.showInfo());
		/*
		  ==== 홍길동님 ====
		  1. 아이디 : hongkd
		  2. 비밀번호 : abcd 
		  3. 성명 : 홍길동
		  4. 나이 : 30
		  5. 포인트 : 100Point		 
		 */
		
		// 소괄호() 속에 있는 String userid 이러한 것을 파라미터(parameter) == 아규머트(argument) == 인자 == 인수 라고 부른다.
		// 파라미터가 있는 생성자로 Member 클래스 인스턴스(객체) 생성하기
		Member hanskMbr = new Member("hansk","qwer1234","한석규",26,200);
		System.out.println(hanskMbr.showInfo());
		/*
		  ==== 한석규님 ====
		  1. 아이디 : hansk
		  2. 비밀번호 : qwer1234 
		  3. 성명 : 한석규
		  4. 나이 : 26
		  5. 포인트 : 200Point		 
		 */
		
		System.out.println("\n~~~~~~~~~~~~인스턴스의 필드값 변경하기 ~~~~~~~~~~\n");
		
		hongMbr.updateInfo("0987abcd","Hong kildong", 27, 150);
		hanskMbr.updateInfo("asdf0070","석규한", 50, 700);
		
		System.out.println(hongMbr.showInfo());
		/*
		  ==== Hong kildong님 ====
		  1. 아이디 : hongkd
		  2. 비밀번호 : 0987abcd 
		  3. 성명 : 홍길동
		  4. 나이 : 27
		  5. 포인트 : 150Point		 
		 */
		System.out.println(hanskMbr.showInfo());
		/*
		  ==== Hong kildong님 ====
		  1. 아이디 : hongkd
		  2. 비밀번호 : asdf0070
		  3. 성명 : 석규한
		  4. 나이 : 50
		  5. 포인트 : 700Point		 
		 */
		
		System.out.println("\n====퀴즈 =====\n");
		hongMbr.showInfo_2();
		/*
		  ==== Hong kildong님 ====
		  1. 아이디 : hongkd
		  2. 비밀번호 : 0987abcd 
		  3. 성명 : 홍길동
		  4. 나이 : 27
		  5. 포인트 : 150Point
		  6. 실행종료시각 : 2022-06-02 15:35:40	 
		 */
		hanskMbr.showInfo_2();
		/*
		  ==== Hong kildong님 ====
		  1. 아이디 : hongkd
		  2. 비밀번호 : asdf0070
		  3. 성명 : 석규한
		  4. 나이 : 50
		  5. 포인트 : 700Point
		  6. 실행종료시각 : 2022-06-02 15:35:40		 
		 */
		
		/*
        x << n  은 x*(2의 n승)의 결과값과 같다. x는 실수형은 불가하고 정수형만 가능함.
        x >> n  은 x가 양수일 경우 x/(2의 n승)의 결과값과 같다. x는 실수형은 불가하고 정수형만 가능함. 
        x >>> n 은 정수 x를 32bit 형태의 2진수로 나타낸후 오른쪽으로 n번 이동시키고 빈자리는 0으로 채운다.
   */
		
		
	}

}
