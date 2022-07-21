package ism.controller.instruction;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.bean.InstructionHouseBean;
import ism.dao.AddInstructionDao;

public class ListInstructionController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AddInstructionDao addInstructionDao = new AddInstructionDao();
		ArrayList<InstructionHouseBean> listIn = addInstructionDao.listInstruction();
		 request.setAttribute("listIn", listIn);
		 
		 request.getRequestDispatcher("SecurityHome.jsp").forward(request, response);
	}

}
