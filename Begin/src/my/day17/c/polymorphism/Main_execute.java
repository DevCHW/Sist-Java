package my.day17.c.polymorphism;

public class Main_execute {
	// >>> 다형성(Polymorphism) <<< 
   // ==> 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술.
   // 자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성(Polymorphism)이다.	//필수암기 !!!!

	public static void main(String[] args) {

		Animal[] ani_arr = new Animal[5];
		
		Dog dog = new Dog();
//		Animal dog = new Dog();		//가능
//		ani_arr[0] = new Dog(); 	//가능
		
		dog.setName("뽀삐");
		dog.setBirthyear(2010);
		dog.setWeight(5);
		ani_arr[0] = dog;
		
		
		Cat cat = new Cat();
//		Animal cat = new Cat();		//가능
//		ani_arr[1] = new Cat(); 	//가능
		
		cat.setName("톰");
		cat.setBirthyear(2017);
		cat.setColor("검정");
		ani_arr[1] = cat;
		
		
		Duck duck = new Duck();
//		Animal duck = new Duck();	//가능
//		ani_arr[2] = new Duck(); 	//가능
		
		duck.setName("도날드");
		duck.setBirthyear(2018);
		duck.setPrice(5000);
		ani_arr[2] = duck;
		
		for(int i=0; i<ani_arr.length; i++) {
			
			if(ani_arr[i] != null) {
				ani_arr[i].cry();
			}
			
		}// end of for------
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=0;i<ani_arr.length;i++) {
			if(ani_arr[i] != null) {
				if(ani_arr[i] instanceof Dog) {
					//ani_arr[i] 저장소에 들어있는 instance(객체)가 Dog 라는 클래스로 만든 instance(객체) 입니까?
					
					((Dog)ani_arr[i]).run();
					
				}
				else if(ani_arr[i] instanceof Duck) {
					// ani_arr[i] 저장소에 들어있는 instance(객체)가 Duck 라는 클래스로 만든 instance(객체) 입니까?
					((Duck)ani_arr[i]).swim();
				}
					
					
			}
		}//end of for------
		
		
		
	}
	
	
	
}
