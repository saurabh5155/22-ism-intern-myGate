package ism.controller.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.MemberHouseBean;
import ism.dao.MemberDao;

public class ListMemberbyId extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int memberId = Integer.parseInt(request.getParameter("memberId"));
		
		System.out.println(memberId);
		
		MemberDao memberDao = new MemberDao();
		MemberHouseBean listMember = memberDao.getAllMemberByMemberId(memberId);
		
		System.out.println(listMember);
		request.setAttribute("listMember", listMember);
		request.getRequestDispatcher("UpdateMemberById.jsp").forward(request, response);
	}

}
