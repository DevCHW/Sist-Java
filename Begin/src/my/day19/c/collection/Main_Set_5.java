package my.day19.c.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main_Set_5 {


		/*
	    == HashSet == 
	    1. 출력시 저장된 순서가 유지되지 않는다.
	    2. 중복된 데이터를 저장할 수 없다.
          그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.
	              
	    == LinkedHashSet ==
	    1. 출력시 저장된 순서가 유지된다.
	    2. 중복된 데이터를 저장할 수 없다.
          그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.        
	*/
	public static void main(String[] args) {
		System.out.println("\n=========HashSet============\n");
		
		// 1.Member 클래스의 객체만을 저장할 수 있는 HashSet 객체 mbrHashSet을 생성한다.
		Set<Member> mbrHashSet = new HashSet<>();
		
		// 2.Member 클래스의 객체 7개를 생성하여 mbrHashSet에 저장한다.
		mbrHashSet.add(new Member("eom","qwer1234$","엄정화"));
		mbrHashSet.add(new Member("kanghd","qwer1234$","강호동"));
		mbrHashSet.add(new Member("leess","qwer1234$","이순신"));
		mbrHashSet.add(new Member( "kimth","qwer1234$","김태희"));
		mbrHashSet.add(new Member("kangkc","qwer1234$","강감찬"));
		mbrHashSet.add(new Member("leehr","qwer1234$","이혜리"));
		mbrHashSet.add(new Member("leess","abcd0070$","이삼순"));
		
		Member mbr_chaew_1 = new Member("chaew","qwer1234$","차은우");
		Member mbr_chaew_2 = mbr_chaew_1;
		
		mbrHashSet.add(mbr_chaew_1);
		mbrHashSet.add(mbr_chaew_2);
		
		// 3.mbrHashSet 에 저장되어진 모든 Member 들의 정보를 출력한다.
		for(Member mbr : mbrHashSet) {
			mbr.info_print();
		}
		
		System.out.println("\n~~~~~~~또는~~~~~~~~~~~~~~~~\n");
		
		//Set 계열은 저장된 데이터(요소)에 접근하기 위해서 Iterator 를 통해 접근가능하다.
		Iterator<Member> it = mbrHashSet.iterator();
		
		while(it.hasNext()) {
			// it.hasNext() 은 
	        // it 에서 현재 it가 가지고 있는 여러 Member 데이터중 
	        // 하나를 끄집어내서 존재하는지를 알아보는 것이다.
	        // 존재하면 true, 존재하지 않으면 false.
			Member mbr = it.next();
			// 실제로 Member 를 it에서 끄집어 낸다.
			// 그러면 끄집어 낸 Member 는 더이상 it 에는 남아있지 않게 된다.
			mbr.info_print();
		}
		
		// [퀴즈] mbrHashSet 에 신규회원을 저장하려고 한다.
		//		 new Member("kimth","qwer1234$","김태환") 을 mbrHashSet에 
		//		 id 값은"kimth"으로 저장하려고 할 때
		//       "kimth" id 가 이미 존재한다라면 아이디 kimth 은 이미 사용중입니다. 라고 메시지가 나오고
		//		 "kimth" id 가 존재하지 않는다 라면 mbrHashSet에 new Member("kimth","qwer1234$","김태환") 을
		//		 저장하도록 코드를 작성하세요...
		
		Iterator<Member> it_mbr = mbrHashSet.iterator();
		
		
		
		String input_id = "kimth";
		boolean flag = false;
		while(it_mbr.hasNext()) {
			input_id.equals(it_mbr.next().id);
			flag = true;
			break;
		}//end of while------
		if(!flag) {
			mbrHashSet.add(new Member("kimth","qwer1234$","김태환"));
			System.out.println("저장성공!");
		}
		else {
			System.out.println("이미 \""+input_id+"\" 라는 아이디가 존재합니다.");
		}
		
		//////////////////////////////////////////////////////////////////
		//[퀴즈] mbrHashSet 에 저장된 회원중 아이디가 "eom" 와 "kangkc" 인 회원들만 회원정보를 출력하세요
		
		System.out.println("\n========================================\n");
		String[] id_arr = {"eom","kangkc","superman"};
		
		//또는
		String ides = "eom,kangkc,superman";
		String[] id_arr_2 = ides.split("\\,");
		
		
		
		
		for(int i=0;i<id_arr.length;i++) {
			
			Iterator<Member> itrtor = mbrHashSet.iterator();
			
			boolean id_exists = false;
			while(itrtor.hasNext()) {
				Member mbr = itrtor.next();
				if(mbr.id.equals(id_arr[i])){
					mbr.info_print();
					id_exists = true;
					break;
				}
			}//end of while-----
			if(!id_exists)
				System.out.println("id가 "+id_arr[i]+"인 회원은 존재하지 않습니다.");
		}//end of for---
		
		
		
		
		 System.out.println("\n ===== LinkedHashSet ===== \n");
	      
	      // 1. Member 클래스의 객체만을 저장할 수 있는 LinkedHashSet 객체 mbrLinkedHashSet 을 생성한다.
	      Set<Member> mbrLinkedHashSet = new LinkedHashSet<>();
	      
	      // 2. Member 클래스의 객체 7개를 생성하여 mbrLinkedHashSet 에 저장한다.
	      mbrLinkedHashSet.add(new Member("youjs","qwer1234$","유재석"));
	      mbrLinkedHashSet.add(new Member("eom","qwer1234$","엄정화"));
	      mbrLinkedHashSet.add(new Member("kanghd","qwer1234$","강호동"));
	      mbrLinkedHashSet.add(new Member("leess","qwer1234$","이순신"));
	      mbrLinkedHashSet.add(new Member("kimth","qwer1234$","김태희"));
	      mbrLinkedHashSet.add(new Member("kangkc","qwer1234$","강감찬"));
	      
	      mbrLinkedHashSet.add(new Member("leehr","qwer1234$","이혜리"));
	      mbrLinkedHashSet.add(new Member("leehr","qwer1234$","이혜리"));
	      
	      Member mbr_chaew_3 = new Member("chaew","qwer1234$","차은우");
	      Member mbr_chaew_4 = mbr_chaew_3;
	      
	      mbrLinkedHashSet.add(mbr_chaew_3);
	      mbrLinkedHashSet.add(mbr_chaew_4);
	      
	      
	      // 3. mbrLinkedHashSet 에 저장되어진 모든 Member 들의 정보를 출력한다.
	      for(Member mbr : mbrLinkedHashSet) {
	         mbr.info_print();
	      }
	      
	      System.out.println("\n~~~~~~~ 또는 ~~~~~~~~\n");
	      
	      // Set 계열은 저장된 데이터(요소)에 접근하기 위해서는 Iterator 를 통해 접근이 가능하다. 
	      
	      Iterator<Member> itr = mbrLinkedHashSet.iterator();
	      
	      while(itr.hasNext()) {
	         /* itr.hasNext() 은 
	            itr 에서 현재 itr가 가지고 있는 여러 Member 데이터중 
	            하나를 끄집어내서 존재하는지를 알아보는 것이다.
	            존재하면 true, 존재하지 않으면 false.
	          */
	         
	         Member mbr = itr.next();
	         // 실제로 Member 를 itr 에서 끄집어 낸다.
	         // 그러면 끄집어 낸 Member 는 더이상 itr 에는 남아있지 않게 된다.
	         
	         mbr.info_print();
	      }// end of while---------------------
	      
	      
	      // [퀴즈] mbrLinkedHashSet 에 신규회원을 저장하려고 한다. 
	        //       new Member("kimth","qwer1234$","김태환") 을 mbrLinkedHashSet 에 저장하려고 할 때 
	        //       id 가 "kimth" 인 회원이 이미 존재하다라면 아이디 kimth 은 이미 사용중입니다. 라고 메시지가 나오고
	        //       id 가 "kimth" 인 회원이 존재하지 않는다라면 mbrLinkedHashSet 에 new Member("kimth","qwer1234$","김태환") 을 
	        //       저장하도록 코드를 작성하세요.
	      
	      String inputId = "kimth";
	      
	      Iterator<Member> itMbr = mbrLinkedHashSet.iterator();
	      
	      boolean idExists = false;
	      
	      while(itMbr.hasNext()) {
	         
	         if( inputId.equals(itMbr.next().id) ) {
	            idExists = true;
	            break;
	         }
	         
	      }// end of while--------------------
	      
	      if(!idExists) {
	         mbrLinkedHashSet.add(new Member(inputId,"qwer1234$","김태환"));
	         System.out.println("~~~ 저장성공 ~~~");
	      }
	      else {
	         System.out.println("아이디 "+inputId+"는 이미 존재합니다. 다른 아이디를 사용하여 입력하세요!!");
	      }
	      
	      
	      System.out.println("\n~~~~~~~~~~~ [퀴즈] ~~~~~~~~~~~~~~~~~~\n");
	      
	      // [퀴즈] mbrHashSet 에 저장된 회원중 아이디가 "eom" 와 "kangkc" 와 "superman" 인 회원들만 회원정보를 출력하세요.
	      String[] idArr = {"eom","kangkc","superman"}; 
	      
	      for(int i=0; i<idArr.length; i++) {
	         
	         Iterator<Member> itrtor = mbrLinkedHashSet.iterator();
	         
	         boolean id_exist = false;
	         
	         while(itrtor.hasNext()) {
	            Member mbr = itrtor.next();
	            if( idArr[i].equals(mbr.id) ) {
	               mbr.info_print();
	               id_exist = true;
	               break;
	             }
	         }// end of while----------------------
	         
	         if(!id_exist) {
	            System.out.println("아이디가 "+idArr[i]+"인 회원은 존재하지 않습니다.");
	         }
	         
	      }// end of for---------------------------
	}
}