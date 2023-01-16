package my.day16.a.inheritance;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ctrl_Gujikja extends Ctrl_Total{
	// == Gujikja 객체를 Gujikja[] gu_arr 배열에 저장시키는 메서드 생성하기 ==//
	void save_gu_arr(Gujikja gu,Gujikja[] gu_arr) {
		if(gu.getId()!=null &&
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
	
		
		
		// 입력
	void register(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count < gu_arr.length) { // 지금까지 생성된 구직자 회원수가 gu_arr.length(정원) 보다 적을 경우에만 신규회원을 받아들인다.  
		
			
			
			// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
			// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
			String id;
			
			boolean isUseID;
			
			do {
				isUseID = true;
				
				System.out.print("1.아이디 : ");
				id = sc.nextLine();  // "eomjh"  "leess" 
				
				// == 가입된 회원들에 대해 중복아이디 검사하기 == //
				if( !id.trim().isEmpty() ) {
					for(int i=0; i<Gujikja.count; i++) {
					 	if( id.equals(gu_arr[i].getId()) ) {
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
			gu.setId(id);
			gu.setPasswd(passwd);
			gu.setName(name);
			gu.setJubun(jubun);
					
			save_gu_arr(gu, gu_arr);
		
		}
		
		else { // 지금까지 생성된 구직자 회원수가 gu_arr.length(정원) 과 같거나 큰 경우에는 신규회원을 받아들이면 안된다.  
			System.out.println(">> 정원이 초과하여 구직자 회원가입이 불가합니다 !! <<\n");
		}
		
	}// end of void register(Scanner sc, Gujikja[] gu_arr)-----------------------



	//구직자 로그인
	public Gujikja login(Scanner sc, Gujikja[] gu_arr) {
		
		
		System.out.print("▷ 구직자 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Gujikja.count; i++) {
			if(gu_arr[i].getId().equals(id)&&gu_arr[i].getPasswd().equals(passwd)){
				return gu_arr[i];
			}
		}
		
		return null;
	}//end of public Gujikja login(Scanner sc, Gujikja[] gu_arr)------

		
		
	//구직자 전용메뉴
	public void gu_menu(Scanner sc, Gujikja login_gu, Company[] cp_arr) {

		String input_str="";
		do {
			System.out.println("\n=== 구직자 전용메뉴("+login_gu.getName()+")님 로그인중) ===\n"
							 + "1.내정보보기	2.내정보수정	3.모든 구인회사 조회		4.로그아웃\n");
			System.out.print("▷메뉴번호 선택 : ");
			input_str = sc.nextLine();
			switch (input_str) {
				case "1":	//내정보보기
					show_myInfo(login_gu);
					break;
				case "2":	//내정보수정
					update_myInfo(login_gu, sc);
					break;
				case "3":	//모든 구인회사 조회
					show_all_companyInfo(cp_arr);
					break;
				case "4":	//로그아웃
					login_gu = null;
					break;
	
				default:	//메뉴에 없는 번호
					System.out.println("[경고] 메뉴에 있는 번호만 선택하세요 !!\n");
					break;
			}//end of switch------------------
		//do~while----------------------------------
		}while(!("4".equals(input_str)));
		System.out.println("로그아웃이 완료되었습니다!");
			
	}//end of public void gu_menu()---------------------------
	
	// == 내정보 보기를 해주는 메소드 생성하기 == //
	public void show_myInfo(Gujikja login_gu) {
		
		System.out.println(login_gu.toString());
	}//end of void search_menu(Scanner sc, Gujikja[] gu_arr)------------------------
	
	
	
	// == 내정보 수정을 해주는 메소드 생성하기 == //
	public void update_myInfo(Gujikja login_gu,Scanner sc) {
		
		show_myInfo(login_gu);
		
		System.out.println(">>[주의사항] 변경하지 않고 예전의 데이터값을 사용하시려면 그냥 엔터하세요");
		
		System.out.print("1.비밀번호 : ");
		String passwd = sc.nextLine();
		
		System.out.print("2.성명 : ");
		String name = sc.nextLine();
		
		System.out.print("3.주민번호 : ");
		String Jubun = sc.nextLine();

		System.out.print("4.희망연봉 : ");
		String hope_money = sc.nextLine();
		
		if(!passwd.trim().isEmpty()) {
			login_gu.setPasswd(passwd);
		}
		if(!name.trim().isEmpty()) {
			login_gu.setName(name);
		}
		if(!Jubun.trim().isEmpty()) {
			login_gu.setJubun(Jubun);
		}
		if(!hope_money.trim().isEmpty()) {
			login_gu.setHope_money(Integer.parseInt(hope_money));
		}
		
		System.out.println("성공적으로 변경되었습니다.");
	}// end of public void update_myInfo(Gujikja login_gu)-----------------------------

	
	// == 모든 구인회사 조회를 해주는 메소드 생성하기 ==//
	public void show_all_companyInfo(Company[] cp_arr) {
		
//		// 0. 내가 한 방법
//		for(int i=0;i<cp_arr.length;i++) {
//			if(cp_arr[i]==null) {
//				System.out.println(">> 구인회사로 등록된 회사가 한개도 없습니다. <<\n");
//				break;
//			}
//			else {
//				System.out.println(cp_arr[i].toString());
//			}
//		}//end of for---
		
		
		  // 1. 첫번째 방법
	      /*   
	         for(int i=0; i<Company.count; i++) {
	         //   sb.append(cp_arr[i].toString()+"\n");
	         //  또는   
	            sb.append(cp_arr[i]+"\n");
	         }
	         System.out.println(sb.toString());
	      */   
	         
	         // 2. 두번째 방법
			StringBuilder sb = new StringBuilder();
		
	        DecimalFormat df = new DecimalFormat("#,###");
	         
	        for(int i=0; i<Company.count; i++) {
	            sb.append(cp_arr[i].getName()+"\t"+
	                    cp_arr[i].getJobType()+"\t"+
	                    cp_arr[i].getBusiness_number()+"\t"+
	                    df.format(cp_arr[i].getSeedMoney())+"원\n");
	         }
	         System.out.println(sb.toString());
		
	}//end of void show_all_companyInfo()---------------------------
	
	
			
		
}
