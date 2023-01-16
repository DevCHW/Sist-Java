package my.day18.f.exception;

public class Main {

	public static void main(String[] args) {

		Product[] prod_arr = new Product[3];
		
		prod_arr[0] = new Product();
		prod_arr[0].setProd_name("새우깡");
		prod_arr[0].setJango(100);
		
		
		prod_arr[1] = new Product();
		prod_arr[1].setProd_name("감자깡");
		prod_arr[1].setJango(50);
		
		
		prod_arr[2] = new Product();
		prod_arr[2].setProd_name("양파링");
		prod_arr[2].setJango(150);
		
		System.out.println("~~~~ 주문 전 정보출력 ~~~~~~");
	
		//각 제품의 정보를 출력한다.
		for(Product prod : prod_arr) {
			prod.info();
		}//end of for--
		
		//각 제품마다 80개를 주문을 받는다.
		for(Product prod : prod_arr ) {
			try {
				prod.order(80);
			} catch (Jango_lack_Exception e) {
				// 
				e.printStackTrace();
				System.out.println("오류메시지 : "+ e.getMessage());
			}
		}//end of for--
		
		System.out.println("\n~~~~ 주문 후 정보출력 ~~~~~~\n");
	
		//각 제품의 정보를 출력한다.
		for(Product prod : prod_arr) {
			prod.info();
		}//end of for--
		
		
		System.out.println("\n=======================================================\n");
		
		prod_arr[0].setJango(100);
		prod_arr[1].setJango(50);
		prod_arr[2].setJango(150);
		
		//각 제품마다 80개를 주문을 받는다.
			for(Product prod : prod_arr ) {
				try {
					prod.order_2(80);
				} catch (Jango_lack_Exception e) {
					// 
					e.printStackTrace();
					System.out.println("오류메시지 : "+ e.getMessage());
				}
			}//end of for--
			
		//각 제품의 정보를 출력한다.
		for(Product prod : prod_arr) {
			prod.info();
		}//end of for--
		
		
		System.out.println("\n=======================================================\n");

		prod_arr[0].setJango(100);
		prod_arr[1].setJango(50);
		prod_arr[2].setJango(150);
		
		//각 제품마다 80개를 주문을 받고서 바로 제품의 정보를 보여준다..
			for(Product prod : prod_arr ) {
				try {
					prod.order_info(80);
				} catch (Jango_lack_Exception e) {
//					System.out.println("ㅜㅜ 잔고가 부족하네요 ㅜㅜ");
//					System.out.println(e.getMessage());
					System.out.println("오류발생 =>"+prod.getProd_name()+"의 현재잔고는 "+prod.getJango()+", 주문량은 80개 라서 주문이 불가합니다.");
				}
			}
		
		
	}//end of main()---
}
