package my.day19.c.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main_HashMap_4 {

	/*
	   === Map 계열 ===
	   1. HashMap 과 Hashtable 이 있다.
	   2. Map 계열은 List 계열(Vector, ArrayList, LinkedList)처럼 index 가 사용되어 저장되는 것이 아니라, 
	      Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
	         데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
	         이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
	   3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
	   4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
	      value 값의 추출은 get(String key) 메소드를 사용한다. 
	*/
	public static void main(String[] args) {
//		HashMap<String,Member> mbrMap = new HashMap<String, Member>();
//		또는
//		HashMap<String,Member> mbrMap = new HashMap<>();
//		또는
		Map<String,Member>mbrMap = new HashMap<>();
		
		mbrMap.put("youjs", new Member("youjs","qwer1234$","유재석"));
	  // mbrMap 이라는 HashMap 저장소에 new Member("youjs","qwer1234$","유재석")을 저장하는데 
      // 저장된  new Member("youjs","qwer1234$","유재석")을 찾고자 할때는 
      // "youjs" 만 넣어주면 new Member("youjs","qwer1234$","유재석") 이 나오도록 저장하겠다는 말이다. 
		
		mbrMap.put("eom", new Member("eom","qwer1234$","엄정화"));
		mbrMap.put("kanghd", new Member("kanghd","qwer1234$","강호동"));
		mbrMap.put("leess", new Member("leess","qwer1234$","이순신"));
		mbrMap.put("kimth", new Member("kimth","qwer1234$","김태희"));
		mbrMap.put("kangkc", new Member("kangkc","qwer1234$","강감찬"));
		mbrMap.put("leehr", new Member("leehr","qwer1234$","이혜리"));
		
		mbrMap.put("leess", new Member("leess","abcd0070$","이삼순"));
		
		Member mbr_chaew_1 = new Member("chaew","qwer1234$","차은우");
		Member mbr_chaew_2 = mbr_chaew_1;
		
		mbrMap.put("chaew_1", mbr_chaew_1);
		mbrMap.put("chaew_1", mbr_chaew_2);
		Set<String> key_sets = mbrMap.keySet();
		
		for(String key : key_sets) {
			System.out.println(key);
		}
		// ==mbrMap 에 저장되어진 Member 객체들 중에 key 가 "leess" 인 value 값(지금은 Member)을 추출해서
		//	 추출된 회원(Member)의 정보를 출력하세요 ==
		
		
		String search_id ="leess";
		
		Member mbr = mbrMap.get(search_id);
		if(mbr != null)
			mbrMap.get(search_id).info_print();
		else
			System.out.println("검색하신 "+search_id+"에 해당하는 회원은 없습니다. <<");
		/*
		 
		 	=== 이삼순님의 회원정보 ===
		 	1. 아이디 :leess
		 	2. 암호 : abcd0070$
		 	3. 성명 : 이삼순
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		mbrMap.put("leess_2", new Member("leess_2","abcd0070$","이삼순"));
		
		search_id = "leess_2";
		mbr = mbrMap.get(search_id);
		if(mbr != null)
			mbrMap.get(search_id).info_print();
		else
			System.out.println("검색하신 "+search_id+"에 해당하는 회원은 없습니다. <<");
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		// === mbrMap 에 저장되어진 모든 key 들을 읽어오는 첫번째 방법 == //
		// == mbrMap 에 저장되어진 모든 회원들의 정보를 출력하세요 === //
		for(String key : key_sets) {
			mbrMap.get(key).info_print();
		}
		
		
		
		
		// [퀴즈] mbrMap 에 신규회원을 저장하려고 한다.
		//		 new Member("kimth","qwer1234$","김태환") 을 mbrMap 에 
		//		 key 값은"kimth"으로 저장하려고 할 때
		//       "kimth" key 가 이미 존재한다라면 아이디 kimth 은 이미 사용중입니다. 라고 메시지가 나오고
		//		 "kimth" key 가 존재하지 않는다 라면 mbrMap에 new Member("kimth","qwer1234$","김태환") 을
		//		 저장하도록 코드를 작성하세요...
		
		String input_id = "kimth";
		
		if(mbrMap.get(input_id) == null) {
			mbrMap.put(input_id,  new Member("kimth","qwer1234$","김태환"));
		}
		else {
			System.out.println("아이디 "+input_id+" 은 이미 사용중입니다.");
		}
		
		
		
		// === mbrMap 에 저장되어진 모든 key 들을 읽어오는 두번째 방법 == //
		System.out.println("\n====================================\n");
		Set<String> key_sets_2 = mbrMap.keySet();
		
		Iterator<String> it = key_sets_2.iterator();
		//Iterator 는 저장소가 아니라 Collecton 에 저장되어진 요소(Element)를 읽어오는 용도로 쓰이는 것이다.
		
		while(it.hasNext()) {	//return타입 boolean값
		//it.hasNext(); 는 it 에서 현재 it가 가지고 있는 여러 String 데이터중 하나를 끄집어내서 존재하는지를 알아보는 것이다.
		// 존재하면 ture, 존재하지 않으면 false 리턴해준다.
		// 그러므로 현재 키의 개수가 8개이므로 8번 반복을 할 것이다.
			String key = it.next();
			/*
			 	실제로 키값이 String 값을 it 에서 끄집어낸다.
			 	그러면 끄집어 낸 String 값은 더 이상 it 에는 남아있지 않게 된다.
			 */
			System.out.println(key);
		}//end of while()-----
		/*
		 leess_2
		 eom
		 youjs
		 kimth
		 kangkc
		 leehr
		 kanghd
		 leess
		 */
		
		System.out.println("\n~~~~~~~~~ 또 한번 더 ~~~~~~~~~\n");
		while(it.hasNext()) {	//return타입 boolean값
				String key = it.next();
				System.out.println(key);
			}//end of while()-----
		
		System.out.println("\n~~~~~~~~~ 다시 처음부터 해본다. ~~~~~~~~~\n");
		
		Iterator<String> it_2 = key_sets_2.iterator();
		
		while(it_2.hasNext()) {
			String key = it_2.next();
			System.out.println(key);
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		//== mbrMap 에 저장되어진 모든 회원들의 정보를 출력하세요 ===//
		
		Set<String> key_sets_3 = mbrMap.keySet();
		Iterator<String> it_3 = key_sets_3.iterator();
		while(it_3.hasNext()) {
			String key = it_3.next();
			mbrMap.get(key).info_print();
		}//end of while----------------
		
		System.out.println("\n ==== key 값이 kangkc 인 Member를 삭제하기 ====\n");
		
		mbrMap.remove("kangkc");
		
		for(String key:key_sets_3) {
			mbrMap.get(key);
		}
		System.out.println("\n ==== mbrMap에 저장되어진 모든 Member를 삭제하기  ====\n");
		mbrMap.clear();	//mbrMap에 저장되어진 모든 Member를 삭제하였기 때문에 출력해도 암것도 안나옴
		
		for(String key:key_sets_3) {
			mbrMap.get(key);
		}
		
		System.out.println("mbrMap.isEmpty() =>"+mbrMap.isEmpty());
		//mbrMap.isEmpty() => true
		
	}//end of main()-----
	
	
}
