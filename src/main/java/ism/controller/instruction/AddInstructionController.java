package ism.controller.instruction;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.AddInstructionBean;
import ism.dao.AddInstructionDao;

public class AddInstructionController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String description = request.getParameter("description");
		String time = request.getParameter("time");
		int houseId =Integer.parseInt( request.getParameter("houseId"));
		String status = "pending";
		
		AddInstructionBean addInstructionBean = new AddInstructionBean();
		addInstructionBean.setName(name);
		addInstructionBean.setType(type);
		addInstructionBean.setDescription(description);
		addInstructionBean.setTime(time);
		addInstructionBean.setHouseId(houseId);
		addInstructionBean.setStatus(status);
		
		AddInstructionDao addInstructionDao = new AddInstructionDao();
		addInstructionDao.AddInstruction(addInstructionBean);
		
		response.sendRedirect("GetMemberHouseNumber?temp=AddInstruction");
		
	}

}
