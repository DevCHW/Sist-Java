package my.day18.d.Interface;

import java.text.DecimalFormat;
import java.util.Calendar;
import my.util.MyUtil;

public class Gujikja extends Member { // Member 클래스가 Gujikja 클래스의 부모 클래스가 된다.
    // Gujikja 클래스는 Member 클래스의 자식 클래스가 된다.
    // Gujikja 클래스 와 Member 클래스는 상속관계에 있다라고 본다.

// field 생성
	private String jubun;   // 주민번호인데 앞자리6자리에 성별을 나타내는 1자리까지만 입력한다.
	// 예: "9506201" "9607202"  "0006203"  "0106204"  "1106204"
	
	private int hope_money; // 희망연봉
	
	
	// method 생성
	
	// getter, setter 만들기
	public String getJubun() {
	return jubun;
	}


	public void setJubun(String jubun) {
	
	if( MyUtil.checkJubun(jubun) ) {
	this.jubun = jubun;
	}
	
	else {
	System.out.println("[경고] 주민번호를 올바르게 넣으세요!!\n 예>9510092 \n");
	}
	
	}
	
	
	public int getHope_money() {
	return hope_money;
	}
	
	
	public void setHope_money(int hope_money) {
	
	if(hope_money > 0) {
	this.hope_money = hope_money;
	}
	else {
	System.out.println("[경고] 희망연봉은 0 보다 커야 합니다.\n");
	}
	}
	
	
	// == 구직자의 나이를 알려주는 메소드 생성하기 ==
	int getAge() {
	
	// 현재나이 = 현재년도 - 태어난년도 + 1
	
	Calendar currentDate = Calendar.getInstance();    // 현재날짜와 시간을 얻어온다.
	int currentYear = currentDate.get(Calendar.YEAR); // 현재년도 2022 
	
	int centry = ( Integer.parseInt(jubun.substring(6)) == 1 || Integer.parseInt(jubun.substring(6)) == 2 )?1900:2000;      
	
	int birthYear = Integer.parseInt(jubun.substring(0, 2)) + centry;  // 태어난년도
	
	return currentYear - birthYear + 1;
	}
	
	
	// == 구직자의 성별을 알려주는 메소드 생성하기 ==
	String getGender() {
	
	String gender = "";
	
	switch (jubun.substring(6)) {
	case "1":
	case "3":	
	gender = "남";
	break;
	
	default:
	gender = "여";
	break;
	}
	
	return gender;
	}
	
	
	// == 구직자의 정보를 한줄로 출력해주는 메소드 생성하기 ==
	String getInfo() {
	
	// eomjh   qWer*****    엄정화   여      27     2022-06-21    5,000만원
	
	DecimalFormat df = new DecimalFormat("#,###"); // 3자리 마다 콤마를 찍어주는 것이다.
	
	StringBuilder sb = new StringBuilder();
	sb.append( super.getId()+"\t");
	
	String str_star = "";
	for(int i=0; i<super.getPasswd().length()-4; i++) {
	str_star += "*";
	}
	sb.append(super.getPasswd().substring(0, 4) + str_star +"\t");
	
	sb.append(super.getName()+"\t");
	sb.append(getGender()+"\t");
	sb.append(getAge()+"\t");
	sb.append(super.getRegister_day()+"\t");
	sb.append(df.format(hope_money)+"만원");
	
	return sb.toString();
	}
	
	
	


	@Override	//정보출력 메서드
	public String toString() {
	
	DecimalFormat df = new DecimalFormat("#,###"); // 3자리 마다 콤마를 찍어주는 것이다.
	
	String info = "1.아이디 : "+super.getId()+"\n"
	+ "2.비밀번호 : "+super.getPasswd()+"\n"
	+ "3.성명 : "+super.getName()+"\n"
	+ "4.주민번호 : "+jubun+"\n"
	+ "5.희망연봉 : "+df.format(hope_money)+"원\n" ;
	
	return info;
	}// end of public String toString()---------------------------

	
	@Override
	public void view_dater(Member[] mbr_arr) {
		int company_count = 0;
		
		for(int i=0; i<Member.count; i++) {
			if( mbr_arr[i] instanceof Company ) {
				company_count++;
			}
		}// end of for------------------------------
		
		
		if(company_count == 0) { 
			System.out.println(">> 구인회사로 등록된 회사가 한개도 없습니다. <<\n");
		}
		
		else {
			
			System.out.println("======================================\n"
					         + "회사명    업종    사업자등록번호    자본금\n"
					         + "======================================");
			
			StringBuilder sb = new StringBuilder();
			
			// 1. 첫번째 방법
		/*	
			for(int i=0; i<Member.count; i++) {
			
				if(mbr_arr[i] instanceof Company) {
				//	sb.append(mbr_arr[i].toString()+"\n");
				//  또는	
					sb.append(mbr_arr[i]+"\n");
				}
			}
			System.out.println(sb.toString());
		*/	
			
			// 2. 두번째 방법
			DecimalFormat df = new DecimalFormat("#,###");
			
			for(int i=0; i<Member.count; i++) {
				if(mbr_arr[i] instanceof Company) {
					sb.append(mbr_arr[i].getName()+"\t"+
						      ((Company)mbr_arr[i]).getJobType()+"\t"+
						      ((Company)mbr_arr[i]).getBusiness_number()+"\t"+
						      df.format(((Company)mbr_arr[i]).getSeedMoney())+"원\n");
				}
			}
			System.out.println(sb.toString());
			
		}
	}//end of Viewdater
	// === 구인회사의 정보를 보여주는 미완성 메소드(추상 메소드)를 일반 메소드로 구현하기 ===
	@Override
	public String view_info() {
		
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		return super.getName()+"\t"+this.getGender()+"\t"+this.getAge()+"\t"+df.format(hope_money);
		
		
	}
		
		
		
	

}
