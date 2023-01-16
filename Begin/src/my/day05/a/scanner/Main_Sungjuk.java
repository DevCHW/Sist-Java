package my.day05.a.scanner;

import java.util.Scanner;

public class Main_Sungjuk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Sungjuk lssSj = null;
		Sungjuk eomSj = null;
		
		String hakbun ="";
		String name = "";
		String str_kor = "";
		String str_eng = "";
		String str_math = "";
		
		int kor = 0;		
		int eng = 0;	
		int math = 0;
		int flag = 0; 	//국어, 영어, 수학 점수를 올바른 정수로 입력했는지 아닌지를 알려고 표시해두는 용도
		
		try {
			
			System.out.println(">> 첫번째 학생정보를 입력하세요 <<");
			
			System.out.print("1. 학번 : ");
			
			hakbun = sc.nextLine();
			
			System.out.print("2. 성명 : ");
			name = sc.nextLine();
			
			System.out.print("3. 국어 : ");
			str_kor = sc.nextLine();
			kor = Integer.parseInt(str_kor);
			flag = 1;
			
			System.out.print("4. 영어 : ");
			str_eng = sc.nextLine();
			eng = Integer.parseInt(str_eng);
			flag = 2;
			
			System.out.print("5. 수학 : ");
			str_math = sc.nextLine();
			math = Integer.parseInt(str_math);
			flag = 3;
									
		}catch(NumberFormatException e) {
			
			String subject ="";
			
			if(flag == 0) {
				subject = "국어";
			}
			else if(flag == 1){
				subject = "영어";
			}
			else if(flag == 2) {
				subject = "수학";
			}	
				System.out.println(" >> "+subject+"점수는 정수이어야 합니다. <<");
			}
		lssSj = new Sungjuk();
		lssSj.hakbun = hakbun;
		lssSj.name = name;
		lssSj.kor = kor;
		lssSj.eng = eng;
		lssSj.math = math;		
		/*
		1. 학번 : 091234엔터
		2. 성명 : 이순신엔터
		3. 국어 : 90엔터
		4. 영어 : 100엔터
		5. 수학 : 80엔터
		*/
		
			
		/*
		1. 학번 : 201234엔터
		2. 성명 : 엄정화엔터
		3. 국어 : 91엔터
		4. 영어 : 98엔터
		5. 수학 : 82엔터
	*/
		try {
			flag = 3;
			kor = 0;		
			eng = 0;	
			math = 0;
			
			System.out.println("\n>> 두번째 학생정보를 입력하세요 <<");
			
			System.out.print("1. 학번 : ");
			
			hakbun = sc.nextLine();
			
			System.out.print("2. 성명 : ");
			name = sc.nextLine();
			
			System.out.print("3. 국어 : ");
			str_kor = sc.nextLine();
			kor = Integer.parseInt(str_kor);
			flag = 4;
			
			System.out.print("4. 영어 : ");
			str_eng= sc.nextLine();
			eng = Integer.parseInt(str_eng);
			flag = 5;
			
			System.out.print("5. 수학 : ");
			str_math = sc.nextLine();
			math = Integer.parseInt(str_math);
			flag = 6;
			
			
		}catch(NumberFormatException e) {
			String subject ="";
			
			if(flag == 3) {
				subject = "국어";
			}
			else if(flag == 4){
				subject = "영어";
			}
			else if(flag == 5) {
				subject = "수학";
			}	
				System.out.println(" >> "+subject+"점수는 정수이어야 합니다. <<");			
		}
		eomSj = new Sungjuk(hakbun, name, kor, eng, math);
		
		lssSj.showInfo();
	/*
		=== 이순신님 성적결과 ===
		1. 학번 : 091234
		2. 성명 : 이순신
		3. 국어 : 90
		4. 영어 : 100
		5. 수학 : 80
		6. 총점 : 270
		7. 평균 : 90.0
		8. 학점 : A
	 */
		eomSj.showInfo();
		/*
		=== 엄정화님 성적결과 ===
		1. 학번 : 201234
		2. 성명 : 엄정화
		3. 국어 : 91
		4. 영어 : 98
		5. 수학 : 82
		6. 총점 : 271
		7. 평균 : 90.33333333333333
		8. 학점 : A
	 */
		sc.close();
	}

}
