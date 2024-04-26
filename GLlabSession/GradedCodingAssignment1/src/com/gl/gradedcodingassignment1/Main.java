package com.gl.gradedcodingassignment1;

public class Main {

	public static void main(String[] args) {
		String s1 = "Welcome to ";
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		
		System.out.println(s1 + admin.departmentName() + "\n" + admin.getTodaysWork() + "\n" + admin.getWorkDeadline() + "\n" +admin.isTodayAHoliday() + "\n");
		System.out.println(s1 + hr.departmentName() + "\n" + hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n" + hr.doActivity() + "\n" + hr.isTodayAHoliday() + "\n");
		System.out.println(s1 + tech.departmentName() + "\n" + tech.getTodaysWork() + "\n" + tech.getWorkDeadline() + "\n" + tech.getTechStackInformation() + "\n" + tech.isTodayAHoliday());

	}

}
