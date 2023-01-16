package my.day18.e.exception;

public class Main_exception_test {

	public static void main(String[] args) {
		
		System.out.println("\n 1.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		//1.ArrayIndexOutOfBoundsException
		//==> 배열의 크기가 오버가 되어지면 발생하는 익셉션
		
		
		//String[] subject_arr = new String[]{"자바","오라클","JSP"};
		//또는
		String[] subject_arr = new String[]{"자바","오라클","JSP"};
		try {
			
			for(int i=0;i<=subject_arr.length; i++) {
				System.out.println(subject_arr[i]);
			}//end of for---
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. <<");
			System.out.println(e.getMessage());	//어디가 잘못되었는지 메세지만 뜸
//			e.printStackTrace();	//어디가 잘못되었는지 추적해서 프린트
		}
	
		System.out.println("\n 2.~~~~~~~~~~~~~~~~~~~~~~~~ \n");
	      
	      
	      // 2. ArithmeticException 
	      // ==> 분모에 0 이 들어가는 경우에 발생하는 익셉션
	      
	      try {
	         int num = 10;
	         
	         for(int i=2; i>=0; i--) {
	            System.out.println(num/i);
	         }
	      } catch(ArithmeticException e) {
	         System.out.println(">> 분모에는 0 이 올 수 없습니다. \n"); 
	       // System.out.println(e.getMessage());
	         // e.getMessage() 은 오류메시지를 알려주는 것이다. 
	            
	         // e.printStackTrace(); // 어디가 오류인지를 추적해서 알려준다.
	      }
	
	      System.out.println("\n 3.~~~~~~~~~~~~~~~~~~~~~~~~ \n");
	      
	      int[] num_arr = {10,20,30};
	      
	      for(int i=3;i>=0;i--) {
	    	  try {
	    	  int val = num_arr[i]/i;
	    	  System.out.println(val);
	    	  }catch(ArrayIndexOutOfBoundsException e) {
	    		  System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. <<");
	    	  }
	    	  catch(ArithmeticException e) {
	    		  System.out.println(">> 분모에는 0 이 올 수 없습니다. \n");
	    	  }
	      }//end of for------------------
	      
	      System.out.println("\n 4.~~~~~~~~~~~~~~~~~~~~~~~~ \n");
	      
	      int[] num2_arr = {10,20,30};
	      
	      for(int i=3;i>=0;i--) {
	    	  try {
	    	  
	    	  int val = num2_arr[i]/i;
	    	  System.out.println(val);
	    	  
	    	  }catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
	    		  e.printStackTrace();
	    	  }
	      }//end of for------------------
	      
//	      System.out.println("\n 5.~~~~~~~~~~~~~~~~~~~~~~~~ \n");
//	      
//	      String[] str_arr = {"10","스물","30"};
//	      
//	      for(int i=3;i>=0;i--) {
//	    	  try {
//	    		  
//	    	  int val = Integer.parseInt(str_arr[i])/i;
//	    	  System.out.println(val);
//	    	  
//	    	  }catch(Exception e) {
//	    		  System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. <<");
//	    	  }
//	    	  catch(ArithmeticException e) {
//	    		  System.out.println(">> 분모에는 0 이 올 수 없습니다. \n");
//	    	  }catch(ArrayIndexOutOfBoundsException e) {	// if의 else와 비슷함, 그냥 익셉션 쓰면 모든오류를 말한다.
//	    		  System.out.println("오류 메시지 : " + e.getMessage());
//	    	  }
//	      }//end of for------------------
//	      
////	      === [!!! 중요 !!!] ===
////	      익셉션 처리시 부모클래스의 익셉션이 맨 아래에 나와야 한다.
////	      왜냐하면 익셉션 처리는 위에서 처리되면서 위의것이 처리가 안되면
////	      아래로 내려가라는 말인데 부모 클래스의 익셉션이 먼저 나오고 
////	      자식 클래스의 익셉션이 아래에 나오면 부모클래스 익셉션이 처리를 못한것을
////	      자식클래스 익셉션이 처리를 해라는 것은 모순이기 때문이다.

//	      System.out.println("\n 6.~~~~~~~~~~~~~~~~~~~~~~~~ \n");
//
//	      String[] str_num_arr = {"10","20","삼십","40"};
//	      
//	      int count = 0;
//	      
//	      for(String str:str_num_arr) {
//	    	  try {
//	    		  System.out.println(Integer.parseInt(str));
//			} finally {
//				// finally 은 위에서 오류가 발생하든지 또는 위에서 오류가 발생하지 않든지 관계없이 무조건 
//				//실행해야 하는 것들은 finally 속에 기술해주면 된다.
//				//try에서 오류가 발생해도 finally 안에 있는 것들은 끝내고 던져라
//				System.out.println(++count +"번 반복 >> 여기는 오류가 발생하든 발생하지 않든 무조건 실행되어야 합니다. <<");
//			}
//	      }//end of for--------
	      
	      
	      
	      System.out.println("\n 7.~~~~~~~~~~~~~~~~~~~~~~~~ \n");

	      String[] str_num2_arr = {"10","20","삼십","40"};
	      
	      int count2 = 0;
	      
	      for(String str:str_num2_arr) {
	    	  try {
	    		  System.out.println(Integer.parseInt(str));
	    	  }catch(Exception e) {
	    		  System.out.println(str_num2_arr[count2]+"는 숫자로 변경이 불가합니다.");
	    	  }finally {
	    		  
				// finally 은 위에서 오류가 발생하든지 또는 위에서 오류가 발생하지 않든지 관계없이 무조건 
				//실행해야 하는 것들은 finally 속에 기술해주면 된다.
				//try에서 오류가 발생해도 finally 안에 있는 것들은 끝내고 던져라
				System.out.println(++count2 +"번 반복 >> 여기는 오류가 발생하든 발생하지 않든 무조건 실행되어야 합니다. <<\n");
			}
	      }//end of for--------
	}//end of main()-------------------------
	
}
