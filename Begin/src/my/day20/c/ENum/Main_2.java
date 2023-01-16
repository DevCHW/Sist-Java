package my.day20.c.ENum;

import java.util.Calendar;

public class Main_2 {

	public static void main(String[] args) {

		Calendar currentDate = Calendar.getInstance();	//현재 날짜와 시간을 얻어온다.
		int currentMonth = currentDate.get(Calendar.MONTH)+1; // 현재 월
		
		System.out.println(currentMonth); // 6
		
		String season = null;
		
		if(1<=currentMonth&& currentMonth <= 2|| currentMonth == 12) {
			season = Season_1.WINTER;
		}
		else if(3<=currentMonth&& currentMonth <= 5) {
			season = Season_1.SPRING;
		}
		else if(6<=currentMonth&& currentMonth <= 8) {
			season = Season_1.SUMMER;
		}
		else if(9<=currentMonth&& currentMonth <= 11) {
			season = Season_1.AUTUMN;
		}
		
		System.out.println(season); //여름
		
		System.out.println("==================================================");
		
		if(1<=currentMonth&& currentMonth <= 2|| currentMonth == 12) {
			season = "딸기";
		}
		else if(3<=currentMonth&& currentMonth <= 5) {
			season = "집에 보내줘요";
		}
		else if(6<=currentMonth&& currentMonth <= 8) {
			season = "치킨 2마리";
		}
		else if(9<=currentMonth&& currentMonth <= 11) {
			season = "몰라";
		}
		
		System.out.println(season); //여름
		
		System.out.println("==================================================");
		
		/*
	        위와 같이 우리가 기대하는 값인 4계절명(봄,여름,가을,겨울)이 아닌 String 타입만 되면 어떤 것이든지 
	        들어올 수 있기 때문에 자바는 오류가 아니지만 사용자 측면에서는 오류가 발생될 수 있다.
	        이러한 경우 "서로 연관된 상수들의 집합"을 의미하는 enum(열거형)이라는 타입을 사용하여 해결할 수 있다.
        */  
		
		SeasonType_3 stype = null;
		
		if(1<=currentMonth&& currentMonth <= 2|| currentMonth == 12) {
			stype = SeasonType_3.겨울;
		}
		else if(3<=currentMonth&& currentMonth <= 5) {
			stype = SeasonType_3.봄;
		}
		else if(6<=currentMonth&& currentMonth <= 8) {
			stype = SeasonType_3.여름;
		}
		else if(9<=currentMonth&& currentMonth <= 11) {
			stype = SeasonType_3.가을;
		}
		
		System.out.println(stype); //여름
		
		System.out.println("==================================================");
		
		/*
		  stype 변수에는 enum 으로 열거된
		  SeasonType_3.봄 SeasonType_3.여름 SeasonType_3.가을 SeasonType_3.겨울 이외의 값은 들어올 수가 없다.
		 */
		
		switch (stype) {
//		case 봄:    				오류 발생함
//		case SeasonType_3.봄:    오류 발생함
//		case "딸기":    오류 발생함
		case 봄:    
			System.out.println("따스한 봄입니다.");
			break;
		case 여름:
			System.out.println("무더운 여름입니다.");
			break;
		case 가을:
			System.out.println("시원한 가을입니다.");
			break;
		case 겨울:
			System.out.println("추운 겨울입니다.");
			break;
		}//end of switch()--------
		
	}// end of main()----------------------

}
