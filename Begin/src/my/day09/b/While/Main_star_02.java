package my.day09.b.While;

public class Main_star_02 {

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
		
		System.out.println("~~~ 2. while 문 사용한 것 ~~~ \n");

		
		int i=0;
		
		while(!(++i > 9)) {
			
			String str_star = "";
			// i => 1 2 3 4 5 6 7 8 9
			// j => 9 8 7 6 5 4 3 2 1
			int j=10-i;
			while(!(j-- == 0)) {
				str_star += "*"; 
			}//end of while----------------------------------
			System.out.println(str_star + i);
		}//end of while------------------------------
		
		
	}//end of main()------------------

}
