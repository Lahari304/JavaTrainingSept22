package question2;

public class DayScholar implements Student {
	
	int regNo;
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getModeofTransport() {
		return modeofTransport;
	}

	public void setModeofTransport(String modeofTransport) {
		this.modeofTransport = modeofTransport;
	}

	String dept;
	String address;
	String modeofTransport;
	
	public void printDetails() {
		
		System.out.println("Student details : \nRegistration number : "+ regNo+
							"\nDepartment : "+ dept+
							"\nAddress : "+ address+
							"\nMode of transport : "+ modeofTransport);
		
		return;
		
	}

}
