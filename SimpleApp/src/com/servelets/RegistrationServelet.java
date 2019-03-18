package com.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.db.ConnDB;



public class RegistrationServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection cnn;
		PreparedStatement ps;
		int r = 0;
		
		String sql = "INSERT INTO facelook.tbl_registration(fname,lname,dob,mob,pass) VALUES (?,?,?,?,?)";
		//read Parameters
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String mno = request.getParameter("mno");
		String pass = request.getParameter("pass");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		cnn = ConnDB.connectionToDB();
		try {
			ps = cnn.prepareStatement(sql);
			ps.setString(1, fName);
			ps.setString(2, lName);
			ps.setString(3, dob);
			ps.setString(4, mno);
			ps.setString(5, pass);
			r = ps.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println(sqle);
			pw.println(sqle);
		}
		if(r == 1) {
			pw.print("registration Successfull... Go to");
			pw.println("<a href='Login.jsp'>Login</a>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
