package my.day03.a.constructor;

import my.util.MyUtil;

 public class Member {	//미완성 메소드(추상 메소드를)가지는 클래스는 반드시 추상클래스가 되어야한다.
    	    
	//field, attribute, property, 속성
	String userid;
	String passwd;
	String name;
	int age;
	int point;
	
	
	// ***생성자(constructor) 및 생성자 오버로딩(Overloading) ***
	
	// 기본 생성자(constructor)는 생략되어져 있다.
	// 그런데 아래와 같이 파라미터(parameter)가 있는 생성자(constructor)를 만들어 주면 생략 되어져있던 기본 생성자는 삭제가 되어버린다.
	// 그래서 기본생성자가 필요할 경우 반드시 아래처럼 기본생성자를 만들어줘야 한다.
	
	//기본 생성자(constructor)
	
	public Member() {
		
	}
	
	// String userid 이러한 것을 파라미터(parameter) == 아규머트(argument) == 인자 == 인수 라고 부른다.
	// 파라미터(parameter) 가 있는 생성자(constructor)
	
	public Member(String userid, String passwd, String name, int age , int point) {
		// 지역변수명과 멤버변수(인스턴수변수 와 static 변수를 모두 지칭하는 것)
		// 일치할 경우에는 지역변수가 우선된다.
		// 이럴경우 지역변수와 멤버변수를 구븐을 지어주어야 한다.
		// 이때 사용하는 것이 this 이다.
		// this는 해당클래스(지금은 Member 클래스)로 생성되어진 instance(인스턴스)를 가리키는 대명사이다.
		// 그래서 this.필드명을 사용하면 바로 멤버변수를 가리키는 것이다.
		
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.point = point;
	}	
		
	// method, function, 기능, 행위
	// 파라미터는 없고 리턴타입이 있는 메소드 생성해보기
	String showInfo() {			
		return "==== " + name +" 님 ====\n"
			+"1. 아이디 : "+ userid +"\n"
			+"2. 비밀번호 : "+ passwd +"\n" 
			+"3. 성명 : "+ name +"\n"
			+"4. 나이 : "+ age +"세\n"
			+"5. 포인트 : "+ point +"Point\n";		
	}
	
	// 파라미터가 있고 리턴타입이 void 인 메소드 생성하기 
	void updateInfo(String passwd,String name, int age , int point) {
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.point = point;
	}
	
	void showInfo_2() {
		System.out.println("==== " + name +" 님 ====\n"
				 		+"1. 아이디 : "+ userid +"\n"
				 		+"2. 비밀번호 : "+ passwd +"\n"
						+"3. 성명 : "+ name +"\n"
						+"4. 나이 : "+ age +"세\n"
						+"5. 포인트 : "+ point +"Point\n"
						+"6. 실행종료시각 : "+MyUtil.currentTime()+"\n");		
		System.out.println(showInfo()
							+"6. 실행종료시각 : "+MyUtil.currentTime()+"\n");
	
	}//end of showInfo_2()
	
	

	
}
