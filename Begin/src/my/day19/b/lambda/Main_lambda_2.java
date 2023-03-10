package my.day19.b.lambda;

//람다식의 특징 개념정리한 메인클래스.
public class Main_lambda_2 {

	public static void main(String[] args) {
		
		System.out.println("=== 람다식(Lambda)을 사용하지 않은 것[무명(익명)클래스를 사용한 것] ===");
		
		Inter_functional_1 annoymous_obj = new Inter_functional_1() {

			@Override
			public void area(double x, double y, int type) {
				
				switch (type) {
					case 1:
						System.out.println("가로 "+x+", 세로 "+y+" 인 사각형 면적은 : "+(x*y));
						break;
						
					case 2:
						System.out.println("밑변 "+x+", 높이 "+y+" 인 삼각형 면적은 : "+(x*y*0.5)); 
						break;	
						
					case 3:
						System.out.println("장축의 반지름 "+x+", 단축의 반지름 "+y+" 인 타원형 면적은 : "+(3.141592F*x*y)); 
						break;						
	
					default:
						System.out.println("세번째 파라미터는 1 또는 2 또는 3 만 가능합니다.");
						break;
				}// end of switch(type)-------------------
				
			}
			
		}; // end of annoymous Class--------------------
		
		annoymous_obj.area(10.5, 5.5, 1);
		// 가로 10.5, 세로 5.5 인 사각형 면적은 : 57.75
		
		
		System.out.println("\n==== 람다식(Lambda)을 사용한 것 ===");
		
	/*
		   람다(Lambda) 함수는 프로그래밍 언어에서 사용되는 개념으로 익명 함수(Anonymous functions)를 지칭하는 용어이다.
           현재 사용되고 있는 람다의 근간은 수학과 기초 컴퓨터과학 분야에서의 람다 대수이다. 
           람다 대수는 간단히 말하자면 수학에서 사용하는 함수를 보다 단순하게 표현하는 방법이다.

           람다 대수는 이름을 가질 필요가 없다. 즉, 익명 함수 (Anonymous functions)이다.
		   람다식(Lambda)은 익명함수(anonymous function)을 생성하기 위한 식으로서 객체 지향 언어보다 함수 지향 언어에 가깝다.
	      
		   자바에서 람다식의 사용 목적은 인터페이스에 정의된 메소드를 구현시 코딩양을 확 줄여서 간편하게 사용하는 것이 목적이다.  
	            
	       자바에서는 함수 단독으로는 사용할 수 없고 객체를 통해서만 사용이 가능한 형태이므로 
	       자바에서 람다를 실행하려면 전제조건으로 먼저 FunctionalInterface(함수형 인터페이스)를 구현한 익명(무명)클래스 객체가 생성되어져 있어야만 한다. 
	       람다는 FunctionalInterface(함수형 인터페이스)를 구현한 익명(무명)클래스 객체의 메소드로 동작하게 된다.  
	       여기서 주의할 점은 FunctionalInterface(함수형 인터페이스)는 오로지 딱 한개만의 추상메소드로 이루어져야 한다는 것이다. 
	       만약에 FunctionalInterface(함수형 인터페이스)에 두 개 이상의 메소드가 선언되면 자바 컴파일러는 오류를 발생시킨다.  
	       함수형 인터페이스를 만드려면  @FunctionalInterface 어노테이션을 사용하면 된다.
	*/		
		
		Inter_functional_1 lambda_obj = (x, y, type) -> {
				
				switch (type) {
					case 1:
						System.out.println("가로 "+x+", 세로 "+y+" 인 사각형 면적은 : "+(x*y));
						break;
						
					case 2:
						System.out.println("밑변 "+x+", 높이 "+y+" 인 삼각형 면적은 : "+(x*y*0.5)); 
						break;	
						
					case 3:
						System.out.println("장축의 반지름 "+x+", 단축의 반지름 "+y+" 인 타원형 면적은 : "+(3.141592F*x*y)); 
						break;						
	
					default:
						System.out.println("세번째 파라미터는 1 또는 2 또는 3 만 가능합니다.");
						break;
				}// end of switch(type)-------------------
			
		}; 
		
		lambda_obj.area(10.5, 5.5, 1);
		// 가로 10.5, 세로 5.5 인 사각형 면적은 : 57.75
		
		
		System.out.println("\n~~~~~~~ 람다식(Lambda) 표기 방법 알아보기 ~~~~~~~~~");
		
		Inter_functional_3 annoymous_operator = new Inter_functional_3() {

			@Override
			public double operator(double a, double b, String type) {
				
				double result = 0.0;
				
				switch (type) {
					case "+":
						result = a+b;
						break;
						
					case "-":
						result = a-b;
						break;	
						
					case "*":
						result = a*b;
						break;						
	
					case "/":
						result = a/b;
						break;						
						
					default:
						System.out.println("세번째 파라미터는 + - * / 만 가능합니다.");
						break;
				}// end of switch(type)-------------------
				
				return result;
			}
			
		};
		
		
		double opr_result = annoymous_operator.operator(10, 20, "+");
		System.out.println(opr_result); // 30.0
		
		
		// 1. 람다식(Lambda) 표기 기본방법
		Inter_functional_3 lambda_operator_1 = (double a, double b, String type) -> {
			
			double result = 0.0;
			
			switch (type) {
				case "+":
					result = a+b;
					break;
					
				case "-":
					result = a-b;
					break;	
					
				case "*":
					result = a*b;
					break;						

				case "/":
					result = a/b;
					break;						
					
				default:
					System.out.println("세번째 파라미터는 + - * / 만 가능합니다.");
					break;
			}// end of switch(type)-------------------
			
			return result;
		};
		
		opr_result = lambda_operator_1.operator(10, 20, "-");
		System.out.println(opr_result); // -10.0
		
		
		// 2. 파라미터의 타입은 생략할 수 있다.
		Inter_functional_3 lambda_operator_2 = (a, b, type) -> {
			
			double result = 0.0;
			
			switch (type) {
				case "+":
					result = a+b;
					break;
					
				case "-":
					result = a-b;
					break;	
					
				case "*":
					result = a*b;
					break;						

				case "/":
					result = a/b;
					break;						
					
				default:
					System.out.println("세번째 파라미터는 + - * / 만 가능합니다.");
					break;
			}// end of switch(type)-------------------
			
			return result;
		};
		
		opr_result = lambda_operator_2.operator(10, 20, "*");
		System.out.println(opr_result); // 200.0
		
		
		// 3. 실행명령문이 1개 이라면 { }; 을 생략할 수 있다.
		Inter_functional_4 lambda_search = (str) -> System.out.println("회원들중 \""+str+"\" 를 조회합니다.");  
		lambda_search.search("이순신");
        // 회원들중 "이순신" 를 조회합니다.
		
		// 4. 파라미터의 개수가 1개 이라면 파라미터를 감싸는 괄호( )를 생략할 수 있다.
		Inter_functional_4 lambda_search_2 = (str) -> System.out.println("회원들중 \""+str+"\" 를 조회합니다.");  
		lambda_search_2.search("엄정화");
		// 회원들중 "엄정화" 를 찾습니다.
		
		
		// 5. 파라미터의 개수가 2개 이상 이라면 무조건 파라미터를 감싸는 괄호 ( ) 를 써야 한다.
		
		/*
		Inter_functional_3 lambda_operator_2 = a, b, type -> {
			
			double result = 0.0;
			
			switch (type) {
				case "+":
					result = a+b;
					break;
					
				case "-":
					result = a-b;
					break;	
					
				case "*":
					result = a*b;
					break;						

				case "/":
					result = a/b;
					break;						
					
				default:
					System.out.println("세번째 파라미터는 + - * / 만 가능합니다.");
					break;
			}// end of switch(type)-------------------
			
			return result;
		};
		*/
		
		
		// 6.파라미터가 없는 람다식은 무조건 괄호( ) 를 써야 한다.
		Inter_functional_5 lambda_search_all = () -> {
			System.out.println("1. 파라미터에 값이 없는 것은");
			System.out.println("2. 모든 회원들을 조회합니다.");
		};
		
		lambda_search_all.searchAll();
		/*
		 1. 파라미터에 값이 없는 것은
		 2. 모든 회원들을 조회합니다.
		 */
		
		
		// 7. 실행명령문이 1개 이더라도 return 이 있을 경우에는 { }; 을 생략할 수 없다.
		
		Inter_functional_6 lambda_6 = (a, b)->{
			return a+b;
		};
		System.out.println(lambda_6.plus(10, 20));
		//30
		
		// 8.return 문만 있는 단일 코드인 경우에는 { }; 및 return 을 생략할 수 있다.
		Inter_functional_6 lambda_6_2 = (a, b) -> a+b;
		
		System.out.println(lambda_6_2.plus(10, 20));
		//30
		
	}// end of main()----------------------------

}

