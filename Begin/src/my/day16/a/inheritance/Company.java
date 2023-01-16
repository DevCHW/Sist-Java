package my.day16.a.inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company extends Member {

	// field 생성
	private String business_number; 	//사업자등록번호(사업자등록번호는 맨 앞에 0이 들어올 수 있다는 전제하에 하겠습니다.그래서 String 타입으로 합니다.)
	private String jobType;				//회사직종타입(제조업, 서비스업, IT, ......)
	private long seedMoney;				//자본금
	
	static int count;    // Company 객체(인스턴스)의 개수를 알아오려는 용도
	
	// method 생성
	
	// getter, setter 하기

	public String getBusiness_number() {
		return business_number;
	}

	public void setBusiness_number(String business_number) {
		// 사업자등록번호는 오로지 숫자로만 들어와야 하며, 사업자등록번호의 길이는 10글자로 하겠습니다.
		
		
		// ==1. 정규표현식(Regular Expression) 패턴을 작성한다. ==//
		Pattern p = Pattern.compile("^[0-9]{10}$"); // return 타입 pattern
		// ^ 은 시작을 의미한다.
		// $ 는 끝을 의미한다.
		// [] 는 글자1개가 들어오는 것을 의미한다.
		//{10}은 반복되어지는 회수를 말하는데 10번 반복해야 한다는 말이다.
		
		
		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(business_number); //return 타입 match
		
		// == 3.판별하도록 한다. ==//
		boolean b = m.matches();
		
		if(b)
			this.business_number = business_number;
		else {
			System.out.println("[경고] 사업자등록번호는 숫자로 10글자만 입력해야 합니다.\n");
		}
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		if(!jobType.trim().isEmpty()) {
		this.jobType = jobType;
		}
		else {
			System.out.println("[경고] 회사직종군을 공백이 아닌 글자로 입력하셔야 합니다.\n");
		}
	}

	public long getSeedMoney() {
		return seedMoney;
	}

	public void setSeedMoney(long seedMoney) {
		if(seedMoney > 0) {
			this.seedMoney = seedMoney;
		}
		else {
			System.out.println("[경고] 자본금은 0 보다 커야 합니다.\n");
		}
	}
	
	
	@Override // @를 어노테이션(애노테이션)이라고 부른다. Overrride 어노테이션(애노테이션)은 부모클래스로 부터 상속받은 메서도의 내용을 싹 바꿀 때 쓰이는것이다.
	public void setName(String name) {
		
		if(name != null && !name.trim().isEmpty())
			super.input_name(name);
		else {
			System.out.println("[경고] 회사명은 공백만으로 되어지는 글자는 안됩니다.\n");
		}
	
	}
	
	
	
	@Override
	public String toString() {
		
		String info = "------"+super.getName()+"회사의 정보-------\n"
				    + "1.아이디 : "+super.getId()+"\n"
				    + "2.암호 : "+super.getPasswd()+"\n"
				    + "3.회사이름 : "+super.getName()+"\n"
				    + "4.직종 : "+this.getJobType()+"\n"
				    + "5.자본금 : "+this.getSeedMoney()+"\n";
		
		return info;
	}//end of toString()-----------------------------
	
	
	
	
		
	

	
}
