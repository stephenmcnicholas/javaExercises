package JavaRevision;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRevision 
{
	public static void main(String[] args) 
	{
		Date d = new Date(); // Data java clasas 
		System.out.println(d.toString()); // converts to string for printing, but only in specific format, e.g. Tue Jun 08 13:27:31 BST 2021
		
		SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy"); // create specific output format based on java datetime API specs (e.g. MM = month, but mm = mins)
		SimpleDateFormat sdfa = new SimpleDateFormat("h:mm:ss"); // play with allowed formats to find different outputs
				
		System.out.println(sdf.format(d)); // pass date object to the simpledateformat method 
		System.out.println(sdfa.format(d));

		
		// similarly with Calendars as per Dates, there is a default format
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdfb = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		System.out.println(sdfb.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // lots of methods available in Calendar that are not in Date class. 
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
	}
}
