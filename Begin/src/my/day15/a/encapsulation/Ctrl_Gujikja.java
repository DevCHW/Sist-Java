package my.day15.a.encapsulation;
import java.util.Scanner;

public class Ctrl_Gujikja {
	// == Gujikja 객체를 Gujikja[] gu_arr 배열에 저장시키는 메서드 생성하기 ==//
	void save_gu_arr(Gujikja gu,Gujikja[] gu_arr) {
		if(gu.getUserid()!=null &&
				gu.getPasswd()!=null &&
				gu.getName()!=null &&
				gu.getJubun()!=null) {
			gu_arr[Gujikja.count++] = gu;
			
			System.out.println("[구직자 회원으로 가입 성공함!!]\n");
		}
		else {
			System.out.println("[구직자 회원가입 실패함!!]\n");
		}
	}//end of void save_gu_arr(Gujikja gu,Gujikja[] gu_arr) --------
	
	
	// == 메인 메뉴를 보여주는 메소드 생성하기 == //
		void main_menu() {
			System.out.println("\n === 메인메뉴 ===\n"
					         + "1.구직자 회원가입   2.구직자 모두보기   3.검색    4.프로그램종료\n");
			System.out.print("▷ 메뉴번호 선택 : ");
		}
		
		// == 검색 메뉴를 보여주는 메소드 생성하기 == //
		void search_menu(Scanner sc, Gujikja[] gu_arr) {
			
			String str_menuno = "";
			do {
				System.out.println("\n === 검색메뉴 ===\n"
				         + "1.연령대검색   2.성별검색   3.연령대 및 성별 검색    4.메인메뉴로 돌아가기\n");
				System.out.print("▷ 메뉴번호 선택 : ");
				
				str_menuno = sc.nextLine();
				
				switch (str_menuno) {
					case "1":  // 연령대검색
						search_ageLine(sc, gu_arr);
						break;
						
					case "2":  // 성별검색 
						search_gender(sc, gu_arr);
						break;
						
					case "3":  // 연령대 및 성별 검색 
						search_ageLine_gender(sc, gu_arr);
						break;
						
					case "4":  // 메인메뉴로 돌아가기
						
						break;					
		
					default:
						System.out.println("[경고] 검색메뉴에 존재하는 번호만 입력하세요!!\n");
						break;
				}// end of switch (str_menuno)---------------------
				
			} while (!("4".equals(str_menuno) ));
			
		}// end of void search_menu(Scanner sc)---------------------------
		
		

		// === 구직자(Gujikja) 신규 회원가입시 
		//     Gujikja 클래스의 field 의 요구사항에 모두 맞으면 
		//     Gujikja[] gu_arr 에 저장시켜주는 메소드 생성하기 ===
		void register(Scanner sc, Gujikja[] gu_arr) {
			
			if(Gujikja.count < gu_arr.length) { // 지금까지 생성된 구직자 회원수가 gu_arr.length(정원) 보다 적을 경우에만 신규회원을 받아들인다.  
			
				
				
				// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
				// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
				String userid;
				
				boolean isUseID;
				
				do {
					isUseID = true;
					
					System.out.print("1.아이디 : ");
					userid = sc.nextLine();  // "eomjh"  "leess" 
					
					// == 가입된 회원들에 대해 중복아이디 검사하기 == //
					if( !userid.trim().isEmpty() ) {
						for(int i=0; i<Gujikja.count; i++) {
						 	if( userid.equals(gu_arr[i].getUserid()) ) {
						 		System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
						 		isUseID = false;
						 		break;
						 	}
						}// end of for------------------
					}//end of if------
					
					else {  // ""  또는  "       "
						isUseID = false;
					}//end of else----
					
				} while (!isUseID);
				// end of do ~ while----------------------
	
				System.out.print("2.비밀번호 : ");
				String passwd = sc.nextLine();  // "qW12$"  "qwer1234$"   "qWer1234$" 
				
				System.out.print("3.성명 : ");
				String name = sc.nextLine();  // "엄정화"  ""   "       " 
			
			
				System.out.print("4.주민번호 : ");
				String jubun = sc.nextLine();  // ""  ""   "" 
				
				
				Gujikja gu = new Gujikja();
				gu.setUserid(userid);
				gu.setPasswd(passwd);
				gu.setName(name);
				gu.setJubun(jubun);
						
				save_gu_arr(gu, gu_arr);
			
			}
			
			else { // 지금까지 생성된 구직자 회원수가 gu_arr.length(정원) 과 같거나 큰 경우에는 신규회원을 받아들이면 안된다.  
				System.out.println(">> 정원이 초과하여 구직자 회원가입이 불가합니다 !! <<\n");
			}
			
		}// end of void register(Scanner sc, Gujikja[] gu_arr)-----------------------


		// === 구직자 모두보기 메소드 ===
		void showAll_info(Gujikja[] gu_arr) {
				
			/*
			     --------------------------------------------------
			      아이디    비밀번호       성명    성별    현재나이
			     --------------------------------------------------
			      eomjh   qWer*****    엄정화   여      27 
			      leess   abCd******   이순신   남      31
			      chaew   aSdf*****    차은우   남      22
			*/
			
			if( Gujikja.count == 0 ) {
				System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
			}
			
			else {
				title();
				StringBuilder sb = new StringBuilder();
				
				for(int i=0; i<Gujikja.count; i++) {
					sb.append(gu_arr[i].getInfo()+"\n");
				}// end of for------------------------
				
				System.out.println(sb.toString());
			}
			
		}// end of void showAll_info(Gujikja[] gu_arr)------------------------------
		
		
		
		// === 연령대 검색해주는 메소드 ===
		void search_ageLine(Scanner sc, Gujikja[] gu_arr) {
			
			System.out.print("▷ 검색하고자 하는 연령대 : ");
			String str_ageLine = sc.nextLine();                    // "20"  "30"  "40"  "강아지"
			
			int search_ageLine = 0;
			try {
				search_ageLine = Integer.parseInt(str_ageLine); //  20    30    40
			} catch(NumberFormatException e) {
				System.out.println("[경고] 올바른 연령대로 입력하세요!!\n");
				return; // search_ageLine(Scanner sc, Gujikja[] gu_arr) 메소드 종료하기 
			}
			
			StringBuilder sb = new StringBuilder();
			int count = 0;
			for(int i=0; i<Gujikja.count; i++) {
			//	gu_arr[i].getAge()                      // 27        31        22
				int ageLine = gu_arr[i].getAge()/10*10; // 27/10*10  31/10*10  22/10*10
				                                        // 20        30        20
				
				if(search_ageLine == ageLine) {
					count++;
					sb.append(gu_arr[i].getInfo()+"\n"); 
				}
				
			} // end of for------------------------
			
			if(count == 0) {
				System.out.println("[검색결과 "+str_ageLine+"대 구직자는 없습니다]\n");
			}
			else {
				title();
				System.out.println(sb.toString());
				System.out.println("[검색결과] "+str_ageLine+"대는 "+count+"명 입니다.\n");
			}
			
		}// end of void search_ageLine()-------------------------------------------
		
		
		void title() {
			System.out.println("=================================================\n"
			                 + " 아이디    비밀번호         성명    성별    현재나이	가입일자\n"
			                 + "=================================================");
		}// end of void title()----------------
		
		// === 성별 검색해주는 메소드 ===
		void search_gender(Scanner sc, Gujikja[] gu_arr) {
			
			System.out.print("▷ 검색하고자 하는 성별[남/여] : ");
			String input_gender = sc.nextLine();    // "남"  "여"  " 남 "  " 여 "  "강아지"
			
			input_gender = input_gender.trim();     // "남"  "여"   "남"    "여"   "강아지"
			
			if("남".equals(input_gender) || "여".equals(input_gender)) {
			
				StringBuilder sb = new StringBuilder();
				
				int count = 0;
				
				for(int i=0; i<Gujikja.count; i++) {
					
					if( gu_arr[i].getGender().equals(input_gender) ) {
						count++;
						sb.append(gu_arr[i].getInfo()+"\n");
					}
					
				} // end of for------------------------
				
				if(count == 0) {
					System.out.println("[검색결과 "+input_gender+"자 구직자는 없습니다]\n");
				}
				else {
					title();
					System.out.println(sb.toString());
					System.out.println("[검색결과] "+input_gender+"자는 "+count+"명 입니다.\n");
				}
			
			}
			
			else {  // "남" 또는 "여" 가 아닌 "강아지" 입력한 경우
				System.out.println("[경고] \"남\" 또는 \"여\" 만 입력하세요!!\n");
			}
			
		}// end of void search_ageLine()-----------------------------------
		
		
		
		//==연령 및 성별 검색 메서드================
		
		void search_ageLine_gender(Scanner sc, Gujikja[] gu_arr) {
			System.out.print("▷ 검색하고자 하는 연령대 : ");
			String str_ageLine = sc.nextLine();                    // "20"  "30"  "40"  "강아지"
			
			int search_ageLine = 0;
			try {
				search_ageLine = Integer.parseInt(str_ageLine); //  20    30    40
			} catch(NumberFormatException e) {
				System.out.println("[경고] 올바른 연령대로 입력하세요!!\n");
				return; // search_ageLine(Scanner sc, Gujikja[] gu_arr) 메소드 종료하기 
			}
			
			System.out.print("▷ 검색하고자 하는 성별[남/여] : ");
			String input_gender = sc.nextLine();    // "남"  "여"  " 남 "  " 여 "  "강아지"
			input_gender = input_gender.trim();
			if(!("남".equals(input_gender) || "여".equals(input_gender))) {
				System.out.println("[경고]올바른 성명을 입력하세요 !! \n");
			}
			
			StringBuilder sb = new StringBuilder();
			int count = 0;
			for(int i=0; i<Gujikja.count; i++) {
			//	gu_arr[i].getAge()                      // 27        31        22
				int ageLine = gu_arr[i].getAge()/10*10; // 27/10*10  31/10*10  22/10*10
				                                        // 20        30        20
				
				if(search_ageLine == ageLine && gu_arr[i].getGender().equals(input_gender)) {
					count++;
					sb.append(gu_arr[i].getInfo()+"\n"); 
				}
				
			} // end of for------------------------
			
			if(count == 0) {
				System.out.println("[검색결과 "+str_ageLine+"대 "+input_gender+"자 구직자는 없습니다]\n");
			}
			else {
				title();
				System.out.println(sb.toString());
				System.out.println("[검색결과] "+str_ageLine+"대 "+input_gender+"자는 "+count+"명 입니다.\n");
			}
			
		}//end of void search_ageLine_gender(Scanner sc, Gujikja[] gu_arr) --------
			
		
}
