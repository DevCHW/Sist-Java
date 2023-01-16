package my.day18.a.Inteface;

public interface Figure {

	// === 인터페이스(interface)란? ===
	/*
	 	오로지 미완성메소드(추상메소드)와 field 는 final 변수로만 이루어진것을 말한다.
	 	그리고 미완성메소드(추상메소드)와 field 의 접근제한자는 public 으로만 되어진다.
		
		field 생성시 public final 이 생략되어져 있다.
		미완성메소드(추상메소드) 생성시 public abstract 가 생략되어져 있다.
	 */
	
	// field
	double PI = 3.141592;
	// 즉, public final double PI = 3.141592; 이다.
	
	
	// method ==> public abstract 가 생략되어져 있다.
	double area(double x,double y);
	// 즉, public abstract double area(double x,double y); 이다.
	
	// 메소드의 오버로딩
	double area(double r);
	
}
