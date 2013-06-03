package com.timemanager.client.view;
import java.util.Date;
  
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.Format;

public class MyCustomDateBoxFormat  implements Format { 
	DateTimeFormat f = DateTimeFormat.getFormat("yyyy/MM/dd");
	@Override
	public String format(DateBox dateBox, Date date) {
		if (date==null) {
			Date today = new Date();
			return f.format(today);
		}
		String ret = f.format(date); 
		return ret;
	}

	@Override
	public Date parse(DateBox dateBox, String text, boolean reportError) {
		return f.parse(text);
	}

	@Override
	public void reset(DateBox dateBox, boolean abandon) { 
	}

 
}
