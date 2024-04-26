package com.gl.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Player{
//public class Player implements InitializingBean,DisposableBean{
	int pno;
	String pname;
	String teams[];
	List captians;
	Map<String, Integer> centuries;
	
	public Player() {
		System.out.println("constructor called");
	}
	
	public Player(int pno, String pname, String[] teams, List captians, Map<String, Integer> centuries) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.teams = teams;
		this.captians = captians;
		this.centuries = centuries;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String[] getTeams() {
		return teams;
	}

	public void setTeams(String[] teams) {
		this.teams = teams;
	}

	public List getCaptians() {
		return captians;
	}

	public void setCaptians(List captians) {
		this.captians = captians;
	}

	public Map<String, Integer> getCenturies() {
		return centuries;
	}

	public void setCenturies(Map<String, Integer> centuries) {
		this.centuries = centuries;
	}

	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", teams=" + Arrays.toString(teams) + ", captians="
				+ captians + ", centuries=" + centuries + "]";
	}

//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Before Destroyed");
//		
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("After Constructor Call");
//		
//	}
	
	
	@PostConstruct
	public void abc() {
		System.out.println("Before Destroyed");
		
	}

	@PreDestroy
	public void xyz() {
		System.out.println("After Constructor Call");
		
	}
	

}
