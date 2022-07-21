package ism.controller.Signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.dao.UserDao;

public class DeleteUserController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));

		UserDao userDao = new UserDao();
		userDao.deleteUserController(userId);

		response.sendRedirect("ListUserController");
	}

}
