package ism.controller.Signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.UserBean;
import ism.dao.UserDao;

public class SignupController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		long number = Long.parseLong(request.getParameter("number"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = "member";
		boolean active = false;
		String approvel = "pending";
		
		UserBean userBean = new UserBean();
		userBean.setFirstName(firstName);
		userBean.setLastName(lastName);
		userBean.setGender(gender);
		userBean.setNumber(number);
		userBean.setEmail(email);
		userBean.setPassword(password);
		userBean.setRole(role);
		userBean.setActive(active);
		userBean.setApprovel(approvel);
		
		UserDao userDao = new UserDao();
		userDao.signupUser(userBean);
		
		response.sendRedirect("Login.jsp");
		
		
	}

}
