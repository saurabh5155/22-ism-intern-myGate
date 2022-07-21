package ism.controller.House;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.HouseBean;
import ism.dao.HouseDao;

public class GetAllHouse extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		HouseDao houseDao = new HouseDao();
		ArrayList<HouseBean> houselist = houseDao.getAllHouse();
			
		System.out.println(houselist);
		request.setAttribute("houseList", houselist);
		request.getRequestDispatcher("AddInstruction.jsp").forward(request, response);
	}

}
