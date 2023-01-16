package my.day10.a.random;

import java.util.Random;

import my.util.MyUtil;

public class Main_random_01 {

	public static void main(String[] args) {

		// === 랜덤한 정수를 뽑아낸다.===
		
		/*
		java.lang.Math.random(); 메소드는
		0.0 이상 1.0 미만의 실수(double) 값을 랜덤하게 나타내어주는 메소드이다.
		즉, 0.0 <= 임의의 난수(실수) < 1.0
		*/
		/* ******공식*******
		 	1부터 10 까지 중 랜덤한 정수를 얻어오겠습니다.
		 	
		 	랜덤한 정수 = (int)(Math.random()*구간범위) + 시작값;
		 	
		 	Math.random()
		 	0.0							(int)(0.0*(10-1+1) + 1);	==>1
		 	0.9794526629767569			(int)(0.9794526629767569*(10-1+1)+1);	==>10
		 	0.14593402725823879			(int)(0.14593402725823879*(10-1+1)+1);	==>2
			0.6693335862103671			(int)(0.6693335862103671*(10-1+1)+1);	==>7

		 */
		
		
		System.out.println("1 부터 10 까지 중 랜덤한 정수 => "+((int)(Math.random()*(10-1+1)+1)));
		System.out.println("11 부터 20 까지 중 랜덤한 정수 => "+((int)(Math.random()*(20-11+1)+11)));
		System.out.println("3 부터 7 까지 중 랜덤한 정수 => "+((int)(Math.random()*(7-3+1)+3)));
		
		System.out.println("\n===================================================\n");
		
		/*
		 	Math.random();은 보안상 위험하므로 이것을 사용하지 말고 
		 	new Random(); 을 사용하는 것이 더 안전하다.
		 */
		
		Random rnd = new Random();
		//	랜덤한 정수 = rnd.nextInt(마지막수 - 처음수 + 1) + 처음수
		
		System.out.println("1 부터 10 까지 중 랜덤한 정수 => "+(rnd.nextInt(10 - 1 + 1)+1));
		System.out.println("11 부터 20 까지 중 랜덤한 정수 => "+(rnd.nextInt(20-11+1)+11));
		System.out.println("3 부터 7 까지 중 랜덤한 정수 => "+(rnd.nextInt(7-3+1)+3));
		
		System.out.println("\n===================================================\n");
		
		
		System.out.println("랜덤한 소문자  => "+(char)((int)(Math.random()*('z'-'a'+1)) +'a'));
		System.out.println("랜덤한 소문자  => "+(char)(rnd.nextInt('z' - 'a' + 1) + 'a'));
		
		//인증키는 랜덤한 숫자 3개(0~9)에다가 랜덤한 소문자 4개로 이루어진다.
		//예>103qdtq		020abat
		
		String authentication_key_1 = "";	//인증키
		
		for(int i=0; i<3; i++) {
			authentication_key_1 += ((int)(Math.random()*(9-0+1))+0);
		}
		
		for(int i=0; i<4; i++) {
			char ch = (char)((int)(Math.random()*('z'-'a'+1)) +'a');
			authentication_key_1 += ch;
		}
		
		System.out.println(authentication_key_1);
		
		String authentication_key_2 = "";	//인증키
		
		for(int i=0; i<3; i++) {
			authentication_key_2 += rnd.nextInt(9-0+1)+0;
		}
		
		for(int i=0; i<4; i++) {
			char ch = (char)(rnd.nextInt('z'-'a'+1)+'a');
			authentication_key_2 += ch;
		}
		
		System.out.println(authentication_key_2);
		
		System.out.println("\n===================================================\n");
		
		System.out.println("인증키 => "+MyUtil.authentication_key());

		
	}//end of main()----------------------------------

}
