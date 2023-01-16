package my.day01;

public class Main_Member {
	
	// 콘솔프로그램의 실행은 main()메소드에서 실행한다.
	public static void main(String[] args) {

		// 1명의 새로운 회원이 필요하다.
		Member lssmbr = new Member(); // 이순신 회원
		// lssmbr 은 메모리(RAM)에 생성되어진 Member 클래스의 인스턴스(객체)의 주소를 가리키는 것이다.
		// lssmbr 를 Member 클래스의 인스턴스(==객체)라고 부른다.
		
		
		System.out.println(lssmbr);
		// my.day01.Member@15db9742
		// @다음에 나오는 16진수값은 메모리(RAM)상의 위치(주소)이다.
		
		lssmbr.id = "leess"; // 여기서 = 은 "같다" 라는 뜻이 아니라 "대입한다" 라는 뜻이다.
		lssmbr.pwd = "abcd";
		lssmbr.name = "이순신";
		lssmbr.email = "leess@naver.com";
		
		Member.address ="서울시 마포구";
		
		System.out.println("lssmbr 객체의 아이디 : " + lssmbr.id);
		System.out.println("lssmbr 객체의 비밀번호 : " + lssmbr.pwd);
		System.out.println("lssmbr 객체의 성명 : " + lssmbr.name);
		System.out.println("lssmbr 객체의 이메일 : " + lssmbr.email);
		System.out.println("Member 클래스로 생성되어진 객체들이 공유해서 사용하는 변수인 주소 : " + Member.address);
		
		System.out.println("\n====================\n");
		
		// 1명의 또 새로운 회원이 필요하다.
		Member eomjhmbr = new Member(); // 엄정화 회원
		// lssmbr 은 메모리(RAM)에 생성되어진 Member 클래스의 인스턴스(객체)의 주소를 가리키는 것이다.
		
		System.out.println(eomjhmbr);
		// my.day01.Member@6d06d69c
		// @다음에 나오는 16진수값은 메모리(RAM)상의 위치(주소)이다.
		
		eomjhmbr.id = "eomjh";
		eomjhmbr.pwd = "qwer1234";
		eomjhmbr.name = "엄정화";
		eomjhmbr.email = "eomjh@gmail.com";
		
		Member Kimjhmbr = new Member();
		Kimjhmbr.id = "Kimjh";
		Kimjhmbr.pwd = "286431";
		Kimjhmbr.name = "김멍현";
		Kimjhmbr.email = "nowadaysgreen79@naver.com";
		
				
		
		System.out.println("eomjhmbr 객체의 아이디 : " + eomjhmbr.id);
		System.out.println("eomjhmbr 객체의 비밀번호 : " + eomjhmbr.pwd);
		System.out.println("eomjhmbr 객체의 성명 : " + eomjhmbr.name);
		System.out.println("eomjhmbr 객체의 이메일 : " + eomjhmbr.email);
		System.out.println("Member 클래스로 생성되어진 객체들이 공유해서 사용하는 변수인 주소 : " + Member.address);		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		lssmbr.showInfo(); // lssmbr 인스턴스에 대한 회원정보 조회하기
		/*		 	
		 * === 이순신님의 정보출력 ===
		 	1. 아이디 : leess
		 	2. 비밀번호 : abcd
		 	3. 성명 : 이순신
		 	4. 이메일 : leess@naver.com
		 */
		
		eomjhmbr.showInfo(); // lssmbr 인스턴스에 대한 회원정보 조회하기
		/*
	 	=== 이순신님의 정보출력 ===
	 	1. 아이디 : eomjhmbr
	 	2. 비밀번호 : qwer1234
	 	3. 성명 : 엄정화
	 	4. 이메일 : eomjh@naver.com
	 */
		Kimjhmbr.showInfo();
		
		
	}

}
