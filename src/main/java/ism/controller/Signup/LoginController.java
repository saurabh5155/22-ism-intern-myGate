package ism.controller.Signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.UserBean;
import ism.dao.UserDao;

public class LoginController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDao userDao = new UserDao();
		UserBean userBean = userDao.login(email, password);
		
		if(userBean==null) {
			request.setAttribute("InvalidUser", "Inavlid Password or email");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}else {			
			HttpSession session = request.getSession();
			session.setAttribute("userId", userBean.getUserId());
			System.out.println(userBean.getUserId());
			if(userBean.getRole().equals("admin")) {
				request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
			}else if(userBean.getRole().equals("member")){			
				if(userBean.getApprovel().equals("pending")) {	
					request.setAttribute("wait", "Please Wait for Admin Approval");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				}else if(userBean.getApprovel().equals("done")){
					request.getRequestDispatcher("Home.jsp").forward(request, response);					
				}
			}else if(userBean.getRole().equals("security")){	
				request.getRequestDispatcher("ListInstructionController").forward(request, response);									
			}else {
				request.getRequestDispatcher("404.jsp").forward(request, response);
			}
		}
	}

}
