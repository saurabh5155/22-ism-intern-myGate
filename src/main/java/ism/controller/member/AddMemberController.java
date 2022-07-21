package ism.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.MemberBean;
import ism.dao.MemberDao;

public class AddMemberController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberName = request.getParameter("memberName");
		long memberNumber =Long.parseLong( request.getParameter("memberNumber"));
		int memberAge =Integer.parseInt( request.getParameter("memberAge"));
		String gender = request.getParameter("gender");
		int houseId =Integer.parseInt( request.getParameter("houseid"));
		boolean active = false;
		
		MemberBean memberBean = new MemberBean();
		memberBean.setMemberName(memberName);
		memberBean.setMemberNumber(memberNumber);
		memberBean.setMemberAge(memberAge);
		memberBean.setGender(gender);
		memberBean.setHouseId(houseId);
		memberBean.setActive(active);
		
		MemberDao memberDao = new MemberDao();
		memberDao.addMember(memberBean);
		
		response.sendRedirect("GetMemberHouseNumber?temp=AddMember");
	}

}
