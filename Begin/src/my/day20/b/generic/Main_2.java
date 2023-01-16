package my.day20.b.generic;

import java.util.List;

public class Main_2 {

	public static void main(String[] args) {
		
		Box_Employee<Child_Executive> box_executive = new Box_Employee<>();
		box_executive.register(new Child_Executive("hansk","1234","한석규","사장","1-01"));
		box_executive.register(new Child_Executive("dusk","5678","두석규","전무","2-01"));
		box_executive.register(new Child_Executive("sesk","0070","세석규","상무","3-01"));
		
		List<Child_Executive> executive_List = box_executive.getList();
		
		for(int i=0;i<executive_List.size();i++) {
			System.out.println(executive_List.get(i));
		}// end of for---
		/*
		    == 임직원 == 
			1.아이디: hansk
			2.비밀번호: 1234
			3.성명: 한석규
			4.직급: 사장
			5.법인카드번호 : 1-01
			
			== 임직원 == 
			1.아이디: dusk
			2.비밀번호: 5678
			3.성명: 두석규
			4.직급: 전무
			5.법인카드번호 : 2-01
			
			== 임직원 == 
			1.아이디: sesk
			2.비밀번호: 0070
			3.성명: 세석규
			4.직급: 상무
			5.법인카드번호 : 3-01

		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Box_Employee<Child_Plain> box_plain = new Box_Employee<>();
		box_plain.register(new Child_Plain("leess","qwer","이순신","부장",8000));
		box_plain.register(new Child_Plain("eomjh","abcd","엄정화","과장",7000));
		box_plain.register(new Child_Plain("hongkd","1234","홍길동","대리",6000));
		List<Child_Plain> Plain_List = box_plain.getList();
		for(Child_Plain plain :Plain_List) {
			System.out.println(plain);
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Box_Employee<Employee> box_all = new Box_Employee<>();
		box_all.register(new Employee("superman","1234","슈퍼맨","부장"));
		box_all.register(new Child_Executive("batman","6789","배트맨","이사","4-01"));
		box_all.register(new Child_Plain("wonderwoman","0070","원더우먼","과장",9000));
		
		List<Employee> emp_List = box_all.getList();		
		
		for(Employee emp:emp_List) {
			System.out.println(emp);
		}
		
	}//end of main()--------

}
