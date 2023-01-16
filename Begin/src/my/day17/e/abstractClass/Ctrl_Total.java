package my.day17.e.abstractClass;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ctrl_Total {

	// == 메인 메뉴를 보여주는 메소드 생성하기 == //
	public void main_menu() {
		System.out.println("\n === 메인메뉴 ===\n"
				         + "1.구직자 회원가입   2.구인회사 회원가입   3.구직자 로그인    4.구인회사 로그인     5.프로그램종료\n"); 
		System.out.print("▷ 메뉴번호 선택 : ");
	}
	
	
	// == Gujikja 객체 및 Company 객체를 Member[] mbr_arr 배열에 저장시키는 메소드 생성하기 == //
	void save_mbr_arr(Member mbr, Member[] mbr_arr) {
		
		Gujikja gu = null;
		Company cp = null;
		
		if( mbr instanceof Gujikja ) {
			gu = (Gujikja)mbr;
		}
		else {
			cp = (Company)mbr; 
		}
				
		if( cp == null && gu != null &&
			gu.getId() != null &&
			gu.getPasswd() != null &&
			gu.getName() != null &&
			gu.getJubun() != null ) {
			
			mbr_arr[Member.count++] = gu;
			
			System.out.println("[구직자 회원으로 가입 성공함!!]\n");
		}
		
		else if( cp == null && gu != null ){
			System.out.println("[구직자 회원 가입 실패함!!]\n");
		}
		
		else if( gu == null && cp != null &&
				 cp.getId() != null &&
				 cp.getPasswd() != null &&
				 cp.getName() != null &&
				 cp.getBusiness_number() != null ) {

			mbr_arr[Member.count++] = cp;
			
			System.out.println("[구인회사 회원으로 가입 성공함!!]\n");
		}
		
		else {
			System.out.println("[구인회사 회원 가입 실패함!!]\n");
		}
		
	}// end of void save_mbr_arr(Member mbr, Member[] mbr_arr)------------
	
	
	
	// === 구직자(Gujikja) 신규 회원가입시 
	//     Gujikja 클래스의 field 의 요구사항에 모두 맞으면 
	//     Member[] mbr_arr 에 저장시켜주는 메소드 생성하기 ===
	void register_gu(Scanner sc, Member[] mbr_arr) {
		
		if(Member.count < mbr_arr.length) { // 지금까지 생성된 구직자 및 구인회사 회원수가 mbr_arr.length(정원) 보다 적을 경우에만 신규회원을 받아들인다.  
					
			// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
			// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
			String id;
			
			boolean isUseID;
			
			do {
				isUseID = true;
				
				System.out.print("1.아이디 : ");
				id = sc.nextLine();  // "eomjh"  "leess" 
				
				// == 가입된 구직자 회원들 중에서 중복아이디 검사하기 == //
				if( !id.trim().isEmpty() ) {
					for(int i=0; i<Member.count; i++) {
					 	if( mbr_arr[i] instanceof Gujikja && id.equals(mbr_arr[i].getId()) ) {
					 		System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
					 		isUseID = false;
					 		break;
					 	}
					}// end of for------------------
				}
				
				else {  // ""  또는  "       "
					isUseID = false;
				}
				
			} while (!isUseID);
			// end of do ~ while----------------------
			
			
			System.out.print("2.비밀번호 : ");
			String passwd = sc.nextLine();  
			
			System.out.print("3.성명 : ");
			String name = sc.nextLine();  		
			
			System.out.print("4.주민번호 : ");
			String jubun = sc.nextLine();  
						
			Gujikja gu = new Gujikja();
			gu.setId(id);
			gu.setPasswd(passwd);
			gu.setName(name);
			gu.setJubun(jubun);
					
			save_mbr_arr(gu, mbr_arr);
			
		}
		
		else { // 지금까지 생성된 구직자 및 구인회사 회원수가 mbr_arr.length(정원) 과 같거나 큰 경우에는 신규회원을 받아들이면 안된다.  
			System.out.println(">> 정원이 초과하여 구직자 회원가입이 불가합니다 !! <<\n");
		}
		
	}// end of void register_gu(Scanner sc, Member[] mbr_arr)-----------------------		
	
	
	
	// === 구인회사(Company) 신규 회원가입시 
	//     Company 클래스의 field 의 요구사항에 모두 맞으면 
	//     Member[] mbr_arr 에 저장시켜주는 메소드 생성하기 ===
	void register_cp(Scanner sc, Member[] mbr_arr) {
		
		if(Member.count < mbr_arr.length) { // 지금까지 생성된 구직자 및 구인회사 회원수가 mbr_arr.length(정원) 보다 적을 경우에만 신규회원을 받아들인다.  
			
			// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
			// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
			String id;
			
			boolean isUseID;
			
			do {
				isUseID = true;
				
				System.out.print("1.아이디 : ");
				id = sc.nextLine();  // "samsung"  "lg" 
				
				// == 가입된 구인회사들 에서만 중복아이디 검사하기 == //
				if( !id.trim().isEmpty() ) {
					for(int i=0; i<Member.count; i++) {
					 	if( mbr_arr[i] instanceof Company && id.equals(mbr_arr[i].getId()) ) {
					 		System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
					 		isUseID = false;
					 		break;
					 	}
					}// end of for------------------
				}
				
				else {  // ""  또는  "       "
					isUseID = false;
				}
				
			} while (!isUseID);
			// end of do ~ while----------------------
			
			
			System.out.print("2.비밀번호 : ");
			String passwd = sc.nextLine();  
			
			System.out.print("3.회사명 : ");
			String name = sc.nextLine();  		
			
			System.out.print("4.사업자등록번호 : ");
			String business_number = sc.nextLine(); 
			
			System.out.print("5.회사직종타입 : ");
			String jobType = sc.nextLine();
			
			System.out.print("6.자본금 : ");
			String seedMoney = sc.nextLine();
			
						
			Company cp = new Company();
			cp.setId(id);
			cp.setPasswd(passwd);
			cp.setName(name);
			cp.setBusiness_number(business_number);
			cp.setJobType(jobType);
			cp.setSeedMoney(Long.parseLong(seedMoney));
					
			save_mbr_arr(cp, mbr_arr);
			
		}
		
		else { // 지금까지 생성된 구직자 및 구인회사 회원수가 mbr_arr.length(정원) 과 같거나 큰 경우에는 신규회원을 받아들이면 안된다.  
			System.out.println(">> 정원이 초과하여 구인회사 회원가입이 불가합니다 !! <<\n");
		}
		
	}// end of register_cp(Scanner sc, Member[] mbr_arr)-----------------------		
	
	
	// 구직자 로그인
	public Gujikja login_gu(Scanner sc, Member[] mbr_arr) {
		
		System.out.print("▷ 구직자 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Member.count; i++) {
			
			if( mbr_arr[i] instanceof Gujikja &&
				mbr_arr[i].getId().equals(id) && mbr_arr[i].getPasswd().equals(passwd) ) {
				return (Gujikja) mbr_arr[i];
			}
			
		}// end of for--------------------
		
		return null;
	}// end of public Gujikja login(Scanner sc, Gujikja[] gu_arr)------------
	

	// 구직자 전용메뉴
	public void gu_menu(Gujikja login_gu, Member[] mbr_arr, Scanner sc) {
		
		String str_menuno = "";
		
		do {
			System.out.println("=== 구직자 전용메뉴("+login_gu.getName()+"님 로그인중)===\n"
					         + "1.내정보 보기    2.내정보 수정    3.모든구인회사 조회    4.로그아웃\n");
			
			System.out.print("▷ 메뉴번호 선택 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1":  // 내정보 보기
					show_myInfo(login_gu);
					break;
					
				case "2":  // 내정보 수정
					update_myInfo(login_gu, sc);
					break;
					
				case "3":  // 모든구인회사 조회
					login_gu.view_dater(mbr_arr);
					break;
					
				case "4":  // 로그아웃
					login_gu = null;
					break;				
		
				default:
					System.out.println("[경고] 메뉴에 있는 번호만 선택하세요!!\n");
					break;
			}// end of switch()-------------------------
		
		} while( !("4".equals(str_menuno)));
		
		System.out.println(">> 로그아웃 되었습니다.<< \n");
		
	}// end of public void gu_menu()----------------------------------------
	
	
	// == 내정보 보기를 해주는 메소드 생성하기 == //
	public void show_myInfo(Gujikja login_gu) {
        
		System.out.println("\n=== "+login_gu.getName()+"님의 정보 ===");
	//	System.out.println(login_gu.toString());
	//  또는 	
		System.out.println(login_gu);
					
	}// end of public void show_myInfo(Gujikja login_gu)----------------------
		
	
	// === 내정보 수정을 해주는 메소드 ===
	public void update_myInfo(Gujikja login_gu, Scanner sc) {
		
		show_myInfo(login_gu);
		
		System.out.println(">> [주의사항] 변경하지 않고 예전의 데이터값을 사용하시려면 그냥 엔터하세요!!");
		
		System.out.print("1.비밀번호 : ");
		String passwd = sc.nextLine();
		
		System.out.print("2.성명 : ");
		String name = sc.nextLine();
		
		System.out.print("3.주민번호 : ");
		String jubun = sc.nextLine();
		
		System.out.print("4.희망연봉 : ");
		String hope_money = sc.nextLine();
		
		System.out.println("");
		
		if( !passwd.trim().isEmpty() ) { 
			login_gu.setPasswd(passwd);
		}
		
		if( !name.trim().isEmpty() ) { 
			login_gu.setName(name);
		}
		
		if( !jubun.trim().isEmpty() ) { 
			login_gu.setJubun(jubun);
		}
		
		if( !hope_money.trim().isEmpty() ) { 
			login_gu.setHope_money(Integer.parseInt(hope_money));
		}
		
	}// public void update_myInfo(Gujikja login_gu)------------------------------
	
	
	// === 모든 구인회사 정보를 조회 해주는 메소드 ===
	public void show_all_companyInfo(Member[] mbr_arr) {
		
		int company_count = 0;
		
		for(int i=0; i<Member.count; i++) {
			if( mbr_arr[i] instanceof Company ) {
				company_count++;
			}
		}// end of for------------------------------
		
		
		if(company_count == 0) { 
			System.out.println(">> 구인회사로 등록된 회사가 한개도 없습니다. <<\n");
		}
		
		else {
			
			System.out.println("======================================\n"
					         + "회사명    업종    사업자등록번호    자본금\n"
					         + "======================================");
			
			StringBuilder sb = new StringBuilder();
			
			// 1. 첫번째 방법
		/*	
			for(int i=0; i<Member.count; i++) {
			
				if(mbr_arr[i] instanceof Company) {
				//	sb.append(mbr_arr[i].toString()+"\n");
				//  또는	
					sb.append(mbr_arr[i]+"\n");
				}
			}
			System.out.println(sb.toString());
		*/	
			
			// 2. 두번째 방법
			DecimalFormat df = new DecimalFormat("#,###");
			
			for(int i=0; i<Member.count; i++) {
				if(mbr_arr[i] instanceof Company) {
					sb.append(mbr_arr[i].getName()+"\t"+
						      ((Company)mbr_arr[i]).getJobType()+"\t"+
						      ((Company)mbr_arr[i]).getBusiness_number()+"\t"+
						      df.format(((Company)mbr_arr[i]).getSeedMoney())+"원\n");
				}
			}
			System.out.println(sb.toString());
			
		}
		
	}// end of public void show_all_companyInfo(Company[] cp_arr)----------------	

	// 구인회사 로그인
	public Company login_cp(Scanner sc, Member[] mbr_arr) {
		
		System.out.print("▷ 구인회사 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Member.count;i++) {
			if(mbr_arr[i] instanceof Company &&
				mbr_arr[i].getId().equals(id) && mbr_arr[i].getPasswd().equals(passwd)	) {
				return(Company) mbr_arr[i];
			}
		}//end of for-----
		return null;
	}//end of public Company login_cp(Scanner sc, Member[] mbr_arr)

	
	// 구인회사 로그인했을때 메뉴
	// 구인회사 전용메뉴
	   public void cp_menu(Company login_cp, Member[] mbr_arr, Scanner sc) {
	      
	      String str_menuno = "";
	      
	      do {
	         System.out.println("=== 구인회사 전용메뉴("+login_cp.getName()+"님 로그인중)===\n"
	                        + "1.내회사정보 보기    2.내회사정보 수정    3.모든구직자 조회    4.로그아웃\n");
	         
	         System.out.print("▷ 메뉴번호 선택 : ");
	         str_menuno = sc.nextLine();
	         
	         switch (str_menuno) {
	            case "1":  // 내회사정보 보기
	               show_myInfo(login_cp);
	               break;
	               
	            case "2":  // 내회사정보 수정
	               update_myInfo(login_cp, sc);
	               break;
	               
	            case "3":  // 모든구직자 조회
	               login_cp.view_dater(mbr_arr);
	               break;
	               
	            case "4":  // 로그아웃
	               login_cp = null;
	               break;            
	      
	            default:
	               System.out.println("[경고] 메뉴에 있는 번호만 선택하세요!!\n");
	               break;
	         }// end of switch()-------------------------
	      
	      } while( !("4".equals(str_menuno)));
	      
	      System.out.println(">> 로그아웃 되었습니다.<< \n");
	      
	      // =================================================================//
	      // 동일한 결과물을 다른 방법으로 나오게 끔 해보겠습니다. //
	      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 	      
	      System.out.println("======================또다른방법=================\n");
	      
	      System.out.println("======================================\n"
					         + "회사명    업종    사업자등록번호    자본금\n"
					         + "======================================");
		
	      StringBuilder sb = new StringBuilder();
	      
	      for(int i=0; i<Member.count; i++) {
	    	  if(mbr_arr[i] instanceof Company) {
	    		  sb.append(mbr_arr[i].view_info());
	    	  }

	      }// end of for-------
	
	      System.out.println(sb.toString());
	      
	   }// end of public void cp_menu()----------------------------------------   

	   //*** 면접에서 물어보는 것 중 하나인데 메소드의 오버로딩(overloading) 과 메소드의 오버라이딩(overriding)

	   //메소드 오버로딩(overloading)이란?
	   //메소드의 이름이 같지만 파라미터의 개수 또는 파라미터의 타입의 순서가 다르면
	   //메소드의 이름이 비록 같더라도 서로 다른 메소드로 보기 때문에 중복이 아니다.
	   //조심할 사항은 메소드의 리턴타입은 다르지만 메소드의 파라미터 형식이 똑같으면 동일한 메소드로 보기 때문에 중복되어 오류가 발생한다.

	   
	   


	// == 내정보 보기를 해주는 메소드 생성하기 == //
		public void show_myInfo(Company login_cp) {
	        
			System.out.println("\n=== "+login_cp.getName()+"님의 정보 ==="
					         + "회사이름\t직종\t사업자번호\t자본금");
		//	System.out.println(login_gu.toString());
		//  또는 	
			System.out.println(login_cp);
						
		}// end of public void show_myInfo(Gujikja login_gu)----------------------
			


	private void update_myInfo(Company login_cp, Scanner sc) {
		
	  show_myInfo(login_cp);
    
    System.out.println(">> [주의사항] 변경하지 않고 예전의 데이터값을 사용하시려면 그냥 엔터하세요!!");
    
    System.out.print("1.비밀번호 : ");
    String passwd = sc.nextLine();
    
    System.out.print("2.회사명 : ");
    String name = sc.nextLine();
    
    System.out.print("3.사업자등록번호 : ");
    String business_number = sc.nextLine(); 
    
    System.out.print("4.회사직종타입 : ");
    String jobType = sc.nextLine();
    
    System.out.print("5.자본금 : ");
    String seedMoney = sc.nextLine();
    
    System.out.println("");
    
    if( !passwd.trim().isEmpty() ) { 
       login_cp.setPasswd(passwd);
    }
    
    if( !name.trim().isEmpty() ) { 
       login_cp.setName(name);
    }
    
    if( !business_number.trim().isEmpty() ) { 
       login_cp.setBusiness_number(business_number);
    }
    
    if( !jobType.trim().isEmpty() ) { 
       login_cp.setJobType(jobType);
    }
    
    if( !seedMoney.trim().isEmpty() ) { 
       login_cp.setSeedMoney(Integer.parseInt(seedMoney)); 
    }

	}
	
	
}
