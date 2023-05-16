package com.objects;

public class hospital {
	private int hId;
	private String hName;
	private String addr;
	private int hContNo;
	private String CityName;
	private int cityId;
	public hospital(int hId, String hName, String addr, int hContNo, String cityName, int cityId) {
		
		this.hId = hId;
		this.hName = hName;
		this.addr = addr;
		this.hContNo = hContNo;
		CityName = cityName;
		this.cityId = cityId;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int gethContNo() {
		return hContNo;
	}
	public void sethContNo(int hContNo) {
		this.hContNo = hContNo;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int gethId() {
		return hId;
	}
	public String gethName() {
		return hName;
	}
	@Override
	public String toString() {
		return "hospital [hId=" + hId + ", hName=" + hName + ", addr=" + addr + ", hContNo=" + hContNo + ", CityName="
				+ CityName + ", cityId=" + cityId + "]";
	}
	
}
