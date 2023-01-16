package my.day08.a.For;

public class Main_sum_1 {

	public static void main(String[] args) {
		
		
		String str = "";
		int sum = 0;
		
		for(int i=1;i<11;i++) {
			if(i==10) {
				str += i;
			}
			else {
			str += i + "+";
			}
			sum += i;
		}
		
		

		
		// str ==>1+2+3+4+5+6+7+8+9+10
		// sum ==>1 부터 10 까지 누적의 합 ==> 55
		
		System.out.println(str+"="+sum);
		
		
		/*
		  1+2+3+4+5+6+7+8+9+10=55
		 */
	}//end of main()--------------------------------------------------------

}
