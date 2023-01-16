package my.day18.a.Inteface;

public class Main {

	public static void main(String[] args) {

		Triangle tri = new Triangle();
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		
		System.out.println("밑변 4, 높이 5 인 삼각형의 넓이 => "+tri.area(4,5));
		System.out.println("가로 4, 세로 5 인 사각형의 넓이 => "+rect.area(4, 5));
		System.out.println("반지름이 5인 원이 넓이 ==> "+ cir.area(5));
		
		System.out.println("\n------------------------------------\n");
		
		//필수암기 !!!!
		// >>> 다형성(Polymorphism) <<< 
		// ==> 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술.
	    // 자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성(Polymorphism)이다.
		// 인터페이스로 구현된 클래스의 객체는 그 인터페이스의 타입으로 받을 수 있다는 것이 다형성(Polymorphism)이다.
		
		Figure fg1 = new Triangle();
		Figure fg2 = new Rectangle();
		Figure fg3 = new Circle();
		
		System.out.println("밑변 4, 높이 5 인 삼각형의 넓이 => "+fg1.area(4,5));
		System.out.println("가로 4, 세로 5 인 사각형의 넓이 => "+fg2.area(4, 5));
		System.out.println("반지름이 5인 원이 넓이 ==> "+ fg3.area(5));
		
		System.out.println("\n------------------------------------\n");
		
		Figure[] fig_arr = new Figure[3];
		fig_arr[0] = new Triangle();
		fig_arr[1] = new Rectangle();
		fig_arr[2] = new Circle();
		
		for(Figure fg:fig_arr) {
			if(fg instanceof Triangle)
				System.out.println("밑변 4, 높이 5 인 삼각형의 넓이 => "+fg.area(4,5));
			
			else if(fg instanceof Rectangle)
				System.out.println("가로 4, 세로 5 인 사각형의 넓이 => "+fg.area(4, 5));
			
			else if(fg instanceof Circle)
				System.out.println("반지름이 5인 원이 넓이 ==> "+ fg.area(5));
		}//end of for-------
		
		
		
		
		
	}//end of main()------------

}
