package my.day19.c.collection;

import java.util.LinkedList;
/*
	== LinkedList == 
	1. 출력시 저장된 순서대로 나온다.
	2. 중복된 데이터를 저장할 수 있다.
	3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
	4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가  ArrayList 보다 상대적으로 느리다.
	5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가 ArrayList 보다 상대적으로 빠르다.    
	6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
	7. LinkedList 보다는 ArrayList 를 사용하도록 하자. 
	
	== LinkedList (저장소) ==   
	
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 3236)----(앞서존재하던객체의 메모리주소 3236)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)   
	
	== 엄정화 를 삭제할 경우
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
	    
	== 엄정화 를 특정 위치에 추가할 경우
	  엄정화(자신의 메모리주소 7876)를 유재석 다음에 추가하고자 한다.
	  유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 7876)----(앞서존재하던객체의 메모리주소 7876)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
	           
*/

public class Main_LinkedList_3 {

	public static void main(String[] args) {
		
		// 1. Member 클래스의 객체만을 저장할 수 있는 LinkedList 객체 mbrList 를 생성하시오.
		LinkedList<Member> mbrList = new LinkedList<>();
		
		// 2. Member 클래스의 객체 6개를 생성하여 mbrList 에 저장하세요.
		mbrList.add(new Member("youjs","qwer1234$","유재석"));
		mbrList.add(new Member("eom","qwer1234$","엄정화"));
		mbrList.add(new Member("kanghd","qwer1234$","강호동"));
		mbrList.add(new Member("leess","qwer1234$","이순신"));
		mbrList.add(new Member("kimth","qwer1234$","김태희"));
		mbrList.add(new Member("kangkc","qwer1234$","강감찬"));
		mbrList.add(new Member("leehr","qwer1234$","이혜리"));
		
		
		
		// 3. mbrList 에 저장되어진 모든 회원들의 정보를 출력하도록 Member 클래스에 정의된 info_print() 메소드를 실행하세요.
		
		// mbrList 에 저장되어진 데이터의 개수는 mbrList.size() 로 알아온다.
		System.out.println(mbrList.size()); // 7
		
		for(int i=0; i<mbrList.size(); i++) {
			mbrList.get(i).info_print();
		}// end of for-----------------
		
		System.out.println("\n~~~~~~~ 또는 ~~~~~~~~\n");
		
		for(Member mbr : mbrList) { // mbrList.size() 만큼 반복한다.
			mbr.info_print();
		}// end of for-----------------
		
		
		System.out.println("\n~~~~~~~ [퀴즈 1] ~~~~~~~~\n");
		/*
		   [퀴즈1]
		   mbrList 에 저장되어진 Member 객체들 중에서 id 값이 "leess" 인 회원만 그 회원의 정보를 출력하세요.
		*/
		
		
		
		System.out.println("\n~~~~~~~ [퀴즈 2] ~~~~~~~~\n");
		/*
		   [퀴즈2]
		   mbrList 에 저장되어진 Member 객체들 중에서 name이 "이" 씨인 회원만 그 회원의 정보를 출력하세요.
		   
		   mbrList 에 저장되어진 Member 객체들 중에서 name이 "서" 씨인 회원만 그 회원의 정보를 출력하세요.
		   >> 회원중 "서"씨는 없습니다.
		 */
		boolean flag= false;
		String first_name = "서";
		for(int i=0; i<mbrList.size(); i++) {
			String sung = mbrList.get(i).name.substring(0,1);
			if(first_name.equals(sung)) {
				mbrList.get(i).info_print();
				flag = true;
			}
		}// end of for-----------------
		if (!flag) {
			System.out.println("회원중 "+first_name+"씨는 없습니다.");
		}
		
		System.out.println("\n~~~~~~~~~또는 ~~~~~~~~~~~~~~~\n");
		
		for(Member mbr : mbrList) {
			if(mbr.name.startsWith("이")) {
				mbr.info_print();
			}
		}
			
		// *** LinkedList 타입인 mbrList 에 새로운 Member 객체 추가시 특정 index(위치)에 들어가도록 할 수 있다.
		System.out.println("\n ~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~");
		
		mbrList.add(new Member("seolh","qwer1234#","설현"));
		// index 값이 없으면 mbrList 의 맨 뒤에 추가된다.
		
		mbrList.add(3, new Member("chaew","qwer1234","차은우"));
		//			3 이 특정 인덱스이다.
		//	유재석(0) 엄정화(1) 강호동(2) 이순신(3) 으로 되어있는데,
		//	유재석(0) 엄정화(1) 강호동(2) 차은우(3) 이순신(4) 으로 된다.
		
		for(Member mbr:mbrList) {
			mbr.info_print();
		}
		
		// *** LinkedList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 *** //
		System.out.println("\n ~~~ LinkedList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 ~~~");
		
		System.out.println(">> 삭제하기전 mbrList.size() => " +mbrList.size());
		// >> 삭제하기전 mbrList.size() =>
		
		mbrList.remove(3);	//mbrList.remove(삭제할 Member 객체의 인덱스번호);
		
		System.out.println(">> 삭제한 뒤 mbrList.size() => " +mbrList.size());
		
		for(Member mbr:mbrList) {
			mbr.info_print();
		}
		
		
		System.out.println("\n~~~~~~~ [퀴즈 3] ~~~~~~~~\n");
		/*
		 [퀴즈 3]
		 mbrList 에 저장되어진 Member 객체들 중에서
		 name 이 "이" 씨인 회원들을 삭제하고
		 삭제한 후 mbrList 에 저장되어진 Member 객체들의 정보를 출력하세요.
		 */
		mbrList.add(new Member("leemh","qwer1234$","이민호"));
		mbrList.add(new Member("leemh","qwer1234$","이승기"));
		
		//LinkedList에서 삭제할때는 앞에서부터 순차적으로 삭제말고 뒤에서부터 삭제하여야한다.
		//왜냐하면 삭제할때 발생하는 작업이
		//인덱스가 앞으로 땡겨지기때문에 삭제하지못하는 정보가 발생할수있다.
		String sung = "이";
		int remove_count=0;
		for(int i=mbrList.size()-1;i>=0;i--) {
			if(mbrList.get(i).name!=null&&mbrList.get(i).name.startsWith(sung)) {
				mbrList.remove(i);
				remove_count++;
			}
		}
		System.out.println("성이 \""+sung+"\"씨인 회원 "+remove_count+"명 정보를 삭제하였습니다!");
		for(int i=0; i<mbrList.size(); i++) {
			mbrList.get(i).info_print();
		}// end of for-----------------
		
		System.out.println("\n~~~~~~~ [퀴즈 4] ~~~~~~~~\n");
		/*
		 	[퀴즈 4]
		 	mbrList에 저장되어진 Member 객체들 중에서
		 	특정한 조건(name 이 "강호동")에 만족하는 Member 객체를 삭제하고.
		 	삭제되어진 그 인덱스(위치)자리에 새로운 Member 객체를 채워주기
		 */
		
		flag = false;
		for(int i=mbrList.size()-1;i>=0;i--) {
			if("강호동".equals(mbrList.get(i).name)) {
				mbrList.remove(i);
				mbrList.add(i, new Member("seogj","qwer1234$","서강준"));
				flag = true;
				break;
			}
		}
		if(!flag) {
			mbrList.add(new Member("seogj","qwer1234$","서강준"));
		}
		
		for(Member mbr:mbrList) {
			mbr.info_print();
		}
		
		System.out.println("\n~~~~~~~ mbrList 에 저장된 모든 객체 삭제하기 ~~~~~~~~\n");
		mbrList.clear();
		System.out.println(">> 삭제한 후 mbrList.size() =>"+mbrList.size());
		
		
		
	}// end of main()---------------------------

}
