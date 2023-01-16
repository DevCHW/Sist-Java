package my.day02.dataType;

public class Main_Sungjuk {

	public static void main(String[] args) {
	
		/*
		int hakbun1 = 20191234;
		int hakbun2 = 001234;
		
		System.out.println("hakbun1 : " + hakbun1); // le20191234
		System.out.println("hakbun2 : " + hakbun2); // 668
	
		String hakbun3 = "20191234";
		String hakbun4 = "001234";
		
		System.out.println("hakbun3 : " + hakbun3); // 20191234
		System.out.println("hakbun4 : " + hakbun4); // 001234
	
		*/
		
		System.out.println(10+20);	   //30
		System.out.println("10"+"20"); //1020
		System.out.println("10"+20);   //1020
		System.out.println(""+10+20);  //"10"+20 ==> 1020
		System.out.println(""+(10+20)); //"30"
				
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		Sungjuk lssSj = new Sungjuk();
		lssSj.hakbun = "091234";
		lssSj.name = "이순신";
		lssSj.kor = 68;
		lssSj.eng = 95;
		lssSj.math =100;
		
		System.out.println("\n==================\n");
		
		Sungjuk eomSj = new Sungjuk();
		eomSj.hakbun = "109876";
		eomSj.name = "엄정화";
		eomSj.kor = 78;
		eomSj.eng = 88;
		eomSj.math =95;
		
		lssSj.show_sungjuk();
		
		/*
		 === 성적결과 ===
		 1. 학번 : 091234
		 2. 성명 : 이순신
		 3. 국어 : 68
		 5. 수학 : 100
		 6. 총점 : 263
		 7. 평균1 : 87.66666666666667
		 8. 평균2 : 87.66666666666667
		 9. 평균3 : 87.66666666666667
		 7_1. 평균1_1 : 87.666664
		 8_2.평균2_2 : 87.666664
		 9_3.평균3_3 : 87.666664
		 10.금액 : 2300000000
		 11.학점 : B
		 */ 
		
		eomSj.show_sungjuk();
				
		/*=== 성적결과 ===
		1. 학번 : 109876
		2. 성명 : 엄정화
		3. 국어 : 7968
		4. 영어 : 88100
		5. 수학 : 95263
		6. 총점 : 262
		7. 평균1 : 87.33333333333333
		8. 평균2 : 87.33333333333333
		9. 평균3 : 87.33333333333333
		7_1. 평균1_1 : 87.333336
		8_2.평균2_2 : 87.333336
		9_3.평균3_3 : 87.333336
		10.금액 : 2300000000
		*/
		
		System.out.println("\n=========================================\n");
		
		System.out.println("lssSj => " + lssSj);
		
		System.out.println("eomSj => " + eomSj);
		
		Sungjuk hongkdSj = new Sungjuk();
		
		System.out.println("hongkdSj =>" + hongkdSj);
		
		hongkdSj = eomSj;
		System.out.println("hongkdSj =>" + hongkdSj);
		
		System.out.println("\n##############################################\n");
		
		hongkdSj.name = "홍길동";
		
		eomSj.show_sungjuk();
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		hongkdSj.show_sungjuk();
	}		
}
