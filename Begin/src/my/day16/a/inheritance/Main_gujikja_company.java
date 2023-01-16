package my.day16.a.inheritance;

import java.util.Scanner;

public class Main_gujikja_company {

	public static void main(String[] args) {

//		Member mbr1 = new Member();
		Gujikja gu = new Gujikja();
		
		Scanner sc = new Scanner(System.in);
		Ctrl_Total ctrl_total = new Ctrl_Total();
		Ctrl_Gujikja ctrl_gu = new Ctrl_Gujikja();
		Ctrl_Company ctrl_cp = new Ctrl_Company();
		
		Gujikja[] gu_arr = new Gujikja[5];
		Company[] cp_arr = new Company[3];
		
		///////////////////////////////////////////
		gu.setId("eomjh");
		gu.setPasswd("qWer1234$");
		gu.setName("엄정화");
		gu.setJubun("9701031");
		gu.setHope_money(5000);
		
		ctrl_gu.save_gu_arr(gu,gu_arr);
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("abCd12345$");
		gu2.setName("이순신");
		gu2.setJubun("9209201");
		gu2.setHope_money(5000);
		
		ctrl_gu.save_gu_arr(gu2,gu_arr);
		
		Gujikja gu3 = new Gujikja();
		gu3.setId("chaew");
		gu3.setPasswd("aSdf1234$");
		gu3.setName("차은우");
		gu3.setJubun("0106203");
		gu3.setHope_money(123);
		
		ctrl_gu.save_gu_arr(gu3, gu_arr);
		
		//-------------------------------------------//
		Company cp1 = new Company();
		cp1.setId("samsung");
		cp1.setPasswd("qWer1234$");
		cp1.setName("삼성전자");
		cp1.setBusiness_number("1234567890");
		cp1.setJobType("제조업");
		cp1.setSeedMoney(5000000);
		
		ctrl_cp.save_cp_arr(cp1, cp_arr);
		
		Company cp2 = new Company();
		cp2.setId("lg");
		cp2.setPasswd("qWer1234$");
		cp2.setName("LG");
		cp2.setBusiness_number("9234567890");
		cp2.setJobType("IT");
		cp2.setSeedMoney(7000000);
		
		ctrl_cp.save_cp_arr(cp2, cp_arr);
//		
//		try {
//		System.out.println(gu_arr[0].getInfo());
//		}catch(NullPointerException e) {
//		}
		////////////////////////////////////////////
		String str_menuno = "";
		do {
			ctrl_total.main_menu();
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 구직자 회원가입
					ctrl_gu.register(sc, gu_arr);
					break;
					
				case "2": // 구인회사 회원가입
					ctrl_cp.register(sc, cp_arr);
					break;
					
				case "3": // 구직자 로그인
					Gujikja login_gu = ctrl_gu.login(sc, gu_arr);
					if(login_gu == null) {
						System.out.println(">> 구직자 로그인 실패!! <<\n");
					}
					else{
						System.out.println(">> 구직자 로그인 성공!! <<\n");
						
						ctrl_gu.gu_menu(sc, login_gu,cp_arr);	//구직자 전용메뉴
					}
					break;
					
				case "4": //구인회사 로그인
					
					Company login_cp = ctrl_cp.login(sc, cp_arr);
					if(login_cp == null) {
						System.out.println(">> 구인회사 로그인 실패!! <<\n");
					}
					else {
						System.out.println(">> 구인회사 로그인 성공!!<<\n");
						
						ctrl_cp.cp_menu(sc, login_cp,cp_arr);
					}
					break;					
				case "5": //프로그램 종료
					
					break;					
	
				default:
					System.out.println("[경고] 메뉴에 없는 번호 입니다.\n");
					break;
			}// end of switch (str_menuno)-------------------
			
		} while (!("4".equals(str_menuno)));
		// end of do~while-----------------------------------
		
		
		sc.close();
		System.out.println("\n>>> 프로그램 종료 <<<");
	}//end of main()-----------------------

}
