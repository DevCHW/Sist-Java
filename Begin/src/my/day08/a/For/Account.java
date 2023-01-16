package my.day08.a.For;

import java.util.Scanner;

public class Account {
	//field
	String account_number;	//통장계좌번호
	String name;			//예금주
	String str = "";
	
	//method
	void register_account(Scanner sc) {
		
		for(;;) {
		
			//**********************************통장번호 입력 시작**************************************************//
			System.out.print("1. 통장번호 입력(-를 뺀 숫자 10자리만 입력하세요) => ");
			String account_number = sc.nextLine();
			
			
			
			int account_number_length = account_number.length();
			
			for(int i = 0;i < account_number_length ; i++) {
				char ch = account_number.charAt(i);
				
				if(ch != '-') {
					str += ch;
				}
			}//end of for-------------------------------------------------
			
			if(str.length() != 10) {
				System.out.println("\n[경고] 통장번호 형식에 맞지 않습니다. ");
			}
			else {
				boolean isUseAccount = true;
				
				for(int i = 0; i<10; i++ ) {
					char ch = str.charAt(i);
					
					if(!Character.isDigit(ch)) { // 숫자가 아니라면
						isUseAccount = false;
						break;
					}	
				}// end of for-----------------------------------------------
				if(!isUseAccount) {
					System.out.println("\n[경고] 통장번호 형식에 맞지 않습니다.\n");
				}
				else {
				    this.account_number = str;
					System.out.println("\n >> 통장번호 개설완료함");
					break;
				}
			}
		//**********************************통장번호 입력 시작**************************************************//
		
		}//end of for(;;)------------------------------------------------
		
		for(;;) {
			System.out.print("2. 예금주 입력 => ");
			String name = sc.nextLine();
			if(name.length()>4) {
				System.out.println("[경고] 이름 형식에 맞지 않습니다.");
			}
			
		}
		
		
	}//end of void register_account(Scanner sc)-----------------------
	
	
	void showInfo() {
		
		System.out.println("\n1.통장계좌번호 : " + account_number + "\n"
						 + "2.예금주 : " + name);

	}//end of void showInfo()---------------------------
	
	
}
