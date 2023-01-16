package my.day17.f.block;

public class Child extends Parent{
	// field (첫번째)
	String name = "홍길동"; // 멤버변수의 초기화
	static int count;     // 멤버변수의 초기화
	
	// === static 초기화 블럭(두번째) === //
	static {
		/*
		 	static 초기화 블럭은 인스턴스(객체)를 생성하기 전에 먼저 호출되어지며
		 	중요한 것은 오로지 1번만 호출된다는 것이다.
		 	그래서 주로 static 초기화 블럭은 환경설정시 사용된다.
		 */
		System.out.println("*** Child 클래스의 'static 초기화 블럭' 호출됨. ***");
		count++;
		
//		name = "똘똘이";
		// static 초기화 블럭에는 오로지 static 변수만 들어올 수 있고,
		// 인스턴스 변수는 들어올 수 없다.
	}//end of static
	
	// === instance(인스턴스) 초기화 블럭(네번째) === //
	{
		System.out.println("### Child 클래스의 instance(인스턴스) 초기화 블럭 호출됨. ###");
		name = "서강준";
	}
	// === 생성자 === //
	public Child() {
		super();	// (세번째)
		
		// (다섯번째)
		System.out.println(">> 자식클래스인 Child 클래스의 기본생성자 호출됨 <<");
		name = "한지민";
	}
	
}
