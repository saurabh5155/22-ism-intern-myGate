package ism.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ism.bean.MemberBean;
import ism.util.PgAdmin4_myGate;

public class MemberDao {
	public void addMember(MemberBean memberBean) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con
						.prepareStatement("insert into members (member_name,member_number,member_age,member_gender,house_id,active) values (?,?,?,?,?,?)");) {
			
			ptmt.setString(1, memberBean.getMemberName());
			ptmt.setLong(2, memberBean.getMemberNumber());
			ptmt.setInt(3, memberBean.getMemberAge());
			ptmt.setString(4, memberBean.getGender());
			ptmt.setInt(5, memberBean.getHouseId());
			ptmt.setBoolean(6, memberBean.isActive());
			
			int record = ptmt.executeUpdate();
			System.out.println("Record -> House ->" + record);
		} catch (SQLException e) {
			System.out.println("Error -> Memberdao -> addMember()");
			e.printStackTrace();
		}
	}
}
