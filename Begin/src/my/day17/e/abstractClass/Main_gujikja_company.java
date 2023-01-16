package my.day17.e.abstractClass;
import java.util.Scanner;
public class Main_gujikja_company {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		Ctrl_Total ctrl_total = new Ctrl_Total();
		
		Member[] mbr_arr = new Member[10];
				
		///////////////////////////////////////////
		Gujikja gu1 = new Gujikja();
		gu1.setId("eomjh");
		gu1.setPasswd("qWer1234$");
		gu1.setName("엄정화");
		gu1.setJubun("9510092");
		gu1.setHope_money(5000);
				
		ctrl_total.save_mbr_arr(gu1, mbr_arr);
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("abCd12345$");
		gu2.setName("이순신");
		gu2.setJubun("9209201");
		gu2.setHope_money(6000);
		
		ctrl_total.save_mbr_arr(gu2, mbr_arr);
		
		Gujikja gu3 = new Gujikja();
		gu3.setId("chaew");
		gu3.setPasswd("aSdf1234$");
		gu3.setName("차은우");
		gu3.setJubun("0106203");
		gu3.setHope_money(7000);
		
		ctrl_total.save_mbr_arr(gu3, mbr_arr);
		
		// --------------------------------------//

		Company cp1 = new Company();
		cp1.setId("samsung");
		cp1.setPasswd("qWer1234$");
		cp1.setName("삼성전자");
		cp1.setBusiness_number("1234567890");
		cp1.setJobType("제조업");
		cp1.setSeedMoney(5000000);
		
		ctrl_total.save_mbr_arr(cp1, mbr_arr);
		
		Company cp2 = new Company();
		cp2.setId("lg");
		cp2.setPasswd("qWer1234$");
		cp2.setName("LG");
		cp2.setBusiness_number("9234567890");
		cp2.setJobType("IT");
		cp2.setSeedMoney(7000000);

		ctrl_total.save_mbr_arr(cp2, mbr_arr);
		
        ///////////////////////////////////////////
		
		String str_menuno = "";
		do {
			ctrl_total.main_menu();
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 구직자 회원가입
					ctrl_total.register_gu(sc, mbr_arr);
					break;
					
				case "2": // 구인회사 회원가입
					ctrl_total.register_cp(sc, mbr_arr);
					break;
					
				case "3": // 구직자 로그인
					Gujikja login_gu = ctrl_total.login_gu(sc, mbr_arr);
					
					if(login_gu == null) {
						System.out.println(">> 구직자 로그인 실패!! <<\n");
					}
					else {
						System.out.println(">> 구직자 로그인 성공!! <<\n");
						
						ctrl_total.gu_menu(login_gu, mbr_arr, sc); // 구직자 전용메뉴
					}
					
					break;
					
				case "4": // 구인회사 로그인
					Company login_cp = ctrl_total.login_cp(sc, mbr_arr);
					
					if(login_cp == null) {
						System.out.println(">> 구인회사 로그인 실패!! <<\n");
					}
					else {
						System.out.println(">> 구인회사 로그인 성공!! <<\n");
						
						ctrl_total.cp_menu(login_cp, mbr_arr, sc);
					}
					break;					
					
	
				case "5": 	// 프로그램종료
					
					break;
					
				default:
					System.out.println("[경고] 메뉴에 없는 번호 입니다.\n");
					break;
			}// end of switch (str_menuno)-------------------
			
		} while (!("5".equals(str_menuno)));
		// end of do~while-----------------------------------
		
		
		sc.close();
		System.out.println("\n>>> 프로그램 종료 <<<");
		
	}// end of main()------------------------

}
