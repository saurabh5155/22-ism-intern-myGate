package ism.controller.House;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.dao.HouseDao;

public class DeleteHouseController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int houseId = Integer.parseInt(request.getParameter("houseId"));
		
		HouseDao houseDao = new HouseDao();
		houseDao.deleteHouse(houseId);
		
		response.sendRedirect("ListHouseController");
	}

}
