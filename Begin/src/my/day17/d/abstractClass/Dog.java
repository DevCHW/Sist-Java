package my.day17.d.abstractClass;

public class Dog extends Animal{

	//Dog 만 가지는 field 를 정의 (추상화)
	private int weight;

	
	
	@Override
	public void show_info() {
		// TODO Auto-generated method stub
		super.show_info();
		System.out.println("3.체중 : "+this.weight+"kg");
	}

	//Dog 만 가지는 mothod 를 정의 (추상화)
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight>0)
		this.weight = weight;
	}
	@Override
	public void cry() {
		System.out.println("강아지는 '멍멍' 하며 짖습니다.\n");
	}
	public void run() {
		System.out.println(">> 강아지는 빠르게 달립니다.<<\n");
	}

	@Override
	public String sleep() {// 자식클래스에서 메소드의 오버라이딩(재정의)를 할 때 접근제한자는
							//자기자신또는 더 넓은범위 가능!
		return "";
	}


}

