package ism.controller.Signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.UserBean;
import ism.dao.UserDao;

public class UpdateProfileController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		long number = Long.parseLong(request.getParameter("number"));
		String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");
		
		UserBean userBean = new UserBean();
		userBean.setUserId(userId);
		userBean.setFirstName(firstName);
		userBean.setLastName(lastName);
		userBean.setGender(gender);
		userBean.setNumber(number);
		userBean.setEmail(email);
		
		
		UserDao userDao = new UserDao();
		userDao.updateProfile(userBean);
		
		response.sendRedirect("Home.jsp");
	}

}
