package com.ibanking.java8concept.functionalinterfaceexp.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExp {

	public static void main(String[] args) {

		LocalTime currentTime = LocalTime.now(); // 13:33:43.557
		System.out.println(currentTime);

		LocalDate currentDate = LocalDate.now(); // 2020-05-03
		System.out.println(currentDate);

		System.out.println(currentDate.format(DateTimeFormatter.ofPattern("d-MMM-uuuu")));
		System.out.println(currentDate.format(DateTimeFormatter.ofPattern("d/MMM/uuuu")));

		
		DateTimeFormatter formatTodayWithZoneId=DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss VV");

		// Create a zoned date time object with current date and time and New York time
		// zone ID:
		LocalDateTime today = LocalDateTime.now();
		ZoneId timeZone = ZoneId.of("America/New_York");
		ZonedDateTime todayWithTimeZone = ZonedDateTime.of(today, timeZone);
		System.out.format("Formatted date time with zone ID of New York is %s\n",
				todayWithTimeZone.format(formatTodayWithZoneId));
		
		LocalTime t= LocalTime.now(ZoneId.of("Asia/Tokyo"));
System.out.println(t);
		
		// Create a zoned date time object with current date and time and New York time
				// zone ID:
				LocalDateTime today1 = LocalDateTime.now();
				ZoneId timeZone1 = ZoneId.of("America/Chicago");
				ZonedDateTime todayWithTimeZone1 = ZonedDateTime.of(today1, timeZone1);
				System.out.format("Formatted date time with zone ID of japan toyko is %s\n",
						todayWithTimeZone1.format(formatTodayWithZoneId));
		
	}

}
