package ism.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.MemberBean;
import ism.bean.MemberHouseBean;
import ism.dao.MemberDao;

public class UpdateMemberController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String memberName = request.getParameter("memberName");
		long memberNumber =Long.parseLong( request.getParameter("memberNumber"));
		int memberAge =Integer.parseInt( request.getParameter("memberAge"));
		String gender = request.getParameter("gender");
		int memberId =Integer.parseInt( request.getParameter("memberId"));
		
		
		MemberHouseBean memberHouseBean = new MemberHouseBean();
		memberHouseBean.setMemberName(memberName);
		memberHouseBean.setMemberNumber(memberNumber);
		memberHouseBean.setMemberAge(memberAge);
		memberHouseBean.setGender(gender);
		memberHouseBean.setMemberId(memberId);
		
		MemberDao memberDao = new MemberDao();
		memberDao.updateMember(memberHouseBean);
		
		response.sendRedirect("ViewMemberByIdController");
	}

}
