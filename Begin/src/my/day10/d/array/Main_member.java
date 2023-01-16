package my.day10.d.array;

import java.util.Scanner;

import my.util.MyUtil;

public class Main_member {
	
	
	//클론코딩 해보기!!
	
	
/*
	================ >> 메뉴 << =============
	1.회원가입	      2.모든회원조회	3.프로그램종료
	========================================
	▷ 메뉴번호 선택 =>
*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member[] mbr_arr = new Member[3];
		
		String str_menuno = "";
		
		
		do {
			System.out.println("================ >> 메뉴 << =============\n"
							 + "1.회원가입	      2.모든회원조회	3.프로그램종료\n"
							 + "========================================");
			System.out.print("▷ 메뉴번호 선택 =>");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {	
			case "1":	//회원가입
				
				if(Member.count < mbr_arr.length) {
					//가입된 회원수가 정원(배열의 길이)보다 적은 경우
				
					
					Member mbr = new Member();
					do {
						System.out.print("▶아이디 : ");
						
						String input_id = sc.nextLine();
						
						boolean isIdExists = false;
						
						for(int i=0; i<Member.count;i++) {
							if(mbr_arr[i].id.equals(input_id)) { // 하나하나 아이디 검사해봐서 입력받은 id가 기존id와 같은것이 있다면
								isIdExists = true; //아이디가 똑같은게 있다는 흔적을 남기고 if문 빠져나오기.
								break;
							}
						}//end of for---
						
						if(isIdExists) {//아이디 같은게있다면
							System.out.println("[경고] 이미 사용중인 아이디 입니다.");
						}
						else {
							System.out.println(">> 사용가능한 아이디 입니다.");
							mbr.id = input_id;
							break;
						}
						
					}while(true);
					
					do {
						System.out.print("▶비밀번호 : ");
						// 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합이 되어져야만 사용 가능하다.
						
						String input_passwd = sc.nextLine();
						if(MyUtil.checkPwd(input_passwd)) {
							mbr.passwd = input_passwd;
							break;
						}
						else {
							System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합이 되어져야만 사용 가능합니다.") ;
						}
						
					} while(true);
					
					System.out.print("▶성명 : ");
					mbr.name = sc.nextLine();
					
					mbr_arr[Member.count++] = mbr;	
					//mbr_arr[0] = mbr;
					//Member.count = 1;
					
					//mbr_arr[1] = mbr;
					//Member.count = 2;
					
					//mbr_arr[2] = mbr;
					//Member.count = 3;
					
					System.out.println("\n회원가입에 성공하였습니다!\n");
				}//end of if------
				else {
					// 가입된 회원수가 정원(배열의 길이)과 같거나 큰 경우
					System.out.println("[경고] 정원마감이라서 더 이상 회원가입이 불가합니다.\n");
				}
					break;
				
			case "2":	//모든회원조회
//				for(int i=0;i<Member.count;i++) {
//					System.out.println(mbr_arr[i].showInfo());
//				}
//				break;
				
					/*--------------------------------
					 아이디          비밀번호       성명 
					 ---------------------------------
					 leess        qwer1234$   이순신
					 eomjh        wqer1234    엄정화
					 */
				System.out.println("-----------------------------------\n"
								 + "아이디          비밀번호             성명\n"
								 + "-----------------------------------\n");
				for(int i=0;i<Member.count;i++) {
					System.out.println(mbr_arr[i].id+"       "+mbr_arr[i].passwd+"        "+mbr_arr[i].name);
				}
				break;
			case "3":	//프로그램종료
				
				break;

			default:	//메뉴에 없는것을 선택한 경우 (예: 강아지 또는 7)
				System.out.println("[경고] 메뉴에 있는 번호만 선택하세요!!\n");
				break;
			}
			
		} while (!("3".equals(str_menuno)));
		
		System.out.println("==프로그램 종료==");
		
		sc.close();
		
	}//end of main----------

}
