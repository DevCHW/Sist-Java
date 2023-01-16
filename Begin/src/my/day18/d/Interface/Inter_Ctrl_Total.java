package my.day18.d.Interface;

import java.util.Scanner;

public interface Inter_Ctrl_Total {

	// == 메인 메뉴를 보여주는 메소드 생성하기 == //
	void main_menu();
	// public abstract void main_menu(); 이다
		
	// == Gujikja 객체 및 Company 객체를 Member[] mbr_arr 배열에 저장시키는 메소드 생성하기 == //
	void save_mbr_arr(Member mbr, Member[] mbr_arr);
	
	// === 구직자(Gujikja) 신규 회원가입시 
	//     Gujikja 클래스의 field 의 요구사항에 모두 맞으면 
	//     Member[] mbr_arr 에 저장시켜주는 메소드 생성하기 ===
		void register_gu(Scanner sc, Member[] mbr_arr);

	// === 구인회사(Company) 신규 회원가입시 
	//     Company 클래스의 field 의 요구사항에 모두 맞으면 
	//     Member[] mbr_arr 에 저장시켜주는 메소드 생성하기 ===
		void register_cp(Scanner sc, Member[] mbr_arr) ;
		
	// 구직자 로그인
	public Gujikja login_gu(Scanner sc, Member[] mbr_arr);
	

	// 구직자 전용메뉴
	public void gu_menu(Gujikja login_gu, Member[] mbr_arr, Scanner sc);
	
	
	// === 내정보 수정을 해주는 메소드 ===
	public void update_myInfo(Gujikja login_gu, Scanner sc);
	
	// === 모든 구인회사 정보를 조회 해주는 메소드 ===
	public void show_all_companyInfo(Member[] mbr_arr);
	
	// 구인회사 로그인
	public Company login_cp(Scanner sc, Member[] mbr_arr);
	
	// 구인회사 전용메뉴
    public void cp_menu(Company login_cp, Member[] mbr_arr, Scanner sc);
   
    // == 내정보 보기를 해주는 메소드 생성하기 == //
    public void show_myInfo(Company login_cp); 
    
 // == 내정보 보기를 해주는 메소드 생성하기 == //
 	public void show_myInfo(Gujikja login_gu);
}
