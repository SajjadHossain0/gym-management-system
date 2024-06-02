package com.tsg.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gents_member_info_table")
public class G_Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int gid;
	
	private String gname;

	private String gemail;
	
	private String gnumber;
	
	private String gadmissiondate;

	

	public G_Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public G_Member(long id, int gid, String gname, String gemail, String gnumber, String gadmissiondate) {
		this.id = id;
		this.gid = gid;
		this.gname = gname;
		this.gemail = gemail;
		this.gnumber = gnumber;
		this.gadmissiondate = gadmissiondate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGemail() {
		return gemail;
	}

	public void setGemail(String gemail) {
		this.gemail = gemail;
	}

	public String getGnumber() {
		return gnumber;
	}

	public void setGnumber(String gnumber) {
		this.gnumber = gnumber;
	}

	public String getGadmissiondate() {
		return gadmissiondate;
	}

	public void setGadmissiondate(String gadmissiondate) {
		this.gadmissiondate = gadmissiondate;
	}
	
	
}
