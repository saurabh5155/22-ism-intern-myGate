package ism.controller.Signup;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.UserBean;
import ism.dao.UserDao;

public class ListUserController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDao userDao = new UserDao();
		ArrayList<UserBean> listUser =userDao.getAllUsers();
		
		request.setAttribute("listUser", listUser);
		
		request.getRequestDispatcher("ListUser.jsp").forward(request, response);
	}

}
