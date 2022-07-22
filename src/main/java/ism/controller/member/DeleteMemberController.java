package ism.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.dao.MemberDao;

public class DeleteMemberController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int memberId = Integer.parseInt(request.getParameter("memberId"));
		MemberDao memberDao = new MemberDao();
		boolean falg =	memberDao.deleteMember(memberId);
		
		response.sendRedirect("ViewMemberByIdController");
	}

}
