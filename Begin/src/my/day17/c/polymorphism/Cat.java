package my.day17.c.polymorphism;

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
}
