package my.day18.d.Interface;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company extends Member{
	// field 생성
		private String business_number;   // 사업자등록번호 (사업자등록번호는 맨 앞에 0이 들어올 수 있다는 전제하에 하겠습니다. 그래서 String 으로 합니다.) 
		private String jobType;           // 회사직종타입(제조업, 서비스업, IT, ....)
		private long seedMoney;           // 자본금
		
		
		
		// method 생성
		// getter, setter 하기
		public String getBusiness_number() {
			return business_number;
		}

		public void setBusiness_number(String business_number) {
			// 사업자등록번호는 오로지 숫자로만 들어와야 하며, 사업자등록번호의 길이는 10글자로 하겠습니다.
			
			// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
			Pattern p = Pattern.compile("^[0-9]{10}$");
			// ^ 은 시작을 의미한다.
			// $ 는 끝을 의미한다.
			// [] 는 글자 1개가 들어오는 것을 의미한다.
			// {10} 은 반복되어지는 회수를 말하는데 10번 반복해야 한다는 말이다.
			
			
			// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
			Matcher m = p.matcher(business_number);
			
			
			// == 3. 판별하도록 한다. == //
			boolean b = m.matches();
			
			if(b)
				this.business_number = business_number;
			else
				System.out.println("[경고] 사업자등록번호는 숫자로만 10글자 입력해야 합니다.\n");
		}

		public String getJobType() {
			return jobType;
		}

		public void setJobType(String jobType) {
			
			if( !jobType.trim().isEmpty() ) {
				this.jobType = jobType;
			}
			else {
				System.out.println("[경고] 회사직종군을 공백이 아닌 글자로 입력하셔야 합니다.\n");
			}
			
		}

		public long getSeedMoney() {
			return seedMoney;
		}


		public void setSeedMoney(long seedMoney) {
			
			if(seedMoney > 0) {
				this.seedMoney = seedMoney;
			}
			else {
				System.out.println("[경고] 자본금은 0 보다 커야 합니다.\n");
			}
		}
		
		
		@Override  // @를 어노테이션(애노테이션) 이라고 부른다.  Override 어노테이션(애노테이션)은 부모클래스로 부터 상속받은 메소드의 내용을 싹 바꿀때 쓰이는 것이다. 
		public void setName(String name) {
			
			if(name != null && !name.trim().isEmpty()) {
				super.input_name(name);
			}
			else {
				System.out.println("[경고] 회사명은 공백만을 되어지는 글자는 안됩니다.\n");
			}
			
		}


		@Override
		public String toString() {
			
			// 회사명    업종    사업자등록번호    자본금
			
			DecimalFormat df = new DecimalFormat("#,###");
			
			return super.getName() + "\t" + 
				   jobType + "\t" + 
			       business_number + "\t" +
				   df.format(seedMoney) +"원";
			
		}

		@Override
		public void view_dater(Member[] mbr_arr) {
			System.out.println("=============모든구직자 조회==========\n"
					 + "아이디\t비밀번호\t       성명\t   주민번호\t희망연봉\n"
						 + "==================================");
			StringBuilder sb = new StringBuilder();
			
			
			
			
			for(int i=0;i<count;i++) {
				if(mbr_arr[i] instanceof Gujikja) {
					sb.append(mbr_arr[i].getId()+"\t");
					String str_star = "";
					for(int j=0; j<mbr_arr[i].getPasswd().length()-4; j++) {
						str_star += "*";
					}
					sb.append(mbr_arr[i].getPasswd().substring(0, 4) + str_star +"\t");
					sb.append(mbr_arr[i].getName()+"\t");
					sb.append(((Gujikja)mbr_arr[i]).getJubun()+"\t");
					sb.append(((Gujikja)mbr_arr[i]).getHope_money()+"만원\t\n");
				}
			}//end of for--
			System.out.println(sb);
		}//end of public void Viewdater(Member[] mbr_arr)---------

		@Override
		public String view_info() {
			return null;
		}
			
	

}
