package com.study;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class JavaStudy {
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	
	public static void main(String[]args) {
		
		Supplier<LocalDateTime> s = ()-> LocalDateTime.now();
		LocalDateTime time = s.get();
		
		System.out.println(time);
		
		Supplier<String> s1 = ()->dtf.format(LocalDateTime.now());
		String time2 = s1.get();
		System.out.println(time2);
	}
}

class Java8Supplier<T> {
	public static void main(String[] args) {
		Java8Supplier<String> obj = new Java8Supplier();
		List<String> list = obj.supplier().get();
	}
	
	public Supplier<List<T>> supplier() {
		return ArrayList::new;
	}
}

class Java8Supplier2{
	public static void main(String[] args) {
		
	}
}

class Developer {
	private String name;
	private BigDecimal salary;
	private LocalDate start;
	
	public Developer() {
		
	}
	
	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}
	
}
