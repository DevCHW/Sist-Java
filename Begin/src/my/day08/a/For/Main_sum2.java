package my.day08.a.For;

import java.util.Scanner;

public class Main_sum2 {

	public static void main(String[] args) {
		/*
		 >>누적해야할 시작 숫자 -> 1엔터
		 >>누적해야할 마지막 숫자 => 10엔터
		 >> 1+2+3+4+5+6+7+8+9+10=55
		 */
		/*
		 >>누적해야할 시작 숫자 -> 2엔터
		 >>누적해야할 마지막 숫자 => 15엔터
		 >> 2+3+4+5=14
		 */
		/*
		 >>누적해야할 시작 숫자 -> 2엔터
		 >>누적해야할 마지막 숫자 => 10엔터
		 >> 2+3+4+5+6+7+8+9+10=54
		 */
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		int sum = 0;
		
		for(;;) {
			try {
				System.out.print(">> 누적해야할 시작 숫자 => ");
				int startNo = Integer.parseInt(sc.nextLine());	//1엔터 2엔터 강아지엔터 5엔터
				
				System.out.print(">> 누적해야할 마지막 숫자 => ");
				int endNo = Integer.parseInt(sc.nextLine());	//1엔터 2엔터 강아지엔터 3엔터
				
				int cnt = endNo - startNo + 1; // 반복해야할 횟수
				
				if(cnt <= 0) {
					System.out.println("[경고] 누적해야할 마지막 숫자는 시작 숫자보다 같거나 커야합니다.!!\n");
				}
				else {
					
					for(int i = 0, j = startNo; i<cnt; i++, j++) { // 누적치를 구해주기
						
						if(j!=endNo) {
							str = str + j + "+";// str=""+2;
												// str="2"+3;
												// str="23"+4;
												// str=""234"+5;
						}
						else {
							str = str + j;	
						}
						sum += j;
						
					}//end of for-------------------------------------------					
						
					break;	
						
				}
				
			} catch (NumberFormatException e) {
				System.out.println("[경고] 정수로만 입력하세요!!");
			}
		}// end of for--------------------------------------
		
		
		System.out.println(str+"="+sum);
		//1+2+3+4+5+6+7+8+9+10=55
		//2+3+4+5=14
		
		
		sc.close();
//		System.out.println(">> 프로그램 종료 <<");
	}

}
