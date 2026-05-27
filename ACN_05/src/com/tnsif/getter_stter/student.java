package com.tnsif.getter_stter;

public class student {
	
	private int stdid; 
	private String stdname;
	private double marks;
	public String clgname;
	
	// right click --> source --> generate Getter and Setter() --> select stdid, stdname, marks, clgname --> generate
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	
	// right click --> source --> generate to string() --> generate
	
	@Override
	public String toString() {
		return "student [stdid=" + stdid + ", stdname=" + stdname + ", marks=" + marks + ", clgname=" + clgname + "]";
	}
	
	
	

}
