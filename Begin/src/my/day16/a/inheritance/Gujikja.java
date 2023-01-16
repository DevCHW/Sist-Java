package my.day16.a.inheritance;

import java.text.DecimalFormat;
import java.util.Calendar;

import my.util.MyUtil;

public class Gujikja extends Member{//Member 클래스가 Gujikja 클래스의 부모 클래스가 된다.
									//Gujikja 클래스는 Member 클래스의 자식 클래스가 된다.
									//Gujikja 클래스와 Member 클래스는 상속관계에 있다라고 본다.
	
	// field 생성
    private String jubun;        // 주민번호인데 앞자리6자리에 성별을 나타내는 1자리까지만 입력한다.
    							// 예: "9506201" "9607202"  "0006203"  "0106204"  "1106204"
	
    private int hope_money;
    
    
	static int count;    		// Gujikja 객체(인스턴스)의 개수를 알아오려는 용도
	
	
	// 기본생성자
	public Gujikja() {
		
	}

	public String getJubun() {
		return jubun;
	}


	public void setJubun(String jubun) {
		if(MyUtil.checkJubun(jubun)) {
			this.jubun = jubun;
		}
		else {
			System.out.println("[경고] 주민번호를 올바르게 넣으세요!!\n 예>9510201\n");
		}
	}


	
	// method 생성
	
	//getter,setter 만들기
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
		DecimalFormat df = new DecimalFormat("#,###");	// 3자리 마다 콤마를 찍어주는 것이다.
		
		// eomjh   qWer*****    엄정화   여      27 	가입일자
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.getId()+"\t");
		
		String str_star = "";
		for(int i=0; i<super.getPasswd().length()-4; i++) {
			str_star += "*";
		}
		sb.append(getPasswd().substring(0, 4) + str_star +"\t");
		
		sb.append(getName()+"\t");
		sb.append(getGender()+"\t");
		sb.append(getAge()+"\t");
		sb.append(super.getRegister_day()+"\t");
		sb.append(df.format(hope_money)+"만원");
		
		return sb.toString();
	}
	
	
	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("#,###");	// 3자리 마다 콤마를 찍어주는 것이다.
		
		String info ="\n--------"+super.getName()+"님의 정보---------\n" 
				     +"1.아이디 : "+ super.getId()+"\n"
				     +"2.비밀번호 : "+ super.getPasswd()+"\n"
				     +"3.성명 : "+super.getName()+"\n"
				     +"4.주번 : "+this.getJubun()+"\n"
				     +"5.희망연봉 : "+df.format(this.getHope_money())+"원\n";
		return info;
	}//end of toString()-----------------------------
	
	
}
