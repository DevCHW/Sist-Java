package my.day04.b.scanner;

public class Main_Scanner6 {

	public static void main(String[] args) {
		
		// ★ 1. 문자열을 정수로 변환하기
		String str = "10";
		
		System.out.println(str+20);	//"1020" 문자열 10과 20을 더한거라서 결합.		
		System.out.println(Integer.parseInt(str)+20); // 30
		
		// ★ 2. 정수를 문자열로 변환하기 - 첫번째 방법
		int no = 40;
		System.out.println(no+50);	// 90 숫자+숫자라서 계산됨
		System.out.println(Integer.toString(no)+50);	//"40"+50==>"4050" int를 문자열로 변환했기때문에 4050이 나옴
		
		// ★ 3. 정수를 문자열로 변환하기 - 두번째 방법
		int num = 50;
		System.out.println(num + 40);	// 90
		System.out.println(String.valueOf(num)+40);		//"50"+40 ==>"5040"
	}

}
