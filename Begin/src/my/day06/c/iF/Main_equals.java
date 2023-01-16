package my.day06.c.iF;

public class Main_equals {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		if(n1 ==n2) {
			//원시형(primitive) 데이터 사이에서 == 는 값을 비교하는 것이다.
			System.out.println(n1 + " 는(은) " + n2 + "과(와) 같습니다.");
		}
		else {
			System.out.println(n1 + "는(은)" +n2 +"과(와) 값이 같지 않습니다.");			
		}
		//10는(은) 20과(와) 값이 가지 않습니다.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Member mbr1 = new Member();
		
		Member mbr2 = new Member();
		
		
		
		System.out.println("mbr1 =>" + mbr1);
		//mbr1 =>my.day06.c.if.Member@15db9742
		
		System.out.println("mbr2 =>" + mbr2);
		//mbr2 =>my.day06.c.if.Member@6d06d69c
		
		if(mbr1 ==mbr2) {
			//객체 사이에서 == 는 메모리상에 올라가 있는 주소를 비교하는 것이다.
			System.out.println(mbr1 + " 는(은) " + mbr2 + "과(와) 메모리상의 주소가 같습니다.");
		}
		else {
			System.out.println(mbr1 + "는(은)" +mbr2 +"과(와) 메모리상의 주소가 같지 않습니다.");			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String name1 = new String("엄정화");
		String name2 = new String("엄정화");
		
		System.out.println("name1 =>" +name1);
		// name1 => 엄정화
		System.out.println("name2 =>" +name2);
		// name2 => 엄정화
		
		if(name1 ==name2) {
			// 객체 사이에서 ==는 메모리상에 올라가 있는 주소를 비교하는 것이다.
			System.out.println(name1 + " 는(은) " + name2 + "과(와) 메모리상에 올라가 있는 주소가 같습니다.");
		}
		else {
			System.out.println(name1 + "는(은)" +name2 +"과(와) 메모리상에 올라가 있는 주소가 같지 않습니다.");			
		}
		// 엄정화는(은)엄정화과(와) 값이 같지 않습니다.
		
		if(name1.equals(name2)) {
			// String name1 객체의 값("엄정화")과 String name2 객체의 값("엄정화")이 같으면 true
			// String name1 객체의 값("엄정화")과 String name2 객체의 값("엄정화")이 같지 않으면 false
			System.out.println(name1 +" 의 값과 "+name2 + " 의 값은 같습니다.");			
		}
		else {
			System.out.println(name1 +" 의 값과 "+name2 + " 의 값은 같지 않습니다.");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String name3 = "이순신";
		String name4 = "이순신";
		
		if(name3 == name4) {
			
			// name3 과 name4 생성시 new String()을 사용하지 않고 막바로 값을 넣었을 경우에는
			// name3 == name4 는 값을 비교하는 것이다.
			// 이것은 값을 비교하는 것이지만 권장하지는 않는다.
			
			System.out.println(name3 +" 의 값과 "+name4 + " 의 값은 같습니다.");			
		}
		else {
			System.out.println(name3 +" 의 값과 "+name4 + " 의 값은 같지 않습니다.");
		}
		
		if(name3.equals(name4)) { //String의 값을 비교할때는 이것을 권장한다.!!!!!
			
			// name3 과 name4 생성시 new String()을 사용하지 않고 막바로 값을 넣었을 경우에는
			// name3 == name4 는 값을 비교하는 것이다.
			// 이것은 값을 비교하는 것이지만 권장하지는 않는다.
			
			System.out.println(name3 +" 의 값과 "+name4 + " 의 값은 같습니다.");			
		}
		else {
			System.out.println(name3 +" 의 값과 "+name4 + " 의 값은 같지 않습니다.");
		}
		// 이순신의 값과 이순신의 값은 같습니다.
		
		// !!!! 주의 !!!! //
		String name5 = "강동원";
		String name6 = null;
		
		if(name5.equals(name6)) {
			System.out.println(name5 + "의 값과 "+name6 + "의 값은 같습니다.");
		}
		else {
			System.out.println(name5 + "의 값과 " +name6 + "의 값은 같지 않습니다.");
		}
		
		
		/*
		if(name6.equals(name5)) { // name6 이 null 이므로 NullPointerException 오류가 발생함.
			System.out.println(name5 + "의 값과 "+name6 + "의 값은 같습니다.");
		}
		else {
			System.out.println(name5 + "의 값과 " +name6 + "의 값은 같지 않습니다.");
		}
		*/
		/*
		if("호호".equals(null)) {
			//이것은 오류가 아님.
		}
		
		if(null.equals("하하")) {
			//이것은 오류임.
		}
		
		그러므로 상수값.equals(변수)와 같이 사용해야 하지
			  변수.equals(상수값)와 같이 사용할 경우 변수에 null 이 들어올 확률이 있으므로
			  이것은 별로 좋지 않은 방법이다.
		*/
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String name7 = "마동석"; // name7 = "마동석"; name7 = null; name7 = "마동석";
		String name8 = null; //   name8 = null;   name8 = "마동석"; name8 = "마동석";
		
		
		if( (name7 == null && name8 == null) || (name7!=null && name7 == name8)) {
			System.out.println(name7 + "의 값과 "+name8 + "의 값은 같습니다.");
		}
		else {
			System.out.println(name7 + "의 값과 "+name8 + "의 값은 같지 않습니다.");
		}
		System.out.println("\n========================================\n");
		mbr1.id = "kangdw";
		mbr1.name = "강동원";
		mbr1.pwd = "qwer1234";
		
		mbr2.id = "mads";
	//	mbr2.pwd = "abcd0070";
		mbr2.name = "마동석";
		mbr2.email = "mads@gmail.com";
		
		boolean bool = false;
		
		if(mbr1.pwd ==null && mbr2.pwd == null)
			bool = true;
		
		else if(mbr1.pwd != null && mbr1.pwd.equals(mbr2.pwd)) 
			bool = true;
		
		else if(mbr2.pwd != null && mbr2.pwd.equals(mbr1.pwd)) 
			bool = true;
		
		else 
			bool = false;
		
		
		if(bool) {
			System.out.println("id가 kangdw 인 회원의 비밀번호와 id가 mads 인 회원의 비밀번호는 같습니다.");
			System.out.println("#########################################################");
		}
		else {
			System.out.println("id가 kangdw 인 회원의 비밀번호와 id가 mads 인 회원의 비밀번호는 다릅니다.");
			System.out.println("---------------------------------------------------------");
		}
		//id가 kangdw 인 회원의 비밀번호와 id가 mads 인 회원의 비밀번호는 일치합니다.
		if(mbr1.name ==null && mbr2.name == null)
			bool = true;
		
		else if(mbr1.name != null && mbr1.name.equals(mbr2.name)) 
			bool = true;
		
		else if(mbr2.name != null && mbr2.name.equals(mbr1.name)) 
			bool = true;
		
		else 
			bool = false;
		
		
		if(bool) {
			System.out.println("id가 kangdw 인 회원의 성명과 id가 mads 인 회원의 성명은 서로 같습니다.");
			System.out.println("#########################################################");
		}
		else {
			System.out.println("id가 kangdw 인 회원의 성명과 id가 mads 인 회원의 성명은 서로 다릅니다.");
			System.out.println("---------------------------------------------------------");
		}
		
		
		
		//id가 kangdw 인 회원의 성명과 id가 mads 인 회원의 성명은 서로 다릅니다.
		
		if(mbr1.email ==null && mbr2.email == null){
			bool = true;
		}
		else if(mbr1.email != null && mbr1.email.equals(mbr2.email)) {
			bool = true;
		}
		else if(mbr2.email != null && mbr2.email.equals(mbr1.email)) {
			bool = true;
		}
		else {
			bool = false;
		}
		
		if(bool) {
			System.out.println("id가 kangdw 인 회원의 email과 id가 mads 인 회원의 email은 서로 같습니다.");
			System.out.println("#########################################################");
		}
		else {
			System.out.println("id가 kangdw 인 회원의 email과 id가 mads 인 회원의 email은 서로 다릅니다.");
			System.out.println("---------------------------------------------------------");
		}
		
		
		
		
		//id가 kangdw 인 회원의 이메일과 id가 mads 인 회원의 이메일은 서로 다릅니다.
		
		
		
	}

}
