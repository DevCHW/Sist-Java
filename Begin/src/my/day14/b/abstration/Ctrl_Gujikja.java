package my.day14.b.abstration;

import java.util.Scanner;

import my.util.MyUtil;

public class Ctrl_Gujikja {
	
	// == 메뉴를 보여주는 메소드 생성하기 == //
	void main_menu() {
		System.out.println("====================메인 메뉴 =======================\n"
				        +  "1.구직자 회원가입   2.구직자 모두보기    3.검색   4.프로그램 종료\n"
				        +  "===================================================\n");
			System.out.print("▷ 메뉴번호 선택 : ");
	}//end of void main_menu(Scanner sc)

	// === 구직자(Gujikja) 신규 회원가입시 
	//     Gujikja 클래스의 field 의 요구사항에 모두 맞으면
	//	   Gujikja[] gu_arr 에 저장시켜주는 메소드 생성하기 ===
	
	void register(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count<gu_arr.length) {
		
		// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
		// 입력받은 아이디가 중복된 아이디가 아닐때 까지 한다.
		boolean isUseID;
		String userid;
		String passwd;
		String name;
		String jubun;
		do {
			isUseID = true;
			System.out.print("1. 아이디 : ");
			userid = sc.nextLine();
			
			// == 가입된 회원들에 대해 중복아이디 검사하기 == //
			if(!userid.trim().isEmpty()) {
				for(int i=0;i<Gujikja.count;i++) {
					if(gu_arr[i].userid.equals(userid)) {
						System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
						isUseID = false;
						break;
					}
				}//end of for---
			}
			else {
				isUseID = false;
			}
		} while (!isUseID);
		//end of do~while------------------------
		
		
		
		// 암호는 필수 입력사항이면서 암호조건에 맞지않을 때 반복해야한다.!!
		
		boolean isUsePasswd;
		
		do {
			isUsePasswd = true;
			System.out.print("2. 비밀번호 : ");
			passwd = sc.nextLine();
			
			if(!MyUtil.checkPwd(passwd)) {
				System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다.\n");
				isUsePasswd = false;
			}
			// == 가입된 회원들에 대해 중복아이디 검사하기 == //
		} while (!isUsePasswd);
		//end of do~while------------------------
		
		
		
		// 성명은 필수 입력사항이면서 암호조건에 맞지않을 때 반복해야한다.!!
		
		boolean isUseName;
		do {
			isUseName = true;
			System.out.print("3. 성명 : ");
			name = sc.nextLine();
			
			if(name.trim().isEmpty()) {
				System.out.println("[경고] 성명은 공백만으로 된것이 아닌 데이터를 입력 합니다.\n");
				isUseName = false;
			}
			// == 가입된 회원들에 대해 중복아이디 검사하기 == //
		} while (!isUseName);
		//end of do~while------------------------
		
		// 암호는 필수 입력사항이면서 암호조건에 맞지않을 때 반복해야한다.!!
		
		boolean isUseJubun;
		
		do {
			isUseJubun = true;
			System.out.print("4. 주민번호 : ");
			jubun = sc.nextLine();
			
			if(!MyUtil.checkJubun(jubun)) {
				System.out.println("[경고] 올바른 주민번호를 입력하세요!!\n");
				isUseJubun = false;
			}
			// == 가입된 회원들에 대해 중복아이디 검사하기 == //
		} while (!isUseJubun);
		//end of do~while------------------------
		
		
		
		Gujikja gu = new Gujikja();
		gu.userid = userid;
		gu.passwd = passwd;
		gu.name = name;
		gu.jubun = jubun;

	
		gu_arr[Gujikja.count++] = gu;
		
		System.out.println(">> 구직자 회원가입 성공 !! << \n");
		}
		else {//지금까지 생성된 구직자 회원수가 gu_arr.length(정원)과 같거나 큰 경우에는 신규회원을 받아들이면 안된다.
		
			System.out.println(" >> 정원이 초과하여 구직자 회원가입이 불가합니다 !!<< \n");
		}
	
	}//end of void register(Scanner sc, Gujikja[] gu_arr)------------------------------------
	
	
	//구직자를 모두보기 해주는 메서드 생성
	void showInfo_me(Gujikja[] gu_arr) {
		if(Gujikja.count>0) {
			System.out.println("=============================구직자 모두보기=================================\n"
							 + "아이디         성명         비밀번호         성별             나이         가입일자 \n"
							 + "=========================================================================\n");
			
			for(int i=0;i<Gujikja.count;i++) {
				String result="";
				result += gu_arr[i].userid+"       "+gu_arr[i].name+"       "+gu_arr[i].passwd+"        "+gu_arr[i].getGender()+"            "
				       +gu_arr[i].getAge()+"      "+gu_arr[i].register_day;
				System.out.println(result+"\n");
			}//end of for----
			
		}
		else if(Gujikja.count ==0){
			System.out.println("[경고] 가입한 구직자가 없습니다.먼저 회원가입을 해주세요!!");
		}
	}//end of void showInfo()-----------------
	
	void search(Scanner sc,Gujikja[] gu_arr) {
		outer:
		do {
			System.out.print("[뒤로가기:0]검색할 구직자의 성명을 입력해주세요>>");
			String input_name = sc.nextLine();
			if(input_name.equals("0"))
				break outer;
			
			if(Gujikja.count<1) { // 가입한 회원이 없다면
				System.out.println("가입된 구직자가 없습니다.회원가입부터 해주세요!\n");
				break outer;
			}
			for(int i=0;i<Gujikja.count;i++) {
				
				if(input_name.equals(gu_arr[i].name)) {//입력한 이름과 같은 이름이 있다면
					gu_arr[i].showInfo();
					break outer; 				//출력하고 빠져나간다.
				}
				else {
					System.out.println(input_name+" 이라는 구직자는 없습니다. 다시입력하세요!\n");
				}
			}//end of for------
		}while(true);
		
	}//end of search()--------
	
	
	// ==검색 메뉴를 보여주는 메소드 생성하기 == //
	void search_menu(Scanner sc,Gujikja[] gu_arr) {
	
		String input_search_str ="";
		do {
			System.out.println("==================== 검색 메뉴 =======================\n"
				        	+  "1.연령대검색  2.성별검색  3.연령대 및 성별검색  4.메인메뉴로 돌아가기\n"
				        	+  "===================================================\n");
			System.out.print("▷ 메뉴번호 선택 : ");
			input_search_str = sc.nextLine();
			
			switch (input_search_str) {
			case "1"://연령대검색을 해주는 메서드 호출
				search_ageLine(sc, gu_arr);
				break;
			case "2"://성별검색을 해주는 메서드 호출
				search_gender();
				break;
			case "3"://연령대 및 성별검색을 해주는 메서드 호출
				
				break;
			case "4"://메인메뉴로 돌아가기
				
				break;//switch문을 빠져나가서 do~while문을 빠져나간다.

			default:	//메뉴에 없는 번호를 입력했을 때
				System.out.println("메뉴에 있는 번호만 입력해주세요!");
				break;
			}
		}while(!("4".equals(input_search_str)));
		
	}//end of void search_menu()
	
	
	//==연령대검색을 해주는 메서드 생성==
	void search_ageLine(Scanner sc,Gujikja[] gu_arr) {
		int input_age=0; 
		first:
		do {
			System.out.print("▷ 검색하고자 하는 연령대를 입력해주세요 >>");
			try {
				input_age= Integer.parseInt(sc.nextLine());
				if(Gujikja.count ==0){//가입한 회원이 없다면
					System.out.println("[경고] 가입한 회원이 없습니다!\n");
					break first;
				}
			
				for(int i=0;i<Gujikja.count;i++) {	//20대,30대,40대
					
						if(20<=gu_arr[i].getAge() && gu_arr[i].getAge()<30&&20<=input_age&&input_age<30){//입력한 연령대가 20대라면
							gu_arr[i].showInfo();
							continue;
						}
						else if(30<=gu_arr[i].getAge() &&gu_arr[i].getAge()<40 &&30<=input_age&&input_age<40) {;//입력한 연령대가 30대라면
							gu_arr[i].showInfo();
							continue;
						}
						else if(40<=gu_arr[i].getAge() &&gu_arr[i].getAge()<50 &&40<=input_age&&input_age<50) {//입력한 연령대가 40대라면
							gu_arr[i].showInfo();
							continue;
						}
						else {
							System.out.println("입력하신 연령대의 회원 정보가 없습니다!");
							break first;
						}
				}//end of for----
			}catch(NumberFormatException e) {
				System.out.println("[경고]숫자만 입력해주세요!!\n");
			}
		}while(true);
		
	}//end of void search_ageLine()---------
	
	
	//==성별 검색을 해주는 메서드 ==
	void search_gender() {
		
	}
}//end of class
