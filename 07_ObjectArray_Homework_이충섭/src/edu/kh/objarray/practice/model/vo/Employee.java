package edu.kh.objarray.practice.model.vo;

public class Employee {
	
	private int pNum;
	private String pName;
	private String depart;
	private String job;
	private int salary;
	
	public Employee() {}

	public Employee(int pNum, String pName, String depart, String job, int salary) {
		this.pNum = pNum;
		this.pName = pName;
		this.depart = depart;
		this.job = job;
		this.salary = salary;
	}
	
	

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String information() {
		
		return "사번 : " + pNum + ", 이름 : " + pName 
				+ ", 부서 : " + depart + ", 직급 : "+ job 
				+ ", 급여 : "+ salary;
		
	}
}
