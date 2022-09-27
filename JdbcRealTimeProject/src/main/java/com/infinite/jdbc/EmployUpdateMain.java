package com.infinite.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdateMain {
	public static void main(String[] args) {
		Employ employ=new Employ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ No");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name");
		employ.setName(sc.next());
		System.out.println("Enter Employ Department");
		employ.setDept(sc.next());
		System.out.println("Enter Employ Designation");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic");
		employ.setBasic(sc.nextInt());
		try {
			System.out.println(new EmployDAO().updateEmploy(employ));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
