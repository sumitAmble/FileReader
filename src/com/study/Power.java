package com.study;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Power {
	
	public static List<People> createPeople() {
		return Arrays.asList(
				new People("Paula", 23, "Pune"),
				new People("Tom", 25, "New York"),
				new People("Paul", 23, "Houstan"),
				new People("Jack", 29, "Houstan"),
				new People("Tim", 23, "New York"),
				new People("Jill", 24, "Pune"),
				new People("Matt", 23, "Pune")
				);
	}
	
	public static void main(String[] args) { 
		List<People> list = createPeople();
		Map<String,List<String>> map =list.stream()
			.collect(groupingBy(People::getCity,mapping(People::getName,toList())));
		map
		.entrySet()
		.forEach(a->
				{
					System.out.print(a.getKey()+":");
					a.getValue().forEach(b->System.out.print(" "+b));
					System.out.println();
				});
	}
	
}

class People {
	private String name;
	private int age;
	private String city;
	
	public People(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}