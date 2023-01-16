package my.day17.c.polymorphism;
/*
	---------------------------------------------------------------------------------------------------------------------------
	접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	--------------------------------------------------------------------------------------------------------------------------- 
	public                                    O                    O                         O                        O  
	protected                                 O                    O                         O                        X
	default                                   O                    O                         X                        X
	private                                   O                    X                         X                        X
*/


public class Animal{

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
	
	public void cry() {
		
	}
	
		
	
}
