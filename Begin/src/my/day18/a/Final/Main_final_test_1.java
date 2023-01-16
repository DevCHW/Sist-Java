package my.day18.a.Final;

public class Main_final_test_1 {

	public static void main(String[] args) {

		Final_test_1 ft1 = new Final_test_1();
		
		ft1.id = "leess";
		ft1.name = "이순신";
//		ft1.PI//The final field Final_test_1.pi cannot be assigned
			  // final 이므로 새로운 값을 할당 할 수 없기에 오류임.
		
		
		Child_final_test_1 child = new Child_final_test_1();
		child.greeting();
		
		child.rule();
		
		
		
		
	}//end of main()-----------------------

}
