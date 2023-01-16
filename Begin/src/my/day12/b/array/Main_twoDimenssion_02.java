package my.day12.b.array;

public class Main_twoDimenssion_02 {

	public static void main(String[] args) {

		int[][] num_arr = new int[4][];	//4행 null 열
		// 열의 크기를 정해주지 않으면 NullpointerException 발생함
		
		num_arr[0] = new int[3];// 0행은 3열로 설정함.
		num_arr[1] = new int[2];// 1행은 2열로 설정함.
		num_arr[2] = new int[4];// 2행은 4열로 설정함.
		num_arr[3] = new int[3];// 3행은 3열로 설정함.
		
		num_arr[0][0] = 10;
		num_arr[0][1] = 20;
		num_arr[0][2] = 30;
		
		num_arr[1][0] = 40;
		num_arr[1][1] = 50;
//		num_arr[1][2] = 60;	//ArrayIndexOutOfBoundsException이 발생한다. 1행에는 2열뿐인데 3열의 값을 넣어주었기때문.
		
		num_arr[3][0] = 70;
		num_arr[3][1] = 80;
		
		for(int i=0;i<num_arr.length;i++) {	// 행
			
			for(int j=0;j<num_arr[i].length;j++) {
				String str = (j<num_arr[i].length-1)?",":"\n";
				System.out.printf("%2d%s",num_arr[i][j],str);
				
			}//end of for-------
			
		}//end of for-----
		/*
		 10,20,30
		 40,50
	 	  0, 0, 0, 0
		 70,80, 0
		 */
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	/*
		int[][] num_arr_2 = {{10,20,30},
                             {40,50},
                             {0,0,0,0},
                             {70,80,0}};
	*/	
		// 또는 new int[][] 아래와 같이 생략가능하다.
		
		int[][] num_arr_2 = {{10,20,30},
				{40,50},
				{0,0,0,0},
				{70,80,0}};
		
		
		for(int i=0;i<num_arr_2.length;i++) {	// 행
			
			for(int j=0;j<num_arr_2[i].length;j++) {
				String str = (j<num_arr_2[i].length-1)?",":"\n";
				System.out.printf("%2d%s",num_arr_2[i][j],str);
				
			}//end of for-------
			
		}//end of for-----
		/*
		 10,20,30
		 40,50
	 	  0, 0, 0, 0
		 70,80, 0
		 */
		
		
		
		
		
		
		
	}//end of main()----------------------------------

}
