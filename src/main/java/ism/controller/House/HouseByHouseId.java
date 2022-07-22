package ism.controller.House;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.HouseBean;
import ism.dao.HouseDao;

public class HouseByHouseId extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int houseId = Integer.parseInt(request.getParameter("houseId"));

		HouseDao houseDao = new HouseDao();
		HouseBean houseBean = houseDao.getAllHouseByHouseId(houseId);
		
		String house[] =houseBean.getHouseBlock().split("/");

		String houseBlockName =null;
		String houseBlockNumber=null;
		for (int i = 0; i < house.length; i++) {
			 houseBlockName = house[0];
			 houseBlockNumber = house[1];			
		}
		request.setAttribute("houseBlockName", houseBlockName);
		request.setAttribute("houseBlockNumber", houseBlockNumber);
		request.setAttribute("houseBean", houseBean);
		
		request.getRequestDispatcher("UpdateHouseById.jsp").forward(request, response);
		

	}

}
