package com.tsg.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "gents_member_payment_info_table")
public class G_memberPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;

	private int gid;

	private String gname;

	private int gamount;

	private String gpaymentmonth;

	public G_memberPayment() {
		super();
	}

	public G_memberPayment(long pid, int gid, String gname, int gamount, String gpaymentmonth) {
		this.pid = pid;
		this.gid = gid;
		this.gname = gname;
		this.gamount = gamount;
		this.gpaymentmonth = gpaymentmonth;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
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
}
