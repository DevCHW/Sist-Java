package my.day08.a.For;

public class Main_quiz_1 {

	public static void main(String[] args) {
	String word = "Abz3Sa0#$T";
	int wordLength;
	wordLength = word.length();  
	
	
	int upperCnt= 0;
	int lowerCnt= 0;
	int digitCnt= 0;
	int specialCnt= 0;
	
	for(int i = 0; i<wordLength; i++) {
		char ch = word.charAt(i);
	
		if(Character.isUpperCase(ch)) {
			upperCnt++;
		}
		else if (Character.isLowerCase(ch)){
			lowerCnt++;
		}
		else if(Character.isDigit(ch)) {
			digitCnt++;
		}
		else {
			specialCnt++;
		}
	}

	
	System.out.println(word + "\n"
					 + "전체길이 : " + wordLength + "\n"
					 + "대문자 개수 : " + upperCnt + "\n"
					 + "소문자 개수 : " + lowerCnt + "\n"
					 + "숫자 개수 : "	+ digitCnt + "\n"
					 + "특수문자 개수 : "+ specialCnt +"\n");
	
	}
	
		
	/*
	  Abz3Sa0#$T
	  전체길이 : 10
	  대문자 개수 : 3
	  소문자 개수 : 3
	  숫자 개수 : 2
	  특수문자 개수 : 2
	  
	 */
		
}


