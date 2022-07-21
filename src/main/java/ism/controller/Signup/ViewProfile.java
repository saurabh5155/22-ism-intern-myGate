package ism.controller.Signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.UserBean;
import ism.dao.UserDao;

public class ViewProfile extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");
		
		UserDao userDao = new UserDao();
		UserBean userBean = userDao.viewProfile(userId);
		
		request.setAttribute("userBean", userBean);
		request.getRequestDispatcher("ViewProfile.jsp").forward(request, response);
	}

}
