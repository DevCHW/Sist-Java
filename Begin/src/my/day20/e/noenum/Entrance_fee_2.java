package my.day20.e.noenum;

public class Entrance_fee_2 {

	//filed
	public static final Entrance_fee_2 CHIlD = new Entrance_fee_2(0);
	public static final Entrance_fee_2 TEENAGER = new Entrance_fee_2(150);
	public static final Entrance_fee_2 ADULT = new Entrance_fee_2(300);
	public static final Entrance_fee_2 OLD = new Entrance_fee_2(100);
	
	private final int FEE;
	// 외부에서 FEE 에 접근하지 못하도록 접근제한자에 private 을 준다.
	
	public Entrance_fee_2(int fee) {
	// 생성자의 접근제한자에 private 을 주어서 외부에서 객체 생성을 못하도록 막아버린다.
		this.FEE = fee;
	}
	
	public int getFee() {
	// 외부에서 FEE 값을 읽을 수 있도록 접근제한자를 public 으로 준다.
		return FEE;
	}

}
