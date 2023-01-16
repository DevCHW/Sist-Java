package my.day14.b.abstration;

import java.util.Scanner;

public class Main_gujikja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ctrl_Gujikja ctrl = new Ctrl_Gujikja();

		Gujikja[] gu_arr = new Gujikja[5];
		
		
		
		String input_str;
		do {
			ctrl.main_menu();
			input_str = sc.nextLine();
			switch (input_str) {
			case "1":
				ctrl.register(sc, gu_arr);
				break;
			case "2":
				//구직자 모두보기 메서드 생성
				ctrl.showInfo_me(gu_arr);
				break;
			case "3":
				//구직자 검색 메서드 생성(내가만든 메서드 이름검색)
//				ctrl.search(sc,gu_arr);
				ctrl.search_menu(sc, gu_arr);
				//end of do~while---
				break;
			case "4":
				
				break; //4번을 선택하면 switch문을 빠져나가서 프로그램이 종료된다.
	
			default:	//메뉴에 없는번호를 선택하였을 때
				System.out.println("[경고] 메뉴에 있는 번호만 선택해주세요!!");
				break;
			}//end of switch
		}while(!("4".equals(input_str)));
		sc.close();
		System.out.println(">> 프로그램 종료 <<");
	}//end of main()-------------------------------------

}
