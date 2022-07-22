package ism.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ism.bean.MemberBean;
import ism.bean.MemberHouseBean;
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
	
	public ArrayList<MemberHouseBean> getAllMemberByUserId(int userId){
		ArrayList<MemberHouseBean> listMember = new ArrayList<>();
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con
						.prepareStatement("select * from houses inner join members on members.house_id = houses.houseid where userid=?");) {
					ptmt.setInt(1, userId);
					
					ResultSet rs = ptmt.executeQuery();
					
					while(rs.next()) {
						MemberHouseBean memberHouseBean = new MemberHouseBean();
						memberHouseBean.setMemberName(rs.getString("member_name"));
						memberHouseBean.setMemberNumber(rs.getLong("member_number"));
						memberHouseBean.setMemberAge(rs.getInt("member_age"));
						memberHouseBean.setGender(rs.getString("member_gender"));
						memberHouseBean.setHouseBlock(rs.getString("house_block"));
						memberHouseBean.setHouseId(rs.getInt("houseid"));
						memberHouseBean.setUserId(rs.getInt("userid"));
						memberHouseBean.setMemberId(rs.getInt("memberid"));
						listMember.add(memberHouseBean);
					}
			
		}catch (SQLException e) {
			System.out.println("Error -> Memberdao -> addMember()");
			e.printStackTrace();
		}
		return listMember;
	}
	
	public MemberHouseBean getAllMemberByMemberId(int memberId){
		MemberHouseBean memberHouseBean = null;
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con
						.prepareStatement("select * from houses inner join members on members.house_id = houses.houseid where memberid=?");) {
					ptmt.setInt(1, memberId);
					
					ResultSet rs = ptmt.executeQuery();
					
					while(rs.next()) {
						memberHouseBean = new MemberHouseBean();
						memberHouseBean.setMemberName(rs.getString("member_name"));
						memberHouseBean.setMemberNumber(rs.getLong("member_number"));
						memberHouseBean.setMemberAge(rs.getInt("member_age"));
						memberHouseBean.setGender(rs.getString("member_gender"));
						memberHouseBean.setHouseBlock(rs.getString("house_block"));
						memberHouseBean.setHouseId(rs.getInt("houseid"));
						memberHouseBean.setUserId(rs.getInt("userid"));
						memberHouseBean.setMemberId(rs.getInt("memberid"));
						
					}
			
		}catch (SQLException e) {
			System.out.println("Error -> Memberdao -> addMember()");
			e.printStackTrace();
		}
		return memberHouseBean;
	}
	
	public Boolean deleteMember(int memberId) {
		boolean flag=false;
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con
						.prepareStatement("delete from members where memberid =?");) {
			ptmt.setInt(1, memberId);
			int result = ptmt.executeUpdate();
			System.out.println("Record ->"+result);
			if(result==1) {
				flag = true;
			}
		}catch (SQLException e) {
			System.out.println("Error -> Memberdao -> addMember()");
			e.printStackTrace();
		}
		return flag;
	}
	
	public void updateMember(MemberHouseBean memberHouseBean) {
		
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con
						.prepareStatement("update members set member_name =?,member_number=?,member_age=?,member_gender=? where memberid=?");) {
			
			ptmt.setString(1, memberHouseBean.getMemberName());
			ptmt.setLong(2, memberHouseBean.getMemberNumber());
			ptmt.setInt(3, memberHouseBean.getMemberAge());
			ptmt.setString(4, memberHouseBean.getGender());
			ptmt.setInt(5, memberHouseBean.getMemberId());
			
			int record = ptmt.executeUpdate();
			System.out.println("Record -> House ->" + record);
		} catch (SQLException e) {
			System.out.println("Error -> Memberdao -> updateMember()");
			e.printStackTrace();
		}
		
	}
}
