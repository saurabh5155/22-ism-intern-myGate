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

public class ListHouseController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");
		
		HouseDao houseDao = new HouseDao();
		ArrayList<HouseBean> listHouse = houseDao.getAllHouseByUserId(userId);
		
		request.setAttribute("listHouse", listHouse);
		request.getRequestDispatcher("ListHouse.jsp").forward(request, response);
	}

}
