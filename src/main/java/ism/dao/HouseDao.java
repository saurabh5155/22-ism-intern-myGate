package ism.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ism.bean.HouseBean;
import ism.util.PgAdmin4_myGate;

public class HouseDao {
	public void addHouse(HouseBean houseBean) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con
						.prepareStatement("insert into houses (house_block,userid) values (?,?)");) {
			ptmt.setString(1, houseBean.getHouseBlock());
			ptmt.setInt(2, houseBean.getUserId());

			int record = ptmt.executeUpdate();
			System.out.println("Record -> House ->" + record);
		} catch (SQLException e) {
			System.out.println("Error -> HouseDao -> addHouse");
			e.printStackTrace();
		}
	}

	public ArrayList<HouseBean> getAllHouseByUserId(int userid) {
		ArrayList<HouseBean> houselist = new ArrayList<>();
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement("select * from houses where userid = ?");) {

			ptmt.setInt(1, userid);

			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				HouseBean houseBean = new HouseBean();
				houseBean.setHouseId(rs.getInt("houseid"));
				houseBean.setHouseBlock(rs.getString("house_block"));
				houselist.add(houseBean);
			}

		} catch (SQLException e) {
			System.out.println("Error -> HouseDao -> getAllHouseByUserId");
			e.printStackTrace();
		}

		return houselist;
	}
	
	public ArrayList<HouseBean> getAllHouse() {
		ArrayList<HouseBean> houselist = new ArrayList<>();
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement("select * from houses");) {


			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				HouseBean houseBean = new HouseBean();
				houseBean.setHouseId(rs.getInt("houseid"));
				houseBean.setHouseBlock(rs.getString("house_block"));
				houselist.add(houseBean);
			}

		} catch (SQLException e) {
			System.out.println("Error -> HouseDao -> getAllHouseByUserId");
			e.printStackTrace();
		}

		return houselist;
	}
}
