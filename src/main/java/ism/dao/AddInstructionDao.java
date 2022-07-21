package ism.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ism.bean.AddInstructionBean;
import ism.bean.InstructionHouseBean;
import ism.util.PgAdmin4_myGate;

public class AddInstructionDao {
	public void AddInstruction(AddInstructionBean addInstructionBean) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement(
						"insert into instructions (name,type,description,time,house_id,status) values (?,?,?,?,?,?)");) {
			ptmt.setString(1, addInstructionBean.getName());
			ptmt.setString(2, addInstructionBean.getType());
			ptmt.setString(3, addInstructionBean.getDescription());
			ptmt.setString(4, addInstructionBean.getTime());
			ptmt.setInt(5, addInstructionBean.getHouseId());
			ptmt.setString(6, addInstructionBean.getStatus());
			
			int record = ptmt.executeUpdate();
			System.out.println("Record ->"+record);
		} catch (SQLException e) {
			System.out.println("Error -> AddInstructionDao -> AddInstruction()");
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<InstructionHouseBean> listInstruction(){
		ArrayList<InstructionHouseBean> listInstruction = new ArrayList<>();
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement(
						"select * from instructions inner join houses on houses.houseid = instructions.house_id ");) {
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				InstructionHouseBean instructionHouseBean= new InstructionHouseBean();
				instructionHouseBean.setHouseId(rs.getInt("house_id"));
				instructionHouseBean.setName(rs.getString("name"));
				instructionHouseBean.setType(rs.getString("type"));
				instructionHouseBean.setDescription(rs.getString("description"));
				instructionHouseBean.setHouseBlock(rs.getString("house_block"));
				instructionHouseBean.setTime(rs.getString("time"));
				instructionHouseBean.setUserId(rs.getInt("userid"));
				instructionHouseBean.setStatus(rs.getString("status"));
				instructionHouseBean.setInstruction(rs.getInt("instruction_id"));
				listInstruction.add(instructionHouseBean);
			}
		}catch (SQLException e) {
			System.out.println("Error -> AddInstructionDao -> listInstruction()");
			e.printStackTrace();
		}
		
		return listInstruction;
	}
	
	public void allowFromInstruction(int instructionId) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement(
						"update instructions set status = ? where instruction_id=?");) {
			ptmt.setString(1, "done");
			ptmt.setInt(2, instructionId);
			
			int record = ptmt.executeUpdate();
			System.out.println("Record ->"+record);
		}catch (SQLException e) {
			System.out.println("Error -> AddInstructionDao -> allowFromInstruction()");
			e.printStackTrace();
		}
	}
}
