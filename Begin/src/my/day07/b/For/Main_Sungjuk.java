package my.day07.b.For;

import java.util.Scanner;

public class Main_Sungjuk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sungjuk sj_1 = new Sungjuk();
		
		
		System.out.println("=== 첫번째 학생에 대한 성적정보 입력하세요 ===");

		sj_1.registerInfo(sc);
		
		sj_1.showInfo();
		/*
		 === 이순신님 성적입력 결과 ===
		 1.학번 : 091234
		 2.성명 : 이순신
		 3.국어 : 100
		 4.영어 : 90
		 5.수학 : 94
		 6.총점 : 284
		 7.평균 : 94.7
		 8.학점 : A

		 */
		sc.close();
	}

}
