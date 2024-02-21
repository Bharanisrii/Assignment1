package com.practice;
import java.util.Scanner;
public class Weekday{
	enum Weekdays {
		Sunday,Monday,Tuesday,Wednesday,Friday,Saturday
	}
	
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Weekdays Number(1-7) ");
	int day = scanner.nextInt();
	if (day>=1 && day<=7) {
		Weekdays weekday = Weekdays.values()[day-1];
		System.out.println("It's"+ weekday);
	}
	else {
		System.out.println("Check the Input Value!");
	}
}
}
