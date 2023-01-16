package my.day07.c.For;

import java.util.Scanner;

public class main_Member {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===첫번째 회원을 가입하세요===");
		Member lss = new Member();
	
		lss.registerMember(sc);
		
		
	}

}
