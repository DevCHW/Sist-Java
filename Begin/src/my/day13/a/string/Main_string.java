package my.day13.a.string;

import my.util.MyUtil;

public class Main_string {

	public static void main(String[] args) {

		
		// === 1. "문자열".charAt(int index) ===
		//        "안녕하세요".charAt(2); ==> '하'
		//   index  01234 
		
		char ch="안녕하세요".charAt(2);
		System.out.println("ch => " + ch);
		// ch => 하
		
		
		String str = "안녕하세요";
		
		//요셍하녕안
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			ch = str.charAt(i);
			result += ch;	//길이-1은 배열의 끝.
		}
		
		System.out.println(result);
		//요세하녕안
		
		// === 2. "문자열".toCharArray() ===
		// "안녕하세요".toCharArray() ==> char 타입의 배열로 만들어준다.
		/*
		 	---------------------------
		 	|'안'||'녕'||'하'||'세'||'요'|
		 	---------------------------
	index ==> 0    1     2    3     4
		 */
		char[] ch_arr = "안녕하세요".toCharArray();
		result ="";
		
		for(int i=ch_arr.length-1;i>=0;i--) {
			result+=ch_arr[i];
		}
		
		System.out.println(result);
		//요세하녕안
		
		
		// 3. "문자열".substring(int 시작인덱스, int 끝인덱스) ===
		// "안녕하세요".substring(1, 4); ==> 1번 인덱스인 "녕"부터 4번 인덱스 앞 까지인 "세"
		//  01234
		str = "안녕하세요".substring(1,4);
		System.out.println(str);
		//녕하세
		
		String s_insa = "안녕하세요 행복하세요 끝";
		System.out.println(s_insa.substring(2,13));
		// 하세요 행복하세요 끝
		
		
		System.out.println(s_insa.substring(2, s_insa.length()));
		// 하세요 행복하세요 끝
		
		// 4. "문자열".substring(int 시작인덱스) ===
		// "안녕하세요".substring(2); ==> 2번 인덱스인 "하"부터 끝까지 뽑아낸다.
		//  01234
		System.out.println(s_insa.substring(2));
		// 하세요 행복하세요 끝
		
		// === 5. "문자열".indexOf("찾을문자열") ===
		//		  "문자열" 에서 최초로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.
		int index = "시작하세요 안녕하세요 건강하세요".indexOf("하세요");
		System.out.println(index);
		// 2
		
		index = "시작하세요 안녕하세요 건강하세요".indexOf("하세하세");
		System.out.println(index);
		// -1 찾고자 하는 문자열이 없으면 -1 이 나온다.
		
		index = "시작하세요 안녕하세요 건강하세요".indexOf("A");
		System.out.println(index);
		// -1 찾고자 하는 문자열이 없으면 -1 이 나온다.
		
		str = "시작하세요 안녕하세요 건강하세요";
		// 문자열 str 에서 두번째로 나오는 "하세요" 의 index 값을 알고자 한다.
		
		str.indexOf("하세요");	// 2
		str = str.substring(index+1);	//"세요 안녕하세요 건강하세요"
		System.out.println(str.indexOf("하세요"));	//5
		
		// ==== [퀴즈] ==== //
		// 아래ㅘ 같이 나오는"2,000,000" 에서 콤마(,) 만 제거되어진 값을 나타내세요.
		String money = "2,000,000";
		for(;;) {
			int comma_index = money.indexOf(",");	//1
			if(comma_index!=-1) {
			money = money.substring(0,comma_index)+money.substring(comma_index+1);
			}
			else {
				break;
			}
		}//end of for
		
		
		System.out.println(money);
		String money_2 = "123,456,789";
		for(;;) {
			int comma_index = money_2.indexOf(",");	//1
			if(comma_index!=-1) {
				money_2 = money_2.substring(0,comma_index)+money_2.substring(comma_index+1);
			}
			else {
				break;
			}
		}//end of for
		
		int comma_index = 0;
//		do {
//			comma_index = money_2.indexOf(",");
//				money_2 = money_2.substring(0,comma_index) + money_2.substring(comma_index+1);
//		} while (!(comma_index == -1));
//		System.out.println(money);
//		
		money ="987,654,321,000";
		
		System.out.println(MyUtil.delete_string(money, ","));
		
		str = "시작하세요 안녕하세요 건강하세요";
		System.out.println(MyUtil.delete_string(str, "하세요"));
		//시작 안녕 건강
		
		////////////////////////////////////////////////////////////////////
		
		
		// ==== [퀴즈] ==== //
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~\n");
	      
	      String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
	                                  "D:/mymusic.mp3",
	                                  "C:/photo/내얼굴.jpg"};
	      
	      for(int i=0; i<pathFileNameArr.length; i++) {
	         System.out.println(pathFileNameArr[i]);
	      }
	      /*
	         C:/mydocument/resume/나의이력서.hwp
	         D:/mymusic.mp3
	         C:/photo/내얼굴.jpg 
	      */
	      
	      System.out.println("\n === 파일명만 뽑아온 결과물 ===");
	      
	      
	      
	      //마지막 / 뒤의 내용을 써야함
	      //pathFileNameArr.indexOf("/")앞의 내용을 삭제
	      //pathFileNameArr.subString(pathFileNameArr.indexOf("/")+1) 이 작업을 반복
	      //pathFileNameArr.indexOf("/") = -1이 나올때까지
	      
	      String[] quiz = pathFileNameArr;
	      for(int i=0;i<pathFileNameArr.length;i++) {
	    	  for(;;) {
	    		  int slash_index =  pathFileNameArr[i].indexOf("/");
	    		  if(slash_index!=-1)
	    			  quiz[i] = pathFileNameArr[i].substring(slash_index+1);
	    		  else {
	    			  break;
	    		  }
	    	  }//end of for---
	      }//end of for---
	      for(int i=0; i<quiz.length; i++) {
		         System.out.println(quiz[i]);
		  }// end of for----
	
	      /*
	       		나의이력서.hwp
	       		mymusic.mp3
	       		내얼굴.jpg
	       */
		//---------------------------------------------
	      
	      
	    //===6."문자열".lastIndexOf("찾을문자열")===
	    //	   "문자열" 에서 마지막으로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.
	      index = "시작하세요 안녕하세요 건강하세요".lastIndexOf("하세요");
	      System.out.println(index);
	      //14
	      
	      index = "시작하세요 안녕하세요 건강하세요".lastIndexOf("하세하세");
	      System.out.println(index);
	      //-1 찾고자 하는 문자열이 없으면 -1이 나온다.
	      
	      
	      System.out.println("\n=== 파일명만 뽑아온 결과물 2 ===");
	      
	      for(int i=0; i<pathFileNameArr.length; i++) {
	    	  
	    	  	 String pathName = pathFileNameArr[i];
	    	  	 int idx = pathName.lastIndexOf("/");
		         System.out.println(pathName.substring(idx+1));
		      }
		      /*
		         C:/mydocument/resume/나의이력서.hwp
		         D:/mymusic.mp3
		         C:/photo/내얼굴.jpg 
		      */
	      
	    //===7."문자열".split("구분자")===
		    // "문자열"을 "구분자"로 잘라서 String 타입의 배열로 돌려주는것이다.
	      System.out.println("\n 7-1.====================================\n");
	      
	      String foodes ="파스타,국밥,볶음밥,고구마,계란말이";
	      
	      String[] food_arr = foodes.split("\\,");
//	또는    String[] food_arr = foodes.split("[,]");
//	또는    String[] food_arr = foodes.split(",");
	      
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      for(int i = 0;i<food_arr.length;i++) {
	    	  System.out.println(food_arr[i]);
	      }//end of for---
	      /*
				파스타
				국밥
				볶음밥
				고구마
				계란말이
	       */
	      
	      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      System.out.println(MyUtil.delete_string(foodes, ","));
	      
	      String result_foodes = "";
	      for(String food : foodes.split(",")) {
	    	  result_foodes += food;
	      }//end of for----
		
	      System.out.println(result_foodes);
	      // 파스타국밥볶음밥고구마계란말이
	      
	      System.out.println("~~~~~~~~~~~~~~~~~\n");
	      
	      str = "시작하세요 안녕하세요 건강하세요";
	      
	      System.out.println(MyUtil.delete_string(str, "하세요"));
	      // {"시작"," 안녕"," 건강"}
	      
	      
	      String[] str_arr = str.split("하세요");
	      for(String s:str_arr) {
	    	  System.out.println(s);
	      }
	      
	      String result_str ="";
	      
	      for(String s : str_arr) {
	    	  result_str+= s;
	      }
	      System.out.println(result_str);
	      
	      //어떤 글자 싹 지워! 라고하면 indexOf와 substring 쓸수있고,
	      //split 쓸 수 있음
	      
	      System.out.println("\n 7-2.====================================\n");
	      
	      foodes ="파스타	국밥	볶음밥	고구마	계란말이";
	      
	      food_arr = foodes.split("\t");
//또는	  food_arr = foodes.split("[\t]");
//또는     food_arr = foodes.split("\\\t");
	      
	      
	      for(int i = 0;i<food_arr.length;i++) {
	    	  System.out.println(food_arr[i]);
	      }
	      
	      
	      System.out.println("\n7-3.============================\n");
	      foodes ="파스타.국밥.볶음밥.고구마.계란말이";
	      
	      //split 사용시 구분자로 . | / 등 특수문자를 사용하려고 하는 경우에는 
	      //구분자로 사용되어지는 특수문자 바로 앞에 \\를 붙이거나 (예 \\.)
	      //아니면 대괄호를 사용한 [특수문자] 으로 해야 한다. <(예> [.])
	      food_arr = foodes.split("\\.");
//	또는   food_arr = foodes.split("[.]");
	      
	      for(int i = 0;i<food_arr.length;i++) {
	    	  System.out.println(food_arr[i]);
	      }
	      
	      System.out.println("\n7-4.============================\n");
	      foodes ="파스타.국밥,볶음밥		고구마|계란말이";
	      
	      food_arr = foodes.split("[.,\t|]");
	      //구분자가 여러개일 경우에는 대괄호를 사용하는데 [.,\t|]
	      //은 구분자로 . 또는 , 또는 \t 또는 | 을 구분자로 사용한다.
	      
	      //{"파스타","국밥","볶음밥","고구마","계란말이}
	      
	      for(int i = 0;i<food_arr.length;i++) {
	    	  System.out.println(food_arr[i]);
	      }
	      
	      
	      System.out.println("\n7-5.============================\n");
	      foodes ="파스타1국밥2볶음밥	1고구마7계란말이";
	      
	      food_arr = foodes.split("[\\d]");
	      //	\\d 에서 d는 정규표현식의 하나로써 숫자를 의미한다.즉, 숫자가 구분자로 쓰인다는 말이다.
	      
	      //{"파스타","국밥","볶음밥","고구마","계란말이}
	      
	      for(int i = 0;i<food_arr.length;i++) {
	    	  System.out.println(food_arr[i]);
	      }
	      
	      System.out.println("\n7-6.============================\n");
	      foodes ="파스타1국밥2볶음밥	1고구마7계란말이";
	      
	      //split 사용시 구분자로 숫자가 아닌것을 사용한 경우
	      
	      food_arr = foodes.split("[\\D]");
	      // \\D에서 D는 정규표현식의 하나로써 숫자가 아닌것을 의미한다.
	      // 즉, 숫자가 아닌것을 구분자로 쓰인다는 말이다.
	      
	      // {"1","2","1","7"}
	      
	      for(int i = 0;i<food_arr.length;i++) {
	    	  System.out.println(food_arr[i]);
	      }
	      /*
	       	1
	       	2
	       	1
	       	7
	       */
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // ==== 참고 : 자바에서 \를 "escape 문자" 라고 부른다.
	      System.out.println("나의 이름은 \"이순신\" 입니다");
	      // 나의 이름은 "이순신" 입니다
	      
	      System.out.println("C:\\NCS\\workspace(java)\\Begin\\src\\Practice01");
	      
	      
	      //===8."문자열".String.join("구분자",문자열배열)=== 
	      //			문자열배열을 "구분자"로 합쳐서 String 타입으로 돌려주는 것이다.
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      String[] name_arr = {"한석규","두석규","세석규","네석규","오석규"};
	      String names = String.join("-",name_arr);
	      System.out.println(names);
	      // 한석규-두석규-세석규-네석규-오석규
	      
	      str = "시작하세요 안녕하세요 건강하세요";
	      // 위의 str 에 저장된 문자열에서 하세요만 삭제한 결과물을 나타내세요.
	      str = String.join("",str.split("하세요"));//{"시작"," 안녕"," 건강"}
	      System.out.println(str);
	      //split은 배열로 돌려주고 join은 구분자로 배열을 합쳐주는것임
	      //그래서 같이쓰면 지정문자를 삭제할 수 있음.
	      
	      String input_str = "103-23-523-009";
	      
	      input_str = String.join("",input_str.split("[-]"));
	      System.out.println(input_str);
	      // 10323523009
	      
	      
	      input_str = "    안녕    하세요   내일   은 즐거운  주말 입니다.";
	      input_str.split(" ");
	      input_str = String.join("",input_str.split(" "));
	      System.out.println(input_str);
	      //안녕하세요내일은즐거운주말입니다.
	      
	      // === 9. "문자열".replaceAll("변경대상문자열","새로이변경될문자열") ===
	      //		"문자열" 에서 "변경대상문자열" 을 모두 "새로이변경될문자열" 로 교체해서 반환해줌.
	     
	      names = "한석규-두석규-세석규-네석규-오석규";
	      names = names.replaceAll("석규","SK");
	      System.out.println(names);
	      //한SK-두SK-세SK-네SK-오SK
	      
	      // === 10. "문자열".replaceFirst("변경대상문자열","새로이변경될문자열") ===
	      //		 "문자열" 에서 "변경대상문자열" 을 첫번째만 "새로이변경될문자열" 로 교체해서 반환해줌.
	      names = "한석규-두석규-세석규-네석규-오석규";
	      names = names.replaceFirst("석규","SK");
	      System.out.println(names);
	      // 한SK-두석규-세석규-네석규-오석규
	      
	      names = "한석규-두석규-세석규-네석규-오석규";
	      // === [퀴즈1] 위의 names 에서 첫번째 석규와 두번째 석규와 세번째 석규만 "석규"를 "SK"로 변환후 출력하세요.
	      
	      for(int i=0;i<3;i++) {
	    	  names = names.replaceFirst("석규", "SK");
	      }
	      System.out.println(names);
	      
	      input_str = "103-23-523-009";
	      input_str = input_str.replaceAll("-", "");
	      System.out.println(input_str);
	      
	      input_str = "    안녕    하세요   내일   은 즐거운  주말 입니다.";
	      input_str = input_str.replaceAll(" ","");
	      System.out.println(input_str);
	      //안녕하세요내일은즐거운주말입니다.
	      
	      
	      
	      // === "문자열".replace() 와 "문자열".replaceAll()의 차이점=== //
	      //     "문자열".replace() 는 정규표현식을 사용할 수 없다.
	      //     하지만
	      //     "문자열".replaceAll() 은 정규표현식을 사용할 수 있다.
	     
	      input_str = "103-23-523-009";
	      input_str = input_str.replaceAll("-", "");
	      System.out.println(input_str);
	      
	      input_str = "    안녕    하세요   내일   은 즐거운  주말 입니다.";
	      input_str = input_str.replace(" ","");
	      System.out.println(input_str);
	      //안녕하세요내일은즐거운주말입니다.
	      
	      /////////////////////////////////////////////////////////////
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      input_str = "java abcd javascript";
	      input_str = input_str.replace("abc", "");
	      System.out.println(input_str);
	      //java d javascript
	
	      input_str = "java abcd javascript";
	      input_str = input_str.replace("a", "").replace("b", "").replace("c", "");
	      System.out.println(input_str);
	      //jv bcd jvscript
	      //jv cd jvscript
	      //jv d jvsript
	      
	      input_str = "java abcd javascript";
	      input_str = input_str.replaceAll("[abc]", ""); // replaceAll 은 정규표현식도 사용이 가능하다.
	      System.out.println(input_str);
	      //jv d jvsrip
	      
	      input_str = "ja7va 98abc12d javas5cr424234ip123312312321321432544363t";
	      input_str = input_str.replaceAll("[0123456789]", "");
	      System.out.println(input_str);
	      //java abcd javascript
	      
	      input_str = "ja7va 98abc12d javas5cr424234ip123312312321321432544363t";
	      input_str = input_str.replaceAll("[0-9]", ""); //숫자인것만 제거
	      System.out.println(input_str);
	      //java abcd javascript
	      
	      input_str = "ja7va 98abc12d javas5cr424234ip123312312321321432544363t";
	      input_str = input_str.replaceAll("[0-4689]", "");//5와 7을뺀 숫자만 제거
	      System.out.println(input_str);
	      //ja7va abcd javas5crip5t
	      //5와 7은 냅두고 나머지 지움
	      // 연속적인것은 -로 표현하면 됨 그래서 0-4는 0부터 4까지 라는 뜻
	      
	      input_str = "ja7va 98abc12d javas5cr424234ip123312312321321432544363t";
	      input_str = input_str.replaceAll("[^0-9]", ""); // 0부터 9까지가 아닌것 제거
	      System.out.println(input_str);
	      //798125424234123312312321321432544363
	      
	      input_str = "ja7va 98abc12d javas5cr424234ip123312312321321432544363t";
	      input_str = input_str.replaceAll("\\d", "");
	      System.out.println(input_str);
	      //java abcd javascript
	      //\\d는 숫자

	      input_str = "ja7va 98abc12d javas5cr424234ip123312312321321432544363t";
	      input_str = input_str.replaceAll("\\D", "");
	      System.out.println(input_str);
	      //798125424234123312312321321432544363
	      //\\D는 숫자가 아닌것.
	      
	      input_str = "java KOREA 0070 !@#%$#";
	      input_str = input_str.replaceAll("[a-z]", "");// 소문자만 제거하라는 뜻
	      System.out.println(input_str);
	      // KOREA 0070 !@#%$#
	      
	      input_str = "java_ KOss_REA 0070 !@#%$#";
	      input_str = input_str.replaceAll("[a-zA-Z0-9_ ]", "");// 소문자 및 대문자 및 숫자 및 _ 및 공백만 제거하라는 뜻
	      System.out.println(input_str);
	      //!@#%$#
	      
	      input_str = "java_ KOss_REA 0070 !@#%$#";
	      input_str = input_str.replaceAll("[\\w ]", "");// 소문자 및 대문자 및 숫자 및 _ 및 공백만 제거하라는 뜻
//	      									정규표현식에서 \\w 은 word(단어)라는 뜻으로 대문자,소문자,숫자,_ 까지를 말한다
	      System.out.println(input_str);
	      //!@#%$#
	      
	      input_str = "java_ KOss_REA 0070 !@#%$#";
	      input_str = input_str.replaceAll("[^a-zA-Z0-9_]", "");// 소문자 및 대문자 및 숫자 및 _ 을 제외한 나머지 제거하라는 뜻
	      System.out.println(input_str);
	      //java_KOss_REA0070
	      
	      input_str = "java_ KOss_REA 0070 !@#%$#";
	      input_str = input_str.replaceAll("[\\W ]", "");// 소문자 및 대문자 및 숫자 및 _ 을 제외한 나머지 제거하라는 뜻
//	      									정규표현식에서 \\W 은 word(단어)가 아닌것 이라는 뜻으로 대문자,소문자,숫자,_ 까지를 말한다
	      System.out.println(input_str);
	      //java_KOss_REA0070
	      
	      System.out.println("\n ====== 퀴즈 ======== \n");
	      
	      String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"};
	      
	      
	      
	      //"건강"이라는 글자가 포함된것을 출력하세요.
	      // 문자열로 배열을 가져옴. 구분자 ,
	      //"건강"이라는 단어가 입력된 배열을 가져온다 어떻게? indexOf가 -1이면 안가져옴.
	      
	      //여기서 건강부터 ,전까지의 글자를 가져와야한다. 몇번반복? 무한인데 gungang_idx가 -1이 아닐때까지
	      for(int i=0;i<contents.length;i++) {
	    	  int gungang_idx = contents[i].indexOf("건강");
		      if(gungang_idx!=-1)
		      System.out.println(contents[i]);
	      }//end of for---
	      /*
	       	  건강하세요
	       	  즐겁고 건강한 하루되세요
	       */
	      
	      System.out.println("===========================================");
	      //"건강" 이라는 글자로 시작하는것을 출력하세요
	      for(int i=0;i<contents.length;i++) {
	    	  int gungang_idx = contents[i].indexOf("건강");
		      if(gungang_idx==0)
		      System.out.println(contents[i].substring(gungang_idx));
	      }//end of for---
	      /*
	          건강하세요
	       */
	      
	      // === 11. "문자열".startsWith("찾고자하는문자열") ===
	      //		 "문자열" 에서 "찾고자하는문자열"이 맨 첫번째에 나오면 true 를 반환
	      //	     "문자열" 에서 "찾고자하는문자열"이 맨 첫번째에 나오지 않으면 false를 반환.
	      
	      //"건강" 이라는 글자로 시작하는것을 출력하세요
	      for(int i=0;i<contents.length;i++) {
		      if(contents[i].startsWith("건강"))
		      System.out.println(contents[i]);
	      }//end of for---
	      
	      System.out.println("===========================================");
	      
	      // === 12. "문자열".endsWith("찾고자하는문자열") ===
	      //		 "문자열" 에서 "찾고자하는문자열"로 끝나면 true 를 반환
	      //	     "문자열" 에서 "찾고자하는문자열"로 끝나지 않으면 false를 반환.
	      
	      //"하세요" 이라는 글자로 시작하는것을 출력하세요
	      for(int i=0;i<contents.length;i++) {
		      if(contents[i].endsWith("하세요"))
		      System.out.println(contents[i]);
	      }//end of for---
	      
	      // === 13."문자열".trim() ===
	      //		"문자열: 의 좌,우에 공백이 있다라면 공백을 모두 제거하고서 반환해준다.
	      
	      String insa = "                수고       많으셨습니다        ";
	      System.out.println("하하하"+insa+"내일 뵐께요~~");
	      
	      System.out.println("하하하"+insa.trim()+"내일 뵐께요~~");
	      
	      // === 14."문자열".isEmpty() ===
	      //        "문자열" 이 아무것도 없으면 true 를 반환해주고,	
	      //        "문자열" 이 뭔가 있으면 false 를 반환해준다,
	      String str1="", str2="abc", str3="        ";
	      
	      System.out.println(str1.isEmpty());	//true
	      System.out.println(str2.isEmpty());	//false
	      System.out.println(str3.isEmpty());	//false
	      System.out.println(str3.trim().isEmpty());	//true
	      
	      // === 15."문자열".toUpperCase() ===
	      //		"문자열" 에서 소문자가 있으면 모두 대문자로 변경해서 반환해줌.
	      String words = "My Name is Tom 입니다.";
	      System.out.println(words.toUpperCase());
	      
	      // === 16."문자열".toLowerCase() ===
	      //		"문자열" 에서 대문자가 있으면 모두 소문자로 변경해서 반환해줌.
	      System.out.println(words.toLowerCase());
	      
	      // === 17. "문자열".equals("비교대상문자열")  ===
	      //     대문자와 소문자를 구분하면서
	      //     "문자열" 과 "비교대상문자열" 의 값이 일치하면  true 를 반환.
	      //      "문자열" 과 "비교대상문자열" 의 값이 일치하지 않으면  false 를 반환. 
	      
	      
	      // === 18. "문자열".equalsIgnoreCase("비교대상문자열")  ===
	      //     대문자와 소문자를 구분하지 않으면서 
	      //     "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하면  true 를 반환.
	      //      "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하지 않으면  false 를 반환.
	      
	      String[] strArr = {"korea", "seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세", null};
	      
	      // 검색어를 "korea" 라는 글자가 들어있는 것만 출력하세요.
	      
	      for(int i=0;i<strArr.length;i++) {
	    	  try {
		    	  if(strArr[i].indexOf("korea")!= -1)
		    	  System.out.println(strArr[i]);
	    	  }catch(NullPointerException e) {
		    	  
		      }
	      }
     
	      
	      
	      // "korea"
	      
	      System.out.println("\n============================================\n");
	      // 검색어를 "korea" 또는 "KOREA" 또는 "kOreA" 또는 "KOrea" 와 같이 했을때에
	      // 대,소문자를 구분치 않고 "korea" 라는 글자가 들어있는 것만 출력하세요.
	      
      for(int i=0;i<strArr.length;i++) {
    	  try {
    		  if(strArr[i].toLowerCase().indexOf("korea") != -1)
    			  System.out.println(strArr[i]);
    	  }catch(NullPointerException e) {
	    	  
	      }
      }
	      
	      
	}// end of main()------------------------------

}
