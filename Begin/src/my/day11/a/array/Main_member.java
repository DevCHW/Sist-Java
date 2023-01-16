package my.day11.a.array;

import java.util.Scanner;

public class Main_member {
	
/*
	===============>> 메뉴 << ===============
	1.회원가입	      2.모든회원조회	  3.프로그램종료
	========================================
	▷ 메뉴번호 선택 =>
*/

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Member[] mbr_arr = new Member[3];
		
		Member loginUser = null;
		
		String menu_no ="";
		outer:
		do {
			if(loginUser == null)
				Member.start_menu();
			else {
				loginUser.logon_menu();
			}
			menu_no = sc.nextLine();
			if(loginUser == null) { //로그인 하기 전의 실행문
				switch (menu_no) {
				case "1":	//회원가입을 선택했을 때
					Member.register(mbr_arr, sc);
					break;
				
				case "2":	// 로그인 or 로그아웃
					
					if(mbr_arr[0] != null) {//회원가입을 하고나서 로그인을 누른 경우
						System.out.print("▷ 아이디 : ");
						String input_id = sc.nextLine();
						
						System.out.print("▷ 비밀번호 : ");
						String input_passwd = sc.nextLine();
						
						for(int i=0; i<Member.count; i++) {
							if(mbr_arr[i].id.equals(input_id) &&
							   mbr_arr[i].passwd.equals(input_passwd)){ //배열의 아이디와 그 아이디의 패스워드가 같다면	
							   loginUser = mbr_arr[i];
							   break; //for문 탈출
							}
						}// end of for-----------------
						
						if(loginUser!= null) { //loginUser가 null이아니라 존재한다면
							System.out.println(">> 로그인 성공!! <<\n");
						}
						else {
							System.out.println(">> 로그인 실패!! <<\n");
						}
					}
					else {// 회원가입을 하지 않고 로그인을 누른 경우
						System.out.println(">> 가입된 회원이 없습니다. 회원가입을 먼저 해주세요. <<\n");
					}
					
					break;	//switch 문 빠져나가기.
				case "3":	//모든회원정보를 선택했을 때
					Member.show_all_memberinfo(mbr_arr);
					break;
				case "4":	//프로그램 종료를 선택했을 때
					break outer;
				default:	//메뉴에 없는 번호를 골랐을 경우(예: 강아지 또는 7 입력)
					System.out.println("[경고] 메뉴에 있는 번호만 선택하세요!!\n");
					break;
				}//end of switch-----------------
			}//end of if---로그인 하기 전
			
//			---------------------------------------------------------------------
			
			else { //로그인 후의 실행문
				
				switch (menu_no) {
				case "1":	//회원가입을 선택했을 때
					Member.register(mbr_arr, sc);
					break;
				
				case "2":	// 로그인 or 로그아웃
					System.out.println(">> 로그아웃됨 <<\n");
					loginUser = null;
						
					break;	//switch 문 빠져나가기.
				case "3":	//모든회원정보를 선택했을 때
					Member.show_all_memberinfo(mbr_arr);
					break;
					
				case "4":	//나의정보조회를 선택했을 때
					System.out.println(loginUser.showInfo());
					break;
				case "5":	//프로그램 종료를 선택했을 때
					
					break outer;
				default:	//메뉴에 없는 번호를 골랐을 경우(예: 강아지 또는 7 입력)
					System.out.println("[경고] 메뉴에 있는 번호만 선택하세요!!\n");
					break;
				}//end of switch-----------------
			}//end of else---
		}while(true);
		
		sc.close();
		System.out.println(">>> 프로그램 종료 <<<");
	}//end of main()-----------------------------------

}
