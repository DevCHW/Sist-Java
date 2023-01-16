package my.day05.b.scanner;

import java.util.Scanner;

public class Main_Sungjuk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">> 첫번째 학생정보를 입력하세요 <<");
		
		Sungjuk lssSj = new Sungjuk();
		lssSj.registerInfo(sc);
		
		System.out.println("총점 : "+lssSj.total()+",  평균:" + lssSj.avg()+" , 학점"+lssSj.hakjum());
		lssSj.showInfo();
		
		System.out.println(">> 두번째 학생정보를 입력하세요 <<");
		
		Sungjuk eomSj = new Sungjuk();
		
		eomSj.registerInfo(sc);
		System.out.println("총점 : "+eomSj.total()+",  평균:" + eomSj.avg()+" , 학점"+eomSj.hakjum());
		eomSj.showInfo();
		
		sc.close();
	}//------------end of main()-----------

}//------------end of class Main_sungjuk
