package my.day21.a.ENUM;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main_3 {

	public static void main(String[] args) {
		
		List<Member_1> mbrList = new ArrayList<>();
        
        for(int i=0; i<30; i++) {
        	Member_1 mbr1 = new Member_1();
            mbr1.setName("어린이"+(i+1));
            mbr1.setJubun("1910203");
            
            mbrList.add(mbr1);
          
            Member_1 mbr2 = new Member_1();
            mbr2.setName("청소년"+(i+1));
            mbr2.setJubun("0910204");
           
            mbrList.add(mbr2);
            
            Member_1 mbr3 = new Member_1();
            mbr3.setName("성년"+(i+1));
            mbr3.setJubun("9410201");
            
            mbrList.add(mbr3);
            
            Member_1 mbr4 = new Member_1();
            mbr4.setName("어르신"+(i+1));
            mbr4.setJubun("4510202"); 
            
            mbrList.add(mbr4);
            
        }//end of for---
        
        int child_cnt=0, teenager_cnt=0, adult_cnt=0, old_cnt=0;
        
        for(Member_1 mbr : mbrList) {
        	if(1<=mbr.getAge()&&mbr.getAge()<10) {
        		child_cnt++;
        	}
        	else if(mbr.getAge()<20) {
        		teenager_cnt++;
        	}
        	else if(mbr.getAge()<70) {
        		adult_cnt++;
        	}
        	else {
        		old_cnt++;
        	}
        	
        }
        DecimalFormat df = new DecimalFormat("#,###");
        
        System.out.printf("어린이 총인원수 %d명, 총입장료 %s원\n" , child_cnt, df.format(Entrance_fee_2.CHILD.getRealFee(child_cnt)));
        System.out.printf("어린이 총인원수 %d명, 총입장료 %s원\n" , teenager_cnt, df.format(Entrance_fee_2.TEENAGER.getRealFee(teenager_cnt)));
        System.out.printf("어린이 총인원수 %d명, 총입장료 %s원\n" , adult_cnt, df.format(Entrance_fee_2.ADULT.getRealFee(adult_cnt)));
        System.out.printf("어린이 총인원수 %d명, 총입장료 %s원\n" , old_cnt, df.format(Entrance_fee_2.OLD.getRealFee(old_cnt)));
        
	}//end of main()-----------------

}
