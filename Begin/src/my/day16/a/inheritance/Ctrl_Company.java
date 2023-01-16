package my.day16.a.inheritance;

import java.util.Scanner;

public class Ctrl_Company {

	// == Company 객체를 Company[] cp_arr 배열에 저장시키는 메서드 생성하기 ==//
		void save_cp_arr(Company cp,Company[] cp_arr) {
				if(cp.getId()!=null &&
					cp.getPasswd()!=null &&
					cp.getName()!=null &&
					cp.getBusiness_number()!=null) {
					
				cp_arr[Company.count++] = cp;
				
				System.out.println("[구인회사 회원으로 가입 성공함!!]\n");
			}
			else {
				System.out.println("[구인회사 회원가입 실패함!!]\n");
			}
		}//end of void save_cp_arr(cpjikja cp,cpjikja[] cp_arr) --------
		
		// === 구직자(cpjikja) 신규 회원가입시 
	//     cpjikja 클래스의 field 의 요구사항에 모두 맞으면 
	//     cpjikja[] cp_arr 에 저장시켜주는 메소드 생성하기 ===
	void register(Scanner sc, Company[] cp_arr) {
		
		if(Company.count < cp_arr.length) { // 지금까지 생성된 구직자 회원수가 cp_arr.length(정원) 보다 적을 경우에만 신규회원을 받아들인다.  
		
			
			
			// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
			// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
			String id;
			
			boolean isUseID;
			
			do {
				isUseID = true;
				
				System.out.print("1.아이디 : ");
				id = sc.nextLine();  // "eomjh"  "leess" 
				
				// == 가입된 회원들에 대해 중복아이디 검사하기 == //
				if( !id.trim().isEmpty() ) {
					for(int i=0; i<Company.count; i++) {
					 	if( id.equals(cp_arr[i].getId()) ) {
					 		System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
					 		isUseID = false;
					 		break;
					 	}
					}// end of for------------------
				}//end of if------
				
				else {  // ""  또는  "       "
					isUseID = false;
				}//end of else----
				
			} while (!isUseID);
			// end of do ~ while----------------------

			System.out.print("2.비밀번호 : ");
			String passwd = sc.nextLine();  // "qW12$"  "qwer1234$"   "qWer1234$" 
			
			System.out.print("3.회사명 : ");
			String name = sc.nextLine();  // "엄정화"  ""   "       " 
		
		
			System.out.print("4.사업자등록번호 : ");
			String business_number = sc.nextLine();  // ""  ""   ""

			System.out.print("5.회사직종타입 : ");
			String jpbType = sc.nextLine();
			
			System.out.print("6.자본금 : ");
			String seedMoney= sc.nextLine();
			
			
			Company cp = new Company();
			cp.setId(id);
			cp.setPasswd(passwd);
			cp.setName(name);
			cp.setBusiness_number(business_number);
			cp.setJobType(jpbType);		
			cp.setSeedMoney(Long.parseLong(seedMoney));
			save_cp_arr(cp, cp_arr);
		
		}
		
		else { // 지금까지 생성된 구직자 회원수가 cp_arr.length(정원) 과 같거나 큰 경우에는 신규회원을 받아들이면 안된다.  
			System.out.println(">> 정원이 초과하여 구인회사 회원가입이 불가합니다 !! <<\n");
		}
		
	}// end of void register(Scanner sc, Company[] cp_arr)-----------------------

	
	// ==구인회사 로그인 메서드 ==//
	public Company login(Scanner sc, Company[] cp_arr) {
		
		System.out.print("▷ 구인회사 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0;i<cp_arr.length;i++) {
			if(cp_arr[i] == null) {
				break;
			}
			else {
				if(cp_arr[i].getId().equals(id)&&cp_arr[i].getPasswd().equals(passwd)) {
					return cp_arr[i];
				}
			}
		}//end of for------
		
		
		return null;
	}//end of public Company login(Scanner sc, Company[] cp_arr) 

	//== 로그인했을 때 구인회사 메뉴 ==//
	public void cp_menu(Scanner sc, Company login_cp, Company[] cp_arr) {
		
		
		
	}//end of public void cp_menu(Scanner sc, Company login_cp, Company[] cp_arr)

	
	
}
