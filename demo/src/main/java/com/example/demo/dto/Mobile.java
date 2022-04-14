package com.example.demo.dto;

public class Mobile {
	
	private int statuscode ;
	private String msg;
	private String Desc;
	
	private Samsung samsung;

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public Samsung getSamsung() {
		return samsung;
	}

	public void setSamsung(Samsung samsung) {
		this.samsung = samsung;
	}

	@Override
	public String toString() {
		return "Mobile [statuscode=" + statuscode + ", msg=" + msg + ", Desc=" + Desc + ", samsung=" + samsung + "]";
	}

	public Mobile(int statuscode, String msg, String desc, Samsung samsung) {
		super();
		this.statuscode = statuscode;
		this.msg = msg;
		Desc = desc;
		this.samsung = samsung;
	}

	public Mobile() {
		super();
		
	}

}
