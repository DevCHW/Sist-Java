package my.day12.b.array;

public class Main_Main_twoDimension_01 {

	public static void main(String[] args) {

		// === 1차원 배열 ===
		int[] subject_arr = new int[5]; //1행 5열
		
		/*
		 	-------------------------
		 	| 0 || 1 || 2 || 3 || 4 |
		 	-------------------------
		 */
//		index =>  0    1    2    3    4
		// === 2차원 배열 ===
		int[][] point_arr = new int[4][3];
		
		/*
		 
	값	 	---------------
		 	| 0 || 0 || 0 |
		 	---------------
		 	---------------
		 	| 0 || 0 || 0 |
		 	---------------
		 	---------------
		 	| 0 || 0 || 0 |
		 	---------------
		 	---------------
		 	| 0 || 0 || 0 |
		 	---------------
		 	
	index=>	------------------------------
		 	| [0][0] || [0][1] || [0][2] |
		 	------------------------------
	        ------------------------------
		 	| [1][0] || [1][1] || [1][2] |
		 	------------------------------
	        ------------------------------
		 	| [2][0] || [2][1] || [2][2] |
		 	------------------------------
            ------------------------------
		 	| [3][0] || [3][1] || [3][2] |
		 	------------------------------
		 */
		point_arr[0][0] = 10;
		point_arr[0][1] = 20;
		point_arr[0][2] = 30;
		
		
		point_arr[1][0] = 40;
//		point_arr[1][1] = 50;
		point_arr[1][2] = 60;
		
//		
//		point_arr[2][0] = 70;
//		point_arr[2][1] = 80;
//		point_arr[2][2] = 90;
//		
		point_arr[3][0] = 100;
		point_arr[3][1] = 110;
		point_arr[3][2] = 120;
		
		System.out.println("point_arr.length => "+point_arr.length);
		//point_arr.length =>4
		//이차원배열명.length 은 행의 길이가 나온다.
		System.out.println("point_arr[0].length => "+point_arr[0].length);
		//point_arr[0].length =>3
		//이차원배열명[행의인덱스].length 은 그 행에 존재하는 열의 크기(길이)가 나온다.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=0; i<point_arr.length; i++) {	//행
		
			for(int j=0; j<point_arr[i].length; j++) {	//열
				String str = (j<point_arr[j].length-1)?",":"\n";
				System.out.printf("%3d%s",point_arr[i][j],str);
			}
		}
		System.out.println("\n===========성적결과==============\n");
	
		String[] name_arr = {"이순신","엄정화","서강준","이혜리"};
		String[] subject_name_arr = {"국어","영어","수학"};
		int[][] jumsu_arr = {{90,80,70},	//이순신
				             {80,85,76},	//엄정화
				             {85,70,90},	//서강준
				             {65,80,50}		//이혜리
							};
		// 1. 각 학생별로 총점을 나타내어 보자.
		
		System.out.println("\n====== 학생별 성적 집계 결과 =======--------\n"
				         + "----------------------------------------\n"
				         + "학생명   국어   영어   수학   총점     평균   학점\n"
				         + "----------------------------------------\n"
				         + "");
		/*
		 	이순신	90 80 70  240  80.0
		 	엄정화    80 85 76  241  80.3
		 	서강준    85 70 90  245  81.7
		 	이혜리    65 80 50  190  63.3
		 */
		String result ="";
		
		for(int i=0; i<jumsu_arr.length;i++) {
			String str_jumsu ="";
			int sum = 0;
			for(int j=0; j<jumsu_arr[i].length;j++) {
				str_jumsu +="    " + jumsu_arr[i][j];
				sum += jumsu_arr[i][j];
			}
			
			double avg = Math.ceil(sum/3.0*10)/10.0;
			String hakjum="";
			switch ((int)avg/10) {
			case 10:
			case 9:
				hakjum="A";
				break;
			case 8:
				hakjum="B";
				break;
			case 7:
				hakjum="C";
				break;
			case 6:
				hakjum="D";
				break;

			default:
				hakjum="E";
				break;
			}
		
			result += name_arr[i] + str_jumsu + "   " +  sum + "   " + avg + "   "+hakjum+"\n";
		}//end of for---
	
		System.out.println(result);
		/*
		  ----------------------------------------
		  학생명   국어   영어   수학   총점     평균   학점
		  ----------------------------------------
		
		  이순신    90    80    70   240   80.0   B
		  엄정화    80    85    76   241   80.4   B
		  서강준    85    70    90   245   81.7   B
		  이혜리    65    80    50   195   65.0   D
		 */
		System.out.println("\n======과목별 평균 =======\n"
				         + "------------------------\n");
		
		result ="";
		for(String subject : subject_name_arr) {
			result += subject + "        ";
			
		}//end of for-----
		
		System.out.println(result+"\n------------------------");
		
		for(int i=0; i<jumsu_arr[0].length; i++) {
			int subject_sum = 0;
			for(int j=0; j<jumsu_arr.length;j++) {
				subject_sum += jumsu_arr[j][i];
			}
			
			result += Math.round((double)subject_sum/jumsu_arr.length*10)/10.0+ "        ";
			
		}// end of for---------------
		
		
		System.out.println(result);
	}//end of main()-----------

}
