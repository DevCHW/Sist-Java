package my.day16.a.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Member {

	
	//field 생성
	private String id;       	 // 아이디
    private String passwd;       // 비밀번호 
	private String name;         // 성명
    private String register_day; // 가입일자
    
    // 생성자
    public Member() {
    	Date now = new Date();  // 현재시각
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	//	System.out.println("오늘날짜 : " + df.format(now));
		
		register_day = df.format(now);
    }
    //상속을 할때 부모클래스의 기본생성자는 무조건 자식클래스에서 호출이 되어진다.
    //레지스터 데이(가입일자)는 자동적으로 기입이 되어야 하므로, get,set 메서드에 넣지 않고 가장 상위 부모클래스의 기본생성자에 넣어둔다.
    
    //method 생성
    
    public String getId() {
    	return id;
    }
    public void setId(String id) {
    	if(id != null && !id.trim().isEmpty()) {
			this.id = id;
		}
		else {//id가 공백이거나 아무것도 입력을 하지 않았을 때
			System.out.println("[경고] 아이디는 공백이 아닌 글자로 입력하셔야 합니다. ");
		}
	}//public void setid(String id)
	
	
    
    public String getPasswd() {
//    	if(passwd == null)
//			return passwd;
//		else {
//			String str_star = "";
//			for(int i=0;i<passwd.substring(4).length();i++) {
//				str_star += "*";
//			}
//			
//			return passwd.substring(0,4) + str_star;
//		}
    	return passwd;
	}

    
    public void setPasswd(String passwd) {
    	if(MyUtil.checkPwd(passwd)) {
    		this.passwd = passwd;
    		}
    		else {
    			System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어져야만 합니다.!!");
    		}
    	}
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	//name 에는 한글만 허용하겠다.
		
		if(name ==null) {
			System.out.println("[경고] 성명은 공백이 아닌 글자로 입력하셔야 합니다.\n");
		}
		else {
			//정규표현식(Regular Expression)이란?
			//==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
			
			// ==1. 정규표현식(Regular Expression) 패턴을 작성한다. ==//
			Pattern p = Pattern.compile("^[가-힣]{2,5}"); // return 타입 pattern
			// ^ 은 시작을 의미한다.
			// $ 는 끝을 의미한다.
			// [] 는 글자1개가 들어오는 것을 의미한다.
			//{2,5}은 반복되어지는 회수를 말하는데 2번 또는 3번 또는 4번 또는 5번 까지를 허용한다는 말이다.
			
			
			// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
			Matcher m = p.matcher(name); //return 타입 match
			
			// == 3.판별하도록 한다. ==//
			boolean b = m.matches();
			
			if(b)
				this.name = name;
			else
				System.out.println(">> 성명은 공백없이 한글로만 2글자 부터 5글자 이내로만 가능합니다. <<");
		}
	}
    public String getRegister_day() {
    	return register_day;
    
    }
    
    public void input_name(String name) {
    	this.name = name;
    }

    
    
    
}
