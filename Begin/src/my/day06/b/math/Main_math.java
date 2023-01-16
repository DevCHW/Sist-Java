package my.day06.b.math;

public class Main_math {

	public static void main(String[] args) {
		
		// === Math 클래스에 대해서 알아봅니다. === //
		
		// 1. >>> 반올림에 대해서 알아본다. <<<
		double db1 = 93.45678, db2=86.87654;
		
		System.out.println("=== 반올림 하기 전 ===");
		System.out.println("db1 => " + db1 + ",db2 => "+db2);
		//db1 => 93.45678,db2 => 86.87654
		System.out.println("=== 반올림 한 후 ===");
		System.out.println("db1 =>" + Math.round(db1) + ", db2 => " + Math.round(db2));
		//db1 =>93, db2 => 87
		//Math.round(double 타입의 실수) ==> long 타입의 정수
		//Math.round(float 타입의 실수) ==> int 타입의 정수
		//Math.round(실수) ==> 입력한 실수의 정수 일의자리까지만 보여주고 나머지 소수부는 반올림하면서 삭제된다.
		//Math.round(93.45678) ==> 93
		//Math.round(86.87654) ==> 87
		
		// ==특정 소수부 자리에서 반올림을 하고자 한다. ==
		// db1=> 93.45678 ==>93.5 (소수부 첫째 자리까지 나타내면서 반올림)
		// db2=> 86.87654 ==>86.88 (소수부 둘째 자리까지 나타내면서 반올림)
		
		// 93.45678 * 10 ==> 934.5678 ==> Math.round(934.5678) ==> 935 ==> 935/10.0 ==> 93.5
		// 86.87654 * 100 ==> 8687.654 ==> Math.round(8687.654) ==> 8688 ==> 8688/100.0 ==> 86.88
		
		System.out.println("\n === 소수부 첫째 자리까지 나타내면서 반올림 한 후 ===");
		System.out.println("db1 =>" + Math.round(db1*10)/10.0 + ", db2 => " + Math.round(db2*10)/10.0);
		//db1 =>93.5, db2 => 86.9
		
		System.out.println("\n === 소수부 둘째 자리까지 나타내면서 반올림 한 후 ===");
		System.out.println("db1 =>" + Math.round(db1*100)/100.0 + ", db2 => " + Math.round(db2*100)/100.0);
		//db1 =>93.46, db2 => 86.88
		
		// 2. >>> 올림에 대해서 알아본다. <<<
		// 54.0 ==> Math.ceil(54.0) ==> 54.0
		// 54.1 ==> Math.ceil(54.1) ==> 55.0
		// 54.9 ==> Math.ceil(54.9) ==> 55.0
		
		double db3=54.0, db4=54.1, db5=54.9;
		System.out.println("\n === 올림한 후 ===");
		System.out.println("db3=>" + Math.ceil(db3) + ", db4 =>" + Math.ceil(db4) + ", db5 =>" + Math.ceil(db5));
		//db3=>54.0, db4 =>55.0, db5 =>55.0
		
		
		System.out.println("\n=========================================\n");
		
		/*
		 웹페이지 게시판에서 보여줄 게시물이 32개 있다. 1페이지당 10개를 보여주고자 한다.
		 이러한 경우 총 페이지 수는 몇페이지일까요?
		 
		 
		 10개 10개     10개   
		 1	   2	   3	  
		 
		 총 페이지수는 3페이지 이어야 한다.
		 */
		
		int totalCount = 30;
		int sizePerPage = 10;
		double totalPage = (double)totalCount/sizePerPage;
		System.out.println("totalPage =>" + Math.ceil(totalPage));
		// totalPage => Math.ceil(3.0) ==> 3.0
		System.out.println("totalPage =>" + (int)Math.ceil(totalPage));
		// 캐스팅해서 3.0 뒤의 소수부를 절삭한다. ==> 3
		
		int totalPge = (int)Math.ceil((double)totalCount/sizePerPage);
		// totalPge => 3
		System.out.println("totalPge => " + totalPge);
		
		/*
		 웹페이지 게시판에서 보여줄 게시물이 32개 있다. 1페이지당 10개를 보여주고자 한다.
		 이러한 경우 총 페이지 수는 몇페이지일까요?
		 
		 
		 10개 10개     10개   2개
		 1	   2	   3	 4 
		 
		 총 페이지수는 3페이지 이어야 한다.
		 */
		System.out.println("\n=========================================\n");
		
		totalCount = 32;
		sizePerPage = 10;
		totalPage = (double)totalCount/sizePerPage;
		System.out.println("totalPage =>" + Math.ceil(totalPage));
		// totalPage => Math.ceil(3.2) ==> 4.0
		System.out.println("totalPage =>" + (int)Math.ceil(totalPage));
		// 캐스팅해서 3.0 뒤의 소수부를 절삭한다. ==> 4
		
		totalPge = (int)Math.ceil((double)totalCount / sizePerPage);
		System.out.println("totalPge =>" + totalPge);
		//totalPge => 4
		
		// 3. >>> 내림에 대해서 알아본다. <<<
		// 54.0 ==> Math.floor(54.0) ==> 54.0
		// 54.1 ==> Math.floor(54.1) ==> 54.0
		// 54.9 ==> Math.floor(54.9) ==> 54.0
		
		db3=54.0; db4=54.1; db5=54.9;
		System.out.println("\n === 내림한 후 ===");
		System.out.println("db3=>" + Math.floor(db3) + ", db4 =>" + Math.floor(db4) + ", db5 =>" + Math.floor(db5));
		//db3=>54.0, db4 =>54.0, db5 =>54.0
		
		System.out.println("db3=>" + (int)Math.floor(db3) + ", db4 =>" + (int)Math.floor(db4) + ", db5 =>" + (int)Math.floor(db5));
		
		System.out.println("\n=========================================\n");
		
		// 4. >>> 절대값에 대해서 알아본다. <<<
		System.out.println("\n === 절대값 ===");
		
		int a=20, b=-30;
		System.out.println("a => "+a+", b =>"+b);
		// a => 20, b => -30
		
		System.out.println("a => "+ Math.abs(a) + ", b =>"+Math.abs(b));
		// a => 20, b => 30
		
	}

}
