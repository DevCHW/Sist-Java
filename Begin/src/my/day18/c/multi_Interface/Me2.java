package my.day18.c.multi_Interface;

public class Me2 implements Inter_Mother, Inter_Father {
//	자바에서는 클래스 생성시 다중 인터페이스 구현이 가능하다
	
	@Override
	public void work() {
		System.out.println("열심히 땀흘려 일합니다.!!");		
	}

	@Override
	public void cook() {
		System.out.println("맛있는 음식을 요리합니다. 냠냠~~");
		
	}

}
