package my.day10.b.array;

public class Main_array_01 {

	// 메소드 파라미터 가변인수 사용하기
	int habgae(int ... point) {
		int sum = 0;
		for(int i=0; i<point.length; i++) {
			sum += point[i];
		}// end of for--------------
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		/*
		   === 배열(array)이란? ===
		   동일한 데이터타입을 가지는 여러개의 데이터를 저장할 수 있는 데이터 타입을 말한다.
		   그리고 배열 또한 객체라는 것을 꼭 기억하도록 하자!!!!
		*/
		
		// 1. == 배열의 선언 ==
		   int[] subject_arr;
		// 또는
		// int subject_arr[];
		   
		// 2. == 선언되어진 배열을 메모리에 할당을 해준다. ==
		   subject_arr = new int[7];
		
		/*
		     -----------------------------
		     | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
		     -----------------------------
		     
		     위의 숫자는 배열의 인덱스(index)를 가리키는 번호로써 0 부터 시작하여 1씩 증가한다.
		     배열의 인덱스(index)를 "배열의 방번호" 라고 흔히 부른다. 
		     
		     배열에 저장된 데이터를 표현할때는 아래와 같이 배열명[인덱스번호]로 나타낸다.
		     subject_arr[0] 
		     subject_arr[1] 
		     subject_arr[2] 
		     subject_arr[3] 
		     subject_arr[4] 
		     subject_arr[5] 
		     subject_arr[6] 
		     
		     subject_arr[7] ==> 존재하지 않으므로 오류!!
		     
		     배열로 선언된 변수에는 자동적으로 초기값이 들어간다.
		     정수는 0, 실수는 0.0, char는 ' ', String 을 포함한 클래스 객체는 null 이 들어간다.  
		 */
		   
		   System.out.println("배열 subject_arr 의 길이 => " + subject_arr.length);
		   // 배열의 길이(크기)는 배열명.length 이다.
		   // 배열 subject_arr 의 길이 => 7 
		   
		   for(int i=0; i<subject_arr.length; i++) {
			   System.out.println("subject_arr["+i+"] => " +  subject_arr[i]);
		   }
		   
		   
		   // 3. == 배열에 데이터값을 넣어주기 ==
		   
		   subject_arr[0] = 100; // 국어
		   subject_arr[1] = 90;  // 영어
		   subject_arr[2] = 95;  // 수학
		   subject_arr[3] = 70;  // 과학
		   subject_arr[4] = 98;  // 사회
		   subject_arr[5] = 100; // 음악
		   subject_arr[6] = 90;  // 체육
		   /*
		      subject_arr
		      -----------------------------
		      | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
		      -----------------------------
		       100  90  95  70  98  100 90
		       국어 영어 수학 과학 사회 음악 체육
           */
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   for(int i=0; i<subject_arr.length; i++) {
			   System.out.println("subject_arr["+i+"] => " +  subject_arr[i]);
		   }
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   int sum = 0;
		   for(int i=0; i<subject_arr.length; i++) {
			   sum += subject_arr[i];
		   }
		   
		   System.out.println("총점 : " + sum);
		   // 총점 : 643
		   
		   double avg = Math.round( (double)sum/subject_arr.length*10 )/10.0;
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 91.9
		   
		   System.out.println("\n=================================\n");
		   
		   /*
		       위의 1. == 배열의 선언 == 과
		           2. == 선언되어진 배열을 메모리에 할당을 해준다. == 을 
		       각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.    
		   */
		   int[] subject_arr_2 = new int[7];
		   
		   // 3. == 배열에 데이터값을 넣어주기 ==
		   subject_arr_2[0] = 100; // 국어
		   subject_arr_2[1] = 90;  // 영어
		   subject_arr_2[2] = 95;  // 수학
		   subject_arr_2[3] = 70;  // 과학
		   subject_arr_2[4] = 98;  // 사회
		   subject_arr_2[5] = 100; // 음악
		   subject_arr_2[6] = 90;  // 체육
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   for(int i=0; i<subject_arr_2.length; i++) {
			   System.out.println("subject_arr_2["+i+"] => " +  subject_arr_2[i]);
		   }
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   sum = 0;
		   for(int i=0; i<subject_arr_2.length; i++) {
			   sum += subject_arr_2[i];
		   }
		   
		   System.out.println("총점 : " + sum);
		   // 총점 : 643
		   
		   avg = Math.round( (double)sum/subject_arr_2.length*10 )/10.0;
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 91.9
		   
		   
		   System.out.println("\n=================================\n");
		   
		   /*
		       위의 1. == 배열의 선언 == 과
		           2. == 선언되어진 배열을 메모리에 할당을 해준다. == 과
		           3. == 배열에 데이터값을 넣어주기 == 
		       각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.    
		   */
		   int[] subject_arr_3 = new int[] {100,90,95,70,98,100,90};
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   for(int i=0; i<subject_arr_3.length; i++) {
			   System.out.println("subject_arr_3["+i+"] => " +  subject_arr_3[i]);
		   }
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   sum = 0;
		   for(int i=0; i<subject_arr_3.length; i++) {
			   sum += subject_arr_3[i];
		   }
		   
		   System.out.println("총점 : " + sum);
		   // 총점 : 643
		   
		   avg = Math.round( (double)sum/subject_arr_3.length*10 )/10.0;
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 91.9
		   
		   
		   System.out.println("\n=================================\n");
		   
		   /*
		       위의 1. == 배열의 선언 == 과
		           2. == 선언되어진 배열을 메모리에 할당을 해준다. == 과
		           3. == 배열에 데이터값을 넣어주기 == 
		       각각 따로 하지 않고 아래와 같이 동시에 할 수 있다. 
		       new int[] 은 생략 가능하다.!!   
		   */
		   int[] subject_arr_4 = {100,90,95,70,98,100,90};
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   for(int i=0; i<subject_arr_4.length; i++) {
			   System.out.println("subject_arr_4["+i+"] => " +  subject_arr_4[i]);
		   }
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   sum = 0;
		   for(int i=0; i<subject_arr_4.length; i++) {
			   sum += subject_arr_4[i];
		   }
		   
		   System.out.println("총점 : " + sum);
		   // 총점 : 643
		   
		   avg = Math.round( (double)sum/subject_arr_4.length*10 )/10.0;
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 91.9
		   
		   System.out.println("\n=================================\n");
		   
		   
		   
		   int[] subject_arr_5 = {100,90,95,70,98,100,90};
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   // >>> 확장된 for문(== 개선된 for문, == for each문) <<< //
		   for(int jumsu : subject_arr_5) { // subject_arr_5 배열의 길이 7 만큼 반복한다.
			   System.out.println(jumsu);
		   }
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   sum = 0;
		   for(int jumsu : subject_arr_5) {
			   sum += jumsu;
		   }
		   
		   System.out.println("총점 : " + sum);
		   // 총점 : 643
		   
		   avg = Math.round( (double)sum/subject_arr_5.length*10 )/10.0;
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 91.9
		   
		   System.out.println("\n######################################\n");
		   
		   System.out.println("\n===== 메소드 파라미터 가변인수 사용하기 =====\n");
		   
		   Main_array_01 ma = new Main_array_01();
		   
		   System.out.println("총점(100,90,95,70,98,100,90) : " + ma.habgae(100,90,95,70,98,100,90) );
		   // 총점(100,90,95,70,98,100,90) : 643
		   
		   System.out.println("총점(90,95,70,98,90) : " + ma.habgae(90,95,70,98,90) );
		   // 총점(90,95,70,98,90) : 443
		   
	}// end of main()----------------------------------
	
	
}