package com.suraj.entity;

public class Player {
	private int id;
	private String pName;
	private int jNo;
	private String tName;
	private int run;
	private int wicket;
	
	public Player() {
		super();
	}

	public Player(int id, String pName, int jNo, String tName, int run, int wicket) {
		super();
		this.id = id;
		this.pName = pName;
		this.jNo = jNo;
		this.tName = tName;
		this.run = run;
		this.wicket = wicket;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getjNo() {
		return jNo;
	}

	public void setjNo(int jNo) {
		this.jNo = jNo;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", pName=" + pName + ", jNo=" + jNo + ", tName=" + tName + ", run=" + run
				+ ", wicket=" + wicket + "]";
	}

	
	
	
}
