package my.day21.a.ENUM;

import java.util.Calendar;

public class Member_1 {

	
	//field
	private String name;
	private String jubun;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJubun() {
		return jubun;
	}
	public void setJubun(String Jubun) {
		jubun = Jubun;
	}
	
	//나이를 구해주는 메소드 생성
	public int getAge() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);// 현재 년도
		String gender = jubun.substring(6);
		int birthYear =0;
		switch (gender) {
		case "0":
		case "1":
			birthYear = 1900 + Integer.parseInt(jubun.substring(0,2));
			break;
				
		case "3":
		case "4":
			birthYear = 2000 + Integer.parseInt(jubun.substring(0,2));
			break;
		}
		return year-birthYear;
	}
//		int gender_no = Integer.parseInt(jubun.substring(6)); //주민번호 7번째자리를 숫자로 변환
//		
//		if(gender_no>2) {// 주민번호 7번째자리가 2보다 크다면
//			jubun = "20"+jubun;
//		}
//		else if(gender_no<=2) {// 주민번호 7번째자리가 2보다 작다면
//			jubun = "19"+jubun;
//		}
//		return year - (Integer.parseInt(jubun.substring(0,4)))+1;
//	}
	
	//method
	
	@Override
	public String toString() {
		return "1.성명 : " + name +"\n"
			 + "2.주민번호 : "+ jubun +"\n"
			 + "3.나이 : "+getAge()+"세";
				
				
	}
}
