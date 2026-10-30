package com.test4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Test4Application {

public static void main(String[] args) {
	List<String>students=new ArrayList<>();
	students.add("aditya");
	students.add("madhab");
	students.add(1,"anup");
	students.add(2,"Dhiraj");
	students.set(1,"dhanus");
	students.add("aditya");
	System.out.println(students);
	}

}
