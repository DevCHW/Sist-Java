package my.day10.a.random;

import java.util.Random;
import java.util.Scanner;

public class Main_gawibawibo_03 {
	/*
 	-- 컴퓨터가 1 또는 2 또는 3 중에 랜덤한 숫자를 생성해주어야 한다.
 	-- 만약에 컴퓨터가 생성한 랜덤한 숫자가 1 일 경우는 컴퓨터가 가위를 냈다라고 본다
 	-- 만약에 컴퓨터가 생성한 랜덤한 숫자가 2 일 경우는 컴퓨터가 바위를 냈다라고 본다
 	-- 만약에 컴퓨터가 생성한 랜덤한 숫자가 3 일 경우는 컴퓨터가 보를 냈다라고 본다
 	
 	============>> 메뉴 <<===========
 	1.가위	2.바위	3.보 	4.게임종료
 	================================
 	>> 메뉴번호를 선택하세요 => 강아지엔터
 	[경고] 메뉴에 없는 번호 입니다.!!
 	
 	============>> 메뉴 <<===========
 	1.가위	2.바위	3.보 	4.게임종료
 	================================
 	>> 메뉴번호를 선택하세요 => 7엔터
 	[경고] 메뉴에 없는 번호 입니다.!!
 	
 	============>> 메뉴 <<===========
 	1.가위	2.바위	3.보 	4.게임종료
 	================================
 	>> 메뉴번호를 선택하세요 => 1엔터
 	[게임결과] 사용자님이 이겼습니다 ^o^
 	[게임결과] 사용자님이 비겼습니다 
 	[게임결과] 사용자님이 졌습니다 ㅜㅜ
 	
 	============>> 메뉴 <<===========
 	1.가위	2.바위	3.보 	4.게임종료
 	================================
 	>> 메뉴번호를 선택하세요 => 4
 	[게임종료] 안녕히 가세요~~
 	
 	== 프로그램 종료 ==
 	
	*/

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		String str_input="";
		//1 가위
		//2 바위
		//3 보
		do {
			int pc_num = rnd.nextInt(3-1+1)+1;
			String pc_input = "";
			if(pc_num==1) {
				pc_input ="가위";
			}
			else if(pc_num==2) {
				pc_input ="바위";
			}
			else if(pc_num==3){
				pc_input="보";
			}
			System.out.println("============>> 메뉴 <<===========\n"
							 + "1.가위	2.바위	3.보 	4.게임종료\n"
							 + "================================\n");
			System.out.print(">> 메뉴번호를 선택하세요 => ");
			str_input = sc.nextLine();
			
			if(!"1".equals(str_input) && !"2".equals(str_input) && !"3".equals(str_input) && !"4".equals(str_input)) {
				System.out.println("[경고] 메뉴에 없는 번호 입니다.!!\n");
			}
			else if(!"4".equals(str_input)) {
				String msg="";
				if( ("1".equals(str_input) && pc_num ==3)||
					("2".equals(str_input) && pc_num ==1)||
					("3".equals(str_input) && pc_num ==2)) {//사용자가 이긴 경우
					msg = "[게임결과] 사용자님이 이겼습니다. ^o^";
				}
				else if("1".equals(str_input) && pc_num ==2||
						"2".equals(str_input) && pc_num ==3||
						"3".equals(str_input) && pc_num ==1) {//사용자가 진 경우
					msg ="[게임결과] 사용자님이 졌습니다. ㅜㅜ";
				}
				else {
					msg = "[게임결과] 사용자님과 비겼습니다.";
				}
				System.out.println("[게임결과] 컴퓨터는 "+pc_input+"를 냈습니다!");
				System.out.println(msg+"\n");
				
			}//end of else---
		} while (!("4".equals(str_input)));

		sc.close();
		System.out.println("[게임종료] 안녕히 가세요~~\n");
		System.out.println("\n== 프로그램 종료 ==");
		
	}//end of main()------------------

}
