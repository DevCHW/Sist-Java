package Practice01;

import java.util.Scanner;

public class Information {
	//Field
	String name;
	String ID;
	String str_Height;
	String str_Weight;
	String Bloodtype;
	String MBTI;
	String Birthday;
	double Height;
	double Weight;
	//construtor
	public Information(){
		
	}
	//method
	
	void inputInfo(Scanner sc) {
		int flag = 0;
		try {
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("ID : ");
		ID = sc.nextLine();
		
		System.out.print("키 : ");		
		Height = Double.parseDouble(sc.nextLine());
		flag = 1;
		
		System.out.print("몸무게 : ");		
		Weight = Double.parseDouble(sc.nextLine());
		flag = 2;
		
		System.out.print("혈액형 : ");
		Bloodtype = sc.nextLine();
		
		System.out.print("MBTI : ");
		MBTI = sc.nextLine();
		
		System.out.print("Birthday(2022-06-07 형식으로 입력) : ");
		Birthday = sc.nextLine();
		}catch(NumberFormatException e) {
			String Element ="";
			if(flag == 0) {
				Element = "키";
			}
			else if (flag == 1) {
				Element = "몸무게";
			}
		
			System.out.println(Element+"를 똑바로 입력해주세요!!");
			
		}//--end of catch
	}//--end of void inputInfo()---
	
	void showInfo() {
		System.out.println("==== "+name+ "님의 인적사항 ====\n"
						+  name+"님의 ID : "+ID+"\n"
						+  "키 : "+Height+"cm\n"
						+  "몸무게 : "+Weight+"kg\n"
						+  "혈액형 : "+Bloodtype+"형\n"
						+  "MBTI : "+MBTI+"\n"
						+  "생일 : "+Birthday+"");
		/*
		 ==== 김멍현 님의 인적사항 ====
		멍현님의 ID : nowadaysgreen79@naver.com
		키 : 152.3 cm
		몸무게 : 45kg
		혈액형 : A형
		MBTI : ISTJ
		생일 : 2000.07.09
		 */
		
	}//----void showInfo()-----
}
