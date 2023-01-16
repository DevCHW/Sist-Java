package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class MyUtil {
	
	
	// ==== 현재시각을 리턴해주는 static 메소드에 대해서 알아봅니다. ==== //
	public static String currentTime() {
		
		// 현재시각
		Date now = new Date();
		System.out.println(now);
				
		SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdfrmt.format(now);
		
		System.out.println(">> 현재시각 : " + result);
		
		return result;
	}
	
//	-----------------------------------new method-----------------------------------------
	
	//비밀번호 조건
	
	public static boolean checkPwd(String pwd) {

		// 입력받은 String pwd의 글자수 알아오기
		// 입력받은 암호 길이 : "+pwd.length() ★암기 자주쓰임.
		//System.out.println("입력받은 암호 길이 : "+pwd.length());
		
		boolean upperFlag = false;	//대문자인지 기록하는 용도
		boolean lowerFlag = false;	//소문자인지 기록하는 용도
		boolean digitFlag = false;	//숫자인지 기록하는 용도
		boolean specialFlag = false;//특수기호인지 기록하는 용도
		
		int pwd_length = pwd.length();
		
		if(pwd_length <8 || pwd_length>15) { //비밀번호의 길이가 8미만 또는 15초과라면
			return false;
		}
		else { // 비밀번호의 글자수가 8글자 이상 15글자 이하인 경우
				// 암호가 어떤글자로 이루어졌는지 검사를 시도해야한다.
	
				//pwd ==>"qwEr1234$"
				//index ==> 012345678			
			for(int i=0; i<pwd_length; i++) { //입력받은 글자의 길이 만큼 검사를 해야한다.
				char ch = pwd.charAt(i);
				
				if(Character.isUpperCase(ch)) { // 대문자이라면
					upperFlag = true;
				}
				else if(Character.isLowerCase(ch)) { // 소문자이라면
					lowerFlag = true;
				}
				else if(Character.isDigit(ch)) {//숫자라면
					digitFlag = true;
				}
				else //특수기호라면
					specialFlag = true;
				
			}// end of for-------------------
			if(upperFlag && lowerFlag && digitFlag && specialFlag) {
				
				return true;
				
			}//end of if ------------------------
			else{
				return false;				
			}//end of else---------------------------
				
			
			
		}
		
	}//end of checkPwd Method(String pwd)-----------------------------------
	
	
	//인증키를 생성해주는 메소드
	//인증키는 3개의 숫자와 4개의 소문자로 구성된다.
	public static String authentication_key() {
		Random rnd = new Random();
		//	랜덤한 정수 = rnd.nextInt(마지막수 - 처음수 + 1) + 처음수
		
		String authentication_key_2 = "";
		
		for(int i=0; i<3; i++) {
			authentication_key_2 += rnd.nextInt(9-0+1)+0;
		}
		
		for(int i=0; i<4; i++) {
			authentication_key_2 += (char)(rnd.nextInt('z'-'a'+1)+'a');
		}
		
		return authentication_key_2;
	}//end of authentication_key()----------------------
	
	
	// === 콤마(,)가 들어있는 숫자로 되어진 문자열을 콤마(,)를 제거해서 정수로 리턴시켜주는 메소드 생성하기
	public static long delete_comma(String str) {
		
		String tmp="";

		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch != ',') {
				tmp +=ch;
			}
		}//end of for---
		try {
			long result = Long.parseLong(tmp);
			return result;	//Long.parseLong("1234567")
		}
		catch(NumberFormatException e){
			return 0;
		}

		
	}// public static long delete_comma(String str)------
	
	// === 숫자에 3자리 마다 콤마(,)를 추가해서 문자열로 리턴시켜주는 메소드 생성하기 === //
	public static String append_comma(long num) {
		//package my.day11.b.array; Main_comma_del_append_02 클래스파일 참조
		
		String tmp = String.valueOf(num);
		char[] origin_arr = tmp.toCharArray();
		int origin_length = origin_arr.length;	//7
		int comma_len = (origin_length%3==0)?origin_length/3-1:origin_length/3;
		
		char[] result_arr = new char[origin_length + comma_len];
		
		for(int i=origin_arr.length-1,j=result_arr.length-1, cnt=1;i>=0;i--,j--,cnt++) {
			if(cnt%4 != 0) {
			result_arr[j] = origin_arr[i];
			
			}
			else {
			result_arr[j] = ',';
			i++;
			}
		}
		
		
		return String.copyValueOf(result_arr);
	}//end of public static String append_comma(long num)--------------
	
	// === 문자열에서 특정 문자열(예: ",")을 제거한 문자열을 리턴시켜주는 메소드 생성하기 === //
	
	public static String delete_string(String source, String target) {
		//my.day13.a.string.Main_String에서 참조
		for(;;) {
			int target_index = source.indexOf(target);	//1
			if(target_index!=-1) {
				source = source.substring(0,target_index)+source.substring(target_index+target.length());
			}
			else {
				break;
			}
		}//end of for
		
		return source;
		
	}
	
	//주민번호로 사용가능한 것인지 사용불가능ㅇ한 것인지 검사해주는 메소드 생성하기 //
	public static boolean checkJubun(String jubun) {
		
		// 주민번호로 사용할 수 없는 경우
		// jubun ==> null, "", "96" , "961020s","9610208", "9a05102" , "96102012"
					 
		if(jubun == null)
			return false;
		
		char[] ch_arr = jubun.toCharArray();
		
		if(ch_arr.length != 7)
			return false;
		
		for(int i=0; i<7; i++) {
			if(!Character.isDigit(ch_arr[i]))
			   return false;	
		}//end of for---
		
		if(!('1' <= ch_arr[6] && ch_arr[6]<='4'))
			return false;
		
		// 월 ==>01 ~ 12
		int month = Integer.parseInt(jubun.substring(2,4));
		if(!(1<=month && month <=12)) {
			return false;
		}
		int day = Integer.parseInt(jubun.substring(4,6));
		if(!(1<=day && day <=31)){
			return false;
			// 2월은 31일이 없다.
		}
		if(month == 2&&30<= day && day <=31) {
			return false;
		}
			
			
		return true;	
		
	}//end of
	
	
	
}
