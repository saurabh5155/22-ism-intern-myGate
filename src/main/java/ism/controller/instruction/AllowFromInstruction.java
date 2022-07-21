package ism.controller.instruction;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ism.dao.AddInstructionDao;

public class AllowFromInstruction extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int instructionId =Integer.parseInt( request.getParameter("instructionId"));
		
		AddInstructionDao addInstructionDao = new AddInstructionDao();
		addInstructionDao.allowFromInstruction(instructionId);
		
		request.getRequestDispatcher("ListInstructionController").forward(request, response);
	}

}
