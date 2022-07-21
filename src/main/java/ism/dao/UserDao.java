package ism.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ism.bean.UserBean;
import ism.util.PgAdmin4_myGate;

public class UserDao {
	public void signupUser(UserBean userBean) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement(
						"insert into users (firstname,lastname,gender,email,password,role,active,number,approvel) values (?,?,?,?,?,?,?,?,?)");) {
			ptmt.setString(1, userBean.getFirstName());
			ptmt.setString(2, userBean.getLastName());
			ptmt.setString(3, userBean.getGender());
			ptmt.setString(4, userBean.getEmail());
			ptmt.setString(5, userBean.getPassword());
			ptmt.setString(6, userBean.getRole());
			ptmt.setBoolean(7, userBean.isActive());
			ptmt.setLong(8, userBean.getNumber());
			ptmt.setString(9, userBean.getApprovel());
			
			int record = ptmt.executeUpdate();
			System.out.println("Record -> " + record);

		} catch (SQLException e) {
			System.out.println("UserDao -> signupUser()");
			e.printStackTrace();
		}
	}

	public UserBean login(String email, String password) {
		boolean flag = false;
		UserBean userBean = null;
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement("select * from users where email=? and password=?");) {
			ptmt.setString(1, email);
			ptmt.setString(2, password);

			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				userBean = new UserBean();
				userBean.setFirstName(rs.getString("firstname"));
				userBean.setLastName(rs.getString("lastname"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));
				userBean.setGender(rs.getString("gender"));
				userBean.setUserId(rs.getInt("userid"));
				userBean.setNumber(rs.getLong("number"));
				userBean.setRole(rs.getString("role"));
				userBean.setActive(rs.getBoolean("active"));
				userBean.setApprovel(rs.getString("approvel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("UserDao -> login()");
		}

		return userBean;

	}

	public UserBean viewProfile(int userId) {
		UserBean userBean = null;
		try(Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement("select * from users where userid =?");
					) {
			ptmt.setInt(1, userId);
			
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()) {
				userBean = new UserBean();
				userBean.setFirstName(rs.getString("firstname"));
				userBean.setFirstName(rs.getString("firstname"));
				userBean.setLastName(rs.getString("lastname"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));
				userBean.setGender(rs.getString("gender"));
				userBean.setUserId(rs.getInt("userid"));
				userBean.setNumber(rs.getLong("number"));
				userBean.setRole(rs.getString("role"));
				userBean.setActive(rs.getBoolean("active"));
			}
					
		} catch (SQLException e) {
			System.out.println("Error -> UserDao -> viewProfile()");
			e.printStackTrace();
		}
		return userBean;
	}
	
	public void updateProfile(UserBean userBean) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement(
						"update users set firstname=?,lastname=?,gender=?,email=?,number=? where userid =?");) {
			ptmt.setString(1, userBean.getFirstName());
			ptmt.setString(2, userBean.getLastName());
			ptmt.setString(3, userBean.getGender());
			ptmt.setString(4, userBean.getEmail());
			ptmt.setLong(5, userBean.getNumber());
			ptmt.setInt(6, userBean.getUserId());
			
			int record = ptmt.executeUpdate();
			System.out.println("Record -> " + record);

		} catch (SQLException e) {
			System.out.println("UserDao -> updateProfile()");
			e.printStackTrace();
		}
	}
	
	public ArrayList<UserBean> getAllUsers(){
		ArrayList<UserBean> userList = new ArrayList<>();
		UserBean userBean = null;
		try(Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement("select * from users where role =? ");
					) {
			ptmt.setString(1, "member");
			
			
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()) {
				userBean = new UserBean();
				
				userBean.setFirstName(rs.getString("firstname"));
				userBean.setLastName(rs.getString("lastname"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));
				userBean.setGender(rs.getString("gender"));
				userBean.setUserId(rs.getInt("userid"));
				userBean.setNumber(rs.getLong("number"));
				userBean.setRole(rs.getString("role"));
				userBean.setActive(rs.getBoolean("active"));
				userBean.setApprovel(rs.getString("approvel"));
				userList.add(userBean);
			}
					
		} catch (SQLException e) {
			System.out.println("Error -> UserDao -> getAllUsers()");
			e.printStackTrace();
		}
		return userList;
	}
	
	public void approveDoneController(int userId) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement(
						"update users set approvel =? where userid =?");) {
			ptmt.setString(1, "done");
			ptmt.setInt(2, userId);
			
			int record = ptmt.executeUpdate();
			System.out.println("Record -> " + record);

		} catch (SQLException e) {
			System.out.println("UserDao -> approveDoneController()");
			e.printStackTrace();
		}
	}
	public void deleteUserController(int userId) {
		try (Connection con = PgAdmin4_myGate.getConnection();
				PreparedStatement ptmt = con.prepareStatement(
						"delete from users where userid =?");) {
			ptmt.setInt(1, userId);
			
			int record = ptmt.executeUpdate();
			System.out.println("Record -> " + record);

		} catch (SQLException e) {
			System.out.println("UserDao -> deleteUserController()");
			e.printStackTrace();
		}
	}
}
