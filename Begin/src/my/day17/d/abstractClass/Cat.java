package my.day17.d.abstractClass;

public class Cat extends Animal{

	// Cat만 가지는 field를 정의(추상화)
	private String color;
	// Cat만 가지는 mothod를 정의(추상화)

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null && !color.trim().isEmpty())
		this.color = color;
	}

	@Override
	public void show_info() {
		super.show_info();
		System.out.println("3. 피부색 : "+this.color+"색");
	}
	@Override
	public void cry() {
		System.out.println("고양이는 '야옹야옹' 하며 웁니다.\n");
	}
	
	public void jump() {
		System.out.println(">> 고양이는 점프를 합니다..<<\n");
	}

	@Override
//	protected String sleep() {	//자식클래스에서 메소드의 오버라이딩(재정의)를 할 때 접근제한자는
								//부모클래스의 접근제한자와 같든지 아니면 더 크게 허용해주는 접근제한자를 사용한다.
// 	또는	
	public String sleep() {
		return "강아지는 쌔근쌔근 잡니다.";
	}
}
