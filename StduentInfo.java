package org.deloitte.schoolmanagementsystem.bean;

import java.util.Date;

public class StduentInfo {
	private String studentId;
	private String studentName;
	private Date date;
	private char guardianType;
	private String guardianName;
	private String address;
	private String countryId;
	private int contactNo;
	private String mailId;
	private char gender;
	private String standard;
	private char stdandardCategory;
	private char transport;
	private int netFees;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getGuardianType() {
		return guardianType;
	}
	public void setGuardianType(char guardianType) {
		this.guardianType = guardianType;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public char getStdandardCategory() {
		return stdandardCategory;
	}
	public void setStdandardCategory(char stdandardCategory) {
		this.stdandardCategory = stdandardCategory;
	}
	public char getTransport() {
		return transport;
	}
	public void setTransport(char transport) {
		this.transport = transport;
	}
	public int getNetFees() {
		return netFees;
	}
	public void setNetFees(int netFees) {
		this.netFees = netFees;
	}
	
}