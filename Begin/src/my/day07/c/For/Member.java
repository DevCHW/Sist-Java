package my.day07.c.For;

import java.util.Scanner;

import my.util.MyUtil;

public class Member {

	//field	
	String id;			//필수입력사항
	String pwd;			//필수입력사항, 암호는 대문자,소문자,숫자,특수기호가 혼합된 8글자 이상 15글자 이하이어야만 된다.	
	String name;		//필수입력사항
	String email;		//필수입력사항
	
	//method
	//회원가입을 해주는 메소드 생성하기
	void registerMember(Scanner sc) {
		for(;;) {
			System.out.print("1.아이디 :");
			String id = sc.nextLine();
			
			if(id.trim().isEmpty()) {
				System.out.println("[경고] 아이디를 올바르게 입력하세요!!\n");
			}
			else {
				this.id = id;
				break;
			}
		}//end of for-----------------------------
		
		for(;;) { //암호는 대문자,소문자,숫자,특수기호가 혼합된 8글자 이상 15글자 이하이어야만 된다.
			System.out.print("2.비밀번호 :");
			String pwd = sc.nextLine();
			
			if(pwd.trim().isEmpty()) {
				System.out.println("[경고] 패스워드를 올바르게 입력하세요!!\n");
			}
			else {
				if( MyUtil.checkPwd(pwd) ) { //예>qwEr1234$				
					this.pwd = pwd;
					break;
				}
				else { //예> qwer1234$ qWer1234 qwer!@#$! )
					System.out.println("암호는 대문자,소문자,숫자,특수기호가 혼합된 8글자 이상 15글자 이하이어야만 됩니다.");
				}
			}
		}//end of for-----------------------------
		
		for(;;) {
			System.out.print("3.성명 :");
			String name = sc.nextLine();
			
			if(name.trim().isEmpty()) {
				System.out.println("[경고] 성명를 올바르게 입력하세요!!\n");
			}
			else {
				this.name = name;
				break;
			}
		}//end of for-----------------------------
		
		for(;;) {
			System.out.print("4.이메일 :");
			String email = sc.nextLine();
			
			if(email.trim().isEmpty()) {
				System.out.println("[경고] 이메일을 올바르게 입력하세요!!\n");
			}
			else {
				this.email = email;
				break;
			}
		}//end of for-----------------------------
		
		
		
		
		
		
	}//end of registerMember Method(Scanner sc)
		
}



