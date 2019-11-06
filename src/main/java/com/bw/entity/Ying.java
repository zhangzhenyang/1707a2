package com.bw.entity;

public class Ying {

	private Integer yid;
	private String yname;
	private String dy;
	private Integer price;
	private String startdate;
	private Integer time;
	private String type;
	private Integer years;
	private String address;
	
	private Integer lable;
	
	public Integer getLable() {
		return lable;
	}
	public void setLable(Integer lable) {
		this.lable = lable;
	}
	public Integer getYid() {
		return yid;
	}
	public void setYid(Integer yid) {
		this.yid = yid;
	}
	public String getYname() {
		return yname;
	}
	public void setYname(String yname) {
		this.yname = yname;
	}
	public String getDy() {
		return dy;
	}
	public void setDy(String dy) {
		this.dy = dy;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Ying(Integer yid, String yname, String dy, Integer price, String startdate, Integer time, String type,
			Integer years, String address, Integer lable) {
		super();
		this.yid = yid;
		this.yname = yname;
		this.dy = dy;
		this.price = price;
		this.startdate = startdate;
		this.time = time;
		this.type = type;
		this.years = years;
		this.address = address;
		this.lable = lable;
	}
	public Ying() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
