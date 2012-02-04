package controlador.general;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.zkoss.calendar.api.DateFormatter;

public class PMSDateFormatter implements DateFormatter {

	private String dateFormat = "EEE dd/MM";

	// Here we can mention our required date format.It will reflect in our ZK
	// calendar. You can very well make this date format as configurable. Thus
	// you may not need to change code - if someone wants date to be shown in
	// some other format

	private SimpleDateFormat df;

	public String getCaptionByDate(Date date, Locale locale, TimeZone timezone) {

		if (df == null) {

			df = new SimpleDateFormat(dateFormat, locale);

		}

		df.setTimeZone(timezone);

		return df.format(date);

	}

	@Override
	public String getCaptionByDayOfWeek(Date date, Locale locale,
			TimeZone timezone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaptionByTimeOfDay(Date date, Locale locale,
			TimeZone timezone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaptionByDateOfMonth(Date date, Locale locale,
			TimeZone timezone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaptionByPopup(Date date, Locale locale, TimeZone timezone) {
		// TODO Auto-generated method stub
		return null;
	}

}