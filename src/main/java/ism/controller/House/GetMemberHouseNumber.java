package ism.controller.House;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.HouseBean;
import ism.dao.HouseDao;

public class GetMemberHouseNumber extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String temp = request.getParameter("temp");
		System.out.println(temp);
		
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");
		
		HouseDao houseDao = new HouseDao();
		ArrayList<HouseBean> houselist = houseDao.getAllHouseByUserId(userId);
			
		System.out.println(houselist);
		
		if(houselist.isEmpty()) {
			request.setAttribute("notHouse", "Please add house");
			request.getRequestDispatcher("AddHouse.jsp").forward(request, response);
			
		}else {
			if(temp.equals("AddMember")) {				
				request.setAttribute("houselist", houselist);
				request.getRequestDispatcher("AddMember.jsp").forward(request, response);
			}else if(temp.equals("AddInstruction")){
				request.setAttribute("houselist", houselist);
				request.getRequestDispatcher("AddInstruction.jsp").forward(request, response);				
			}
		}
		
	}

}
