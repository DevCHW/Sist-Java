package my.day05.b.scanner;

import java.util.Scanner;

public class Sungjuk {

	//field
		String hakbun;	//학번
		String name;	//성명
		int kor;		//국어
		int eng;		//영어
		int math;		//수학
	//constructor
		public Sungjuk() {
			
		}		

		//method
	//학생의 성적정보를 입력해주는 메소드
		void registerInfo(Scanner sc) {
			int flag = 0;
			try {
			System.out.print("1. 학번 : ");
			hakbun = sc.nextLine();
			
			System.out.print("2. 성명 : ");
			name = sc.nextLine();
			
			System.out.print("3. 국어 : ");
			kor = Integer.parseInt(sc.nextLine());
			flag = 1;
			
			System.out.print("4. 영어 : ");
			eng = Integer.parseInt(sc.nextLine());
			flag = 2;
			
			System.out.print("5. 수학 : ");
			math = Integer.parseInt(sc.nextLine());
			flag = 3;
			
			}catch(NumberFormatException e) {
				String subject = "";
				if (flag == 0){
					subject = "국어";
				}
				else if(flag == 1) {
					subject = "영어";
				}
				else if(flag == 2) {
					subject = "수학";
				}		
				System.out.println(">> " + subject + "과목은 정수로 입력해야 합니다!!<<");
			}
		} //end of void registerInfo();
			/*
			>> 학생정보를 입력하세요 <<
			1. 학번 : 091234엔터
			2. 성명 : 이순신엔터
			3. 국어 : 90엔터
			4. 영어 : 100엔터
			5. 수학 : 80엔터
			*/
			
			//총점을 리턴시켜주는 메소드
			int total() {
				return kor+eng+math;
			}
			//평균 리턴
			double avg() {
				return total()/3.0;				
			}			
			//학점 리턴
			char hakjum() {
				double avg = avg();
				char result = ' ';
				if(avg >= 90) {
					result = 'A';
				}
				else if(avg >= 80) {
					result = 'B';
				}
				else if(avg >= 70) {
					result = 'C';
				}
				else if(avg >= 60) {
					result = 'D';
				}
				else {
					result = 'F';
				}
				return result;			
		}// end of char hakjum()--------------
		
		void showInfo() {
		
			System.out.println("\n==== "+name+"님 성적 정보 =====\n"
							+ "1. 학번 : "+hakbun+"\n"
							+ "2. 성명 : "+name+"\n"
							+ "3. 국어 : "+kor+"\n"
							+ "4. 영어 : "+eng+"\n"
							+ "5. 수학 : "+math+"\n"
							+ "6. 총점 : "+total()+"\n"
							+ "7. 평균 : "+avg()+"\n"
							+ "8. 학점 : "+hakjum()+"\n");
		}// end of void showInfo()-------------------------
	
} //end of class Sungjuk()------------------------------
