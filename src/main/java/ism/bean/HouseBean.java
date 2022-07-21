package ism.bean;

import javax.servlet.http.HttpSession;

public class HouseBean {
	String houseBlock;
	int userId;
	int houseId;
	public String getHouseBlock() {
		return houseBlock;
	}
	public void setHouseBlock(String houseBlock) {
		this.houseBlock = houseBlock;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	
}
