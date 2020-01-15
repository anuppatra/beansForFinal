package org.deloitte.schoolmanagementsystem.bean;

import java.util.Date;

public class STAFF_INFO {
	private String STAFF_ID;
	private Date DATE_OF_BIRTH;
	private String STAFF_NAME;
	private String ADDRESS;
	private String COUNTRY_ID;
	private char GENDER;
	private int SALARY;
	private String HIGHEST_QUALIFICATION;
	private String EMAIL_ID;
	private int CONTACT_NUMBER;
	private String Designation;
	private int YEAR_PASSED_OUT;
	private int EXPERIENCE;
	private Date DOJ;
	
	public String getSTAFF_ID() {
		return STAFF_ID;
	}
	public void setSTAFF_ID(String sTAFF_ID) {
		STAFF_ID = sTAFF_ID;
	}
	public Date getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}
	public void setDATE_OF_BIRTH(Date dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}
	public String getSTAFF_NAME() {
		return STAFF_NAME;
	}
	public void setSTAFF_NAME(String sTAFF_NAME) {
		STAFF_NAME = sTAFF_NAME;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}
	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}
	public char getGENDER() {
		return GENDER;
	}
	public void setGENDER(char gENDER) {
		GENDER = gENDER;
	}
	public int getSALARY() {
		return SALARY;
	}
	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}
	public String getHIGHEST_QUALIFICATION() {
		return HIGHEST_QUALIFICATION;
	}
	public void setHIGHEST_QUALIFICATION(String hIGHEST_QUALIFICATION) {
		HIGHEST_QUALIFICATION = hIGHEST_QUALIFICATION;
	}
	public String getEMAIL_ID() {
		return EMAIL_ID;
	}
	public void setEMAIL_ID(String eMAIL_ID) {
		EMAIL_ID = eMAIL_ID;
	}
	public int getCONTACT_NUMBER() {
		return CONTACT_NUMBER;
	}
	public void setCONTACT_NUMBER(int cONTACT_NUMBER) {
		CONTACT_NUMBER = cONTACT_NUMBER;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getYEAR_PASSED_OUT() {
		return YEAR_PASSED_OUT;
	}
	public void setYEAR_PASSED_OUT(int yEAR_PASSED_OUT) {
		YEAR_PASSED_OUT = yEAR_PASSED_OUT;
	}
	public int getEXPERIENCE() {
		return EXPERIENCE;
	}
	public void setEXPERIENCE(int eXPERIENCE) {
		EXPERIENCE = eXPERIENCE;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	
	
}
