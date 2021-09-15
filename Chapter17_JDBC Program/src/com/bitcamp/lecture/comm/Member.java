package com.bitcamp.lecture.comm;

public class Member {
	//field
	private String id = null;
	private String pwd = null;
	private String name = null;
	private String gender =null;
	private String birthDay = null;
	private String phone = null;
	private String lastUpdate = null;
	private String email = null;
	
	// constructor
	public Member() {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.phone = phone;
		this.lastUpdate = lastUpdate;
		this.email = email;
	}

	
	// method (설계 하는대로 데이터가 저장되려면 이와 같이 해야한다.)
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
	
}
