package ism.controller.House;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ism.bean.HouseBean;
import ism.dao.HouseDao;

public class UpdateHouseController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String house = request.getParameter("houseBlock");
		String houseNumber =request.getParameter("houseNumber");
		int houseId = Integer.parseInt(request.getParameter("houseId"));
		String houseBlock = house.concat("/").concat(houseNumber);
		
		System.out.println(houseNumber);
		
		
		HouseBean houseBean = new HouseBean();
		houseBean.setHouseBlock(houseBlock);
		houseBean.setHouseId(houseId);
		
		HouseDao houseDao = new HouseDao();
		houseDao.updateHouse(houseBean);
		response.sendRedirect("ListHouseController");
	}

}
