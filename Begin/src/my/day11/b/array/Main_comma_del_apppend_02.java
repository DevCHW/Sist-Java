package my.day11.b.array;

import java.text.DecimalFormat;

import my.util.MyUtil;

public class Main_comma_del_apppend_02 {

	public static void main(String[] args) {
//		-----------------------------------------------------------------문제
		String money1 = "1,234,567";
		String money2 = "50,000";
		
		String tmp ="";
		for(int i=0;i<money1.length();i++) {
			char ch = money1.charAt(i);
			if(ch !=',') {
			tmp += ch;
			}
		} // end of for-----
		
		int sum = Integer.parseInt(tmp); //1234567
		
		tmp ="";
		for(int i=0;i<money2.length();i++) {
			char ch = money2.charAt(i);
			if(ch !=',') {
			tmp += ch;
			}
		}
		
		sum += Integer.parseInt(tmp);
		
		
		System.out.println(money1 + " + " +money2+ " = " +sum);
		// 1,234,567 + 50,000 = 1,254,567 이 나오도록 하여라.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println(money1 + " + " +money2+ " = " +(MyUtil.delete_comma(money1))+MyUtil.delete_comma(money2));
		
		
		
		System.out.println(MyUtil.delete_comma("하하하,호호호"));

		
//		----------------------------------------------------------------------------------풀이 끝
		

		
//		------------------------------------------------------------------------------------문제
		
		int money3 = 1500000;
		int money4 = 4000;
		
		tmp = String.valueOf(money3+money4);	// "1504000"
		
		System.out.println(tmp);
		
		/*
		 	"1504000" 글자수 7자리
		 
		 	"1,504,000"
		 	
		 	글자수 1자리 ==> 콤마가 0개 글자수가 3의배수가 아니라면	1자리/3			 =0
		 	글자수 2자리 ==> 콤마가 0개 글자수가 3의배수가 아니라면   2자리/3			 =0
		 	글자수 3자리 ==> 콤마가 0개 글자수가 3의배수가 	 이라면   3자리/3 - 1 = 1-1 = 0
		 	
		 	글자수 4자리 ==> 콤마가 1개 글자수가 3의배수가 아니라면   4자리/3			 =1
		 	글자수 5자리 ==> 콤마가 1개 글자수가 3의배수가 아니라면   5자리/3			 =1
		 	글자수 6자리 ==> 콤마가 1개 글자수가 3의배수가 	 이라면   6자리/3 - 1 = 3-1 =1
		 	
		 	글자수 7자리 ==> 콤마가 2개 글자수가 3의배수가 아니라면   7자리/3			 =2
		 	글자수 8자리 ==> 콤마가 2개 글자수가 3의배수가 아니라면   8자리/3			 =2
		 	글자수 9자리 ==> 콤마가 2개 글자수가 3의배수가 	 이라면   9자리/3 - 1 = 3-1 =2
		 	
		 	뒤에서 부터 순서가 4번재 ==> 콤마찍음
		 	뒤에서 부터 순서가 8번째 ==> 콤마찍음
		 */
		
		char[] origin_arr = tmp.toCharArray();
		/*
		 	"1504000"
		 	
		 	-----------------------------------
		 	|'1'||'5'||'0'||'4'||'0'||'0'||'0'|
		 	-----------------------------------
		index 0    1    2    3    4    5    6
		 */
		int origin_length = origin_arr.length;	//7
		int comma_len = (origin_length%3==0)?origin_length/3-1:origin_length/3;
		
		char[] result_arr = new char[origin_length + comma_len];
		/*
		 	---------------------------------------------
		 	|' '||' '||' '||' '||' '||' '||' '||' '||' '|
		 	---------------------------------------------
		index 0    1    2    3    4    5    6    7    8 	
		 */
		for(int i=origin_arr.length-1,j=result_arr.length-1, cnt=1;i>=0;i--,j--,cnt++) {
			if(cnt%4 != 0) {
			result_arr[j] = origin_arr[i];
			
			}
			else {
			result_arr[j] = ',';
			i++;
			}
		}
		/*
	 	---------------------------------------------
	 	|'1'||','||'5'||'0'||'4'||','||'0'||'0'||'0'|
	 	---------------------------------------------
	index 0    1    2    3    4    5    6    7    8 	
	 */
		
		System.out.println(String.valueOf(result_arr));
		
//		System.out.println("money3 + money4 = " +tmp);
		//500000 + 4000 = 1,504,000
		
		
//		--------------------------------------------------------------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		System.out.println(MyUtil.append_comma(25000000));
		System.out.println(MyUtil.append_comma(750000));
		
		
		System.out.println(MyUtil.append_comma(MyUtil.delete_comma("3000000")+MyUtil.delete_comma("800000")));
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println(MyUtil.append_comma(MyUtil.delete_comma("3000000")+MyUtil.delete_comma("800000")));

		DecimalFormat df = new DecimalFormat("#,###");	// 3자리 마다 콤마를 찍어주는 것이다.
		System.out.println(df.format(3800000));
		System.out.println(df.format(MyUtil.delete_comma("3000000")+MyUtil.delete_comma("800000")));
		
	}//end of main()---------------------------------

}
