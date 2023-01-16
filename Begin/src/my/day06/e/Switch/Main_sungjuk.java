package my.day06.e.Switch;

public class Main_sungjuk {

	public static void main(String[] args) {
		Sungjuk lssSj = new Sungjuk();
		lssSj.hakbun = "091234";
		lssSj.name = "이순신";
		lssSj.kor = 80;
		lssSj.eng = 80;
        lssSj.math = 80;
        
        System.out.println( "1.총점 : " + lssSj.total() +"\n"
        				+	"2.평균 : " + lssSj.avg() +"\n"
        				+	"3.평균 : " + lssSj.grade()+"\n"
        				+ 	"4.상품 : " + lssSj.gift());
        /*
         	상품
         	학점이 "A" 이라면 "놀이공원이용권, 치킨, 피자, 아이스크림"
         	학점이 "B" 이라면 "치킨,피자,아이스크림"
         	학점이 "C" 이라면 "피자,아이스크림"
         	학점이 "D" 이라면 "아이스크림"
         	학점이 "F" 이라면 "꿀밤3대"
         */
	}

}
