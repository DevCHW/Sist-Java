package my.day09.a.multiFor;

import java.util.Scanner;

public class Main_gugudan_02 {

	public static void main(String[] args) {
		
		/* 몇단 볼래? => 8엔터
		  
		  === 8단 ===
		  8*1=8
		  8*2=16
		  8*3=24
		  8*4=32
		  8*5=40
		  8*6=48
		  8*7=56
		  8*8=64
		  8*9=72
		  
		 >> 또 하시겠습니까?[Y/N] => y엔터 또는 Y엔터
		 
		 >> 몇단 볼래? => 1.34엔터 또는 똘똘이엔터
		 [경고] 2단부터 9단까지만 가능합니다.
		 
		 >> 몇단 볼래? => 345엔터
		 [경고] 2단부터 9단까지만 가능합니다.
		 
		 >> 몇단 볼래? => 3엔터
		  === 3단 ===
		  3*1=3
		  3*2=6
		  3*3=9
		  3*4=12
		  3*5=15
		  3*6=18
		  3*7=21
		  3*8=24
		  3*9=27
		  
		  >> 또 하시겠습니까?[Y/N] => s엔터 또는 S엔터
		  [경고] Y 또는 N만 가능합니다.
		  
		  >> 또 하시겠습니까?[Y/N] => n엔터 또는 N엔터
		  
		  ==프로그램 종료==
		 */
		
		Scanner sc= new Scanner(System.in);
		
		/*
		  	==
		 
		 */
		outer:
		for(;;) {
			try {
				System.out.print("몇단 볼래? =>");
				String str_dan = sc.nextLine();
				int dan = Integer.parseInt(str_dan);
				
				if(2<= dan && dan <= 9) {
					//입력받은 단을 출력해주기
					System.out.println("\n==="+dan+"단 ===");
					for(int i=0; i<9; i++) {
						System.out.println(dan+"*"+(i+1)+"="+dan*(i+1));
					}//end of for-------------------------------
					
					for(;;) {
					System.out.print("\n>> 또 하시겠습니까?[Y/N] =>");
					String yn = sc.nextLine();
					
					if("y".equalsIgnoreCase(yn)) {	//대소문자 구분없이 y 이라면
						break;
					}//end of if-------
					else if("n".equalsIgnoreCase(yn)){ //대소문자 구분없이 n 이라면
						sc.close();
						System.out.println("==프로그램 종료==");
						break outer; // outer 라는 레이블명으로 선언되어진 for 문을 빠져나가는 것이다.
								     // outer 가 레이블명이다.
					}//end of else if--------
					else {
						System.out.println("[경고] Y 또는 N만 가능합니다.\n");
					}
					
					}//end of for---------------
					
				}
				else {
					System.out.println("[경고] 2단부터 9단까지만 가능합니다.\n");
				}
				
			}catch(NumberFormatException e){
				System.out.println("[경고] 2단부터 9단까지만 가능합니다.\n");
				
			
			}//end of catch------------
			
		}//end of for--------
			
		
	}

}
