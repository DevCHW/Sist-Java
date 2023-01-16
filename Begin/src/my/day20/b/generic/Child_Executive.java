package my.day20.b.generic;

public class Child_Executive extends Employee {
	
	String cardNo;// 법인카드번호
	
	public Child_Executive() {}

	public Child_Executive(String userid, String passwd, String name, String jik,String cardNo) {
		super(userid,passwd,name,jik);
		this.cardNo = cardNo;
	}
	
	@Override
	public String toString() {
		return "== 임직원 == \n"
			 +  super.toString()
			 + "5.법인카드번호 : "+cardNo+"\n";
	}
	
}
