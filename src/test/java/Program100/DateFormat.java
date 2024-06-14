package Program100;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter year:");
		int year= s.nextInt();
        System.out.println("Enter month (1-12):");
		int month=s.nextInt();
        System.out.println("Enter day:");
		int dayOfMonth=s.nextInt();

        if(month<1 || month>12 || dayOfMonth<1 ||dayOfMonth>31){
            System.out.println("Invalid date input.");
            return;
        }

		String pattern="YYYY-MM-dd";

		//using LocalDate constructor
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern(pattern);

//		LocalDate localDate=LocalDate.of(2024, 5,8);
		LocalDate localDate1=LocalDate.of(year,month,dayOfMonth);
		String convertedDate=localDate1.format(dateTimeFormatter);

		System.out.println("Formatted Date: "+convertedDate);

        //using calander constructor
//        month -= 1;
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);

		// Create a calendar instance and set the date
		Calendar calendar=Calendar.getInstance();
		calendar.set(year,month-=1,dayOfMonth);

        // Get the Date object from the calendar
        Date date = calendar.getTime();

        // Format the date
        String convertedDate1 = simpleDateFormat.format(date);
        System.out.println("Formatted Date: "+convertedDate1);

        s.close();
	}
}
