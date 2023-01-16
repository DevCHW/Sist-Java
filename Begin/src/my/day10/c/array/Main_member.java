package my.day10.c.array;

public class Main_member {

	public static void main(String[] args) {

		Member[] mbr_arr = new Member[10];
		
		for(int i=0; i<mbr_arr.length; i++) {
			System.out.println(mbr_arr[i]);
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.passwd = "qwer1234";
		mbr1.name = "이순신";
		Member.count++; // 1
		
		mbr_arr[0] = mbr1;
		
		Member mbr2 = new Member();
		mbr2.id = "eomjh";
		mbr2.passwd = "abcd0070";
		mbr2.name = "엄정화";
		Member.count++;	//2
		
		mbr_arr[1] = mbr2;
		
		Member mbr3 = new Member();
		mbr3.id = "chaew";
		mbr3.passwd = "qwer0070";
		mbr3.name = "차은우";
		Member.count++;	//3
		
		mbr_arr[2] = mbr3;
		
		Member mbr4 = new Member();
		mbr4.id = "jinhr";
		mbr4.passwd = "asdf1234";
		mbr4.name = "진혜린";
		Member.count++;	//4
		
		mbr_arr[3] = mbr4;
		
		Member mbr5 = new Member();
		mbr5.id = "jangjy";
		mbr5.passwd = "1234abc";
		mbr5.name = "장진영";
		Member.count++;	//5
		
		mbr_arr[4] = mbr5;
		
		// 모든 회원들에 대해서 회원정보를 출력하세요~~
		try {
			for(int i=0;i<Member.count;i++) {
				System.out.println(mbr_arr[i].showInfo());
			}//end of for------------
		}catch(NullPointerException e){
			System.out.println("");
		}
		
		
	}// end of main()-------------------------------

}
