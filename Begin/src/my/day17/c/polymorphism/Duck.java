package my.day17.c.polymorphism;

public class Duck extends Animal{

	// Duck만 가지는 field를 정의(추상화)
	private int price;
	// Duck만 가지는 mothod를 정의(추상화)

	public int getPrice() {
		return price;
	}

	//메소드의 오버라이딩(재정의)
	@Override
	public void show_info() {
		super.show_info();
		System.out.println("3. 가격 : "+this.price+"원");
	}

	public void setPrice(int price) {
		if(price >0)
			this.price = price;
	}
	@Override
	public void cry() {
		System.out.println("오리는 '꽥꽥' 하며 소리를 냅니다.\n");
	}
	public void swim() {
		System.out.println(">> 오리는 물가에서 헤엄을 칩니다.<<\n");
	}
	
}
