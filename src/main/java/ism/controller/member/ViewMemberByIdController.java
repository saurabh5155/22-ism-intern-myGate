package ism.controller.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.MemberHouseBean;
import ism.dao.MemberDao;

public class ViewMemberByIdController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int userId=0;
		try {
		userId = Integer.parseInt(request.getParameter("userId"));
		}catch (Exception e) {
			System.out.println("Error In ViewMemberByIdController()");
//			e.printStackTrace();
		}
		MemberDao memberDao = new MemberDao();
		if(userId==0) {
			HttpSession session = request.getSession();
			int userId1 =(int) session.getAttribute("userId");
			ArrayList<MemberHouseBean> listMember1 = memberDao.getAllMemberByUserId(userId1);
			request.setAttribute("listMember", listMember1);
			request.getRequestDispatcher("ListMemberForUser.jsp").forward(request, response);
			
		}else {
			
			ArrayList<MemberHouseBean> listMember = memberDao.getAllMemberByUserId(userId);
			request.setAttribute("listMember", listMember);
			request.getRequestDispatcher("ListMember.jsp").forward(request, response);
		}
		

	}

}
