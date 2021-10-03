package com.bridgelabz.Employeewage;

public class Employee_wage_program {
	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		Employee_wage_program employeewage = new Employee_wage_program();
		employeewage.welcome();
		employeewage.emopDailyWage();
	}

	public void welcome() {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	}

	public void emopDailyWage() {
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case Is_Part_Time:
			empHrs = 4;
			break;
		case Is_Full_Time:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee_wage:" + empWage);

	}

}
