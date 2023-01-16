package my.day11.a.array;

import java.util.Scanner;

import my.util.MyUtil;

public class Member {

	// field
	String id;
	String passwd;
	String name;
	
	static int count; //Member 클래스 객체(인스턴스)를 생성한 개수를 알려주고자 하는 용도 
	
	
	// method
	// 로그인 하기 전 메뉴를 보여주는 메소드 생성하기
	static void start_menu() {
		System.out.println("==================== >> 메뉴 << =================\n"
				 		 + "1.회원가입	    2.로그인    3.모든회원조회     4.프로그램종료\n" //로그인을 하지 않았을 때는 4번
				 		 + "================================================");
		System.out.print("▷ 메뉴번호 선택 =>");
		
	}//end of start_menu()--------------------------
	
	
	// 로그인후 메뉴를 보여주는 메소드 생성하기
	void logon_menu() {
		System.out.println("========= >> 메뉴("+name+"님 로그인중) << =============\n"
				 		 + "1.회원가입	    2.로그아웃    3.모든회원조회     4.나의정보조회\n"
				 		 + "5.프로그램종료\n"
				 		 + "===============================================");
		System.out.print("▷ 메뉴번호 선택 =>");
		
	}//end of logon_menu()--------------------------
	
	

	
	//회원가입을 해주는 메소드 생성
	static void register(Member[] mbr_arr, Scanner sc) {
		
		
		if(count < mbr_arr.length) {	//가입된 회원수가 정원보다 적은 경우
			
			Member mbr = new Member();
			
			String input_id="";
			do {
				System.out.print("▶아이디 : ");	//중복이 되면 안됨.
				
				input_id = sc.nextLine();
				
				if(input_id.trim().isEmpty()) {
					System.out.println("[경고] 아이디에는 공백을 입력할 수 없습니다.");
					continue;
				}
				
				boolean isIdExists=false;
				for(int i=0;i<count;i++) {
					if(mbr_arr[i].id.equals(input_id)) {	//입력하고자 하는 아이디가 이미 사용중이라면
						System.out.println("[경고] 이미 사용중인 아이디입니다.\n");
						isIdExists = true;
						break;	//검사하다가 하나라도 겹치면 if를 빠져나온다.
					}//end of if---
				}// end of for---
				if(!isIdExists) break;
				
			}while(true);
			
			
			String input_passwd="";
			do {
				System.out.print("▶비밀번호 : "); // 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합이 되어져야만 사용 가능하다.
				input_passwd = sc.nextLine();
				
				if(MyUtil.checkPwd(input_passwd)) {
					break;	//do while 문을 빠져나간다.
				}
				
				else {
					System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합이 되어져야만 사용 가능하다.");
				}
				
			}while(true);
			
			String input_name="";
			do {
				System.out.print("▶성명 : ");
				input_name = sc.nextLine();
				
				if(input_name.trim().isEmpty()) {	//성명에 공백을 입력한경우,아무것도 입력하지 않은경우
					System.out.println("[경고] 성명은 반드시 공백만이 아닌 글자로 입력하셔야 합니다.\n");
				}
				else {	//성명을 제대로 입력한경우
					break;	//do~while을 빠져나온다.
				}
			}while(true);
			
			
			mbr.id = input_id;
			mbr.passwd = input_passwd;
			mbr.name = input_name;
			
			mbr_arr[count++] = mbr;
			System.out.println("\n회원가입이 완료되었습니다.\n");
		}//end of if---가입된 회원수가 정원보다 적은 경우
		else {	//가입된 회원수가 정원(배열의 길이)과 같거나 큰 경우
			System.out.println("[경고] 정원마감이라서 더 이상 회원가입이 불가합니다.\n");
		}
		
		
	}//end of static void register--------
	
	
	//모든 회원의 정보를 보여주는 메소드 생성하기
	static void show_all_memberinfo(Member[] mbr_arr) {
		
		if(count > 0) { // 가입된 회원이 최소한 1명 이상인 경우
			System.out.println("\n------------------------------------\n"
							  + "아이디           비밀번호              성명\n"
							  + "--------------------------------------");
			String result="";
			for(int i=0;i<count;i++) {
				result += mbr_arr[i].id+"\t"+mbr_arr[i].passwd+"\t"+mbr_arr[i].name+"\n";
			}//end of for
			System.out.println(result);
		}
		else { //가입된 회원이 없는 경우
			System.out.println(">> 가입된 회원이 아무도 없습니다. <<\n");
		}
		
	}// void show_all_memberinfo(Member[] mbr_arr)------------
	
	
	
	String showInfo() {
		return  "---"+name+"님의 정보-----\n"
			  + "1.아이디   : " + id +"\n"
			  + "2.비밀번호  : " + passwd +"\n"
			  + "3.성명    : " + name  +"\n";
	
	}
}//end of class
