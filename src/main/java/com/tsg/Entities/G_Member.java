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

	private int g_id;
	
	private String g_name;
	
	private String g_number; 
	
	private String g_admission_date;
	

	public G_Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public G_Member(long id, int g_id, String g_name, String g_number, String g_admission_date) {
		super();
		this.id = id;
		this.g_id = g_id;
		this.g_name = g_name;
		this.g_number = g_number;
		this.g_admission_date = g_admission_date;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getG_id() {
		return g_id;
	}

	public void setG_id(int g_id) {
		this.g_id = g_id;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public String getG_number() {
		return g_number;
	}

	public void setG_number(String g_number) {
		this.g_number = g_number;
	}

	public String getG_admission_date() {
		return g_admission_date;
	}

	public void setG_admission_date(String g_admission_date) {
		this.g_admission_date = g_admission_date;
	}
	
	
}
