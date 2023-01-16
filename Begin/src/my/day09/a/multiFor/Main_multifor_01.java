package my.day09.a.multiFor;

public class Main_multifor_01 {

	public static void main(String[] args) {

		
		char ch= 'a';
		for(int i=0; i<'u'-'a'+1;i++) {
			System.out.print(ch++);
			if((i+1)%7==0) {
				System.out.println();
			}
		}//end of for-------------
		
		//다중 for문에 대해서 알아봅니다.
		
				/*
				  	abcdefg
				  	hijklmn
				  	opqrstu
				 */
		ch = 'a';
		
		System.out.println("\n==========================================\n");
		for(int i = 0; i<3; i++) {// 바깥 for 문 ==> 행 3행
			
			for(int j=0; j<7; j++) {// 내부 for 문 ==> 열 7열
				System.out.print(ch++);
			}
			System.out.println();
		}//end of for--------------------
		
		System.out.println("\n==========================================\n");
		/*
		 	[0,0][0,1][0,2]		4행3열
		 	[1,0][1,1][1,2]
		 	[2,0][2,1][2,2]
		 	[3,0][3,1][3,2]
		 */
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print("["+i+","+j+"]");
				
			}// end of for--------------
			System.out.println();
		}// end of for----------------
		
		System.out.println("\n==========================================\n");

		
		/*
	 	[0,0][0,1][0,2]		4행3열인데
	 	[1,0][1,1][1,2]
	 	[2,0][2,1][2,2]
	 */
		for(int i=0; i<4; i++) {
			if(i == 2) {	
				continue;	//continue; 를 만나면 아래로 내려가지 않고 반복문의 증감식으로 이동하는 것.
			}
				for(int j=0; j<3; j++) {
					System.out.print("["+i+","+j+"]");
				}// end of for--------------
				System.out.println();
			}// end of for----------------
		
		System.out.println("\n==========================================\n");
		
		/*
		 	[0,0][0,2]	4행3열 인데 2열은 하지말고 건너띄어라 라고 하겠습니다.
		 	[1,0][1,2]	
		 	[2,1][2,2]
		 	[3,1][3,2]
		 */
		for(int i=0; i<4; i++) {
				for(int j=0; j<3; j++) {
					if(j==1) {
						continue;	//continue; 를 만나면 아래로 내려가지 않고 반복문의 증감식으로 이동하는 것.
					}
					System.out.print("["+i+","+j+"]");
				}// end of for--------------
				System.out.print("\n");
			}// end of for----------------
		System.out.println("\n==========================================\n");
		
		
		System.out.println("안녕하세요\t내일\t또뵐께요~~");
		//	"\t" 이 키보드의 탭이다.
		
		/*
		 		501호	502호	503호	505호
		 		301호	302호	303호	305호
		 		201호	202호	203호	205호
		 		101호	102호	103호	105호
		 */
		
		//5행 5열인데 4층라인은 하지말고 건너띄고 4호라인은 하지말고 건너띄어라는 말이다.
		
		for(int i=5; i>0; i--) {
			if(i==4) {
				continue;
			}//end of for---------------
			for(int j=1; j<6; j++) {
				if(j==4) {
					continue;
				}
				System.out.print(i+"0"+j+"호\t");
			}// end of for--------------
			System.out.print("\n");
		}// end of for----------------
		



		
	}//end of main-----

}
