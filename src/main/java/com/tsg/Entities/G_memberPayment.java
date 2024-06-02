package com.tsg.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "gents_member_payment_info_table")
public class G_memberPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;

	private int gpid;// this is the member id, marked as gpid cuz there is already a gid in member entity which refer member id

	private String gname;

	private int gamount;

	private String gpaymentmonth;

	private LocalDate gpaymentdate;

	@ManyToOne
	@JoinColumn(name = "g_member_id", nullable = false)
	private G_Member gMember;

	public G_memberPayment(long pid, int gpid, String gname, int gamount, String gpaymentmonth, LocalDate gpaymentdate, G_Member gMember) {
		this.pid = pid;
		this.gpid = gpid;
		this.gname = gname;
		this.gamount = gamount;
		this.gpaymentmonth = gpaymentmonth;
		this.gpaymentdate = gpaymentdate;
		this.gMember = gMember;
	}

	public G_memberPayment() {

	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public int getGpid() {
		return gpid;
	}

	public void setGpid(int gpid) {
		this.gpid = gpid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getGamount() {
		return gamount;
	}

	public void setGamount(int gamount) {
		this.gamount = gamount;
	}

	public String getGpaymentmonth() {
		return gpaymentmonth;
	}

	public void setGpaymentmonth(String gpaymentmonth) {
		this.gpaymentmonth = gpaymentmonth;
	}

	public LocalDate getGpaymentdate() {
		return gpaymentdate;
	}

	public void setGpaymentdate(LocalDate gpaymentdate) {
		this.gpaymentdate = gpaymentdate;
	}

	public G_Member getgMember() {
		return gMember;
	}

	public void setgMember(G_Member gMember) {
		this.gMember = gMember;
	}
}
