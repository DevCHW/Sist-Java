package my.day08.a.For;

import java.util.Scanner;

public class Main_sum_3_hol_jjak {

	public static void main(String[] args) {
		/*
		 >>첫번째 정수-> 1엔터
		 >>두번째 정수 => 10엔터
		 
		 >> 결과 <<
		 1부터 10까지의 홀수들만의 합 : 25
		 2부터 10까지의 짝수들만의 합 : 30
		 */
		
		/*
		 >> 첫번째 정수 => 2엔터
		 >> 두번째 정수 => 10엔터
		 
		 >> 결과 <<
		 2부터 10까지의 홀수들만의 합 : 24
		 2부터 10까지의 짝수들만의 합 : 30
		 */
		
		/*
		 >> 첫번째 정수 => 3엔터
		 >> 두번째 정수 => 10엔터
		 
		 >> 결과 <<
		 3부터 10까지의 홀수들만의 합 : 24
		 3부터 10까지의 짝수들만의 합 : 28
		 */
		 
		Scanner sc = new Scanner(System.in);
		
		int num1=0,num2,hol_sum=0,jjak_sum=0;
				
		for(;;) {			
			try {				
				System.out.print(">> 첫번째 정수 => ");
				num1 = Integer.parseInt(sc.nextLine());	//1   2    3
				System.out.print(">> 두번째 정수 => ");
				num2 = Integer.parseInt(sc.nextLine()); //10  10   10
				
				int holsu = 0, jjaksu = 0;
				
				if(num1%2 != 0) {     // 첫번째 정수가 홀수인 경우
					holsu = num1;     // holsu = 1
					jjaksu = num1+1;  // jjaksu = 1+1;
					
					
				
				
				}
				else { // 첫번째 정수가 홀수인 경우
					holsu = num1+1;   // holsu = 2+1
					jjaksu = num1;    // jjaksu = 2
					
					
				}
				
				// 홀수 및 짝수의 합을 구한다.
				for(;;) {
													//		   num1=1;	num2=10;	num1=2; num2=10;
					if(holsu <= num2 )				//홀수의 합   1+3+5+7+9            3+5+7+9
						hol_sum += holsu;				
					
					if(jjaksu <= num2)  			//짝수의 합   2+4+6+8+10           2+4+6+8+10
						jjak_sum += jjaksu;
						
					holsu += 2;
					jjaksu += 2;
				
					if(holsu > num2 && jjaksu > num2) {
						break;
					}
					
				}// end of for--------------------------------------------------
				
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("[경고] 정수만 입력하세요!!\n");
			}
		}//end of for---------------------------
		
		System.out.println("\n>> 결과 <<\n"
						 + num1+"부터 "+num2+"까지의 홀수들만의 합 : "+hol_sum+"\n"
						 + num1+"부터 "+num2+"까지의 짝수들만의 합 : "+jjak_sum+"\n");
		
		sc.close();
		
		
		
		
		
	}

}
