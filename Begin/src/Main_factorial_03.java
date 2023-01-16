import java.util.Scanner;

public class Main_factorial_03 {

	public static void main(String[] args) {

		//=== 입사문제 === //
		/*
		 	>> 알고싶은 팩토리얼 수 입력 => 5엔터
		 	>> 5! = 120
		 	
		 	>> 알고싶은 팩토리얼 수 입력 => 5엔터
		 	>> 5! => 5*4*3*2*1 => 120
		 	
		 	>> 또 할래?[Y/N] => y엔터
		 	
		 	>> 알고싶은 팩토리얼 수 입력 => 0엔터
		 	[경고] 자연수만 입력하세요!!
		 	
		 	>> 알고싶은 팩토리얼 수 입력 => 7엔터
		 	>> 7! => 7*6*5*4*3*2*1 => 5040
		 	
		 	>> 또 할래?[Y/N] => n엔터
		 	
		 	== 프로그램 종료 ==
		 */
		Scanner sc = new Scanner(System.in);
		outer:
		do {
			try {
				System.out.print(">> 알고싶은 팩토리얼 수 입력 =>");
				int num = Integer.parseInt(sc.nextLine());
				
				if(num <= 0) {
					System.out.println("[경고] 자연수만 입력하세요!!\n");
				}
				else {
					long result = 1;
					String str="";
					for(int i=num; i>0; i--) {
						result *= i; 		 // result = 1*5 =5
											 // result = 5*4;
											 // result = 5*4*3;
						                     // result = 5*4*3*2;
											 // result = 5*4*3*2*1;
						if(i>1) {
							str += i+"*";
						}
						else {
							str += i;
						}
						
					}//end of for----------------
					
					System.out.println(num+"! => "+ str +" => "+result);
					// >> 5~ => 5*4*3*2*1 => 120
					do {
						System.out.print("\n>> 또 할래?[Y/N] => ");
						String yn = sc.nextLine();
						
						if("y".equalsIgnoreCase(yn)) { // 또 할래? 물었을 때 "y" "Y" 를 입력한 경우
							break;
						}
						else if("n".equalsIgnoreCase(yn)) { // 또 할래? 물었을 때 "n" "N" 를 입력한 경우
							break outer;
						}
						else { // 또 할래? 물었을 때 "y" "Y" "n" "N" 을 제외한 나머지를 입력한 경우
							System.out.println("[경고] Y 또는 N 만 입력하세요!!");
						}
						
					}while(true);
						
				}//end of else----------------------------------
				
			}catch(NumberFormatException e) {
				System.out.println("[경고] 자연수만 입력하세요!!\n");
			}//end of catch---------------------------
				
		} while (true);
		// end of do~while--------------------------------------
		
		
		
		
		sc.close();
		System.out.println("\n== 프로그램 종료==");
	}//end of main()-------------------

}
