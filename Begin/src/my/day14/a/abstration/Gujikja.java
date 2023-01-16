package my.day14.a.abstration;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Gujikja {

		
		
		//filed 생성
		String name; // 성명
		String jubun; // 주민번호인데 앞자리6자리에 성별을 나타내는 1자리까지만 입력한다.
					  // 예: "9506201" "9607202" "0006203"  "0106204"
		String register_day; // 가입일자
		
		public Gujikja() {
			Date now = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

//			System.out.println("오늘날짜 : " +df.format(now));
			register_day = df.format(now);
		}
		
		//method 생성
		// == 구직자의 나이를 알려주는 메소드 생성하기 ==
		int getAge() {
			
			// 현재나이 = 현재년도 - 태어난년도 + 1
			
			Calendar currentDate = Calendar.getInstance();	//현재날짜와 시간을 얻어온다.
			int currentYear = currentDate.get(Calendar.YEAR);	//현재년도 2022
			
			int centry = (Integer.parseInt(jubun.substring(6)) == 1||Integer.parseInt(jubun.substring(6)) == 2)?1900:2000;
			
			int birthYear = Integer.parseInt(jubun.substring(0,2))+centry;// 태어난년도
			
			
			return currentYear-birthYear+1;
		}//end of getAge()--------------
		
		// == 구직자의 성별을 알려주는 메소드 생성하기 ==
		
		String getGender() {
			if(Integer.parseInt(jubun.substring(6))%2==0) {
				return "여";
			}
			else {
				return "남";
			}
		}//end of getGender()----------------------
		
		
		
		// == 구직자의 정보를 출력해주는 메소드 생성하기 ===
		void showInfo() {
			System.out.println("1.성명 : "+name+"\n"
							 + "2.현재나이 : "+getAge() +"\n"
							 + "3.성별 : "+getGender() +"\n"
							 + "4.가입일자 : "+register_day+"\n");
		}//end of void showInfo()-----------------
		

}
