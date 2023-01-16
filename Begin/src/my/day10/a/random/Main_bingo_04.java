package my.day10.a.random;

import java.util.Random;
import java.util.Scanner;

public class Main_bingo_04 {
	
/*
 	PC가 만들 수 있는 숫자는 1 ~ 100 까지중 아무거나 1개를 만든다.
 	
 		예> 59 (PC가 랜덤하게 만든 숫자)
 		
 		1 부터 100 사이의 숫자 입력 => 50엔터
 		>> 50보다 큰 값입니다.
 		
 		1 부터 100 사이의 숫자 입력 => 71엔터
 		>> 71보다 작은 값입니다.
 		
 		1 부터 100 사이의 숫자 입력 => 60엔터
 		>> 60보다 작은 값입니다.
 		
 		1 부터 100 사이의 숫자 입력 => 58엔터
 		>> 58보다 작은 값입니다.
 		
 		1 부터 100 사이의 숫자 입력 => 58엔터
 		>> 58보다 작은 값입니다.
 		
 		1 부터 100 사이의 숫자 입력 => 59엔터
 		#### 빙고!! 5번만에 맞추었습니다. ####
 */

	public static void main(String[] args) {

	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);
	
	int cntflag =0;
	int pc_no = rnd.nextInt(100-1+1)+1;
	do {
		int user_input=0;
		
		System.out.print("1 부터 100 사이의 숫자 입력 =>");
		try{
			user_input = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("[경고] 1 부터 100 사이의 숫자만 입력하세요!!\n");
			continue;
		}
		if(user_input>pc_no) {
			System.out.println(">> "+user_input+"보다 작은 값입니다.");
			cntflag+=1;
		}
		else if(user_input<pc_no) {
			System.out.println(">> "+user_input+"보다 큰 값입니다.");
			cntflag+=1;
		}
		else if(user_input == pc_no) {
			cntflag+=1;
			System.out.println("#### 빙고!! "+cntflag+"번만에 맞추었습니다. ####");
			break;
		}
		
		
	} while (true);
	sc.close();
	}//end of main()------------------

}
