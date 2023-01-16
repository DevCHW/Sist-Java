package my.day05.a.scanner;

public class Sungjuk {
	
	String hakbun;//학번
	String name;	//성명
	int kor;	//국어
	int eng;	//영어
	int math;	//수학
	
	//기본생성자
	public Sungjuk(){
				
	}
	
	// 파라미터가 있는 생성자
	public Sungjuk(String hakbun,String name,int kor,int eng,int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
		
	}
	
	// 메소드
	void showInfo() {
		
		int total = kor+eng+math;
		double avg = (double)total/3;
		
		String hakjum = "";
		if(avg >= 90) {
			hakjum = "A";
		}
		else if (avg >= 80) {
			hakjum = "B";
		}
		else if (avg >= 70) {
			hakjum = "C";
		}
		else if (avg >= 70) {
			hakjum = "D";
		}
		else{
			hakjum = "F";
		}
		System.out.println("=== 이순신님 성적결과 ===\n"
				         + "1. 학번 : "+hakbun+"\n"
				         + "2. 성명 : "+name+"\n"
				         + "3. 국어 : "+kor+"\n"
				         + "4. 영어 : "+eng+"\n"
				         + "5. 수학 : "+math+"\n"
				         + "6. 총점 : "+total+"\n"
				         + "7. 평균 : "+avg+"\n"
				         + "8. 학점 : "+hakjum+"\n");
		
	}
	
}
