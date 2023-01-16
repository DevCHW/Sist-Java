package my.day18.d.Interface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import my.util.MyUtil;
public abstract class Member implements Inter_Member{
	
	// field 생성
		private String id;           // 아이디
		private String passwd;       // 비밀번호 
		private String name;         // 성명(회사명, 개인성명)
		private String register_day; // 가입일자
		
		static int count;            // Gujikja 객체(인스턴스) 및 Company 객체(인스턴스)의 개수를 알아오려는 용도
		
		// 생성자
		public Member() {
		//	System.out.println(">>> 확인용 부모 클래스인 Member 클래스 생성자 호출됨.!!");
			
			Date now = new Date();  // 현재시각
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//	System.out.println("오늘날짜 : " + df.format(now));
			
			register_day = df.format(now);
		}
		
		
		// method 생성
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			
			if(id != null && !id.trim().isEmpty() ) {
				this.id = id;	
			}
			else {
				System.out.println("[경고] 아이디는 공백인 아닌 글자로 입력하셔야 합니다.\n");
			}
			
		}
		
		public String getPasswd() {
			return passwd;
		}
		
		public void setPasswd(String passwd) {
			
			if( MyUtil.checkPwd(passwd) ) {
				this.passwd = passwd;
			}
			else {
				System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다.\n");
			}
			
		}
		
		public String getName() {
			return name;
		}
		
		
		public void setName(String name) {
			
			// name 에는 한글만 허용하겠다.
			
			if(name == null ) { 
				System.out.println("[경고] 성명은 공백인 아닌 글자로 입력하셔야 합니다.\n");
			}
			else {
				// 정규표현식(Regular Expression)이란?
				// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
				
				// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
				Pattern p = Pattern.compile("^[가-힣]{2,5}$");
				// ^ 은 시작을 의미한다.
				// $ 는 끝을 의미한다.
				// [] 는 글자 1개가 들어오는 것을 의미한다.
				// {2,5} 은 반복되어지는 회수를 말하는데 2번 또는 3번 또는 4번 또는 5번 까지를 허용한다는 말이다.
				
				
				// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
				Matcher m = p.matcher(name);
				
				
				// == 3. 판별하도록 한다. == //
				boolean b = m.matches();
				
				if(b) 
					this.name = name;
				
				else 
					System.out.println(">> 성명은 공백없이 한글로만 2글자 부터 5글자 이내로만 가능합니다. <<\n");
				
			}
			
		}
		
		public String getRegister_day() {
			return register_day;
		}
		
		
		public void input_name(String name) {
			this.name = name;
		}
		
		abstract public String view_info();
		
}
