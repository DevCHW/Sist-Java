package my.day18.f.exception;

public class Product {

	//field
	private String prod_name;//제품명("새우깡" "감자깡" "양파링")
	private int    jango;    //잔고 (100		50		150)
	
	
	//method
	public String getProd_name() {
		return prod_name;
	}
	
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	public int getJango() {
		return jango;
	}
	
	public void setJango(int jango) {
		this.jango = jango;
	}
	
	
	//제품의 정보를 보여주는 메소드 생성
	public void info() {
		System.out.println("1.제품명 : " + prod_name + "\n"
						 + "2.잔고량 : " + jango + "개");
	}
	
	// 주문을 받는 메소드 생성1
	public void order(int jumun_su) throws Jango_lack_Exception {
	// order(int jumun_su)은 파라미터로 들어오는 jumun_su 의 값에 따라서
	// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발할 수 있다는 말이다.
		
		if(jango < jumun_su) {
			//잔고량이 주문량보다 부족할 시 Jango_lack_Exception 익셉션을 유발 시켜야 한다.
			throw new Jango_lack_Exception();
		}
		else {
			jango -= jumun_su;
			System.out.println(prod_name + " 제품을 " + jumun_su + "개를 주문하셨습니다.");
		}
	}
	
	// 주문을 받는 메소드 생성2
	public void order_2(int jumun_su) throws Jango_lack_Exception {
		// order_2(int jumun_su)은 파라미터로 들어오는 jumun_su 의 값에 따라서
		// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발할 수 있다는 말이다.
			
			if(jango < jumun_su) {
				//잔고량이 주문량보다 부족할 시 Jango_lack_Exception 익셉션을 유발 시켜야 한다.
				throw new Jango_lack_Exception(">> "+prod_name+"의 잔고가 "+jango+"개 인데 주문량이 "+jumun_su+"개라서 잔고부족으로 주문이 불가합니다. <<");
			}
			else {
				jango -= jumun_su;
				System.out.println(prod_name + " 제품을 " + jumun_su + "개를 주문하셨습니다.");
			}
		}
	
	
	///////////////////////////////////////////////////////////////////////////////
	// 주문을 받고서 제품의 정보를 보여주는 메소드 생성
	
	public void order_info(int jumun_su) throws Jango_lack_Exception {
		order_2(jumun_su);
		info();
	
	}
	
}
