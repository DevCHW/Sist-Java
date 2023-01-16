package my.day20.b.generic;

public class Child_Plain extends Employee {

	int salary;// 연봉
	
	public Child_Plain() {}
	
	public Child_Plain(String userid, String passwd, String name, String jik,int salary) {
		super(userid,passwd,name,jik);
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "== 일반직원 == \n"
			 +  super.toString()
			 + "5.연봉 : "+salary+"만원\n";
	}
	
	
}
