package my.day15.a.encapsulation;

import java.util.Scanner;



public class Main_gujikja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ctrl_Gujikja ctrl = new Ctrl_Gujikja();
		
		Gujikja[] gu_arr = new Gujikja[5];
		
		///////////////////////////////////////////
//		Gujikja gu = new Gujikja();
//		gu.setUserid("eomjh");
//		gu.setPasswd("qWer1234$");
//		gu.setName("엄정화");
//		gu.setJubun("9701031");
//		
//		ctrl.save_gu_arr(gu,gu_arr);
//		
//		Gujikja gu2 = new Gujikja();
//		gu2.setUserid("leess");
//		gu2.setPasswd("abCd12345$");
//		gu2.setName("이순신");
//		gu2.setJubun("9209201");
//		
//		ctrl.save_gu_arr(gu2,gu_arr);
//		
//		Gujikja gu3 = new Gujikja();
//		gu3.setUserid("chaew");
//		gu3.setPasswd("aSdf1234$");
//		gu3.setName("차은우");
//		gu3.setJubun("0106203");
//		
//		ctrl.save_gu_arr(gu3, gu_arr);
		
		try {
		System.out.println(gu_arr[0].getInfo());
		}catch(NullPointerException e) {
		}
		////////////////////////////////////////////
		String str_menuno = "";
		do {
			ctrl.main_menu();
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 구직자 회원가입
					ctrl.register(sc, gu_arr);
					break;
					
				case "2": // 구직자 모두보기
					ctrl.showAll_info(gu_arr);
					break;
					
				case "3": // 검색
					ctrl.search_menu(sc, gu_arr);
					break;
					
				case "4":
					
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
