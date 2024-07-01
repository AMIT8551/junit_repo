package com.bikkadit.employeeManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Employee {

	@Id
	private int eid;
	private String ename;
	private String edept;
	private String ecity;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String ename, String edept, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.ecity = ecity;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edept=" + edept + ", ecity=" + ecity + "]";
	}
	
	
	
}
