package Practice01;

import java.util.Scanner;

public class Main_Information {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">>> 회원정보를 입력하세요<<< ");
		Information MungHyun = new Information();
		MungHyun.inputInfo(sc);
	
		MungHyun.showInfo();
		
		System.out.println(">>> 회원정보를 입력하세요<<< ");
		Information Hyunwoo = new Information();
		Hyunwoo.inputInfo(sc);
		
		Hyunwoo.showInfo();
		}

}
