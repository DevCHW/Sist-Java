package my.day20.d.ENUM;

public class Main_2 {

	public static void main(String[] args) {
		
		// *** enum(열거형) 타입인 SeasonType_1 에 열거되어진 데이터 값이 뭐가 있는지 확인하고자 한다. *** //
		SeasonType_1[] season_arr = SeasonType_1.values();
		//SeasonType_1.values();을 실행하면 enum(열거형)의 모든 상수를 배열에 담아 반환시켜준다.
		
		System.out.println("1.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(SeasonType_1 season : season_arr) {
			/*
			 	모든 enum(열거형)은 추상 클래스 Enum 의 자손이다.
			 	즉,enum(열거형)의 조상은 java.lang.Enum 클래스이다.
			 	그러므로 enum(열거형)타입은 클래스이며, java.lang.Enum 클래스에서 정의되어진 메소드 들을 사용할 수 있게 된다.
			 */
			String season_name = season.name();
			// name() 메소드는 enum(열거형) 상수의 값을 문자열(String)로 반환해주는 것이다.
			
			System.out.println(season_name);
		}//end of for--------
		
		System.out.println("\n2.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(SeasonType_1 season : season_arr) {
			int order = season.ordinal();
			// ordinal() 메소드는 enum(열거형) 상수가 정의된 순서를 반환해주는 것이다.
			// 순서는 0부터 시작한다.
			String season_name = season.name();
			// name() 메소드는 enum(열거형) 상수의 값을 문자열(String)로 반환해주는 것이다.
			
			System.out.println(order + "."+season_name);
		}//end of for--------
		/*
		 0.봄
		1.여름
		2.가을
		3.겨울
		 */
		
		System.out.println("\n3.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		String str = "";
		
		try {
			str = "여름";
			SeasonType_1 season = SeasonType_1.valueOf(str);
			// valueOf() 메소드는 열거형 SeasonType_1 에서 문자열 "여름"과 일치하는 열거형 상수를 반환해주는 것이다.
			season = SeasonType_1.valueOf(str);
			System.out.println(str);
			
			str = "한여름";
			season = SeasonType_1.valueOf(str);
			System.out.println(str);
		}catch(IllegalArgumentException e) {
			System.out.println(">> 열거형 상수에는 "+str+"이 없습니다. <<");
		}
		//>> 열거형 상수에는 "+str+"이 없습니다. <<
		
		
		
		
		
		
	}

}
