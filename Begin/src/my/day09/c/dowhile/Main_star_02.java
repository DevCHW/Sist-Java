package my.day09.c.dowhile;

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
		
		System.out.println("~~~ 3. do~while 문 사용한 것 ~~~ \n");

		
		int i=1;
		
		do {
			// i => 1 2 3 4 5 6 7 8 9
			// j => 9 8 7 6 5 4 3 2 1
			
			String str_star ="";
			int j= 10-i;
			
			do {
				str_star += "*";
			} while (!(--j ==0)); 
			//end of do~while--------------------------------------------
			System.out.println(str_star + i);
		} while (!(++i==10)); 
		//end of do~while---------------------------------------
		
		
	}//end of main()------------------

}
