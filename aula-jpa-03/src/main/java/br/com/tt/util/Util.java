package br.com.tt.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {
	public static String calenderStr(Calendar calendar) {
		return calenderStr(calendar, "dd/MM/YYYY");
	}
	
	public static String calenderStr(Calendar calendar, String pattern) { 
		String data = null;
		if (calendar != null) {
			Date date = calendar.getTime();
			data = new SimpleDateFormat(pattern).format(date);
		}
		return data;
	}
}
