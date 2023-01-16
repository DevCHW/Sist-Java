package my.day18.c.multi_Interface;

public class Main {

	public static void main(String[] args) {

		Me me = new Me();
		me.work();	//보람차게 일합니다.!!
		me.cook();	//맛있는 음식을 요리합니다.~~
		me.play();	//재미있게 놀아요^^
		System.out.println("원주율 => "+me.PI);
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Inter_Me interme = new Me();
		
		System.out.println("원주율 => "+me.PI);
		interme.work();	//보람차게 일합니다.!!      
		interme.cook(); //맛있는 음식을 요리합니다.~~  
		interme.play(); //재미있게 놀아요^^        
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Inter_Father interfa = new Me();
		System.out.println("원주율 => "+me.PI);
		interfa.work();	//보람차게 일합니다.!!      
//		interfa.cook(); //Inter_Father 인터페이스에 기재된 미완성 메소드가 아니므로 오류!!
//		interfa.play(); //Inter_Father 인터페이스에 기재된 미완성 메소드가 아니므로 오류!!
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		//Inter_Mother 인터페이스에 기재된 field 가 아니므로 오류!!
		
		Inter_Mother intermom = new Me();
		System.out.println("원주율 => "+me.PI);
//		intermom.work(); //Inter_Mother 인터페이스에 기재된 미완성 메소드가 아니므로 오류!!
		intermom.cook(); //맛있는 음식을 요리합니다.~~
//		intermom.play(); //Inter_Mother 인터페이스에 기재된 미완성 메소드가 아니므로 오류!!
	}

}
