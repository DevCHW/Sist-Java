package my.day09.a.multiFor;

public class Main_star_05 {

	public static void main(String[] args) {
		/*
		  == 입사문제 ==
		  
		  *********1
		  ********2
		  *******3
		  ******4
		  *****5
		  ****6
		  ***7
		  **8
		  *9
		 */
		
		System.out.println("~~~ 1. for 문 사용한 것 ~~~ \n");
		
		
		
		for(int i=0;i<9;i++) {	//9행
			String str_star="";
			for(int j=9-i;j>0;j--) {
				str_star += "*";
			}//end of for-----
			System.out.println(str_star+(i+1));
		}//end of for-------------------
	}//end of main()------------------

}
