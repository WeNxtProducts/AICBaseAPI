package com.aic.base.model;

import java.util.Date;

import com.aic.base.users.LM_MENU_USERS;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_MENU_USER_COMP_DIVN")
public class LM_MENU_USER_COMP_DIVN {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mucd_id")
	private int mucd_id;

	@ManyToOne
	@JoinColumn(name = "mucd_user_id")
	private LM_MENU_USERS mucd_user_id;

	@Column(name = "mucd_comp_code")
	private String mucd_comp_code;

	@Column(name = "mucd_divn_code")
	private String mucd_divn_code;

	@Column(name = "mucd_dept_code")
	private String mucd_dept_code;

	@Column(name = "mucd_cr_uid")
	private String mucd_cr_uid;

	@Column(name = "mucd_cr_dt")
	private Date mucd_cr_dt;

	@Column(name = "mucd_upd_uid")
	private String mucd_upd_uid;

	@Column(name = "mucd_upd_dt")
	private Date mucd_upd_dt;

	@Column(name = "mucd_dflt_yn")
	private String mucd_dflt_yn;

	public int getMucd_id() {
		return mucd_id;
	}

	public void setMucd_id(int mucd_id) {
		this.mucd_id = mucd_id;
	}



	public LM_MENU_USERS getMucd_user_id() {
		return mucd_user_id;
	}

	public void setMucd_user_id(LM_MENU_USERS mucd_user_id) {
		this.mucd_user_id = mucd_user_id;
	}

	public String getMucd_comp_code() {
		return mucd_comp_code;
	}

	public void setMucd_comp_code(String mucd_comp_code) {
		this.mucd_comp_code = mucd_comp_code;
	}

	public String getMucd_divn_code() {
		return mucd_divn_code;
	}

	public void setMucd_divn_code(String mucd_divn_code) {
		this.mucd_divn_code = mucd_divn_code;
	}

	public String getMucd_dept_code() {
		return mucd_dept_code;
	}

	public void setMucd_dept_code(String mucd_dept_code) {
		this.mucd_dept_code = mucd_dept_code;
	}

	public String getMucd_cr_uid() {
		return mucd_cr_uid;
	}

	public void setMucd_cr_uid(String mucd_cr_uid) {
		this.mucd_cr_uid = mucd_cr_uid;
	}

	public Date getMucd_cr_dt() {
		return mucd_cr_dt;
	}

	public void setMucd_cr_dt(Date mucd_cr_dt) {
		this.mucd_cr_dt = mucd_cr_dt;
	}

	public String getMucd_upd_uid() {
		return mucd_upd_uid;
	}

	public void setMucd_upd_uid(String mucd_upd_uid) {
		this.mucd_upd_uid = mucd_upd_uid;
	}

	public Date getMucd_upd_dt() {
		return mucd_upd_dt;
	}

	public void setMucd_upd_dt(Date mucd_upd_dt) {
		this.mucd_upd_dt = mucd_upd_dt;
	}

	public String getMucd_dflt_yn() {
		return mucd_dflt_yn;
	}

	public void setMucd_dflt_yn(String mucd_dflt_yn) {
		this.mucd_dflt_yn = mucd_dflt_yn;
	}

}
