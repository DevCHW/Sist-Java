package my.day13.b.stringbuilder;

public class Main_stringbuilder {

	public static void main(String[] args) {
		
		String name ="일순신";	// 메모리상에 name 1개 소모
		
		name += ",이순신";		// 메모리상에 name 1개 소모
		name += ",삼순신";		// 메모리상에 name 1개 소모
		name += ",사순신";		// 메모리상에 name 1개 소모
		name += ",오순신";		// 메모리상에 name 1개 소모
		name += ",육순신";		// 메모리상에 name 1개 소모
		name += ",칠순신";		// 메모리상에 name 1개 소모
		name += ",팔순신";		// 메모리상에 name 1개 소모
		name += ",구순신";		// 메모리상에 name 1개 소모
		
		// 누적되어진 메모리상의 name 은 9개가 소모된다고 한다.
		
		System.out.println(name);
		//일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		StringBuilder sb = new StringBuilder();// 단일 스레드(Single thread)에서만 사용되어지므로 주로 Web에서 많이 쓰인다.
//		StringBuilder 가 StringBuffer 보다 상대적으로 좀 더 가볍다.
//		StringBuffer sb = new StringBuffer(); // 단일 스레드(Single thread) 및 다중 스레드(Multi thread)를 지원해주므로 주로 게임용에서 많이 쓰인다.
											//StringBuffer 와 StringBuilder 는 사용방법이 같다.
		
		sb.append("일순신");
		sb.append(",이순신");
		sb.append(",삼순신");
		sb.append(",사순신");
		sb.append(",오순신");
		sb.append(",육순신");
		sb.append(",칠순신");
		sb.append(",팔순신");
		sb.append(",구순신");
		
		System.out.println(sb.toString());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// StringBuilder 의 초기화 하는 첫번째 방법
//		sb = new StringBuilder();
		
		// StringBuilder 의 초기화 하는 두번째 방법
		sb.setLength(0); // 길이를 0 으로 하면 된다.
		
		sb.append("일미자");
		sb.append(",이미자");
		sb.append(",삼미자");
		sb.append(",사미자");
		sb.append(",오미자");
		
		System.out.println(sb.toString());
		
		String str = "안녕하세요";
		
		char[] ch_arr = str.toCharArray();
		String result ="";
		
		for(int i=ch_arr.length-1;i>=0;i--) {
			result += ch_arr[i];
		}
		System.out.println(result);
		//"요세하녕안"
		
		// === StringBuilder 를 사용하여 문자열을 거꾸로 만들기 ===
		sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
		//"요세하녕안"
		
		// === StringBuilder 를 사용하여 특정위치에 존재하는 문자열을 다른 문자열로 바꾸기 ===
		str = "안녕하세요? 호호호 안녕하십니까? 안녕히 가세요~~";
		// str 변수에 들어있는 두번째 "안녕"을 "Hello" 로 바꾸기
		
		sb = new StringBuilder(str);
		System.out.println(sb.replace(11, 13, "Hello").toString());
		//안녕하세요? 호호호 Hello하십니까? 안녕히 가세요~~
		//sb.replace(11, 13, "Hello")은 sb에 저장된 문자열인 "안녕하세요? 호호호 안녕하십니까? 안녕히 가세요~~"의
		//index 11부터 index 13 바로 앞까지 인 문자열인 "안녕"을 지우고 그 자리에 "Hello" 로 넣어서 바꾼다는 말이다.
		
	}// end of main()----------------------

}
