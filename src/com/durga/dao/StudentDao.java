package com.durga.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.durga.beans.Student;

public class StudentDao {
	public static int addStudent(Student student) throws SQLException
	{
		///Step1:get the connection
		Connection con=DBConnection.getConnection();
		///Step2:prepare the sql
		String sql="insert into student values(?,?,?)";
		///step3:Execute the sql
		PreparedStatement psmt=con.prepareStatement(sql);
		psmt.setString(1,student.getName());
		psmt.setString(2,student.getEmail());
		psmt.setString(3,student.getAddress());
		
	
		int status=psmt.executeUpdate();
		if(status>0)
		{
			return status;
		}
		else
		{
			return 0;
		}
		
	}
	public static ArrayList<Student> selectStudent() throws SQLException
	{
		Connection con=DBConnection.getConnection();
		String sql="select *from student";
		PreparedStatement psmt=con.prepareStatement(sql);
		ResultSet rs=psmt.executeQuery();
		ArrayList<Student> studentlist=new ArrayList<Student>();
		while(rs.next())
		{
			Student s=new Student();
			s.setName(rs.getString(1));
			s.setEmail(rs.getString(2));
			s.setAddress(rs.getString(3));
			studentlist.add(s);
		}
		return studentlist;
	}

}
