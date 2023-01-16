package my.day10.a.random;

import java.util.Random;
import java.util.Scanner;

public class Main_holjjak_02 {
	
	/*
 	-- 컴퓨터가 0 또는 1 중에 랜덤한 숫자를 생성해주어야 한다.
 	-- 만약에 컴퓨터가 생성한 랜덤한 숫자가 0 일 경우
 	-- 만약에 컴퓨터가 생성한 랜덤한 숫자가 1 일 경우
 	
 	사용자선택[1:홀수 / 0:짝수] => 0엔터	1엔터
 	<결과> 맞추었습니다.
	컴퓨터가 낸수 : 0
 	
 	사용자선택[1:홀수 / 0:짝수] => 0엔터
 	<결과> 틀렸습니다.
 	컴퓨터가 낸수 : 1
 	
 	>> 또 할래?[Y/N] => s
 	[경고] Y 또는 N 만 가능합니다.
 	
 	>> 또 할래?[Y/N] => y
 	
 	사용자선택[1:홀수 / 0:짝수] => 2엔터
 	[경고] 홀짝 선택은 0 또는 1 만 가능합니다.
 	
 	사용자선택[1:홀수 / 0:짝수] => 강아지엔터
 	[경고] 홀짝 선택은 0 또는 1 만 가능합니다.
 	
 	사용자선택[1:홀수 / 0:짝수] => 1엔터
 	<결과> 맞추었습니다.
	컴퓨터가 낸수 : 1
	
	<결과> 틀렸습니다.
 	컴퓨터가 낸수 : 0
 	
 	>> 또 할래?[Y/N] => n
 	
 	== 프로그램 종료 ==
 */

	public static void main(String[] args) {
		
		// -- 컴퓨터가 0 또는 1 중에 랜덤한 숫자를 생성해주어야 한다.
		Random rnd = new Random();
		
		
		// 랜덤한 정수 = rnd.nextInt(마지막수 - 처음수 + 1) + 처음수;
		
		
		outer:
		do{
			int pc_no = rnd.nextInt(1 - 0 + 1) + 0;
			Scanner sc = new Scanner(System.in);
			int user_no = 0;
			do {
				System.out.print("사용자선택[1:홀수 / 0:짝수] => ");
				try {
					user_no = Integer.parseInt(sc.nextLine());
					
					if(user_no == 0 || user_no ==1)
						break;
					else {
						System.out.println("[경고] 홀짝 선택은 0 또는 1 만 가능합니다.\n");
					}
					
				}catch(NumberFormatException e) {
					System.out.println("[경고] 홀짝 선택은 0 또는 1 만 가능합니다.\n");
				}//end of catch--
			}while(true);
			String result =(pc_no==user_no)?"맞추었습니다.":"틀렸습니다.";
			
			
			System.out.println("<결과> "+result);	
			System.out.println("컴퓨터가 낸 수 : "+pc_no+"\n");	
			
			do {
				System.out.print(">> 또 할래?[Y/N] => ");
				String yn = sc.nextLine();
				
				if("y".equalsIgnoreCase(yn)) {
					break;
				}//end of if----
				else if("n".equalsIgnoreCase(yn)) {
					sc.close();
					break outer;
				}//end of if----
				
				else {
					System.out.println("[경고] Y 또는 N 만 가능합니다.\n");
				}//end of else---
				
			} while (true);
			
		}while(true);//end of outer:do~while--
		
		
		
		System.out.println("== 프로그램 종료 ==");
	}

}
