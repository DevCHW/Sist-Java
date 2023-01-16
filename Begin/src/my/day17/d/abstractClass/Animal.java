package my.day17.d.abstractClass;
/*
	---------------------------------------------------------------------------------------------------------------------------
	접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	--------------------------------------------------------------------------------------------------------------------------- 
	public                                    O                    O                         O                        O  
	protected                                 O                    O                         O                        X
	default                                   O                    O                         X                        X
	private                                   O                    X                         X                        X
*/


//public abstract class Animal{ // 미완성 클래스( == 추상 클래스, abstract class)
//또는
abstract public class Animal{ // 미완성 클래스( == 추상 클래스, abstract class)
	
/*
    미완성 메소드(== 추상메소드, abstract method)가 있는 클래스는 
    반드시 미완성 클래스(== 추상 클래스, abstract class)로 만들어야 한다.  
    왜 미완성 메소드(== 추상메소드, abstract method)를 만들까요?
    왜냐하면 자식클래스에서 메소드를 오버라이딩(==재정의)를 하기 때문에 
    부모클래스에서는 메소드를 정의할 필요가 없으므로 미완성 메소드로 만들어 버린다.
    
    일반적으로 부모클래스를 미완성 클래스(== 추상 클래스, abstract class)로 만든다.
    
     미완성 클래스(== 추상 클래스, abstract class)를 사용하여 객체(인스턴스)를 생성할 수 없다.          
*/	

	//Dog, Cat, Duck 의 공통 field (추상화)
	private String name;
	private int birthyear;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		if(name != null && !name.trim().isEmpty())
			this.name = name;
		
	}
	protected int getBirthyear() {
		return birthyear;
	}
	protected void setBirthyear(int birthyear) {
		if(birthyear !=0)
			this.birthyear = birthyear;
	}
	
	//Dog, Cat, Duck 의 공통 method(기능) (추상화)
	
	// == 동물들(강아지, 고양이, 오리)의 정보를 출력해주는 메소드 ==//

	public void show_info() {
		System.out.println("=== 동물정보 ===\n"
						 + "1.성명 : " + name+"\n"
						 + "2.생년 : " + birthyear+"년"
						 );
	}
	
//	public abstract void cry();	//미완성 메소드(== 추상메소드, abstract method)
//  또는	
	abstract public void cry();	//미완성 메소드(== 추상메소드, abstract method)
	
	protected abstract String sleep();//미완성 메소드(== 추상메소드, abstract method)
		
	
}
