package com.objects;

public class doctor extends speciality {
	private int doc_id;
	private String dname;
	private String spl;
	private int contNo;
	private String dEmail;
	private String hospName;
	
	public doctor(String spl, int doc_id, String dname, String spl2, int contNo, String dEmail, String hospName) {
		super(spl);
		this.doc_id = doc_id;
		this.dname = dname;
		spl = spl2;
		this.contNo = contNo;
		this.dEmail = dEmail;
		this.hospName = hospName;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getContNo() {
		return contNo;
	}
	public void setContNo(int contNo) {
		this.contNo = contNo;
	}
	public String getdEmail() {
		return dEmail;
	}
	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}
	public String getHospName() {
		return hospName;
	}
	public void setHospName(String hospName) {
		this.hospName = hospName;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public String getSpl() {
		return spl;
	}
	@Override
	public String toString() {
		return "doctor [doc_id=" + doc_id + ", dname=" + dname + ", spl=" + spl + ", contNo=" + contNo + ", dEmail="
				+ dEmail + ", hospName=" + hospName + "]";
	}
	
	
}