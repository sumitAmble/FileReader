package com.timedata;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TimeDateStudy {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDate1= LocalDate.of(2020, 07, 07);
		System.out.println(localDate1);
		LocalDate localDate2 = LocalDate.ofYearDay(2020, 359);
		System.out.println(localDate2);
		System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
	}
}
