package my.day18.a.Final;

public class Child_final_test_1 extends Final_test_1 {

	int age;
	
	public void test() {
		System.out.println(">> 연습입니다. <<");
	}
	
	
	@Override
	public void greeting() {
		System.out.println("\n~~~~~Hi !! hello~~~~~\n");
	}
	
//	== final 메소드는 재정의 할 수 없다.
//	@Override
//	public void rule() {
//		System.out.println("\n~~~~~Honesty~~~~~\n");
//	}
}
