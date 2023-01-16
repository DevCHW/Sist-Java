package my.day10.d.array;

public class Member {

	// field
	String id;
	String passwd;
	String name;
	
	static int count; //Member 클래스 객체(인스턴스)를 생성한 개수를 알려주고자 하는 용도 
	
	// method
	String showInfo() {
		return "1.아이디 : " + id +"\n"
			 + "2.비밀번호 : " + passwd +"\n"
			 + "3.성명 : " + name  +"\n";
		
		
		
		
		
		
		
	}//end of showInfo()---------------------------------------
	
	
}
