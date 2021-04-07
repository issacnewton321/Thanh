package com.abc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hocsinh {
	@Id
	String mssv;
	String name;
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
