package com.aic.base.commonUtils;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lt_policy")
public class lt_policy
{
	@Id
//	@GeneratedValue(GenerationType.IDENTITY)
	@Column(name = "pol_tran_id")
	private long _pol_tran_id;
	public long getpol_tran_id()
	{
		return this._pol_tran_id;
	}
	public void setpol_tran_id(long value)
	{
		this._pol_tran_id = value;
	}
	
	@Column(name = "pol_prop_tran_id")
	private long _pol_prop_tran_id;
	public long getpol_prop_tran_id()
	{
		return this._pol_prop_tran_id;
	}
	public void setpol_prop_tran_id(long value)
	{
		this._pol_prop_tran_id = value;
	}
	
	@Column(name = "pol_prop_no")
	private String _pol_prop_no;
	public String getpol_prop_no()
	{
		return this._pol_prop_no;
	}
	public void setpol_prop_no(String value)
	{
		this._pol_prop_no = value;
	}
	
	@Column(name = "pol_divn_code")
	private String _pol_divn_code;
	public String getpol_divn_code()
	{
		return this._pol_divn_code;
	}
	public void setpol_divn_code(String value)
	{
		this._pol_divn_code = value;
	}
	
	@Column(name = "pol_dept_code")
	private String _pol_dept_code;
	public String getpol_dept_code()
	{
		return this._pol_dept_code;
	}
	public void setpol_dept_code(String value)
	{
		this._pol_dept_code = value;
	}
	
	@Column(name = "pol_class_code")
	private String _pol_class_code;
	public String getpol_class_code()
	{
		return this._pol_class_code;
	}
	public void setpol_class_code(String value)
	{
		this._pol_class_code = value;
	}
	
	@Column(name = "pol_uw_year")
	private short _pol_uw_year;
	public short getpol_uw_year()
	{
		return this._pol_uw_year;
	}
	public void setpol_uw_year(short value)
	{
		this._pol_uw_year = value;
	}
	
	@Column(name = "pol_no")
	private String _pol_no;
	public String getpol_no()
	{
		return this._pol_no;
	}
	public void setpol_no(String value)
	{
		this._pol_no = value;
	}
	
	@Column(name = "pol_issue_dt")
	private java.sql.Date _pol_issue_dt;
	public java.sql.Date getpol_issue_dt()
	{
		return this._pol_issue_dt;
	}
	public void setpol_issue_dt(java.sql.Date value)
	{
		this._pol_issue_dt = value;
	}
	
	@Column(name = "pol_start_dt")
	private java.sql.Date _pol_start_dt;
	public java.sql.Date getpol_start_dt()
	{
		return this._pol_start_dt;
	}
	public void setpol_start_dt(java.sql.Date value)
	{
		this._pol_start_dt = value;
	}
	
	@Column(name = "pol_expiry_dt")
	private java.sql.Date _pol_expiry_dt;
	public java.sql.Date getpol_expiry_dt()
	{
		return this._pol_expiry_dt;
	}
	public void setpol_expiry_dt(java.sql.Date value)
	{
		this._pol_expiry_dt = value;
	}
	
	@Column(name = "pol_plan_code")
	private String _pol_plan_code;
	public String getpol_plan_code()
	{
		return this._pol_plan_code;
	}
	public void setpol_plan_code(String value)
	{
		this._pol_plan_code = value;
	}
	
	@Column(name = "pol_prod_code")
	private String _pol_prod_code;
	public String getpol_prod_code()
	{
		return this._pol_prod_code;
	}
	public void setpol_prod_code(String value)
	{
		this._pol_prod_code = value;
	}
	
	@Column(name = "pol_cust_code")
	private String _pol_cust_code;
	public String getpol_cust_code()
	{
		return this._pol_cust_code;
	}
	public void setpol_cust_code(String value)
	{
		this._pol_cust_code = value;
	}
	
	@Column(name = "pol_assr_code")
	private String _pol_assr_code;
	public String getpol_assr_code()
	{
		return this._pol_assr_code;
	}
	public void setpol_assr_code(String value)
	{
		this._pol_assr_code = value;
	}
	
	@Column(name = "pol_assured_name")
	private String _pol_assured_name;
	public String getpol_assured_name()
	{
		return this._pol_assured_name;
	}
	public void setpol_assured_name(String value)
	{
		this._pol_assured_name = value;
	}
	
	@Column(name = "pol_ass_address_1")
	private String _pol_ass_address_1;
	public String getpol_ass_address_1()
	{
		return this._pol_ass_address_1;
	}
	public void setpol_ass_address_1(String value)
	{
		this._pol_ass_address_1 = value;
	}
	
	@Column(name = "pol_ass_address_2")
	private String _pol_ass_address_2;
	public String getpol_ass_address_2()
	{
		return this._pol_ass_address_2;
	}
	public void setpol_ass_address_2(String value)
	{
		this._pol_ass_address_2 = value;
	}
	
	@Column(name = "pol_ass_address_3")
	private String _pol_ass_address_3;
	public String getpol_ass_address_3()
	{
		return this._pol_ass_address_3;
	}
	public void setpol_ass_address_3(String value)
	{
		this._pol_ass_address_3 = value;
	}
	
	@Column(name = "pol_ass_phone_no")
	private String _pol_ass_phone_no;
	public String getpol_ass_phone_no()
	{
		return this._pol_ass_phone_no;
	}
	public void setpol_ass_phone_no(String value)
	{
		this._pol_ass_phone_no = value;
	}
	
	@Column(name = "pol_ass_area_code")
	private String _pol_ass_area_code;
	public String getpol_ass_area_code()
	{
		return this._pol_ass_area_code;
	}
	public void setpol_ass_area_code(String value)
	{
		this._pol_ass_area_code = value;
	}
	
	@Column(name = "pol_sa_curr_code")
	private String _pol_sa_curr_code;
	public String getpol_sa_curr_code()
	{
		return this._pol_sa_curr_code;
	}
	public void setpol_sa_curr_code(String value)
	{
		this._pol_sa_curr_code = value;
	}
	
	@Column(name = "pol_sa_exch_rate")
	private BigDecimal _pol_sa_exch_rate;
	public BigDecimal getpol_sa_exch_rate()
	{
		return this._pol_sa_exch_rate;
	}
	public void setpol_sa_exch_rate(BigDecimal value)
	{
		this._pol_sa_exch_rate = value;
	}
	
	@Column(name = "pol_cust_curr_code")
	private String _pol_cust_curr_code;
	public String getpol_cust_curr_code()
	{
		return this._pol_cust_curr_code;
	}
	public void setpol_cust_curr_code(String value)
	{
		this._pol_cust_curr_code = value;
	}
	
	@Column(name = "pol_cust_exch_rate")
	private BigDecimal _pol_cust_exch_rate;
	public BigDecimal getpol_cust_exch_rate()
	{
		return this._pol_cust_exch_rate;
	}
	public void setpol_cust_exch_rate(BigDecimal value)
	{
		this._pol_cust_exch_rate = value;
	}
	
	@Column(name = "pol_fc_sum_assured")
	private BigDecimal _pol_fc_sum_assured;
	public BigDecimal getpol_fc_sum_assured()
	{
		return this._pol_fc_sum_assured;
	}
	public void setpol_fc_sum_assured(BigDecimal value)
	{
		this._pol_fc_sum_assured = value;
	}
	
	@Column(name = "pol_lc_sum_assured")
	private BigDecimal _pol_lc_sum_assured;
	public BigDecimal getpol_lc_sum_assured()
	{
		return this._pol_lc_sum_assured;
	}
	public void setpol_lc_sum_assured(BigDecimal value)
	{
		this._pol_lc_sum_assured = value;
	}
	
	@Column(name = "pol_fc_curr_sa")
	private BigDecimal _pol_fc_curr_sa;
	public BigDecimal getpol_fc_curr_sa()
	{
		return this._pol_fc_curr_sa;
	}
	public void setpol_fc_curr_sa(BigDecimal value)
	{
		this._pol_fc_curr_sa = value;
	}
	
	@Column(name = "pol_lc_curr_sa")
	private BigDecimal _pol_lc_curr_sa;
	public BigDecimal getpol_lc_curr_sa()
	{
		return this._pol_lc_curr_sa;
	}
	public void setpol_lc_curr_sa(BigDecimal value)
	{
		this._pol_lc_curr_sa = value;
	}
	
	@Column(name = "pol_period")
	private short _pol_period;
	public short getpol_period()
	{
		return this._pol_period;
	}
	public void setpol_period(short value)
	{
		this._pol_period = value;
	}
	
	@Column(name = "pol_basic_rate")
	private BigDecimal _pol_basic_rate;
	public BigDecimal getpol_basic_rate()
	{
		return this._pol_basic_rate;
	}
	public void setpol_basic_rate(BigDecimal value)
	{
		this._pol_basic_rate = value;
	}
	
	@Column(name = "pol_basic_rate_per")
	private long _pol_basic_rate_per;
	public long getpol_basic_rate_per()
	{
		return this._pol_basic_rate_per;
	}
	public void setpol_basic_rate_per(long value)
	{
		this._pol_basic_rate_per = value;
	}
	
	@Column(name = "pol_fc_basic_prem")
	private BigDecimal _pol_fc_basic_prem;
	public BigDecimal getpol_fc_basic_prem()
	{
		return this._pol_fc_basic_prem;
	}
	public void setpol_fc_basic_prem(BigDecimal value)
	{
		this._pol_fc_basic_prem = value;
	}
	
	@Column(name = "pol_lc_basic_prem")
	private BigDecimal _pol_lc_basic_prem;
	public BigDecimal getpol_lc_basic_prem()
	{
		return this._pol_lc_basic_prem;
	}
	public void setpol_lc_basic_prem(BigDecimal value)
	{
		this._pol_lc_basic_prem = value;
	}
	
	@Column(name = "pol_fc_addl_prem")
	private BigDecimal _pol_fc_addl_prem;
	public BigDecimal getpol_fc_addl_prem()
	{
		return this._pol_fc_addl_prem;
	}
	public void setpol_fc_addl_prem(BigDecimal value)
	{
		this._pol_fc_addl_prem = value;
	}
	
	@Column(name = "pol_lc_addl_prem")
	private BigDecimal _pol_lc_addl_prem;
	public BigDecimal getpol_lc_addl_prem()
	{
		return this._pol_lc_addl_prem;
	}
	public void setpol_lc_addl_prem(BigDecimal value)
	{
		this._pol_lc_addl_prem = value;
	}
	
	@Column(name = "pol_fc_occ_load")
	private BigDecimal _pol_fc_occ_load;
	public BigDecimal getpol_fc_occ_load()
	{
		return this._pol_fc_occ_load;
	}
	public void setpol_fc_occ_load(BigDecimal value)
	{
		this._pol_fc_occ_load = value;
	}
	
	@Column(name = "pol_lc_occ_load")
	private BigDecimal _pol_lc_occ_load;
	public BigDecimal getpol_lc_occ_load()
	{
		return this._pol_lc_occ_load;
	}
	public void setpol_lc_occ_load(BigDecimal value)
	{
		this._pol_lc_occ_load = value;
	}
	
	@Column(name = "pol_fc_health_load")
	private BigDecimal _pol_fc_health_load;
	public BigDecimal getpol_fc_health_load()
	{
		return this._pol_fc_health_load;
	}
	public void setpol_fc_health_load(BigDecimal value)
	{
		this._pol_fc_health_load = value;
	}
	
	@Column(name = "pol_lc_health_load")
	private BigDecimal _pol_lc_health_load;
	public BigDecimal getpol_lc_health_load()
	{
		return this._pol_lc_health_load;
	}
	public void setpol_lc_health_load(BigDecimal value)
	{
		this._pol_lc_health_load = value;
	}
	
	@Column(name = "pol_fc_deposit_amount")
	private BigDecimal _pol_fc_deposit_amount;
	public BigDecimal getpol_fc_deposit_amount()
	{
		return this._pol_fc_deposit_amount;
	}
	public void setpol_fc_deposit_amount(BigDecimal value)
	{
		this._pol_fc_deposit_amount = value;
	}
	
	@Column(name = "pol_lc_deposit_amount")
	private BigDecimal _pol_lc_deposit_amount;
	public BigDecimal getpol_lc_deposit_amount()
	{
		return this._pol_lc_deposit_amount;
	}
	public void setpol_lc_deposit_amount(BigDecimal value)
	{
		this._pol_lc_deposit_amount = value;
	}
	
	@Column(name = "pol_mode_of_pymt")
	private String _pol_mode_of_pymt;
	public String getpol_mode_of_pymt()
	{
		return this._pol_mode_of_pymt;
	}
	public void setpol_mode_of_pymt(String value)
	{
		this._pol_mode_of_pymt = value;
	}
	
	@Column(name = "pol_mode_of_pymt_rate")
	private BigDecimal _pol_mode_of_pymt_rate;
	public BigDecimal getpol_mode_of_pymt_rate()
	{
		return this._pol_mode_of_pymt_rate;
	}
	public void setpol_mode_of_pymt_rate(BigDecimal value)
	{
		this._pol_mode_of_pymt_rate = value;
	}
	
	@Column(name = "pol_remarks")
	private String _pol_remarks;
	public String getpol_remarks()
	{
		return this._pol_remarks;
	}
	public void setpol_remarks(String value)
	{
		this._pol_remarks = value;
	}
	
	@Column(name = "pol_first_inst_dt")
	private java.sql.Date _pol_first_inst_dt;
	public java.sql.Date getpol_first_inst_dt()
	{
		return this._pol_first_inst_dt;
	}
	public void setpol_first_inst_dt(java.sql.Date value)
	{
		this._pol_first_inst_dt = value;
	}
	
	@Column(name = "pol_last_inst_dt")
	private java.sql.Date _pol_last_inst_dt;
	public java.sql.Date getpol_last_inst_dt()
	{
		return this._pol_last_inst_dt;
	}
	public void setpol_last_inst_dt(java.sql.Date value)
	{
		this._pol_last_inst_dt = value;
	}
	
	@Column(name = "pol_no_yrs_prem_paid")
	private BigDecimal _pol_no_yrs_prem_paid;
	public BigDecimal getpol_no_yrs_prem_paid()
	{
		return this._pol_no_yrs_prem_paid;
	}
	public void setpol_no_yrs_prem_paid(BigDecimal value)
	{
		this._pol_no_yrs_prem_paid = value;
	}
	
	@Column(name = "pol_facin_yn")
	private String _pol_facin_yn;
	public String getpol_facin_yn()
	{
		return this._pol_facin_yn;
	}
	public void setpol_facin_yn(String value)
	{
		this._pol_facin_yn = value;
	}
	
	@Column(name = "pol_fac_yn")
	private String _pol_fac_yn;
	public String getpol_fac_yn()
	{
		return this._pol_fac_yn;
	}
	public void setpol_fac_yn(String value)
	{
		this._pol_fac_yn = value;
	}
	
	@Column(name = "pol_coins_yn")
	private String _pol_coins_yn;
	public String getpol_coins_yn()
	{
		return this._pol_coins_yn;
	}
	public void setpol_coins_yn(String value)
	{
		this._pol_coins_yn = value;
	}
	
	@Column(name = "pol_ri_close_flag")
	private String _pol_ri_close_flag;
	public String getpol_ri_close_flag()
	{
		return this._pol_ri_close_flag;
	}
	public void setpol_ri_close_flag(String value)
	{
		this._pol_ri_close_flag = value;
	}
	
	@Column(name = "pol_fac_close_flag")
	private String _pol_fac_close_flag;
	public String getpol_fac_close_flag()
	{
		return this._pol_fac_close_flag;
	}
	public void setpol_fac_close_flag(String value)
	{
		this._pol_fac_close_flag = value;
	}
	
	@Column(name = "pol_status")
	private String _pol_status;
	public String getpol_status()
	{
		return this._pol_status;
	}
	public void setpol_status(String value)
	{
		this._pol_status = value;
	}
	
	@Column(name = "pol_apprv_status")
	private String _pol_apprv_status;
	public String getpol_apprv_status()
	{
		return this._pol_apprv_status;
	}
	public void setpol_apprv_status(String value)
	{
		this._pol_apprv_status = value;
	}
	
	@Column(name = "pol_apprv_dt")
	private java.sql.Date _pol_apprv_dt;
	public java.sql.Date getpol_apprv_dt()
	{
		return this._pol_apprv_dt;
	}
	public void setpol_apprv_dt(java.sql.Date value)
	{
		this._pol_apprv_dt = value;
	}
	
	@Column(name = "pol_end_type")
	private String _pol_end_type;
	public String getpol_end_type()
	{
		return this._pol_end_type;
	}
	public void setpol_end_type(String value)
	{
		this._pol_end_type = value;
	}
	
	@Column(name = "pol_end_code")
	private String _pol_end_code;
	public String getpol_end_code()
	{
		return this._pol_end_code;
	}
	public void setpol_end_code(String value)
	{
		this._pol_end_code = value;
	}
	
	@Column(name = "pol_end_no_idx")
	private long _pol_end_no_idx;
	public long getpol_end_no_idx()
	{
		return this._pol_end_no_idx;
	}
	public void setpol_end_no_idx(long value)
	{
		this._pol_end_no_idx = value;
	}
	
	@Column(name = "pol_end_dt")
	private java.sql.Date _pol_end_dt;
	public java.sql.Date getpol_end_dt()
	{
		return this._pol_end_dt;
	}
	public void setpol_end_dt(java.sql.Date value)
	{
		this._pol_end_dt = value;
	}
	
	@Column(name = "pol_end_no")
	private String _pol_end_no;
	public String getpol_end_no()
	{
		return this._pol_end_no;
	}
	public void setpol_end_no(String value)
	{
		this._pol_end_no = value;
	}
	
	@Column(name = "pol_end_eff_from_dt")
	private java.sql.Date _pol_end_eff_from_dt;
	public java.sql.Date getpol_end_eff_from_dt()
	{
		return this._pol_end_eff_from_dt;
	}
	public void setpol_end_eff_from_dt(java.sql.Date value)
	{
		this._pol_end_eff_from_dt = value;
	}
	
	@Column(name = "pol_end_eff_to_dt")
	private java.sql.Date _pol_end_eff_to_dt;
	public java.sql.Date getpol_end_eff_to_dt()
	{
		return this._pol_end_eff_to_dt;
	}
	public void setpol_end_eff_to_dt(java.sql.Date value)
	{
		this._pol_end_eff_to_dt = value;
	}
	
	@Column(name = "pol_end_desc")
	private String _pol_end_desc;
	public String getpol_end_desc()
	{
		return this._pol_end_desc;
	}
	public void setpol_end_desc(String value)
	{
		this._pol_end_desc = value;
	}
	
	@Column(name = "pol_ins_dt")
	private java.sql.Date _pol_ins_dt;
	public java.sql.Date getpol_ins_dt()
	{
		return this._pol_ins_dt;
	}
	public void setpol_ins_dt(java.sql.Date value)
	{
		this._pol_ins_dt = value;
	}
	
	@Column(name = "pol_ins_id")
	private String _pol_ins_id;
	public String getpol_ins_id()
	{
		return this._pol_ins_id;
	}
	public void setpol_ins_id(String value)
	{
		this._pol_ins_id = value;
	}
	
	@Column(name = "pol_mod_dt")
	private java.sql.Date _pol_mod_dt;
	public java.sql.Date getpol_mod_dt()
	{
		return this._pol_mod_dt;
	}
	public void setpol_mod_dt(java.sql.Date value)
	{
		this._pol_mod_dt = value;
	}
	
	@Column(name = "pol_mod_uid")
	private String _pol_mod_uid;
	public String getpol_mod_uid()
	{
		return this._pol_mod_uid;
	}
	public void setpol_mod_uid(String value)
	{
		this._pol_mod_uid = value;
	}
	
	@Column(name = "pol_prem_waive_yn")
	private String _pol_prem_waive_yn;
	public String getpol_prem_waive_yn()
	{
		return this._pol_prem_waive_yn;
	}
	public void setpol_prem_waive_yn(String value)
	{
		this._pol_prem_waive_yn = value;
	}
	
	@Column(name = "pol_cancel_dt")
	private java.sql.Date _pol_cancel_dt;
	public java.sql.Date getpol_cancel_dt()
	{
		return this._pol_cancel_dt;
	}
	public void setpol_cancel_dt(java.sql.Date value)
	{
		this._pol_cancel_dt = value;
	}
	
	@Column(name = "pol_paidup_dt")	
	private java.sql.Date _pol_paidup_dt;
	public java.sql.Date getpol_paidup_dt()
	{
		return this._pol_paidup_dt;
	}
	public void setpol_paidup_dt(java.sql.Date value)
	{
		this._pol_paidup_dt = value;
	}
	
	@Column(name = "pol_cash_yn")
	private String _pol_cash_yn;
	public String getpol_cash_yn()
	{
		return this._pol_cash_yn;
	}
	public void setpol_cash_yn(String value)
	{
		this._pol_cash_yn = value;
	}
	
	@Column(name = "pol_load_perc")
	private BigDecimal _pol_load_perc;
	public BigDecimal getpol_load_perc()
	{
		return this._pol_load_perc;
	}
	public void setpol_load_perc(BigDecimal value)
	{
		this._pol_load_perc = value;
	}
	
	@Column(name = "pol_doc_type")
	private String _pol_doc_type;
	public String getpol_doc_type()
	{
		return this._pol_doc_type;
	}
	public void setpol_doc_type(String value)
	{
		this._pol_doc_type = value;
	}
	
	@Column(name = "pol_prop_quot_flag")
	private String _pol_prop_quot_flag;
	public String getpol_prop_quot_flag()
	{
		return this._pol_prop_quot_flag;
	}
	public void setpol_prop_quot_flag(String value)
	{
		this._pol_prop_quot_flag = value;
	}
	
	@Column(name = "pol_joint_life_yn")
	private String _pol_joint_life_yn;
	public String getpol_joint_life_yn()
	{
		return this._pol_joint_life_yn;
	}
	public void setpol_joint_life_yn(String value)
	{
		this._pol_joint_life_yn = value;
	}
	
	@Column(name = "pol_joint_life_age")
	private short _pol_joint_life_age;
	public short getpol_joint_life_age()
	{
		return this._pol_joint_life_age;
	}
	public void setpol_joint_life_age(short value)
	{
		this._pol_joint_life_age = value;
	}
	
	@Column(name = "pol_prem_pay_yrs")
	private short _pol_prem_pay_yrs;
	public short getpol_prem_pay_yrs()
	{
		return this._pol_prem_pay_yrs;
	}
	public void setpol_prem_pay_yrs(short value)
	{
		this._pol_prem_pay_yrs = value;
	}
	
	@Column(name = "pol_employer_code")
	private String _pol_employer_code;
	public String getpol_employer_code()
	{
		return this._pol_employer_code;
	}
	public void setpol_employer_code(String value)
	{
		this._pol_employer_code = value;
	}
	
	@Column(name = "pol_tariff_term_flag")
	private String _pol_tariff_term_flag;
	public String getpol_tariff_term_flag()
	{
		return this._pol_tariff_term_flag;
	}
	public void setpol_tariff_term_flag(String value)
	{
		this._pol_tariff_term_flag = value;
	}
	
	@Column(name = "pol_rate_applied_on")
	private String _pol_rate_applied_on;
	public String getpol_rate_applied_on()
	{
		return this._pol_rate_applied_on;
	}
	public void setpol_rate_applied_on(String value)
	{
		this._pol_rate_applied_on = value;
	}
	
	@Column(name = "pol_staff_yn")
	private String _pol_staff_yn;
	public String getpol_staff_yn()
	{
		return this._pol_staff_yn;
	}
	public void setpol_staff_yn(String value)
	{
		this._pol_staff_yn = value;
	}
	
	@Column(name = "pol_fc_disc_amt")
	private BigDecimal _pol_fc_disc_amt;
	public BigDecimal getpol_fc_disc_amt()
	{
		return this._pol_fc_disc_amt;
	}
	public void setpol_fc_disc_amt(BigDecimal value)
	{
		this._pol_fc_disc_amt = value;
	}
	
	@Column(name = "pol_lc_disc_amt")
	private BigDecimal _pol_lc_disc_amt;
	public BigDecimal getpol_lc_disc_amt()
	{
		return this._pol_lc_disc_amt;
	}
	public void setpol_lc_disc_amt(BigDecimal value)
	{
		this._pol_lc_disc_amt = value;
	}
	
	@Column(name = "pol_std_risk_yn")
	private String _pol_std_risk_yn;
	public String getpol_std_risk_yn()
	{
		return this._pol_std_risk_yn;
	}
	public void setpol_std_risk_yn(String value)
	{
		this._pol_std_risk_yn = value;
	}
	
	@Column(name = "pol_fc_first_prem")
	private BigDecimal _pol_fc_first_prem;
	public BigDecimal getpol_fc_first_prem()
	{
		return this._pol_fc_first_prem;
	}
	public void setpol_fc_first_prem(BigDecimal value)
	{
		this._pol_fc_first_prem = value;
	}
	
	@Column(name = "pol_lc_first_prem")
	private BigDecimal _pol_lc_first_prem;
	public BigDecimal getpol_lc_first_prem()
	{
		return this._pol_lc_first_prem;
	}
	public void setpol_lc_first_prem(BigDecimal value)
	{
		this._pol_lc_first_prem = value;
	}
	
	@Column(name = "pol_no_of_inst")
	private short _pol_no_of_inst;
	public short getpol_no_of_inst()
	{
		return this._pol_no_of_inst;
	}
	public void setpol_no_of_inst(short value)
	{
		this._pol_no_of_inst = value;
	}
	
	@Column(name = "pol_addl_status")
	private String _pol_addl_status;
	public String getpol_addl_status()
	{
		return this._pol_addl_status;
	}
	public void setpol_addl_status(String value)
	{
		this._pol_addl_status = value;
	}
	
	@Column(name = "pol_mode_of_calc")
	private String _pol_mode_of_calc;
	public String getpol_mode_of_calc()
	{
		return this._pol_mode_of_calc;
	}
	public void setpol_mode_of_calc(String value)
	{
		this._pol_mode_of_calc = value;
	}
	
	@Column(name = "pol_pymt_type")
	private String _pol_pymt_type;
	public String getpol_pymt_type()
	{
		return this._pol_pymt_type;
	}
	public void setpol_pymt_type(String value)
	{
		this._pol_pymt_type = value;
	}
	
	@Column(name = "pol_fc_tot_sa")
	private BigDecimal _pol_fc_tot_sa;
	public BigDecimal getpol_fc_tot_sa()
	{
		return this._pol_fc_tot_sa;
	}
	public void setpol_fc_tot_sa(BigDecimal value)
	{
		this._pol_fc_tot_sa = value;
	}
	
	@Column(name = "pol_lc_tot_sa")
	private BigDecimal _pol_lc_tot_sa;
	public BigDecimal getpol_lc_tot_sa()
	{
		return this._pol_lc_tot_sa;
	}
	public void setpol_lc_tot_sa(BigDecimal value)
	{
		this._pol_lc_tot_sa = value;
	}
	
	@Column(name = "pol_fc_net_prem")
	private BigDecimal _pol_fc_net_prem;
	public BigDecimal getpol_fc_net_prem()
	{
		return this._pol_fc_net_prem;
	}
	public void setpol_fc_net_prem(BigDecimal value)
	{
		this._pol_fc_net_prem = value;
	}
	
	@Column(name = "pol_lc_net_prem")
	private BigDecimal _pol_lc_net_prem;
	public BigDecimal getpol_lc_net_prem()
	{
		return this._pol_lc_net_prem;
	}
	public void setpol_lc_net_prem(BigDecimal value)
	{
		this._pol_lc_net_prem = value;
	}
	
	@Column(name = "pol_frz_flag")
	private String _pol_frz_flag;
	public String getpol_frz_flag()
	{
		return this._pol_frz_flag;
	}
	public void setpol_frz_flag(String value)
	{
		this._pol_frz_flag = value;
	}
	
	@Column(name = "pol_prop_recv_dt")
	private java.sql.Date _pol_prop_recv_dt;
	public java.sql.Date getpol_prop_recv_dt()
	{
		return this._pol_prop_recv_dt;
	}
	public void setpol_prop_recv_dt(java.sql.Date value)
	{
		this._pol_prop_recv_dt = value;
	}
	
	@Column(name = "pol_prop_stamp_dt")
	private java.sql.Date _pol_prop_stamp_dt;
	public java.sql.Date getpol_prop_stamp_dt()
	{
		return this._pol_prop_stamp_dt;
	}
	public void setpol_prop_stamp_dt(java.sql.Date value)
	{
		this._pol_prop_stamp_dt = value;
	}
	
	@Column(name = "pol_prop_decl_dt")
	private java.sql.Date _pol_prop_decl_dt;
	public java.sql.Date getpol_prop_decl_dt()
	{
		return this._pol_prop_decl_dt;
	}
	public void setpol_prop_decl_dt(java.sql.Date value)
	{
		this._pol_prop_decl_dt = value;
	}
	
	@Column(name = "pol_src_of_bus")
	private String _pol_src_of_bus;
	public String getpol_src_of_bus()
	{
		return this._pol_src_of_bus;
	}
	public void setpol_src_of_bus(String value)
	{
		this._pol_src_of_bus = value;
	}
	
	@Column(name = "pol_postpone_days")
	private short _pol_postpone_days;
	public short getpol_postpone_days()
	{
		return this._pol_postpone_days;
	}
	public void setpol_postpone_days(short value)
	{
		this._pol_postpone_days = value;
	}
	
	@Column(name = "pol_postpone_expiry_dt")
	private java.sql.Date _pol_postpone_expiry_dt;
	public java.sql.Date getpol_postpone_expiry_dt()
	{
		return this._pol_postpone_expiry_dt;
	}
	public void setpol_postpone_expiry_dt(java.sql.Date value)
	{
		this._pol_postpone_expiry_dt = value;
	}
	
	@Column(name = "pol_fac_basis")
	private String _pol_fac_basis;
	public String getpol_fac_basis()
	{
		return this._pol_fac_basis;
	}
	public void setpol_fac_basis(String value)
	{
		this._pol_fac_basis = value;
	}
	
	@Column(name = "pol_ri_pool_code")
	private String _pol_ri_pool_code;
	public String getpol_ri_pool_code()
	{
		return this._pol_ri_pool_code;
	}
	public void setpol_ri_pool_code(String value)
	{
		this._pol_ri_pool_code = value;
	}
	
	@Column(name = "pol_apprv_uid")
	private String _pol_apprv_uid;
	public String getpol_apprv_uid()
	{
		return this._pol_apprv_uid;
	}
	public void setpol_apprv_uid(String value)
	{
		this._pol_apprv_uid = value;
	}
	
	@Column(name = "pol_lc_modal_prem")
	private BigDecimal _pol_lc_modal_prem;
	public BigDecimal getpol_lc_modal_prem()
	{
		return this._pol_lc_modal_prem;
	}
	public void setpol_lc_modal_prem(BigDecimal value)
	{
		this._pol_lc_modal_prem = value;
	}
	
	@Column(name = "pol_fc_modal_prem")
	private BigDecimal _pol_fc_modal_prem;
	public BigDecimal getpol_fc_modal_prem()
	{
		return this._pol_fc_modal_prem;
	}
	public void setpol_fc_modal_prem(BigDecimal value)
	{
		this._pol_fc_modal_prem = value;
	}
	
	@Column(name = "pol_end_apprv_dt")
	private java.sql.Date _pol_end_apprv_dt;
	public java.sql.Date getpol_end_apprv_dt()
	{
		return this._pol_end_apprv_dt;
	}
	public void setpol_end_apprv_dt(java.sql.Date value)
	{
		this._pol_end_apprv_dt = value;
	}
	
	@Column(name = "pol_lc_min_prem")
	private BigDecimal _pol_lc_min_prem;
	public BigDecimal getpol_lc_min_prem()
	{
		return this._pol_lc_min_prem;
	}
	public void setpol_lc_min_prem(BigDecimal value)
	{
		this._pol_lc_min_prem = value;
	}
	
	@Column(name = "pol_fc_min_prem")
	private BigDecimal _pol_fc_min_prem;
	public BigDecimal getpol_fc_min_prem()
	{
		return this._pol_fc_min_prem;
	}
	public void setpol_fc_min_prem(BigDecimal value)
	{
		this._pol_fc_min_prem = value;
	}
	
	@Column(name = "pol_fc_extra_prem")
	private BigDecimal _pol_fc_extra_prem;
	public BigDecimal getpol_fc_extra_prem()
	{
		return this._pol_fc_extra_prem;
	}
	public void setpol_fc_extra_prem(BigDecimal value)
	{
		this._pol_fc_extra_prem = value;
	}
	
	@Column(name = "pol_lc_extra_prem")
	private BigDecimal _pol_lc_extra_prem;
	public BigDecimal getpol_lc_extra_prem()
	{
		return this._pol_lc_extra_prem;
	}
	public void setpol_lc_extra_prem(BigDecimal value)
	{
		this._pol_lc_extra_prem = value;
	}
	
	@Column(name = "pol_stp_yn")
	private String _pol_stp_yn;
	public String getpol_stp_yn()
	{
		return this._pol_stp_yn;
	}
	public void setpol_stp_yn(String value)
	{
		this._pol_stp_yn = value;
	}

}