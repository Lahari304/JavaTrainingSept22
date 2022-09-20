package question2;

public class Hosteller implements Student {
	
	int regNo;
	String dept;
	int hostelNum;
	int roomNum;
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	
	public int getHostelNum() {
		return hostelNum;
	}
	public void setHostelNum(int hostelNum) {
		this.hostelNum = hostelNum;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	public void printDetails() {
		
		System.out.println("Student details : \nRegistration number : "+ regNo+
							"\nDepartment : "+ dept+
							"\nHostel Number : "+ hostelNum+
							"\nroomNum : "+ roomNum);
		
		return;
		
	}
	

}
