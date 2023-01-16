package my.day18.a.Final;

public class Final_test_1 {

	String id;
	String name;
	
	// 필드에 final 이 붙으면 더 이상 새로운 값으로 할당 할 수 없다.
	public final double PI = 3.141592; // final(상수)는 관습상 대문자.	
	
	public void greeting() {
		System.out.println("== 안녕하세요 ==");
	}
	
	// 메소드에 final 을 붙이면 자식 클래스에서 메소드의 overriding(재정의)을 할수 없다.
	public final void rule() {
		System.out.println("== 정직하게 삽시다 ==");
	}
	
	
}//end of class---
