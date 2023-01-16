package my.day01;

public class Member {
	
	/*
	 	만약에 쇼핑몰 프로그램을 작성하고자 한다라면
	 	회원, 제품, 장바구니, 주문내역 부품이 필요할 것이다.
	 	여기서 필요로 하는 부품의 설계도면을 "클래스"	 	
	 */
	
	// 추상화          ==> 필요한 속성 및 기능만 뽑아내는 것을 말한다.
	// 회원가입(병원)    ==> 신장, 혈액형, 몸무게, 혈압
	// 회원가입(쇼핑몰)   ==> 아이디, 비밀번호, 성명, 이메일, 전화번호, 주소, 마일리지(포인트),....
	// attribute == property == field == 속성
	// method == function == operation
	
	/*
	 1). instance(인스턴스)변수 
        instance(인스턴스)변수를 다른말로 non static 변수라고도 한다.
        instance(인스턴스)변수는 서로 다른 instance 끼리 공유하지 못하고 
        각자 자기의 instance 내에서만 사용하는 것이다.   
        instance 는 클래스가 메모리(RAM)에 올라가서 실제 사용가능한 객체로 되어진 상태를 말한다.
	  
	 */
	
	String id; // String 은 문자열을 뜻하는 클래스(자료형)이다.
			   // id 라는 변수(변하는 수)에는 문자열이 들어온다는 뜻이다.
	String pwd; // 비밀번호
	String name; // 성명
	String email; // 이메일
	static String address;
	
	
	// id, pwd, name, email 은 "instance(인스턴스)변수" 라고 부른다.
	
	/*
	 2).static 변수
	 // static 변수는 동일한 클래스로 생성되어진 서로 다른 instance 들 끼리 공유하는 변수다.	    	 	
	 */
	
	
	/*
	 3). method 생성하기	 
	 */
	void showInfo(){
		System.out.println("=== " + name + "님의 정보출력 ===\n"
							+ "1. 아이디 : " + id +"\n"
							+ "2. 비밀번호 : " + pwd + "\n"
							+ "3. 성명 : " +name+ "\n"
							+ "4. 이메일 : " + email +"\n"
							+ "5. 주소 : " + Member.address);
	// \n은 줄바꿈을 말한다.
	// 문자열 사이의 + 는 문자열 결합을 뜻하는 것이다.
	}
	
}
