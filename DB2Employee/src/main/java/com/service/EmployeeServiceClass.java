package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;

public class EmployeeServiceClass {

	public List<Employee> getAllRecords() {
		List<Employee> list = new ArrayList<>();
		String sql="select * from  employee";
		try {
			Connection con=DbUtil.getDataSource().getConnection();
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Employee u = new Employee();
				u.setEmpNo(rs.getString(1));
				u.setFirstName(rs.getString(2));
				u.setMidinit(rs.getString(3));
				u.setLastName(rs.getString(4));
				u.setWorkDept(rs.getString(5));
				u.setPhoneNo(rs.getString(6));
				u.setHireDate(rs.getDate(7));
				u.setJob(rs.getString(8));
				u.setEdLevel(rs.getInt(9));
				u.setSex(rs.getString(10));
				u.setBirthDate(rs.getDate(11));
				u.setSalary(rs.getFloat(12));
				u.setBonus(rs.getFloat(13));
				u.setComm(rs.getFloat(14));

				list.add(u);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	
	public Employee getById(String empNo) {
		Employee u = new Employee();
		String sql="select * from employee where empNo=?";
		try {
			Connection con=DbUtil.getDataSource().getConnection();
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, empNo);
			ResultSet rs=pst.executeQuery();
			while (rs.next()) {
				
				u.setEmpNo(rs.getString(1));
				u.setFirstName(rs.getString(2));
				u.setMidinit(rs.getString(3));
				u.setLastName(rs.getString(4));
				u.setWorkDept(rs.getString(5));
				u.setPhoneNo(rs.getString(6));
				u.setHireDate(rs.getDate(7));
				u.setJob(rs.getString(8));
				u.setEdLevel(rs.getInt(9));
				u.setSex(rs.getString(10));
				u.setBirthDate(rs.getDate(11));
				u.setSalary(rs.getFloat(12));
				u.setBonus(rs.getFloat(13));
				u.setComm(rs.getFloat(14));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			new RuntimeException();
		}
		
		return u;
	}

}
