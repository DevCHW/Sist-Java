package my.day11.b.array;

public class Main_space_del_01 {

	public static void main(String[] args) {

		//=== 문자열 중에 공백을 제거하기 === //
		String str1 = "안녕하세요?";
		String str2 = " 저의 이름은 이순신 입니다.   ";
		String str3 = "끝입니다.";
		
		System.out.println(str1+str2.trim()+str3);
		
		String result="";
		for(int i=0; i<str2.length();i++) {
			char ch= str2.charAt(i);
			if(ch != ' ') {
				result += ch;
			}
		}
		System.out.println(str1+result+str3);
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		char[] ch_arr = str2.toCharArray();
		/*
		        ----------------------------------------------------------------------------------- 
		ch_arr ==>   |' '|' '|'저'|'의'|' '|'이'|'름'|'은'|' '|'이'|'순'|'신'|' '|'입'|'니'|'다'|'.'|' '|' '| 
		        -----------------------------------------------------------------------------------
		*/
		int len = 0;
		for(char chr : ch_arr) {
			if(chr != ' ') {
				len++;
			}
		}//end of for-----
		
		char[] ch_arr_result = new char[len]; // new char[12]
		
		
		
		
		for(int i=0, j=0; i<ch_arr.length; i++, j++) { //ch_arr.length;은 19이다
			if(ch_arr[i] != ' ') {
			ch_arr_result[j] = ch_arr[i];	//ch_arr_result[0] =
			}
			else {
				j--;
			}
		}//end of for-----
		System.out.println(str1+String.valueOf(ch_arr_result)+str3);
	}//end of main()----------------

}
