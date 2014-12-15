package calendar.service;

import java.util.*;

import javax.jws.*;

@WebService
public class HebCalendar {
	
	@WebMethod
	public String hebDayOfWeek(Date date) {
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		
		int dayNum = c.get(Calendar.DAY_OF_WEEK);
		
		return hebDayName(dayNum);
		
	}
	
	@WebMethod
	public String hebDayName(int dayNum) {
		switch (dayNum) {
			case 1: return "�����";
			case 2: return "���";
			case 3: return "�����";
			case 4: return "�����";
			case 5: return "�����";
			case 6: return "����";
			case 7: return "��� �����";
		}
		return null;
	}
}
