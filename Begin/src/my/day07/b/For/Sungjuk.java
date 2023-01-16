package my.day07.b.For;

import java.util.Scanner;

public class Sungjuk {
	//field
		String hakbun;	//필수 입력사항
		String name;	//필수 입력사항
		int kor;		//최소 0 ~ 최대 100
		int eng;		//최소 0 ~ 최대 100
		int math;		//최소 0 ~ 최대 100
		char grade;
	
		
	void registerInfo(Scanner sc) {
		
		for(;;) {
			System.out.print("1. 학번 : ");
			String hakbun = sc.nextLine();
			
						
//			System.out.println("hakbun => "+hakbun.trim().isEmpty());// hakbun.trim() 은 hakbun 에 입력된 문자열 중 좌,우에 공백이 있으면 공백을 모두 제거되어진 문자열을 나타내는 것이다.
				
				if(hakbun.trim().isEmpty())	{//hakbun.trim().isEmpty()값이 true이면 학번입력시 그냥 엔터했거나 공백인 경우이다.
					System.out.println("[경고] 학번을 올바르게 입력하세요!!\n");
				}
				else { //학번을 입력한 경우
					if(checkHakbun(hakbun)) {   //입력한 학번이 6글자로 되어진 숫자인지 아니지를 알아오자.			
						this.hakbun = hakbun;
						break;
					}
					else { //
						System.out.println("[경고] 학번은 6자리 숫자여야 합니다.\n");
					}
				}
			}
			
		for(;;) {
			System.out.print("2. 성명 : ");
			String name = sc.nextLine();
	
				if(name.trim().isEmpty())
					System.out.println("[경고] 성명을 올바르게 입력하세요!!\\n");
				else {
					this.name = name;
					break;
				}
			}
		
		int kor_fail_cnt = 0; //국어점수 입력시 틀린 횟수 용도
		
		
		for(;;) {
			if(kor_fail_cnt <3) {
			try {
			
			System.out.print("3. 국어점수 :");		
			int kor = Integer.parseInt(sc.nextLine().trim());
			
			if(0 <= kor && kor <= 100) {
			this.kor = kor;
			break;
			}
			else {
				System.out.println("[경고] 점수는 0 이상 100 이하 이어야 합니다!!\n");
				System.out.println(">>>"+ ++kor_fail_cnt +"번 틀림");
			}
		} catch(NumberFormatException e){
			System.out.println("[경고] 점수는 정수로만 입력하세요!!\n");
			System.out.println(">>>"+ ++kor_fail_cnt +"번 틀림");
			}
			}
			else {// 국어점수 입력시 틀린 횟수가 3 이상이라면
				System.out.println(">> 국어점수 입력이 3회 이상 틀렸으므로 프로그램을 종료합니다. <<");
				System.exit(0);// 프로그램 종료
			}
		}
		
		
		for(;;) {
		try {
			System.out.print("4. 영어점수 :");
			int eng = Integer.parseInt(sc.nextLine());
			
			if(0 <= eng && eng <= 100) {
				this.eng = eng;
				break;
			}
			else {
					System.out.println("[경고] 점수는 0 이상 100 이하 이어야 합니다!!\n");
				}
			}
		catch(NumberFormatException e) {
			System.out.println("[경고] 점수는 정수로만 입력하세요!!\n");
			}
		}
		for(;;) {
			try {
				System.out.print("4. 수학점수 :");
				int math = Integer.parseInt(sc.nextLine());
				
				if(0 <= math && math <= 100) {
					this.math = math;
					break;
				}
				else {
						System.out.println("[경고] 점수는 0 이상 100 이하 이어야 합니다!!\n");
					}
				}
			catch(NumberFormatException e) {
				System.out.println("[경고] 점수는 정수로만 입력하세요!!\n");
				}
			}
	
	}
	
	
	
	
	//학번이 6글자로 이루어진 숫자인지 아닌지를 검사해주는 메소드
	boolean checkHakbun(String hakbun) {
		int hakbun_length = hakbun.length();
		
		if(hakbun_length != 6) {// 학번의 길이가 6이 아니라면
			return false;
		}
		else { //학번의 길이가 6이라면 검사하자!
			
			boolean result = true;
			
			// "091234"  "09T234"
			for(int i=0 ; i<hakbun_length; i++) {
			char ch = hakbun.charAt(i);
			
			if(Character.isDigit(ch)) {//입력한 학번이 숫자라면
				
			}
			else {
				result = false;
				break;
			}//end of else in for----------
		}

			
		return result;
	}//end of else-----------	
		
		
		
		
}// end of boolean checkHakbun(String Hakbun)--------------------------
	
	
	
	//성적입력 결과 출력 메소드
	
	void showInfo() {
		int total = kor+eng+math;
		float avg = Math.round((float)total/3.0);	//소수 첫째자리에서 반올림
		if(avg>=90)
			grade = 'A';
		else if(avg>=80)
			grade = 'B';
		else if(avg>=70)
			grade = 'C';
		else if(avg>=60)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("=== 이순신님 성적입력 결과 ===\n"
						 + "1.학번 : "+hakbun+"\n"
						 + "2.성명 : "+name+"\n"
						 + "3.국어 : "+kor+"\n"
						 + "4.영어 : "+eng+"\n"
						 + "5.수학 : "+math+"\n"
						 + "6.총점 : "+total+"\n"
						 + "7.평균 : "+avg+"\n"
						 + "8.학점 : "+grade+"\n");
	}

	
	

}
