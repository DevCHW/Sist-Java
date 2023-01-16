package my.day09.a.multiFor;

public class Main_homework_06 {

	/*
	 1. 제출할 파일명 : 자기이름_Main_homework_06.txt
	 				홍길동_Main_homework_06.txt
	 2. 메일주소 : tjdudgkr0959@naver.com
	 3. 제출기한 : 6월17일(금) 18:00 까지
	 4. 자바소스 : for문을 사용하여 만들 것
	 */
	public static void main(String[] args) {
		System.out.println("==과제 1==\n");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}//end of for-----------------
			System.out.println();
			
		}//end of for-----------------
		/*
		   == 과제 1 ==
		   *
		   **
		   ***
		   ****
		   *****
		 */
		
		
		System.out.println("==과제 2==\n");	
		
		String star="";
		
		for(int i=0;i<5;i++) {
			String space="";	//변수를 지정해서 i가 1증가할때마다 공백을 한칸씩 누적.
			star+="*";
			
			for(int j=4-i;j>0;j--) {
				space+=" ";
			}//end of for---------
			
			System.out.print(space+star);
			System.out.println();
		}//end of for-------------	
		
		System.out.println("==과제 2 다른풀이==\n");
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<4-i;j++) { //공백 출력하는 반복문
				System.out.print(" ");
			}//end of for-----
			
			for(int j=0;j<i+1;j++) { //별을 출력하는 반복문
				System.out.print("*");
			}//end of for------
			
			System.out.println();
		}//end of for------
		
				
		/*
		   
		   == 과제 2 ==
		       *
		      **
		     ***
		    ****
		   *****
		    	
		 */	

		
		System.out.println("==과제 3==\n");
		
		for(int i=0;i<5;i++) {
			
			for(int j=5-i;j>0;j--) {
				System.out.print("*");
			}//end of for----------------
			
			System.out.println();
		}//end of for-------------
		
		/*
		   
		   == 과제 3 ==
		   *****
		   ****
		   ***
		   **
		   *
		    	
		 */	
		
		
		System.out.println("==과제 4==\n");	
		for(int i=1;i<=3;i++) {//3행
			
			for(int j=3-i;j>=1;j--) {
				System.out.print(" ");   					
			}
			for(int j=2*i-1;j>=1;j--) {      
				System.out.print("*");        
			}
			System.out.println();
		}//end of for---
		/*
		   
		   == 과제 4 ==
		     *
		    ***
		   *****
		 */		
		
		System.out.println("==과제 5==\n");	
		
		for(int i=1;i<=3;i++) {//3행
			for(int j=i-1;j>0;j--) { //공백을 출력하는 반복문 
				System.out.print(" ");
			}//end of for------
			for(int j=7-2*i;j>0;j--) {
				System.out.print("*");
			}//end of for-----
			System.out.println();
		}//end of for-----
			
		/*
		 == 과제 5 ==
		   *****
		    ***
		     *	
		 */	
		System.out.println("==과제 6==\n");	
		
		for(int i=1;i<=3;i++) {//상단
			
			for(int j=3-i;j>=1;j--) {
				System.out.print(" ");   					
			}
			for(int j=2*i-1;j>=1;j--) {      
				System.out.print("*");        
			}
			System.out.println();
		}
		for(int i=1;i<=2;i++) {//하단
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=5-2*i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		   
		   == 과제 6 ==
		     * 
		    ***
		   *****
		    ***
		     *	
		 */		
	
		
	}//end of main-------------

}//end of class-------------------
