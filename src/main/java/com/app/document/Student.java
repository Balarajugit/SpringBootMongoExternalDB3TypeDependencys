package com.app.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	@Id
	private String id;
	private Integer sId;
	private String sName;
	private List<String> sSub;
	private Map<String,Integer> sMarks;
	private Adress sAdress;
	public Student() {
		super();
	}
	public Student(Integer sId, String sName, List<String> sSub, Map<String, Integer> sMarks, Adress sAdress) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sSub = sSub;
		this.sMarks = sMarks;
		this.sAdress = sAdress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public List<String> getsSub() {
		return sSub;
	}
	public void setsSub(List<String> sSub) {
		this.sSub = sSub;
	}
	public Map<String, Integer> getsMarks() {
		return sMarks;
	}
	public void setsMarks(Map<String, Integer> sMarks) {
		this.sMarks = sMarks;
	}
	public Adress getsAdress() {
		return sAdress;
	}
	public void setsAdress(Adress sAdress) {
		this.sAdress = sAdress;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sId=" + sId + ", sName=" + sName + ", sSub=" + sSub + ", sMarks=" + sMarks
				+ ", sAdress=" + sAdress + "]";
	}
	
	

}
