package ism.controller.House;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.HouseBean;
import ism.dao.HouseDao;
import ism.dao.UserDao;

public class AddHouseController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String house = request.getParameter("houseBlock");
		String houseNumber =request.getParameter("houseNumber");
		
		String houseBlock = house.concat("/").concat(houseNumber);
		
		System.out.println(houseNumber);
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");
		
		HouseBean houseBean = new HouseBean();
		houseBean.setHouseBlock(houseBlock);
		houseBean.setUserId(userId);
		
		HouseDao houseDao = new HouseDao();
		houseDao.addHouse(houseBean);
		response.sendRedirect("AddHouse.jsp");
	}
}
