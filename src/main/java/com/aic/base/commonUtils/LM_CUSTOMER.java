package com.aic.base.commonUtils;

import java.time.LocalDate;
import java.util.Date;

//@Entity
//@Table(name = "lm_customer")
//public class LM_CUSTOMER {
//
//	@Id
//	@Column(name = "cust_code")
//	private String custCode;
//
//	@Column(name = "cust_class")
//	private String cust_class;
//
//	@Column(name = "cust_type")
//	private String cust_type;
//
//	@Column(name = "cust_name")
//	private String cust_name;
//
//	@Column(name = "cust_short_name")
//	private String cust_short_name;
//
//	@Column(name = "cust_dob")
//	private LocalDateTime cust_dob;
//
//	@Column(name = "cust_catg_code")
//	private String cust_catg_code;
//
//	@Column(name = "cust_addr1")
//	private String cust_addr1;
//
//	@Column(name = "cust_addr2")
//	private String cust_addr2;
//
//	@Column(name = "cust_addr3")
//	private String cust_addr3;
//
//	@Column(name = "cust_contact")
//	private String cust_contact;
//
//	@Column(name = "cust_phone")
//	private String cust_phone;
//
//	@Column(name = "cust_city")
//	private String cust_city;
//
//	@Column(name = "cust_country")
//	private String cust_country;
//
//	@Column(name = "cust_mar_status")
//	private String cust_mar_status;
//
//	@Column(name = "cust_salutation")
//	private String cust_salutation;
//
////	@Column(name = "cust_ml_name")
////	private String cust_ml_name;
////
////	@Column(name = "cust_ml_short_name")
////	private String cust_ml_short_name;
////
////	@Column(name = "cust_ml_addr1")
////	private String cust_ml_addr1;
////
////	@Column(name = "cust_ml_addr2")
////	private String cust_ml_addr2;
////
////	@Column(name = "cust_ml_addr3")
////	private String cust_ml_addr3;
////
////	@Column(name = "cust_ml_contact")
////	private String cust_ml_contact;
////
////	@Column(name = "cust_ml_phone")
////	private String cust_ml_phone;
////
////	@Column(name = "cust_ml_city")
////	private String cust_ml_city;
////
////	@Column(name = "cust_ml_country")
////	private String cust_ml_country;
//
//	@Column(name = "cust_frz_flag")
//	private String cust_frz_flag;
//
//	@Column(name = "cust_ins_dt")
//	private LocalDateTime cust_ins_dt;
//
//	@Column(name = "cust_ins_id")
//	private String cust_ins_id;
//
//	@Column(name = "cust_mod_dt")
//	private LocalDateTime cust_mod_dt;
//
//	@Column(name = "cust_mod_id")
//	private String cust_mod_id;
//
////	@Column(name = "cust_national_id")
////	private String cust_national_id;
//
//	@Column(name = "cust_credit_days")
//	private Double cust_credit_days;
//
////	@Column(name = "cust_occupation")
////	private String cust_occupation;
//
//	@Column(name = "cust_mobile_no")
//	private String cust_mobile_no;
//
//	@Column(name = "cust_qualfn")
//	private String cust_qualfn;
//
//	@Column(name = "cust_eff_fm_dt")
//	private LocalDateTime cust_eff_fm_dt;
//
//	@Column(name = "cust_eff_to_dt")
//	private LocalDateTime cust_eff_to_dt;
//
//	@Column(name = "cust_agency_name")
//	private String cust_agency_name;
//
//	@Column(name = "cust_agent_rank_code")
//	private String cust_agent_rank_code;
//
//	@Column(name = "cust_lcn_no")
//	private String cust_lcn_no;
//
//	@Column(name = "cust_lic_start_dt")
//	private LocalDateTime cust_lic_start_dt;
//
//	@Column(name = "cust_lic_end_dt")
//	private LocalDateTime cust_lic_end_dt;
//
//	@Column(name = "cust_lcn_reg_dt")
//	private LocalDateTime cust_lcn_reg_dt;
//
//	@Column(name = "cust_lcn_status")
//	private String cust_lcn_status;
//
//	@Column(name = "cust_spouse_name")
//	private String cust_spouse_name;
//
//	@Column(name = "cust_status")
//	private String cust_status;
//
//	@Column(name = "cust_flex_01")
//	private String cust_flex_01;
//
//	@Column(name = "cust_flex_02")
//	private String cust_flex_02;
//
//	@Column(name = "cust_flex_03")
//	private String cust_flex_03;
//
//	@Column(name = "cust_flex_04")
//	private String cust_flex_04;
//
//	@Column(name = "cust_flex_05")
//	private String cust_flex_05;
//
//	@Column(name = "cust_flex_06")
//	private String cust_flex_06;
//
//	@Column(name = "cust_flex_07")
//	private String cust_flex_07;
//
//	@Column(name = "cust_flex_08")
//	private String cust_flex_08;
//
//	@Column(name = "cust_flex_09")
//	private String cust_flex_09;
//
//	@Column(name = "cust_flex_10")
//	private String cust_flex_10;
//
//	@Column(name = "cust_employer_code")
//	private String cust_employer_code;
//
//	@Column(name = "cust_comp_code")
//	private String cust_comp_code;
//
//	@Column(name = "CUST_FIRST_NAME")
//	private String CUST_FIRST_NAME;
//
//	@Column(name = "CUST_MIDDLE_NAME")
//	private String CUST_MIDDLE_NAME;
//
////	@Column(name = "CUST_SUR_NAME")
////	private String CUST_SUR_NAME;
//
//	@Column(name = "CUST_PHY_ADDR1")
//	private String CUST_PHY_ADDR1;
//
//	@Column(name = "CUST_PHY_ADDR2")
//	private String CUST_PHY_ADDR2;
//
//	@Column(name = "CUST_PHY_ADDR3")
//	private String CUST_PHY_ADDR3;
//
//	@Column(name = "CUST_PHY_PHONE")
//	private String CUST_PHY_PHONE;
//
//	@Column(name = "CUST_PHY_CONTACT")
//	private String CUST_PHY_CONTACT;
//
//	@Column(name = "CUST_PHY_CONTACT2")
//	private String CUST_PHY_CONTACT2;
//
//	@Column(name = "CUST_PHY_FAX")
//	private String CUST_PHY_FAX;
//
//	@Column(name = "CUST_PHY_AREA")
//	private String CUST_PHY_AREA;
//
//	@Column(name = "CUST_PHY_REGION")
//	private String CUST_PHY_REGION;
//
//	@Column(name = "CUST_PHY_COUNTRY")
//	private String CUST_PHY_COUNTRY;
//
//	@Column(name = "CUST_CONTACT2")
//	private String CUST_CONTACT2;
//
//	@Column(name = "CUST_CONTACT3")
//	private String CUST_CONTACT3;
//
//	@Column(name = "CUST_CLM_CONTACT")
//	private String CUST_CLM_CONTACT;
//
//	@Column(name = "CUST_ACNT_CONTACT")
//	private String CUST_ACNT_CONTACT;
//
//	@Column(name = "CUST_CONTACT1_LIC_NO")
//	private String CUST_CONTACT1_LIC_NO;
//
//	@Column(name = "CUST_CONTACT2_LIC_NO")
//	private String CUST_CONTACT2_LIC_NO;
//
//	@Column(name = "CUST_CONTACT3_LIC_NO")
//	private String CUST_CONTACT3_LIC_NO;
//
//	@Column(name = "CUST_CLM_CONTACT_LIC_NO")
//	private String CUST_CLM_CONTACT_LIC_NO;
//
//	@Column(name = "CUST_ACNT_CONTACT_LIC_NO")
//	private String CUST_ACNT_CONTACT_LIC_NO;
//
//	@Column(name="CUST_ID_TYPE")
//	private String CUST_ID_TYPE;
//	
//	@Column(name="CUST_REF_ID1")
//	private String CUST_REF_ID1;
//	
//	public String getCustCode() {
//		return custCode;
//	}
//
//	public void setCustCode(String custCode) {
//		this.custCode = custCode;
//	}
//
//	public String getCust_class() {
//		return cust_class;
//	}
//
//	public void setCust_class(String cust_class) {
//		this.cust_class = cust_class;
//	}
//
//	public String getCust_type() {
//		return cust_type;
//	}
//
//	public void setCust_type(String cust_type) {
//		this.cust_type = cust_type;
//	}
//
//	public String getCust_name() {
//		return cust_name;
//	}
//
//	public void setCust_name(String cust_name) {
//		this.cust_name = cust_name;
//	}
//
//	public String getCust_short_name() {
//		return cust_short_name;
//	}
//
//	public void setCust_short_name(String cust_short_name) {
//		this.cust_short_name = cust_short_name;
//	}
//
//	public LocalDateTime getCust_dob() {
//		return cust_dob;
//	}
//
//	public void setCust_dob(LocalDateTime cust_dob) {
//		this.cust_dob = cust_dob;
//	}
//
//	public String getCust_catg_code() {
//		return cust_catg_code;
//	}
//
//	public void setCust_catg_code(String cust_catg_code) {
//		this.cust_catg_code = cust_catg_code;
//	}
//
//	public String getCust_addr1() {
//		return cust_addr1;
//	}
//
//	public void setCust_addr1(String cust_addr1) {
//		this.cust_addr1 = cust_addr1;
//	}
//
//	public String getCust_addr2() {
//		return cust_addr2;
//	}
//
//	public void setCust_addr2(String cust_addr2) {
//		this.cust_addr2 = cust_addr2;
//	}
//
//	public String getCust_addr3() {
//		return cust_addr3;
//	}
//
//	public void setCust_addr3(String cust_addr3) {
//		this.cust_addr3 = cust_addr3;
//	}
//
//	public String getCust_contact() {
//		return cust_contact;
//	}
//
//	public void setCust_contact(String cust_contact) {
//		this.cust_contact = cust_contact;
//	}
//
//	public String getCust_phone() {
//		return cust_phone;
//	}
//
//	public void setCust_phone(String cust_phone) {
//		this.cust_phone = cust_phone;
//	}
//
//	public String getCust_city() {
//		return cust_city;
//	}
//
//	public void setCust_city(String cust_city) {
//		this.cust_city = cust_city;
//	}
//
//	public String getCust_country() {
//		return cust_country;
//	}
//
//	public void setCust_country(String cust_country) {
//		this.cust_country = cust_country;
//	}
//
//	public String getCust_mar_status() {
//		return cust_mar_status;
//	}
//
//	public void setCust_mar_status(String cust_mar_status) {
//		this.cust_mar_status = cust_mar_status;
//	}
//
//	public String getCust_salutation() {
//		return cust_salutation;
//	}
//
//	public void setCust_salutation(String cust_salutation) {
//		this.cust_salutation = cust_salutation;
//	}
//
////	public String getCust_ml_name() {
////		return cust_ml_name;
////	}
////
////	public void setCust_ml_name(String cust_ml_name) {
////		this.cust_ml_name = cust_ml_name;
////	}
////
////	public String getCust_ml_short_name() {
////		return cust_ml_short_name;
////	}
////
////	public void setCust_ml_short_name(String cust_ml_short_name) {
////		this.cust_ml_short_name = cust_ml_short_name;
////	}
////
////	public String getCust_ml_addr1() {
////		return cust_ml_addr1;
////	}
////
////	public void setCust_ml_addr1(String cust_ml_addr1) {
////		this.cust_ml_addr1 = cust_ml_addr1;
////	}
////
////	public String getCust_ml_addr2() {
////		return cust_ml_addr2;
////	}
////
////	public void setCust_ml_addr2(String cust_ml_addr2) {
////		this.cust_ml_addr2 = cust_ml_addr2;
////	}
////
////	public String getCust_ml_addr3() {
////		return cust_ml_addr3;
////	}
////
////	public void setCust_ml_addr3(String cust_ml_addr3) {
////		this.cust_ml_addr3 = cust_ml_addr3;
////	}
////
////	public String getCust_ml_contact() {
////		return cust_ml_contact;
////	}
////
////	public void setCust_ml_contact(String cust_ml_contact) {
////		this.cust_ml_contact = cust_ml_contact;
////	}
////
////	public String getCust_ml_phone() {
////		return cust_ml_phone;
////	}
////
////	public void setCust_ml_phone(String cust_ml_phone) {
////		this.cust_ml_phone = cust_ml_phone;
////	}
////
////	public String getCust_ml_city() {
////		return cust_ml_city;
////	}
////
////	public void setCust_ml_city(String cust_ml_city) {
////		this.cust_ml_city = cust_ml_city;
////	}
////
////	public String getCust_ml_country() {
////		return cust_ml_country;
////	}
////
////	public void setCust_ml_country(String cust_ml_country) {
////		this.cust_ml_country = cust_ml_country;
////	}
//
//	public String getCust_frz_flag() {
//		return cust_frz_flag;
//	}
//
//	public void setCust_frz_flag(String cust_frz_flag) {
//		this.cust_frz_flag = cust_frz_flag;
//	}
//
//	public LocalDateTime getCust_ins_dt() {
//		return cust_ins_dt;
//	}
//
//	public void setCust_ins_dt(LocalDateTime cust_ins_dt) {
//		this.cust_ins_dt = cust_ins_dt;
//	}
//
//	public String getCust_ins_id() {
//		return cust_ins_id;
//	}
//
//	public void setCust_ins_id(String cust_ins_id) {
//		this.cust_ins_id = cust_ins_id;
//	}
//
//	public LocalDateTime getCust_mod_dt() {
//		return cust_mod_dt;
//	}
//
//	public void setCust_mod_dt(LocalDateTime cust_mod_dt) {
//		this.cust_mod_dt = cust_mod_dt;
//	}
//
//	public String getCust_mod_id() {
//		return cust_mod_id;
//	}
//
//	public void setCust_mod_id(String cust_mod_id) {
//		this.cust_mod_id = cust_mod_id;
//	}
//
////	public String getCust_national_id() {
////		return cust_national_id;
////	}
////
////	public void setCust_national_id(String cust_national_id) {
////		this.cust_national_id = cust_national_id;
////	}
//
//	
//
//	public Double getCust_credit_days() {
//		return cust_credit_days;
//	}
//
//	public void setCust_credit_days(Double cust_credit_days) {
//		this.cust_credit_days = cust_credit_days;
//	}
//
////	public String getCust_occupation() {
////		return cust_occupation;
////	}
////
////	public void setCust_occupation(String cust_occupation) {
////		this.cust_occupation = cust_occupation;
////	}
//
//	public String getCust_mobile_no() {
//		return cust_mobile_no;
//	}
//
//	public void setCust_mobile_no(String cust_mobile_no) {
//		this.cust_mobile_no = cust_mobile_no;
//	}
//
//	public String getCust_qualfn() {
//		return cust_qualfn;
//	}
//
//	public void setCust_qualfn(String cust_qualfn) {
//		this.cust_qualfn = cust_qualfn;
//	}
//
//	public LocalDateTime getCust_eff_fm_dt() {
//		return cust_eff_fm_dt;
//	}
//
//	public void setCust_eff_fm_dt(LocalDateTime cust_eff_fm_dt) {
//		this.cust_eff_fm_dt = cust_eff_fm_dt;
//	}
//
//	public LocalDateTime getCust_eff_to_dt() {
//		return cust_eff_to_dt;
//	}
//
//	public void setCust_eff_to_dt(LocalDateTime cust_eff_to_dt) {
//		this.cust_eff_to_dt = cust_eff_to_dt;
//	}
//
//	public String getCust_agency_name() {
//		return cust_agency_name;
//	}
//
//	public void setCust_agency_name(String cust_agency_name) {
//		this.cust_agency_name = cust_agency_name;
//	}
//
//	public String getCust_agent_rank_code() {
//		return cust_agent_rank_code;
//	}
//
//	public void setCust_agent_rank_code(String cust_agent_rank_code) {
//		this.cust_agent_rank_code = cust_agent_rank_code;
//	}
//
//	public String getCust_lcn_no() {
//		return cust_lcn_no;
//	}
//
//	public void setCust_lcn_no(String cust_lcn_no) {
//		this.cust_lcn_no = cust_lcn_no;
//	}
//
//	public LocalDateTime getCust_lic_start_dt() {
//		return cust_lic_start_dt;
//	}
//
//	public void setCust_lic_start_dt(LocalDateTime cust_lic_start_dt) {
//		this.cust_lic_start_dt = cust_lic_start_dt;
//	}
//
//	public LocalDateTime getCust_lic_end_dt() {
//		return cust_lic_end_dt;
//	}
//
//	public void setCust_lic_end_dt(LocalDateTime cust_lic_end_dt) {
//		this.cust_lic_end_dt = cust_lic_end_dt;
//	}
//
//	public LocalDateTime getCust_lcn_reg_dt() {
//		return cust_lcn_reg_dt;
//	}
//
//	public void setCust_lcn_reg_dt(LocalDateTime cust_lcn_reg_dt) {
//		this.cust_lcn_reg_dt = cust_lcn_reg_dt;
//	}
//
//	public String getCust_lcn_status() {
//		return cust_lcn_status;
//	}
//
//	public void setCust_lcn_status(String cust_lcn_status) {
//		this.cust_lcn_status = cust_lcn_status;
//	}
//
//	public String getCust_spouse_name() {
//		return cust_spouse_name;
//	}
//
//	public void setCust_spouse_name(String cust_spouse_name) {
//		this.cust_spouse_name = cust_spouse_name;
//	}
//
//	public String getCust_status() {
//		return cust_status;
//	}
//
//	public void setCust_status(String cust_status) {
//		this.cust_status = cust_status;
//	}
//
//	public String getCust_flex_01() {
//		return cust_flex_01;
//	}
//
//	public void setCust_flex_01(String cust_flex_01) {
//		this.cust_flex_01 = cust_flex_01;
//	}
//
//	public String getCust_flex_02() {
//		return cust_flex_02;
//	}
//
//	public void setCust_flex_02(String cust_flex_02) {
//		this.cust_flex_02 = cust_flex_02;
//	}
//
//	public String getCust_flex_03() {
//		return cust_flex_03;
//	}
//
//	public void setCust_flex_03(String cust_flex_03) {
//		this.cust_flex_03 = cust_flex_03;
//	}
//
//	public String getCust_flex_04() {
//		return cust_flex_04;
//	}
//
//	public void setCust_flex_04(String cust_flex_04) {
//		this.cust_flex_04 = cust_flex_04;
//	}
//
//	public String getCust_flex_05() {
//		return cust_flex_05;
//	}
//
//	public void setCust_flex_05(String cust_flex_05) {
//		this.cust_flex_05 = cust_flex_05;
//	}
//
//	public String getCust_flex_06() {
//		return cust_flex_06;
//	}
//
//	public void setCust_flex_06(String cust_flex_06) {
//		this.cust_flex_06 = cust_flex_06;
//	}
//
//	public String getCust_flex_07() {
//		return cust_flex_07;
//	}
//
//	public void setCust_flex_07(String cust_flex_07) {
//		this.cust_flex_07 = cust_flex_07;
//	}
//
//	public String getCust_flex_08() {
//		return cust_flex_08;
//	}
//
//	public void setCust_flex_08(String cust_flex_08) {
//		this.cust_flex_08 = cust_flex_08;
//	}
//
//	public String getCust_flex_09() {
//		return cust_flex_09;
//	}
//
//	public void setCust_flex_09(String cust_flex_09) {
//		this.cust_flex_09 = cust_flex_09;
//	}
//
//	public String getCust_flex_10() {
//		return cust_flex_10;
//	}
//
//	public void setCust_flex_10(String cust_flex_10) {
//		this.cust_flex_10 = cust_flex_10;
//	}
//
//	public String getCust_employer_code() {
//		return cust_employer_code;
//	}
//
//	public void setCust_employer_code(String cust_employer_code) {
//		this.cust_employer_code = cust_employer_code;
//	}
//
//	public String getCust_comp_code() {
//		return cust_comp_code;
//	}
//
//	public void setCust_comp_code(String cust_comp_code) {
//		this.cust_comp_code = cust_comp_code;
//	}
//
//	public String getCUST_FIRST_NAME() {
//		return CUST_FIRST_NAME;
//	}
//
//	public void setCUST_FIRST_NAME(String cUST_FIRST_NAME) {
//		CUST_FIRST_NAME = cUST_FIRST_NAME;
//	}
//
//	public String getCUST_MIDDLE_NAME() {
//		return CUST_MIDDLE_NAME;
//	}
//
//	public void setCUST_MIDDLE_NAME(String cUST_MIDDLE_NAME) {
//		CUST_MIDDLE_NAME = cUST_MIDDLE_NAME;
//	}
//
////	public String getCUST_SUR_NAME() {
////		return CUST_SUR_NAME;
////	}
////
////	public void setCUST_SUR_NAME(String cUST_SUR_NAME) {
////		CUST_SUR_NAME = cUST_SUR_NAME;
////	}
//
//	public String getCUST_PHY_ADDR1() {
//		return CUST_PHY_ADDR1;
//	}
//
//	public void setCUST_PHY_ADDR1(String cUST_PHY_ADDR1) {
//		CUST_PHY_ADDR1 = cUST_PHY_ADDR1;
//	}
//
//	public String getCUST_PHY_ADDR2() {
//		return CUST_PHY_ADDR2;
//	}
//
//	public void setCUST_PHY_ADDR2(String cUST_PHY_ADDR2) {
//		CUST_PHY_ADDR2 = cUST_PHY_ADDR2;
//	}
//
//	public String getCUST_PHY_ADDR3() {
//		return CUST_PHY_ADDR3;
//	}
//
//	public void setCUST_PHY_ADDR3(String cUST_PHY_ADDR3) {
//		CUST_PHY_ADDR3 = cUST_PHY_ADDR3;
//	}
//
//	public String getCUST_PHY_PHONE() {
//		return CUST_PHY_PHONE;
//	}
//
//	public void setCUST_PHY_PHONE(String cUST_PHY_PHONE) {
//		CUST_PHY_PHONE = cUST_PHY_PHONE;
//	}
//
//	public String getCUST_PHY_CONTACT() {
//		return CUST_PHY_CONTACT;
//	}
//
//	public void setCUST_PHY_CONTACT(String cUST_PHY_CONTACT) {
//		CUST_PHY_CONTACT = cUST_PHY_CONTACT;
//	}
//
//	public String getCUST_PHY_CONTACT2() {
//		return CUST_PHY_CONTACT2;
//	}
//
//	public void setCUST_PHY_CONTACT2(String cUST_PHY_CONTACT2) {
//		CUST_PHY_CONTACT2 = cUST_PHY_CONTACT2;
//	}
//
//	public String getCUST_PHY_FAX() {
//		return CUST_PHY_FAX;
//	}
//
//	public void setCUST_PHY_FAX(String cUST_PHY_FAX) {
//		CUST_PHY_FAX = cUST_PHY_FAX;
//	}
//
//	public String getCUST_PHY_AREA() {
//		return CUST_PHY_AREA;
//	}
//
//	public void setCUST_PHY_AREA(String cUST_PHY_AREA) {
//		CUST_PHY_AREA = cUST_PHY_AREA;
//	}
//
//	public String getCUST_PHY_REGION() {
//		return CUST_PHY_REGION;
//	}
//
//	public void setCUST_PHY_REGION(String cUST_PHY_REGION) {
//		CUST_PHY_REGION = cUST_PHY_REGION;
//	}
//
//	public String getCUST_PHY_COUNTRY() {
//		return CUST_PHY_COUNTRY;
//	}
//
//	public void setCUST_PHY_COUNTRY(String cUST_PHY_COUNTRY) {
//		CUST_PHY_COUNTRY = cUST_PHY_COUNTRY;
//	}
//
//	public String getCUST_CONTACT2() {
//		return CUST_CONTACT2;
//	}
//
//	public void setCUST_CONTACT2(String cUST_CONTACT2) {
//		CUST_CONTACT2 = cUST_CONTACT2;
//	}
//
//	public String getCUST_CONTACT3() {
//		return CUST_CONTACT3;
//	}
//
//	public void setCUST_CONTACT3(String cUST_CONTACT3) {
//		CUST_CONTACT3 = cUST_CONTACT3;
//	}
//
//	public String getCUST_CLM_CONTACT() {
//		return CUST_CLM_CONTACT;
//	}
//
//	public void setCUST_CLM_CONTACT(String cUST_CLM_CONTACT) {
//		CUST_CLM_CONTACT = cUST_CLM_CONTACT;
//	}
//
//	public String getCUST_ACNT_CONTACT() {
//		return CUST_ACNT_CONTACT;
//	}
//
//	public void setCUST_ACNT_CONTACT(String cUST_ACNT_CONTACT) {
//		CUST_ACNT_CONTACT = cUST_ACNT_CONTACT;
//	}
//
//	public String getCUST_CONTACT1_LIC_NO() {
//		return CUST_CONTACT1_LIC_NO;
//	}
//
//	public void setCUST_CONTACT1_LIC_NO(String cUST_CONTACT1_LIC_NO) {
//		CUST_CONTACT1_LIC_NO = cUST_CONTACT1_LIC_NO;
//	}
//
//	public String getCUST_CONTACT2_LIC_NO() {
//		return CUST_CONTACT2_LIC_NO;
//	}
//
//	public void setCUST_CONTACT2_LIC_NO(String cUST_CONTACT2_LIC_NO) {
//		CUST_CONTACT2_LIC_NO = cUST_CONTACT2_LIC_NO;
//	}
//
//	public String getCUST_CONTACT3_LIC_NO() {
//		return CUST_CONTACT3_LIC_NO;
//	}
//
//	public void setCUST_CONTACT3_LIC_NO(String cUST_CONTACT3_LIC_NO) {
//		CUST_CONTACT3_LIC_NO = cUST_CONTACT3_LIC_NO;
//	}
//
//	public String getCUST_CLM_CONTACT_LIC_NO() {
//		return CUST_CLM_CONTACT_LIC_NO;
//	}
//
//	public void setCUST_CLM_CONTACT_LIC_NO(String cUST_CLM_CONTACT_LIC_NO) {
//		CUST_CLM_CONTACT_LIC_NO = cUST_CLM_CONTACT_LIC_NO;
//	}
//
//	public String getCUST_ACNT_CONTACT_LIC_NO() {
//		return CUST_ACNT_CONTACT_LIC_NO;
//	}
//
//	public void setCUST_ACNT_CONTACT_LIC_NO(String cUST_ACNT_CONTACT_LIC_NO) {
//		CUST_ACNT_CONTACT_LIC_NO = cUST_ACNT_CONTACT_LIC_NO;
//	}
//
//	public String getCUST_ID_TYPE() {
//		return CUST_ID_TYPE;
//	}
//
//	public void setCUST_ID_TYPE(String cUST_ID_TYPE) {
//		CUST_ID_TYPE = cUST_ID_TYPE;
//	}
//
//	public String getCUST_REF_ID1() {
//		return CUST_REF_ID1;
//	}
//
//	public void setCUST_REF_ID1(String cUST_REF_ID1) {
//		CUST_REF_ID1 = cUST_REF_ID1;
//	}
//	
//	
//
//}
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_CUSTOMER", schema = "LIFE_DEV")
public class LM_CUSTOMER {

    @Id
    @Column(name = "CUST_CODE")
    private String custCode;

    @Column(name = "CUST_CLASS")
    private String CUST_CLASS;

    @Column(name = "CUST_NAME")
    private String CUST_NAME;

    @Column(name = "CUST_SHORT_NAME")
    private String CUST_SHORT_NAME;

    @Column(name = "CUST_ADDR1")
    private String CUST_ADDR1;

    @Column(name = "CUST_ADDR2")
    private String CUST_ADDR2;

    @Column(name = "CUST_ADDR3")
    private String CUST_ADDR3;

    @Column(name = "CUST_CONTACT")
    private String CUST_CONTACT;

    @Column(name = "CUST_CONTACT2")
    private String CUST_CONTACT2;

    @Column(name = "CUST_PHONE")
    private String CUST_PHONE;

    @Column(name = "CUST_FAX")
    private String CUST_FAX;

    @Column(name = "CUST_AREA")
    private String CUST_AREA;

    @Column(name = "CUST_REGION")
    private String CUST_REGION;

    @Column(name = "CUST_COUNTRY")
    private String CUST_COUNTRY;

    @Column(name = "CUST_DFLT_BRK_CODE")
    private String CUST_DFLT_BRK_CODE;

    @Column(name = "CUST_BL_NAME")
    private String CUST_BL_NAME;

    @Column(name = "CUST_BL_SHORT_NAME")
    private String CUST_BL_SHORT_NAME;

    @Column(name = "CUST_BL_ADDR1")
    private String CUST_BL_ADDR1;

    @Column(name = "CUST_BL_ADDR2")
    private String CUST_BL_ADDR2;

    @Column(name = "CUST_BL_ADDR3")
    private String CUST_BL_ADDR3;

    @Column(name = "CUST_BL_CONTACT")
    private String CUST_BL_CONTACT;

    @Column(name = "CUST_BL_CONTACT2")
    private String CUST_BL_CONTACT2;

    @Column(name = "CUST_BL_AREA")
    private String CUST_BL_AREA;

    @Column(name = "CUST_BL_REGION")
    private String CUST_BL_REGION;

    @Column(name = "CUST_BL_COUNTRY")
    private String CUST_BL_COUNTRY;

    @Column(name = "CUST_FRZ_FLAG")
    private String CUST_FRZ_FLAG = "N";

    @Column(name = "CUST_INS_DT")
    private Date CUST_INS_DT;

    @Column(name = "CUST_INS_ID")
    private String CUST_INS_ID;

    @Column(name = "CUST_MOD_DT")
    private Date CUST_MOD_DT;

    @Column(name = "CUST_MOD_ID")
    private String CUST_MOD_ID;

    @Column(name = "CUST_CREDIT_LIMIT")
    private Double CUST_CREDIT_LIMIT;

    @Column(name = "CUST_CREDIT_CHECK_YN")
    private String CUST_CREDIT_CHECK_YN;

    @Column(name = "CUST_EMAIL_ID_PER")
    private String CUST_EMAIL_ID_PER;

    @Column(name = "CUST_EMAIL_ID_OFF")
    private String CUST_EMAIL_ID_OFF;

    @Column(name = "CUST_COMP_HOME_PAGE")
    private String CUST_COMP_HOME_PAGE;
    
    @Column(name = "CUST_ID")
    private String CUST_ID;

    @Column(name = "CUST_PIN_NUMBER")
    private String CUST_PIN_NUMBER;

    @Column(name = "CUST_TAX_STATUS")
    private String CUST_TAX_STATUS;

    @Column(name = "CUST_COMMUN_MODE")
    private String CUST_COMMUN_MODE;

    @Column(name = "CUST_STREET")
    private String CUST_STREET;

    @Column(name = "CUST_BUILDING")
    private String CUST_BUILDING;

    @Column(name = "CUST_FLOOR")
    private String CUST_FLOOR;

    @Column(name = "CUST_OFFICE_PHONE")
    private String CUST_OFFICE_PHONE;

    @Column(name = "CUST_GROUP_CODE")
    private String CUST_GROUP_CODE;

    @Column(name = "CUST_PHY_ADDR1")
    private String CUST_PHY_ADDR1;

    @Column(name = "CUST_PHY_ADDR2")
    private String CUST_PHY_ADDR2;

    @Column(name = "CUST_PHY_ADDR3")
    private String CUST_PHY_ADDR3;

    @Column(name = "CUST_PHY_CONTACT")
    private String CUST_PHY_CONTACT;

    @Column(name = "CUST_PHY_CONTACT2")
    private String CUST_PHY_CONTACT2;

    @Column(name = "CUST_PHY_PHONE")
    private String CUST_PHY_PHONE;

    @Column(name = "CUST_PHY_FAX")
    private String CUST_PHY_FAX;

    @Column(name = "CUST_PHY_AREA")
    private String CUST_PHY_AREA;

    @Column(name = "CUST_PHY_REGION")
    private String CUST_PHY_REGION;

    @Column(name = "CUST_PHY_COUNTRY")
    private String CUST_PHY_COUNTRY;

    @Column(name = "CUST_CREDIT_DAYS")
    private Integer CUST_CREDIT_DAYS;

    @Column(name = "CUST_OCC_CODE")
    private String CUST_OCC_CODE;

    @Column(name = "CUST_POST_BOX_NO")
    private String CUST_POST_BOX_NO;

    @Column(name = "CUST_BROKER_CASH_BASIS_YN")
    private String CUST_BROKER_CASH_BASIS_YN;

    @Column(name = "CUST_SRC_BUS")
    private String CUST_SRC_BUS;

    @Column(name = "CUST_CONTRACTED_YN")
    private String CUST_CONTRACTED_YN;

    @Column(name = "CUST_MEDEX_LIMIT")
    private Double CUST_MEDEX_LIMIT;

    @Column(name = "CUST_LINK_AGENT_CODE")
    private String CUST_LINK_AGENT_CODE;

    @Column(name = "CUST_MOBILE_NO")
    private String CUST_MOBILE_NO;

    @Column(name = "CUST_QUALFN")
    private String CUST_QUALFN;

    @Column(name = "CUST_EFF_FM_DT")
    private LocalDate CUST_EFF_FM_DT;

    @Column(name = "CUST_EFF_TO_DT")
    private LocalDate CUST_EFF_TO_DT;

    @Column(name = "CUST_CR_ASSR_YN")
    private String CUST_CR_ASSR_YN;

    @Column(name = "CUST_TYPE")
    private String CUST_TYPE;

    @Column(name = "CUST_REF_ID1")
    private String CUST_REF_ID1;

    @Column(name = "CUST_REF_ID2")
    private String CUST_REF_ID2;

    @Column(name = "CUST_TEL_AREA_CODE")
    private String CUST_TEL_AREA_CODE;

    @Column(name = "CUST_PHY_TEL_AREA_CODE")
    private String CUST_PHY_TEL_AREA_CODE;

    @Column(name = "CUST_FAX_AREA_CODE")
    private String CUST_FAX_AREA_CODE;

    @Column(name = "CUST_PREFERRED_LANG")
    private String CUST_PREFERRED_LANG;

    @Column(name = "CUST_DOB")
    private Date CUST_DOB;

    @Column(name = "CUST_CATG_CODE")
    private String CUST_CATG_CODE;

    @Column(name = "CUST_NATIONALITY_CODE")
    private String CUST_NATIONALITY_CODE;

    @Column(name = "CUST_RACE")
    private String CUST_RACE;

    @Column(name = "CUST_MAR_STATUS")
    private String CUST_MAR_STATUS;

    @Column(name = "CUST_SALUTATION")
    private String CUST_SALUTATION;

    @Column(name = "CUST_BIRTH_CERT_NO")
    private String CUST_BIRTH_CERT_NO;

    @Column(name = "CUST_BANK_NAME")
    private String CUST_BANK_NAME;

    @Column(name = "CUST_BANK_AC_NO")
    private String CUST_BANK_AC_NO;

    @Column(name = "CUST_RELIGION")
    private String CUST_RELIGION;

    @Column(name = "CUST_POSTAL_CODE")
    private String CUST_POSTAL_CODE;

    @Column(name = "CUST_CITY")
    private String CUST_CITY;

    @Column(name = "CUST_STATE")
    private String CUST_STATE;

    @Column(name = "CUST_TITLE")
    private String CUST_TITLE;

    @Column(name = "CUST_COUNT_CODE")
    private String CUST_COUNT_CODE;

    @Column(name = "CUST_POST_CODE")
    private String CUST_POST_CODE;

    @Column(name = "CUST_CITY_CODE")
    private String CUST_CITY_CODE;

    @Column(name = "CUST_STATE_CODE")
    private String CUST_STATE_CODE;

    @Column(name = "CUST_SPOUSE_NAME")
    private String CUST_SPOUSE_NAME;

    @Column(name = "CUST_QUALFN_2")
    private String CUST_QUALFN_2;

    @Column(name = "CUST_NO_DEPDN")
    private Integer CUST_NO_DEPDN;

    @Column(name = "CUST_INCOME_TAX_FILE_NO")
    private String CUST_INCOME_TAX_FILE_NO;

    @Column(name = "CUST_ALT_PAYEE_NAME")
    private String CUST_ALT_PAYEE_NAME;

    @Column(name = "CUST_ALT_PAYEE_AC_NO")
    private String CUST_ALT_PAYEE_AC_NO;

    @Column(name = "CUST_BANK_CODE")
    private String CUST_BANK_CODE;

    @Column(name = "CUST_INSURED_ID")
    private String CUST_INSURED_ID;

    @Column(name = "CUST_ALL_CURR_APPL_YN")
    private String CUST_ALL_CURR_APPL_YN;

    @Column(name = "CUST_MKT_CODE")
    private String CUST_MKT_CODE;

    @Column(name = "CUST_UNIT_CODE")
    private String CUST_UNIT_CODE;

    @Column(name = "CUST_AGENCY_CODE")
    private String CUST_AGENCY_CODE;

    @Column(name = "CUST_AGENCY_BRANCH_CODE")
    private String CUST_AGENCY_BRANCH_CODE;

    @Column(name = "CUST_REGION_CODE")
    private String CUST_REGION_CODE;

    @Column(name = "CUST_AGENCY_NAME")
    private String CUST_AGENCY_NAME;

    @Column(name = "CUST_AGENT_RANK_CODE")
    private String CUST_AGENT_RANK_CODE;

    @Column(name = "CUST_RECRUITER_CODE")
    private String CUST_RECRUITER_CODE;

    @Column(name = "CUST_INTRODUCER_CODE")
    private String CUST_INTRODUCER_CODE;

    @Column(name = "CUST_MIN_NO_OF_POL")
    private Integer CUST_MIN_NO_OF_POL;

    @Column(name = "CUST_MIN_LC_PERS_CONT")
    private Double CUST_MIN_LC_PERS_CONT;

    @Column(name = "CUST_BUDGET_LC_PREM")
    private Double CUST_BUDGET_LC_PREM;

    @Column(name = "CUST_LC_SUM_ASSURED")
    private Double CUST_LC_SUM_ASSURED;

    @Column(name = "CUST_FIRST_NAME")
    private String CUST_FIRST_NAME;

    @Column(name = "CUST_SURNAME")
    private String CUST_SURNAME;

    @Column(name = "CUST_MIDDLE_NAME")
    private String CUST_MIDDLE_NAME;

    @Column(name = "CUST_LONG_NAME")
    private String CUST_LONG_NAME;

    @Column(name = "CUST_STATUS")
    private String CUST_STATUS;

    @Column(name = "CUST_INTEREST_RATE")
    private Double CUST_INTEREST_RATE;

    @Column(name = "CUST_AUTO_DEBIT_AVBL_YN")
    private String CUST_AUTO_DEBIT_AVBL_YN;

    @Column(name = "CUST_COMP_REGN_NO")
    private String CUST_COMP_REGN_NO;

    @Column(name = "CUST_PIAM_AGENCY_CODE")
    private String CUST_PIAM_AGENCY_CODE;

    @Column(name = "CUST_PASS_NO")
    private String CUST_PASS_NO;

    @Column(name = "CUST_CPF_NO")
    private String CUST_CPF_NO;

    @Column(name = "CUST_CBC_YN")
    private String CUST_CBC_YN;

    @Column(name = "CUST_ROC_NO")
    private String CUST_ROC_NO;

    @Column(name = "CUST_CLAIM_EXP")
    private String CUST_CLAIM_EXP;

    @Column(name = "CUST_DRV_EXP")
    private Double CUST_DRV_EXP;

    @Column(name = "CUST_GUARANTEE_LIMIT")
    private Double CUST_GUARANTEE_LIMIT;

    @Column(name = "CUST_MATRIX_PROD_APPBL_YN")
    private String CUST_MATRIX_PROD_APPBL_YN;

    @Column(name = "CUST_CONTACT3")
    private String CUST_CONTACT3;

    @Column(name = "CUST_CONTACT1_LIC_NO")
    private String CUST_CONTACT1_LIC_NO;

    @Column(name = "CUST_CONTACT2_LIC_NO")
    private String CUST_CONTACT2_LIC_NO;

    @Column(name = "CUST_CONTACT3_LIC_NO")
    private String CUST_CONTACT3_LIC_NO;
    
    @Column(name = "CUST_CLM_CONTACT")
    private String CUST_CLM_CONTACT;

    @Column(name = "CUST_CLM_CONTACT_LIC_NO")
    private String CUST_CLM_CONTACT_LIC_NO;

    @Column(name = "CUST_ACNT_CONTACT")
    private String CUST_ACNT_CONTACT;

    @Column(name = "CUST_ACNT_CONTACT_LIC_NO")
    private String CUST_ACNT_CONTACT_LIC_NO;

    @Column(name = "CUST_TEL_AREA_CODE2")
    private String CUST_TEL_AREA_CODE2;

    @Column(name = "CUST_TEL_AREA_CODE3")
    private String CUST_TEL_AREA_CODE3;

    @Column(name = "CUST_PHONE2")
    private String CUST_PHONE2;

    @Column(name = "CUST_PHONE3")
    private String CUST_PHONE3;

    @Column(name = "CUST_FAX_AREA_CODE2")
    private String CUST_FAX_AREA_CODE2;

    @Column(name = "CUST_FAX_AREA_CODE3")
    private String CUST_FAX_AREA_CODE3;

    @Column(name = "CUST_FAX2")
    private String CUST_FAX2;

    @Column(name = "CUST_FAX3")
    private String CUST_FAX3;

    @Column(name = "CUST_TRANSFER_TO")
    private String CUST_TRANSFER_TO;

    @Column(name = "CUST_AGENT_TO")
    private String CUST_AGENT_TO;

    @Column(name = "CUST_AGENT_EFF_FM_DT")
    private Date CUST_AGENT_EFF_FM_DT;

    @Column(name = "CUST_AGENT_EFF_TO_DT")
    private Date CUST_AGENT_EFF_TO_DT;

    @Column(name = "CUST_SUPP_COMM_APBL_YN")
    private String CUST_SUPP_COMM_APBL_YN;

    @Column(name = "CUST_LCN_NO")
    private String CUST_LCN_NO;

    @Column(name = "CUST_LIC_START_DT")
    private Date CUST_LIC_START_DT;

    @Column(name = "CUST_LIC_END_DT")
    private Date CUST_LIC_END_DT;

    @Column(name = "CUST_LCN_REG_DT")
    private Date CUST_LCN_REG_DT;

    @Column(name = "CUST_LCN_STATUS")
    private String CUST_LCN_STATUS;

    @Column(name = "CUST_HANDLER_ID")
    private String CUST_HANDLER_ID;

    @Column(name = "CUST_COD_REQD_YN")
    private String CUST_COD_REQD_YN;

    @Column(name = "CUST_AD_ACC_NO")
    private String CUST_AD_ACC_NO;

    @Column(name = "CUST_AD_BANK_CODE")
    private String CUST_AD_BANK_CODE;

    @Column(name = "CUST_BLACK_LIST_COUNT")
    private Double CUST_BLACK_LIST_COUNT;

    @Column(name = "CUST_CLE_ZONE_CODE")
    private String CUST_CLE_ZONE_CODE;

    @Column(name = "CUST_CONTU_PAYMENT_YN")
    private String CUST_CONTU_PAYMENT_YN;

    @Column(name = "CUST_DES_MTD_CODE")
    private String CUST_DES_MTD_CODE;

    @Column(name = "CUST_INTREST_RATE")
    private Double CUST_INTREST_RATE;

    @Column(name = "CUST_PYMT_TYPE")
    private String CUST_PYMT_TYPE;

    @Column(name = "CUST_IC_TYPE")
    private String CUST_IC_TYPE;

    @Column(name = "CUST_STATE_DESC")
    private String CUST_STATE_DESC;

    @Column(name = "CUST_POSTAL_DESC")
    private String CUST_POSTAL_DESC;

    @Column(name = "CUST_APPL_ALL_BRAN_YN")
    private String CUST_APPL_ALL_BRAN_YN;

    @Column(name = "CUST_FLEX_01")
    private String CUST_FLEX_01;

    @Column(name = "CUST_FLEX_02")
    private String CUST_FLEX_02;

    @Column(name = "CUST_FLEX_DATE_01")
    private Date CUST_FLEX_DATE_01;

    @Column(name = "CUST_FLEX_DATE_02")
    private Date CUST_FLEX_DATE_02;

    @Column(name = "CUST_FLEX_SEL_01")
    private String CUST_FLEX_SEL_01;

    @Column(name = "CUST_FLEX_SEL_02")
    private String CUST_FLEX_SEL_02;

    @Column(name = "CUST_FLEX_03")
    private String CUST_FLEX_03;

    @Column(name = "CUST_FLEX_04")
    private String CUST_FLEX_04;

    @Column(name = "CUST_FLEX_05")
    private String CUST_FLEX_05;

    @Column(name = "CUST_FLEX_06")
    private String CUST_FLEX_06;

    @Column(name = "CUST_FLEX_DATE_03")
    private Date CUST_FLEX_DATE_03;

    @Column(name = "CUST_FLEX_DATE_04")
    private Date CUST_FLEX_DATE_04;

    @Column(name = "CUST_FLEX_DATE_05")
    private Date CUST_FLEX_DATE_05;

    @Column(name = "CUST_FLEX_DATE_06")
    private Date CUST_FLEX_DATE_06;

    @Column(name = "CUST_FLEX_SEL_03")
    private String CUST_FLEX_SEL_03;

    @Column(name = "CUST_FLEX_SEL_04")
    private String CUST_FLEX_SEL_04;

    @Column(name = "CUST_FLEX_SEL_05")
    private String CUST_FLEX_SEL_05;

    @Column(name = "CUST_FLEX_SEL_06")
    private String CUST_FLEX_SEL_06;

    @Column(name = "CUST_EMPLOYER_CODE")
    private String CUST_EMPLOYER_CODE;

    @Column(name = "CUST_PHY_CITY_CODE")
    private String CUST_PHY_CITY_CODE;

    @Column(name = "CUST_CNTCT_AREA_CODE_1")
    private String CUST_CNTCT_AREA_CODE_1;

    @Column(name = "CUST_CNTCT_AREA_CODE_2")
    private String CUST_CNTCT_AREA_CODE_2;

    @Column(name = "CUST_CNTCT_AREA_CODE_3")
    private String CUST_CNTCT_AREA_CODE_3;

    @Column(name = "CUST_CLM_CNTCT_AREA_CODE")
    private String CUST_CLM_CNTCT_AREA_CODE;

    @Column(name = "CUST_ACCD_CNTCT_AREA_CODE")
    private String CUST_ACCD_CNTCT_AREA_CODE;

    @Column(name = "CUST_PHY_MOB_AREA_CODE")
    private String CUST_PHY_MOB_AREA_CODE;

    @Column(name = "CUST_SOCIAL_MEDIA_TYPE")
    private String CUST_SOCIAL_MEDIA_TYPE;

    @Column(name = "CUST_SOCIAL_MEDIA_MAIL_ID")
    private String CUST_SOCIAL_MEDIA_MAIL_ID;

    @Column(name = "CUST_AGE_ADMITTED")
    private String CUST_AGE_ADMITTED;

    @Column(name = "CUST_AGE_PROOF_FLAG")
    private String CUST_AGE_PROOF_FLAG;

    @Column(name = "CUST_AGE_PROOF_OTHERS")
    private String CUST_AGE_PROOF_OTHERS;

    @Column(name = "CUST_FLEX_07")
    private String CUST_FLEX_07;

    @Column(name = "CUST_FLEX_08")
    private String CUST_FLEX_08;

    @Column(name = "CUST_FLEX_09")
    private String CUST_FLEX_09;

    @Column(name = "CUST_FLEX_10")
    private String CUST_FLEX_10;

    @Column(name = "CUST_REL_CODE")
    private String CUST_REL_CODE;

    @Column(name = "CUST_MAIN_MEM_CODE")
    private String CUST_MAIN_MEM_CODE;

    @Column(name = "CUST_CUT_OFF_DAY")
    private Integer CUST_CUT_OFF_DAY;

    @Column(name = "CUST_COMM_RATE")
    private Double CUST_COMM_RATE;

    @Column(name = "CUST_REMARKS")
    private String CUST_REMARKS;

    @Column(name = "CUST_ID_SUB_DT")
    private Date CUST_ID_SUB_DT;

    @Column(name = "CUST_RETD_AGE")
    private Integer CUST_RETD_AGE;

    @Column(name = "CUST_ALT_EMAIL_ID_PER")
    private String CUST_ALT_EMAIL_ID_PER;

    @Column(name = "CUST_ALT_MOBILE_NO")
    private String CUST_ALT_MOBILE_NO;

    @Column(name = "CUST_TEL_AREA_CODE4")
    private String CUST_TEL_AREA_CODE4;

    @Column(name = "CUST_PHY_EMAIL_ID_OFF")
    private String CUST_PHY_EMAIL_ID_OFF;

    @Column(name = "CUST_ALT_PHY_MOBILE_NO")
    private String CUST_ALT_PHY_MOBILE_NO;

    @Column(name = "CUST_PHY_TEL_AREA_CODE2")
    private String CUST_PHY_TEL_AREA_CODE2;

    @Column(name = "CUST_EMP_EMAIL_ID")
    private String CUST_EMP_EMAIL_ID;

    @Column(name = "CUST_EMP_PHONE")
    private String CUST_EMP_PHONE;

    @Column(name = "CUST_EMP_AREA_CODE1")
    private String CUST_EMP_AREA_CODE1;

    @Column(name = "CUST_EMP_MOBILE_NO")
    private String CUST_EMP_MOBILE_NO;

    @Column(name = "CUST_EMP_AREA_CODE2")
    private String CUST_EMP_AREA_CODE2;

    @Column(name = "CUST_COMM_ADDR_FLG")
    private String CUST_COMM_ADDR_FLG = "H";

    @Column(name = "CUST_CORR_ADDR1")
    private String CUST_CORR_ADDR1;

    @Column(name = "CUST_CORR_ADDR2")
    private String CUST_CORR_ADDR2;

    @Column(name = "CUST_CORR_ADDR3")
    private String CUST_CORR_ADDR3;

    @Column(name = "CUST_CORR_COUNTRY")
    private String CUST_CORR_COUNTRY;

    @Column(name = "CUST_CORR_CITY_CODE")
    private String CUST_CORR_CITY_CODE;

    @Column(name = "CUST_CORR_EMAIL_ID_OFF")
    private String CUST_CORR_EMAIL_ID_OFF;

    @Column(name = "CUST_CORR_FAX_AREA_CODE")
    private String CUST_CORR_FAX_AREA_CODE;

    @Column(name = "CUST_CORR_MOB_AREA_CODE")
    private String CUST_CORR_MOB_AREA_CODE;

    @Column(name = "CUST_CORR_POST_BOX_NO")
    private String CUST_CORR_POST_BOX_NO;

    @Column(name = "CUST_CORR_MOBILE_NO")
    private String CUST_CORR_MOBILE_NO;

    @Column(name = "CUST_CORR_TEL_AREA_CODE")
    private String CUST_CORR_TEL_AREA_CODE;

    @Column(name = "CUST_CORR_FAX")
    private String CUST_CORR_FAX;

    @Column(name = "CUST_CORR_OFFICE_PHONE")
    private String CUST_CORR_OFFICE_PHONE;

    @Column(name = "CUST_FLEX_11")
    private String CUST_FLEX_11;

    @Column(name = "CUST_FLEX_12")
    private String CUST_FLEX_12;

    @Column(name = "CUST_CORR_ADDR_FLG")
    private String CUST_CORR_ADDR_FLG;

    @Column(name = "CUST_PHY_POST_BOX_NO")
    private String CUST_PHY_POST_BOX_NO;

    @Column(name = "CUST_CORR_OFFICE_PHONE1")
    private Double CUST_CORR_OFFICE_PHONE1;

    @Column(name = "CUST_CORR_MOB_AREA_CODE2")
    private String CUST_CORR_MOB_AREA_CODE2;

    @Column(name = "CUST_OFFICE_PHONE2")
    private Double CUST_OFFICE_PHONE2;

    @Column(name = "CUST_CORR_COUNTRY_CODE")
    private String CUST_CORR_COUNTRY_CODE;

    @Column(name = "CUST_PHY_COUNTRY_CODE")
    private String CUST_PHY_COUNTRY_CODE;

    @Column(name = "CUST_CORR_STATE_CODE")
    private String CUST_CORR_STATE_CODE;

    @Column(name = "CUST_CORR_STATE")
    private String CUST_CORR_STATE;

    @Column(name = "CUST_PHY_STATE_CODE")
    private String CUST_PHY_STATE_CODE;

    @Column(name = "CUST_CORR_CITY")
    private String CUST_CORR_CITY;

    @Column(name = "CUST_PHY_CITY")
    private String CUST_PHY_CITY;

    @Column(name = "CUST_ADMIN")
    private String CUST_ADMIN;

    @Column(name = "CUST_UPDATE")
    private String CUST_UPDATE;

    @Column(name = "CUST_AUTH_PERSON")
    private String CUST_AUTH_PERSON;

    @Column(name = "CUST_DESIG")
    private String CUST_DESIG;

    @Column(name = "CUST_CONTRACT_DT")
    private Date CUST_CONTRACT_DT;

    @Column(name = "CUST_SIGNED_CONT_YN")
    private String CUST_SIGNED_CONT_YN;

    @Column(name = "CUST_SIGNED_CONT1_YN")
    private String CUST_SIGNED_CONT1_YN;

    @Column(name = "CUST_SIGNED_CONT2_YN")
    private String CUST_SIGNED_CONT2_YN;

    @Column(name = "CUST_AUTH_PERSON_BL")
    private String CUST_AUTH_PERSON_BL;

    @Column(name = "CUST_DESIG_BL")
    private String CUST_DESIG_BL;

    @Column(name = "CUST_ADDR4")
    private String CUST_ADDR4;

    @Column(name = "CUST_PHY_ADDR4")
    private String CUST_PHY_ADDR4;

    @Column(name = "CUST_NATURE_OF_WORK")
    private String CUST_NATURE_OF_WORK;

    @Column(name = "CUST_PHY_STATE")
    private String CUST_PHY_STATE;

    @Column(name = "CUST_VAT_CAT")
    private String CUST_VAT_CAT;

    @Column(name = "CUST_BILL_YN")
    private String CUST_BILL_YN;

    @Column(name = "CUST_WHT_YN")
    private String CUST_WHT_YN;

    @Column(name = "CUST_AGENT_RANK_CODE_DESC")
    private String CUST_AGENT_RANK_CODE_DESC;

    @Column(name = "CUST_COMP_CODE")
    private String CUST_COMP_CODE;

    @Column(name = "CUST_BIRTH_PLACE")
    private String CUST_BIRTH_PLACE;

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getCUST_CLASS() {
		return CUST_CLASS;
	}

	public void setCUST_CLASS(String cUST_CLASS) {
		CUST_CLASS = cUST_CLASS;
	}

	public String getCUST_NAME() {
		return CUST_NAME;
	}

	public void setCUST_NAME(String cUST_NAME) {
		CUST_NAME = cUST_NAME;
	}

	public String getCUST_SHORT_NAME() {
		return CUST_SHORT_NAME;
	}

	public void setCUST_SHORT_NAME(String cUST_SHORT_NAME) {
		CUST_SHORT_NAME = cUST_SHORT_NAME;
	}

	public String getCUST_ADDR1() {
		return CUST_ADDR1;
	}

	public void setCUST_ADDR1(String cUST_ADDR1) {
		CUST_ADDR1 = cUST_ADDR1;
	}

	public String getCUST_ADDR2() {
		return CUST_ADDR2;
	}

	public void setCUST_ADDR2(String cUST_ADDR2) {
		CUST_ADDR2 = cUST_ADDR2;
	}

	public String getCUST_ADDR3() {
		return CUST_ADDR3;
	}

	public void setCUST_ADDR3(String cUST_ADDR3) {
		CUST_ADDR3 = cUST_ADDR3;
	}

	public String getCUST_CONTACT() {
		return CUST_CONTACT;
	}

	public void setCUST_CONTACT(String cUST_CONTACT) {
		CUST_CONTACT = cUST_CONTACT;
	}

	public String getCUST_CONTACT2() {
		return CUST_CONTACT2;
	}

	public void setCUST_CONTACT2(String cUST_CONTACT2) {
		CUST_CONTACT2 = cUST_CONTACT2;
	}

	public String getCUST_PHONE() {
		return CUST_PHONE;
	}

	public void setCUST_PHONE(String cUST_PHONE) {
		CUST_PHONE = cUST_PHONE;
	}

	public String getCUST_FAX() {
		return CUST_FAX;
	}

	public void setCUST_FAX(String cUST_FAX) {
		CUST_FAX = cUST_FAX;
	}

	public String getCUST_AREA() {
		return CUST_AREA;
	}

	public void setCUST_AREA(String cUST_AREA) {
		CUST_AREA = cUST_AREA;
	}

	public String getCUST_REGION() {
		return CUST_REGION;
	}

	public void setCUST_REGION(String cUST_REGION) {
		CUST_REGION = cUST_REGION;
	}

	public String getCUST_COUNTRY() {
		return CUST_COUNTRY;
	}

	public void setCUST_COUNTRY(String cUST_COUNTRY) {
		CUST_COUNTRY = cUST_COUNTRY;
	}

	public String getCUST_DFLT_BRK_CODE() {
		return CUST_DFLT_BRK_CODE;
	}

	public void setCUST_DFLT_BRK_CODE(String cUST_DFLT_BRK_CODE) {
		CUST_DFLT_BRK_CODE = cUST_DFLT_BRK_CODE;
	}

	public String getCUST_BL_NAME() {
		return CUST_BL_NAME;
	}

	public void setCUST_BL_NAME(String cUST_BL_NAME) {
		CUST_BL_NAME = cUST_BL_NAME;
	}

	public String getCUST_BL_SHORT_NAME() {
		return CUST_BL_SHORT_NAME;
	}

	public void setCUST_BL_SHORT_NAME(String cUST_BL_SHORT_NAME) {
		CUST_BL_SHORT_NAME = cUST_BL_SHORT_NAME;
	}

	public String getCUST_BL_ADDR1() {
		return CUST_BL_ADDR1;
	}

	public void setCUST_BL_ADDR1(String cUST_BL_ADDR1) {
		CUST_BL_ADDR1 = cUST_BL_ADDR1;
	}

	public String getCUST_BL_ADDR2() {
		return CUST_BL_ADDR2;
	}

	public void setCUST_BL_ADDR2(String cUST_BL_ADDR2) {
		CUST_BL_ADDR2 = cUST_BL_ADDR2;
	}

	public String getCUST_BL_ADDR3() {
		return CUST_BL_ADDR3;
	}

	public void setCUST_BL_ADDR3(String cUST_BL_ADDR3) {
		CUST_BL_ADDR3 = cUST_BL_ADDR3;
	}

	public String getCUST_BL_CONTACT() {
		return CUST_BL_CONTACT;
	}

	public void setCUST_BL_CONTACT(String cUST_BL_CONTACT) {
		CUST_BL_CONTACT = cUST_BL_CONTACT;
	}

	public String getCUST_BL_CONTACT2() {
		return CUST_BL_CONTACT2;
	}

	public void setCUST_BL_CONTACT2(String cUST_BL_CONTACT2) {
		CUST_BL_CONTACT2 = cUST_BL_CONTACT2;
	}

	public String getCUST_BL_AREA() {
		return CUST_BL_AREA;
	}

	public void setCUST_BL_AREA(String cUST_BL_AREA) {
		CUST_BL_AREA = cUST_BL_AREA;
	}

	public String getCUST_BL_REGION() {
		return CUST_BL_REGION;
	}

	public void setCUST_BL_REGION(String cUST_BL_REGION) {
		CUST_BL_REGION = cUST_BL_REGION;
	}

	public String getCUST_BL_COUNTRY() {
		return CUST_BL_COUNTRY;
	}

	public void setCUST_BL_COUNTRY(String cUST_BL_COUNTRY) {
		CUST_BL_COUNTRY = cUST_BL_COUNTRY;
	}

	public String getCUST_FRZ_FLAG() {
		return CUST_FRZ_FLAG;
	}

	public void setCUST_FRZ_FLAG(String cUST_FRZ_FLAG) {
		CUST_FRZ_FLAG = cUST_FRZ_FLAG;
	}

	public Date getCUST_INS_DT() {
		return CUST_INS_DT;
	}

	public void setCUST_INS_DT(Date cUST_INS_DT) {
		CUST_INS_DT = cUST_INS_DT;
	}

	public String getCUST_INS_ID() {
		return CUST_INS_ID;
	}

	public void setCUST_INS_ID(String cUST_INS_ID) {
		CUST_INS_ID = cUST_INS_ID;
	}

	public Date getCUST_MOD_DT() {
		return CUST_MOD_DT;
	}

	public void setCUST_MOD_DT(Date cUST_MOD_DT) {
		CUST_MOD_DT = cUST_MOD_DT;
	}

	public String getCUST_MOD_ID() {
		return CUST_MOD_ID;
	}

	public void setCUST_MOD_ID(String cUST_MOD_ID) {
		CUST_MOD_ID = cUST_MOD_ID;
	}

	public Double getCUST_CREDIT_LIMIT() {
		return CUST_CREDIT_LIMIT;
	}

	public void setCUST_CREDIT_LIMIT(Double cUST_CREDIT_LIMIT) {
		CUST_CREDIT_LIMIT = cUST_CREDIT_LIMIT;
	}

	public String getCUST_CREDIT_CHECK_YN() {
		return CUST_CREDIT_CHECK_YN;
	}

	public void setCUST_CREDIT_CHECK_YN(String cUST_CREDIT_CHECK_YN) {
		CUST_CREDIT_CHECK_YN = cUST_CREDIT_CHECK_YN;
	}

	public String getCUST_EMAIL_ID_PER() {
		return CUST_EMAIL_ID_PER;
	}

	public void setCUST_EMAIL_ID_PER(String cUST_EMAIL_ID_PER) {
		CUST_EMAIL_ID_PER = cUST_EMAIL_ID_PER;
	}

	public String getCUST_EMAIL_ID_OFF() {
		return CUST_EMAIL_ID_OFF;
	}

	public void setCUST_EMAIL_ID_OFF(String cUST_EMAIL_ID_OFF) {
		CUST_EMAIL_ID_OFF = cUST_EMAIL_ID_OFF;
	}

	public String getCUST_COMP_HOME_PAGE() {
		return CUST_COMP_HOME_PAGE;
	}

	public void setCUST_COMP_HOME_PAGE(String cUST_COMP_HOME_PAGE) {
		CUST_COMP_HOME_PAGE = cUST_COMP_HOME_PAGE;
	}

	public String getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public String getCUST_PIN_NUMBER() {
		return CUST_PIN_NUMBER;
	}

	public void setCUST_PIN_NUMBER(String cUST_PIN_NUMBER) {
		CUST_PIN_NUMBER = cUST_PIN_NUMBER;
	}

	public String getCUST_TAX_STATUS() {
		return CUST_TAX_STATUS;
	}

	public void setCUST_TAX_STATUS(String cUST_TAX_STATUS) {
		CUST_TAX_STATUS = cUST_TAX_STATUS;
	}

	public String getCUST_COMMUN_MODE() {
		return CUST_COMMUN_MODE;
	}

	public void setCUST_COMMUN_MODE(String cUST_COMMUN_MODE) {
		CUST_COMMUN_MODE = cUST_COMMUN_MODE;
	}

	public String getCUST_STREET() {
		return CUST_STREET;
	}

	public void setCUST_STREET(String cUST_STREET) {
		CUST_STREET = cUST_STREET;
	}

	public String getCUST_BUILDING() {
		return CUST_BUILDING;
	}

	public void setCUST_BUILDING(String cUST_BUILDING) {
		CUST_BUILDING = cUST_BUILDING;
	}

	public String getCUST_FLOOR() {
		return CUST_FLOOR;
	}

	public void setCUST_FLOOR(String cUST_FLOOR) {
		CUST_FLOOR = cUST_FLOOR;
	}

	public String getCUST_OFFICE_PHONE() {
		return CUST_OFFICE_PHONE;
	}

	public void setCUST_OFFICE_PHONE(String cUST_OFFICE_PHONE) {
		CUST_OFFICE_PHONE = cUST_OFFICE_PHONE;
	}

	public String getCUST_GROUP_CODE() {
		return CUST_GROUP_CODE;
	}

	public void setCUST_GROUP_CODE(String cUST_GROUP_CODE) {
		CUST_GROUP_CODE = cUST_GROUP_CODE;
	}

	public String getCUST_PHY_ADDR1() {
		return CUST_PHY_ADDR1;
	}

	public void setCUST_PHY_ADDR1(String cUST_PHY_ADDR1) {
		CUST_PHY_ADDR1 = cUST_PHY_ADDR1;
	}

	public String getCUST_PHY_ADDR2() {
		return CUST_PHY_ADDR2;
	}

	public void setCUST_PHY_ADDR2(String cUST_PHY_ADDR2) {
		CUST_PHY_ADDR2 = cUST_PHY_ADDR2;
	}

	public String getCUST_PHY_ADDR3() {
		return CUST_PHY_ADDR3;
	}

	public void setCUST_PHY_ADDR3(String cUST_PHY_ADDR3) {
		CUST_PHY_ADDR3 = cUST_PHY_ADDR3;
	}

	public String getCUST_PHY_CONTACT() {
		return CUST_PHY_CONTACT;
	}

	public void setCUST_PHY_CONTACT(String cUST_PHY_CONTACT) {
		CUST_PHY_CONTACT = cUST_PHY_CONTACT;
	}

	public String getCUST_PHY_CONTACT2() {
		return CUST_PHY_CONTACT2;
	}

	public void setCUST_PHY_CONTACT2(String cUST_PHY_CONTACT2) {
		CUST_PHY_CONTACT2 = cUST_PHY_CONTACT2;
	}

	public String getCUST_PHY_PHONE() {
		return CUST_PHY_PHONE;
	}

	public void setCUST_PHY_PHONE(String cUST_PHY_PHONE) {
		CUST_PHY_PHONE = cUST_PHY_PHONE;
	}

	public String getCUST_PHY_FAX() {
		return CUST_PHY_FAX;
	}

	public void setCUST_PHY_FAX(String cUST_PHY_FAX) {
		CUST_PHY_FAX = cUST_PHY_FAX;
	}

	public String getCUST_PHY_AREA() {
		return CUST_PHY_AREA;
	}

	public void setCUST_PHY_AREA(String cUST_PHY_AREA) {
		CUST_PHY_AREA = cUST_PHY_AREA;
	}

	public String getCUST_PHY_REGION() {
		return CUST_PHY_REGION;
	}

	public void setCUST_PHY_REGION(String cUST_PHY_REGION) {
		CUST_PHY_REGION = cUST_PHY_REGION;
	}

	public String getCUST_PHY_COUNTRY() {
		return CUST_PHY_COUNTRY;
	}

	public void setCUST_PHY_COUNTRY(String cUST_PHY_COUNTRY) {
		CUST_PHY_COUNTRY = cUST_PHY_COUNTRY;
	}

	public Integer getCUST_CREDIT_DAYS() {
		return CUST_CREDIT_DAYS;
	}

	public void setCUST_CREDIT_DAYS(Integer cUST_CREDIT_DAYS) {
		CUST_CREDIT_DAYS = cUST_CREDIT_DAYS;
	}

	public String getCUST_OCC_CODE() {
		return CUST_OCC_CODE;
	}

	public void setCUST_OCC_CODE(String cUST_OCC_CODE) {
		CUST_OCC_CODE = cUST_OCC_CODE;
	}

	public String getCUST_POST_BOX_NO() {
		return CUST_POST_BOX_NO;
	}

	public void setCUST_POST_BOX_NO(String cUST_POST_BOX_NO) {
		CUST_POST_BOX_NO = cUST_POST_BOX_NO;
	}

	public String getCUST_BROKER_CASH_BASIS_YN() {
		return CUST_BROKER_CASH_BASIS_YN;
	}

	public void setCUST_BROKER_CASH_BASIS_YN(String cUST_BROKER_CASH_BASIS_YN) {
		CUST_BROKER_CASH_BASIS_YN = cUST_BROKER_CASH_BASIS_YN;
	}

	public String getCUST_SRC_BUS() {
		return CUST_SRC_BUS;
	}

	public void setCUST_SRC_BUS(String cUST_SRC_BUS) {
		CUST_SRC_BUS = cUST_SRC_BUS;
	}

	public String getCUST_CONTRACTED_YN() {
		return CUST_CONTRACTED_YN;
	}

	public void setCUST_CONTRACTED_YN(String cUST_CONTRACTED_YN) {
		CUST_CONTRACTED_YN = cUST_CONTRACTED_YN;
	}

	public Double getCUST_MEDEX_LIMIT() {
		return CUST_MEDEX_LIMIT;
	}

	public void setCUST_MEDEX_LIMIT(Double cUST_MEDEX_LIMIT) {
		CUST_MEDEX_LIMIT = cUST_MEDEX_LIMIT;
	}

	public String getCUST_LINK_AGENT_CODE() {
		return CUST_LINK_AGENT_CODE;
	}

	public void setCUST_LINK_AGENT_CODE(String cUST_LINK_AGENT_CODE) {
		CUST_LINK_AGENT_CODE = cUST_LINK_AGENT_CODE;
	}

	public String getCUST_MOBILE_NO() {
		return CUST_MOBILE_NO;
	}

	public void setCUST_MOBILE_NO(String cUST_MOBILE_NO) {
		CUST_MOBILE_NO = cUST_MOBILE_NO;
	}

	public String getCUST_QUALFN() {
		return CUST_QUALFN;
	}

	public void setCUST_QUALFN(String cUST_QUALFN) {
		CUST_QUALFN = cUST_QUALFN;
	}

	public LocalDate getCUST_EFF_FM_DT() {
		return CUST_EFF_FM_DT;
	}

	public void setCUST_EFF_FM_DT(LocalDate cUST_EFF_FM_DT) {
		CUST_EFF_FM_DT = cUST_EFF_FM_DT;
	}

	public LocalDate getCUST_EFF_TO_DT() {
		return CUST_EFF_TO_DT;
	}

	public void setCUST_EFF_TO_DT(LocalDate cUST_EFF_TO_DT) {
		CUST_EFF_TO_DT = cUST_EFF_TO_DT;
	}

	public String getCUST_CR_ASSR_YN() {
		return CUST_CR_ASSR_YN;
	}

	public void setCUST_CR_ASSR_YN(String cUST_CR_ASSR_YN) {
		CUST_CR_ASSR_YN = cUST_CR_ASSR_YN;
	}

	public String getCUST_TYPE() {
		return CUST_TYPE;
	}

	public void setCUST_TYPE(String cUST_TYPE) {
		CUST_TYPE = cUST_TYPE;
	}

	public String getCUST_REF_ID1() {
		return CUST_REF_ID1;
	}

	public void setCUST_REF_ID1(String cUST_REF_ID1) {
		CUST_REF_ID1 = cUST_REF_ID1;
	}

	public String getCUST_REF_ID2() {
		return CUST_REF_ID2;
	}

	public void setCUST_REF_ID2(String cUST_REF_ID2) {
		CUST_REF_ID2 = cUST_REF_ID2;
	}

	public String getCUST_TEL_AREA_CODE() {
		return CUST_TEL_AREA_CODE;
	}

	public void setCUST_TEL_AREA_CODE(String cUST_TEL_AREA_CODE) {
		CUST_TEL_AREA_CODE = cUST_TEL_AREA_CODE;
	}

	public String getCUST_PHY_TEL_AREA_CODE() {
		return CUST_PHY_TEL_AREA_CODE;
	}

	public void setCUST_PHY_TEL_AREA_CODE(String cUST_PHY_TEL_AREA_CODE) {
		CUST_PHY_TEL_AREA_CODE = cUST_PHY_TEL_AREA_CODE;
	}

	public String getCUST_FAX_AREA_CODE() {
		return CUST_FAX_AREA_CODE;
	}

	public void setCUST_FAX_AREA_CODE(String cUST_FAX_AREA_CODE) {
		CUST_FAX_AREA_CODE = cUST_FAX_AREA_CODE;
	}

	public String getCUST_PREFERRED_LANG() {
		return CUST_PREFERRED_LANG;
	}

	public void setCUST_PREFERRED_LANG(String cUST_PREFERRED_LANG) {
		CUST_PREFERRED_LANG = cUST_PREFERRED_LANG;
	}

	public Date getCUST_DOB() {
		return CUST_DOB;
	}

	public void setCUST_DOB(Date cUST_DOB) {
		CUST_DOB = cUST_DOB;
	}

	public String getCUST_CATG_CODE() {
		return CUST_CATG_CODE;
	}

	public void setCUST_CATG_CODE(String cUST_CATG_CODE) {
		CUST_CATG_CODE = cUST_CATG_CODE;
	}

	public String getCUST_NATIONALITY_CODE() {
		return CUST_NATIONALITY_CODE;
	}

	public void setCUST_NATIONALITY_CODE(String cUST_NATIONALITY_CODE) {
		CUST_NATIONALITY_CODE = cUST_NATIONALITY_CODE;
	}

	public String getCUST_RACE() {
		return CUST_RACE;
	}

	public void setCUST_RACE(String cUST_RACE) {
		CUST_RACE = cUST_RACE;
	}

	public String getCUST_MAR_STATUS() {
		return CUST_MAR_STATUS;
	}

	public void setCUST_MAR_STATUS(String cUST_MAR_STATUS) {
		CUST_MAR_STATUS = cUST_MAR_STATUS;
	}

	public String getCUST_SALUTATION() {
		return CUST_SALUTATION;
	}

	public void setCUST_SALUTATION(String cUST_SALUTATION) {
		CUST_SALUTATION = cUST_SALUTATION;
	}

	public String getCUST_BIRTH_CERT_NO() {
		return CUST_BIRTH_CERT_NO;
	}

	public void setCUST_BIRTH_CERT_NO(String cUST_BIRTH_CERT_NO) {
		CUST_BIRTH_CERT_NO = cUST_BIRTH_CERT_NO;
	}

	public String getCUST_BANK_NAME() {
		return CUST_BANK_NAME;
	}

	public void setCUST_BANK_NAME(String cUST_BANK_NAME) {
		CUST_BANK_NAME = cUST_BANK_NAME;
	}

	public String getCUST_BANK_AC_NO() {
		return CUST_BANK_AC_NO;
	}

	public void setCUST_BANK_AC_NO(String cUST_BANK_AC_NO) {
		CUST_BANK_AC_NO = cUST_BANK_AC_NO;
	}

	public String getCUST_RELIGION() {
		return CUST_RELIGION;
	}

	public void setCUST_RELIGION(String cUST_RELIGION) {
		CUST_RELIGION = cUST_RELIGION;
	}

	public String getCUST_POSTAL_CODE() {
		return CUST_POSTAL_CODE;
	}

	public void setCUST_POSTAL_CODE(String cUST_POSTAL_CODE) {
		CUST_POSTAL_CODE = cUST_POSTAL_CODE;
	}

	public String getCUST_CITY() {
		return CUST_CITY;
	}

	public void setCUST_CITY(String cUST_CITY) {
		CUST_CITY = cUST_CITY;
	}

	public String getCUST_STATE() {
		return CUST_STATE;
	}

	public void setCUST_STATE(String cUST_STATE) {
		CUST_STATE = cUST_STATE;
	}

	public String getCUST_TITLE() {
		return CUST_TITLE;
	}

	public void setCUST_TITLE(String cUST_TITLE) {
		CUST_TITLE = cUST_TITLE;
	}

	public String getCUST_COUNT_CODE() {
		return CUST_COUNT_CODE;
	}

	public void setCUST_COUNT_CODE(String cUST_COUNT_CODE) {
		CUST_COUNT_CODE = cUST_COUNT_CODE;
	}

	public String getCUST_POST_CODE() {
		return CUST_POST_CODE;
	}

	public void setCUST_POST_CODE(String cUST_POST_CODE) {
		CUST_POST_CODE = cUST_POST_CODE;
	}

	public String getCUST_CITY_CODE() {
		return CUST_CITY_CODE;
	}

	public void setCUST_CITY_CODE(String cUST_CITY_CODE) {
		CUST_CITY_CODE = cUST_CITY_CODE;
	}

	public String getCUST_STATE_CODE() {
		return CUST_STATE_CODE;
	}

	public void setCUST_STATE_CODE(String cUST_STATE_CODE) {
		CUST_STATE_CODE = cUST_STATE_CODE;
	}

	public String getCUST_SPOUSE_NAME() {
		return CUST_SPOUSE_NAME;
	}

	public void setCUST_SPOUSE_NAME(String cUST_SPOUSE_NAME) {
		CUST_SPOUSE_NAME = cUST_SPOUSE_NAME;
	}

	public String getCUST_QUALFN_2() {
		return CUST_QUALFN_2;
	}

	public void setCUST_QUALFN_2(String cUST_QUALFN_2) {
		CUST_QUALFN_2 = cUST_QUALFN_2;
	}

	public Integer getCUST_NO_DEPDN() {
		return CUST_NO_DEPDN;
	}

	public void setCUST_NO_DEPDN(Integer cUST_NO_DEPDN) {
		CUST_NO_DEPDN = cUST_NO_DEPDN;
	}

	public String getCUST_INCOME_TAX_FILE_NO() {
		return CUST_INCOME_TAX_FILE_NO;
	}

	public void setCUST_INCOME_TAX_FILE_NO(String cUST_INCOME_TAX_FILE_NO) {
		CUST_INCOME_TAX_FILE_NO = cUST_INCOME_TAX_FILE_NO;
	}

	public String getCUST_ALT_PAYEE_NAME() {
		return CUST_ALT_PAYEE_NAME;
	}

	public void setCUST_ALT_PAYEE_NAME(String cUST_ALT_PAYEE_NAME) {
		CUST_ALT_PAYEE_NAME = cUST_ALT_PAYEE_NAME;
	}

	public String getCUST_ALT_PAYEE_AC_NO() {
		return CUST_ALT_PAYEE_AC_NO;
	}

	public void setCUST_ALT_PAYEE_AC_NO(String cUST_ALT_PAYEE_AC_NO) {
		CUST_ALT_PAYEE_AC_NO = cUST_ALT_PAYEE_AC_NO;
	}

	public String getCUST_BANK_CODE() {
		return CUST_BANK_CODE;
	}

	public void setCUST_BANK_CODE(String cUST_BANK_CODE) {
		CUST_BANK_CODE = cUST_BANK_CODE;
	}

	public String getCUST_INSURED_ID() {
		return CUST_INSURED_ID;
	}

	public void setCUST_INSURED_ID(String cUST_INSURED_ID) {
		CUST_INSURED_ID = cUST_INSURED_ID;
	}

	public String getCUST_ALL_CURR_APPL_YN() {
		return CUST_ALL_CURR_APPL_YN;
	}

	public void setCUST_ALL_CURR_APPL_YN(String cUST_ALL_CURR_APPL_YN) {
		CUST_ALL_CURR_APPL_YN = cUST_ALL_CURR_APPL_YN;
	}

	public String getCUST_MKT_CODE() {
		return CUST_MKT_CODE;
	}

	public void setCUST_MKT_CODE(String cUST_MKT_CODE) {
		CUST_MKT_CODE = cUST_MKT_CODE;
	}

	public String getCUST_UNIT_CODE() {
		return CUST_UNIT_CODE;
	}

	public void setCUST_UNIT_CODE(String cUST_UNIT_CODE) {
		CUST_UNIT_CODE = cUST_UNIT_CODE;
	}

	public String getCUST_AGENCY_CODE() {
		return CUST_AGENCY_CODE;
	}

	public void setCUST_AGENCY_CODE(String cUST_AGENCY_CODE) {
		CUST_AGENCY_CODE = cUST_AGENCY_CODE;
	}

	public String getCUST_AGENCY_BRANCH_CODE() {
		return CUST_AGENCY_BRANCH_CODE;
	}

	public void setCUST_AGENCY_BRANCH_CODE(String cUST_AGENCY_BRANCH_CODE) {
		CUST_AGENCY_BRANCH_CODE = cUST_AGENCY_BRANCH_CODE;
	}

	public String getCUST_REGION_CODE() {
		return CUST_REGION_CODE;
	}

	public void setCUST_REGION_CODE(String cUST_REGION_CODE) {
		CUST_REGION_CODE = cUST_REGION_CODE;
	}

	public String getCUST_AGENCY_NAME() {
		return CUST_AGENCY_NAME;
	}

	public void setCUST_AGENCY_NAME(String cUST_AGENCY_NAME) {
		CUST_AGENCY_NAME = cUST_AGENCY_NAME;
	}

	public String getCUST_AGENT_RANK_CODE() {
		return CUST_AGENT_RANK_CODE;
	}

	public void setCUST_AGENT_RANK_CODE(String cUST_AGENT_RANK_CODE) {
		CUST_AGENT_RANK_CODE = cUST_AGENT_RANK_CODE;
	}

	public String getCUST_RECRUITER_CODE() {
		return CUST_RECRUITER_CODE;
	}

	public void setCUST_RECRUITER_CODE(String cUST_RECRUITER_CODE) {
		CUST_RECRUITER_CODE = cUST_RECRUITER_CODE;
	}

	public String getCUST_INTRODUCER_CODE() {
		return CUST_INTRODUCER_CODE;
	}

	public void setCUST_INTRODUCER_CODE(String cUST_INTRODUCER_CODE) {
		CUST_INTRODUCER_CODE = cUST_INTRODUCER_CODE;
	}

	public Integer getCUST_MIN_NO_OF_POL() {
		return CUST_MIN_NO_OF_POL;
	}

	public void setCUST_MIN_NO_OF_POL(Integer cUST_MIN_NO_OF_POL) {
		CUST_MIN_NO_OF_POL = cUST_MIN_NO_OF_POL;
	}

	public Double getCUST_MIN_LC_PERS_CONT() {
		return CUST_MIN_LC_PERS_CONT;
	}

	public void setCUST_MIN_LC_PERS_CONT(Double cUST_MIN_LC_PERS_CONT) {
		CUST_MIN_LC_PERS_CONT = cUST_MIN_LC_PERS_CONT;
	}

	public Double getCUST_BUDGET_LC_PREM() {
		return CUST_BUDGET_LC_PREM;
	}

	public void setCUST_BUDGET_LC_PREM(Double cUST_BUDGET_LC_PREM) {
		CUST_BUDGET_LC_PREM = cUST_BUDGET_LC_PREM;
	}

	public Double getCUST_LC_SUM_ASSURED() {
		return CUST_LC_SUM_ASSURED;
	}

	public void setCUST_LC_SUM_ASSURED(Double cUST_LC_SUM_ASSURED) {
		CUST_LC_SUM_ASSURED = cUST_LC_SUM_ASSURED;
	}

	public String getCUST_FIRST_NAME() {
		return CUST_FIRST_NAME;
	}

	public void setCUST_FIRST_NAME(String cUST_FIRST_NAME) {
		CUST_FIRST_NAME = cUST_FIRST_NAME;
	}

	public String getCUST_SURNAME() {
		return CUST_SURNAME;
	}

	public void setCUST_SURNAME(String cUST_SURNAME) {
		CUST_SURNAME = cUST_SURNAME;
	}

	public String getCUST_MIDDLE_NAME() {
		return CUST_MIDDLE_NAME;
	}

	public void setCUST_MIDDLE_NAME(String cUST_MIDDLE_NAME) {
		CUST_MIDDLE_NAME = cUST_MIDDLE_NAME;
	}

	public String getCUST_LONG_NAME() {
		return CUST_LONG_NAME;
	}

	public void setCUST_LONG_NAME(String cUST_LONG_NAME) {
		CUST_LONG_NAME = cUST_LONG_NAME;
	}

	public String getCUST_STATUS() {
		return CUST_STATUS;
	}

	public void setCUST_STATUS(String cUST_STATUS) {
		CUST_STATUS = cUST_STATUS;
	}

	public Double getCUST_INTEREST_RATE() {
		return CUST_INTEREST_RATE;
	}

	public void setCUST_INTEREST_RATE(Double cUST_INTEREST_RATE) {
		CUST_INTEREST_RATE = cUST_INTEREST_RATE;
	}

	public String getCUST_AUTO_DEBIT_AVBL_YN() {
		return CUST_AUTO_DEBIT_AVBL_YN;
	}

	public void setCUST_AUTO_DEBIT_AVBL_YN(String cUST_AUTO_DEBIT_AVBL_YN) {
		CUST_AUTO_DEBIT_AVBL_YN = cUST_AUTO_DEBIT_AVBL_YN;
	}

	public String getCUST_COMP_REGN_NO() {
		return CUST_COMP_REGN_NO;
	}

	public void setCUST_COMP_REGN_NO(String cUST_COMP_REGN_NO) {
		CUST_COMP_REGN_NO = cUST_COMP_REGN_NO;
	}

	public String getCUST_PIAM_AGENCY_CODE() {
		return CUST_PIAM_AGENCY_CODE;
	}

	public void setCUST_PIAM_AGENCY_CODE(String cUST_PIAM_AGENCY_CODE) {
		CUST_PIAM_AGENCY_CODE = cUST_PIAM_AGENCY_CODE;
	}

	public String getCUST_PASS_NO() {
		return CUST_PASS_NO;
	}

	public void setCUST_PASS_NO(String cUST_PASS_NO) {
		CUST_PASS_NO = cUST_PASS_NO;
	}

	public String getCUST_CPF_NO() {
		return CUST_CPF_NO;
	}

	public void setCUST_CPF_NO(String cUST_CPF_NO) {
		CUST_CPF_NO = cUST_CPF_NO;
	}

	public String getCUST_CBC_YN() {
		return CUST_CBC_YN;
	}

	public void setCUST_CBC_YN(String cUST_CBC_YN) {
		CUST_CBC_YN = cUST_CBC_YN;
	}

	public String getCUST_ROC_NO() {
		return CUST_ROC_NO;
	}

	public void setCUST_ROC_NO(String cUST_ROC_NO) {
		CUST_ROC_NO = cUST_ROC_NO;
	}

	public String getCUST_CLAIM_EXP() {
		return CUST_CLAIM_EXP;
	}

	public void setCUST_CLAIM_EXP(String cUST_CLAIM_EXP) {
		CUST_CLAIM_EXP = cUST_CLAIM_EXP;
	}

	public Double getCUST_DRV_EXP() {
		return CUST_DRV_EXP;
	}

	public void setCUST_DRV_EXP(Double cUST_DRV_EXP) {
		CUST_DRV_EXP = cUST_DRV_EXP;
	}

	public Double getCUST_GUARANTEE_LIMIT() {
		return CUST_GUARANTEE_LIMIT;
	}

	public void setCUST_GUARANTEE_LIMIT(Double cUST_GUARANTEE_LIMIT) {
		CUST_GUARANTEE_LIMIT = cUST_GUARANTEE_LIMIT;
	}

	public String getCUST_MATRIX_PROD_APPBL_YN() {
		return CUST_MATRIX_PROD_APPBL_YN;
	}

	public void setCUST_MATRIX_PROD_APPBL_YN(String cUST_MATRIX_PROD_APPBL_YN) {
		CUST_MATRIX_PROD_APPBL_YN = cUST_MATRIX_PROD_APPBL_YN;
	}

	public String getCUST_CONTACT3() {
		return CUST_CONTACT3;
	}

	public void setCUST_CONTACT3(String cUST_CONTACT3) {
		CUST_CONTACT3 = cUST_CONTACT3;
	}

	public String getCUST_CONTACT1_LIC_NO() {
		return CUST_CONTACT1_LIC_NO;
	}

	public void setCUST_CONTACT1_LIC_NO(String cUST_CONTACT1_LIC_NO) {
		CUST_CONTACT1_LIC_NO = cUST_CONTACT1_LIC_NO;
	}

	public String getCUST_CONTACT2_LIC_NO() {
		return CUST_CONTACT2_LIC_NO;
	}

	public void setCUST_CONTACT2_LIC_NO(String cUST_CONTACT2_LIC_NO) {
		CUST_CONTACT2_LIC_NO = cUST_CONTACT2_LIC_NO;
	}

	public String getCUST_CONTACT3_LIC_NO() {
		return CUST_CONTACT3_LIC_NO;
	}

	public void setCUST_CONTACT3_LIC_NO(String cUST_CONTACT3_LIC_NO) {
		CUST_CONTACT3_LIC_NO = cUST_CONTACT3_LIC_NO;
	}

	public String getCUST_CLM_CONTACT() {
		return CUST_CLM_CONTACT;
	}

	public void setCUST_CLM_CONTACT(String cUST_CLM_CONTACT) {
		CUST_CLM_CONTACT = cUST_CLM_CONTACT;
	}

	public String getCUST_CLM_CONTACT_LIC_NO() {
		return CUST_CLM_CONTACT_LIC_NO;
	}

	public void setCUST_CLM_CONTACT_LIC_NO(String cUST_CLM_CONTACT_LIC_NO) {
		CUST_CLM_CONTACT_LIC_NO = cUST_CLM_CONTACT_LIC_NO;
	}

	public String getCUST_ACNT_CONTACT() {
		return CUST_ACNT_CONTACT;
	}

	public void setCUST_ACNT_CONTACT(String cUST_ACNT_CONTACT) {
		CUST_ACNT_CONTACT = cUST_ACNT_CONTACT;
	}

	public String getCUST_ACNT_CONTACT_LIC_NO() {
		return CUST_ACNT_CONTACT_LIC_NO;
	}

	public void setCUST_ACNT_CONTACT_LIC_NO(String cUST_ACNT_CONTACT_LIC_NO) {
		CUST_ACNT_CONTACT_LIC_NO = cUST_ACNT_CONTACT_LIC_NO;
	}

	public String getCUST_TEL_AREA_CODE2() {
		return CUST_TEL_AREA_CODE2;
	}

	public void setCUST_TEL_AREA_CODE2(String cUST_TEL_AREA_CODE2) {
		CUST_TEL_AREA_CODE2 = cUST_TEL_AREA_CODE2;
	}

	public String getCUST_TEL_AREA_CODE3() {
		return CUST_TEL_AREA_CODE3;
	}

	public void setCUST_TEL_AREA_CODE3(String cUST_TEL_AREA_CODE3) {
		CUST_TEL_AREA_CODE3 = cUST_TEL_AREA_CODE3;
	}

	public String getCUST_PHONE2() {
		return CUST_PHONE2;
	}

	public void setCUST_PHONE2(String cUST_PHONE2) {
		CUST_PHONE2 = cUST_PHONE2;
	}

	public String getCUST_PHONE3() {
		return CUST_PHONE3;
	}

	public void setCUST_PHONE3(String cUST_PHONE3) {
		CUST_PHONE3 = cUST_PHONE3;
	}

	public String getCUST_FAX_AREA_CODE2() {
		return CUST_FAX_AREA_CODE2;
	}

	public void setCUST_FAX_AREA_CODE2(String cUST_FAX_AREA_CODE2) {
		CUST_FAX_AREA_CODE2 = cUST_FAX_AREA_CODE2;
	}

	public String getCUST_FAX_AREA_CODE3() {
		return CUST_FAX_AREA_CODE3;
	}

	public void setCUST_FAX_AREA_CODE3(String cUST_FAX_AREA_CODE3) {
		CUST_FAX_AREA_CODE3 = cUST_FAX_AREA_CODE3;
	}

	public String getCUST_FAX2() {
		return CUST_FAX2;
	}

	public void setCUST_FAX2(String cUST_FAX2) {
		CUST_FAX2 = cUST_FAX2;
	}

	public String getCUST_FAX3() {
		return CUST_FAX3;
	}

	public void setCUST_FAX3(String cUST_FAX3) {
		CUST_FAX3 = cUST_FAX3;
	}

	public String getCUST_TRANSFER_TO() {
		return CUST_TRANSFER_TO;
	}

	public void setCUST_TRANSFER_TO(String cUST_TRANSFER_TO) {
		CUST_TRANSFER_TO = cUST_TRANSFER_TO;
	}

	public String getCUST_AGENT_TO() {
		return CUST_AGENT_TO;
	}

	public void setCUST_AGENT_TO(String cUST_AGENT_TO) {
		CUST_AGENT_TO = cUST_AGENT_TO;
	}

	public Date getCUST_AGENT_EFF_FM_DT() {
		return CUST_AGENT_EFF_FM_DT;
	}

	public void setCUST_AGENT_EFF_FM_DT(Date cUST_AGENT_EFF_FM_DT) {
		CUST_AGENT_EFF_FM_DT = cUST_AGENT_EFF_FM_DT;
	}

	public Date getCUST_AGENT_EFF_TO_DT() {
		return CUST_AGENT_EFF_TO_DT;
	}

	public void setCUST_AGENT_EFF_TO_DT(Date cUST_AGENT_EFF_TO_DT) {
		CUST_AGENT_EFF_TO_DT = cUST_AGENT_EFF_TO_DT;
	}

	public String getCUST_SUPP_COMM_APBL_YN() {
		return CUST_SUPP_COMM_APBL_YN;
	}

	public void setCUST_SUPP_COMM_APBL_YN(String cUST_SUPP_COMM_APBL_YN) {
		CUST_SUPP_COMM_APBL_YN = cUST_SUPP_COMM_APBL_YN;
	}

	public String getCUST_LCN_NO() {
		return CUST_LCN_NO;
	}

	public void setCUST_LCN_NO(String cUST_LCN_NO) {
		CUST_LCN_NO = cUST_LCN_NO;
	}

	public Date getCUST_LIC_START_DT() {
		return CUST_LIC_START_DT;
	}

	public void setCUST_LIC_START_DT(Date cUST_LIC_START_DT) {
		CUST_LIC_START_DT = cUST_LIC_START_DT;
	}

	public Date getCUST_LIC_END_DT() {
		return CUST_LIC_END_DT;
	}

	public void setCUST_LIC_END_DT(Date cUST_LIC_END_DT) {
		CUST_LIC_END_DT = cUST_LIC_END_DT;
	}

	public Date getCUST_LCN_REG_DT() {
		return CUST_LCN_REG_DT;
	}

	public void setCUST_LCN_REG_DT(Date cUST_LCN_REG_DT) {
		CUST_LCN_REG_DT = cUST_LCN_REG_DT;
	}

	public String getCUST_LCN_STATUS() {
		return CUST_LCN_STATUS;
	}

	public void setCUST_LCN_STATUS(String cUST_LCN_STATUS) {
		CUST_LCN_STATUS = cUST_LCN_STATUS;
	}

	public String getCUST_HANDLER_ID() {
		return CUST_HANDLER_ID;
	}

	public void setCUST_HANDLER_ID(String cUST_HANDLER_ID) {
		CUST_HANDLER_ID = cUST_HANDLER_ID;
	}

	public String getCUST_COD_REQD_YN() {
		return CUST_COD_REQD_YN;
	}

	public void setCUST_COD_REQD_YN(String cUST_COD_REQD_YN) {
		CUST_COD_REQD_YN = cUST_COD_REQD_YN;
	}

	public String getCUST_AD_ACC_NO() {
		return CUST_AD_ACC_NO;
	}

	public void setCUST_AD_ACC_NO(String cUST_AD_ACC_NO) {
		CUST_AD_ACC_NO = cUST_AD_ACC_NO;
	}

	public String getCUST_AD_BANK_CODE() {
		return CUST_AD_BANK_CODE;
	}

	public void setCUST_AD_BANK_CODE(String cUST_AD_BANK_CODE) {
		CUST_AD_BANK_CODE = cUST_AD_BANK_CODE;
	}

	public Double getCUST_BLACK_LIST_COUNT() {
		return CUST_BLACK_LIST_COUNT;
	}

	public void setCUST_BLACK_LIST_COUNT(Double cUST_BLACK_LIST_COUNT) {
		CUST_BLACK_LIST_COUNT = cUST_BLACK_LIST_COUNT;
	}

	public String getCUST_CLE_ZONE_CODE() {
		return CUST_CLE_ZONE_CODE;
	}

	public void setCUST_CLE_ZONE_CODE(String cUST_CLE_ZONE_CODE) {
		CUST_CLE_ZONE_CODE = cUST_CLE_ZONE_CODE;
	}

	public String getCUST_CONTU_PAYMENT_YN() {
		return CUST_CONTU_PAYMENT_YN;
	}

	public void setCUST_CONTU_PAYMENT_YN(String cUST_CONTU_PAYMENT_YN) {
		CUST_CONTU_PAYMENT_YN = cUST_CONTU_PAYMENT_YN;
	}

	public String getCUST_DES_MTD_CODE() {
		return CUST_DES_MTD_CODE;
	}

	public void setCUST_DES_MTD_CODE(String cUST_DES_MTD_CODE) {
		CUST_DES_MTD_CODE = cUST_DES_MTD_CODE;
	}

	public Double getCUST_INTREST_RATE() {
		return CUST_INTREST_RATE;
	}

	public void setCUST_INTREST_RATE(Double cUST_INTREST_RATE) {
		CUST_INTREST_RATE = cUST_INTREST_RATE;
	}

	public String getCUST_PYMT_TYPE() {
		return CUST_PYMT_TYPE;
	}

	public void setCUST_PYMT_TYPE(String cUST_PYMT_TYPE) {
		CUST_PYMT_TYPE = cUST_PYMT_TYPE;
	}

	public String getCUST_IC_TYPE() {
		return CUST_IC_TYPE;
	}

	public void setCUST_IC_TYPE(String cUST_IC_TYPE) {
		CUST_IC_TYPE = cUST_IC_TYPE;
	}

	public String getCUST_STATE_DESC() {
		return CUST_STATE_DESC;
	}

	public void setCUST_STATE_DESC(String cUST_STATE_DESC) {
		CUST_STATE_DESC = cUST_STATE_DESC;
	}

	public String getCUST_POSTAL_DESC() {
		return CUST_POSTAL_DESC;
	}

	public void setCUST_POSTAL_DESC(String cUST_POSTAL_DESC) {
		CUST_POSTAL_DESC = cUST_POSTAL_DESC;
	}

	public String getCUST_APPL_ALL_BRAN_YN() {
		return CUST_APPL_ALL_BRAN_YN;
	}

	public void setCUST_APPL_ALL_BRAN_YN(String cUST_APPL_ALL_BRAN_YN) {
		CUST_APPL_ALL_BRAN_YN = cUST_APPL_ALL_BRAN_YN;
	}

	public String getCUST_FLEX_01() {
		return CUST_FLEX_01;
	}

	public void setCUST_FLEX_01(String cUST_FLEX_01) {
		CUST_FLEX_01 = cUST_FLEX_01;
	}

	public String getCUST_FLEX_02() {
		return CUST_FLEX_02;
	}

	public void setCUST_FLEX_02(String cUST_FLEX_02) {
		CUST_FLEX_02 = cUST_FLEX_02;
	}

	public Date getCUST_FLEX_DATE_01() {
		return CUST_FLEX_DATE_01;
	}

	public void setCUST_FLEX_DATE_01(Date cUST_FLEX_DATE_01) {
		CUST_FLEX_DATE_01 = cUST_FLEX_DATE_01;
	}

	public Date getCUST_FLEX_DATE_02() {
		return CUST_FLEX_DATE_02;
	}

	public void setCUST_FLEX_DATE_02(Date cUST_FLEX_DATE_02) {
		CUST_FLEX_DATE_02 = cUST_FLEX_DATE_02;
	}

	public String getCUST_FLEX_SEL_01() {
		return CUST_FLEX_SEL_01;
	}

	public void setCUST_FLEX_SEL_01(String cUST_FLEX_SEL_01) {
		CUST_FLEX_SEL_01 = cUST_FLEX_SEL_01;
	}

	public String getCUST_FLEX_SEL_02() {
		return CUST_FLEX_SEL_02;
	}

	public void setCUST_FLEX_SEL_02(String cUST_FLEX_SEL_02) {
		CUST_FLEX_SEL_02 = cUST_FLEX_SEL_02;
	}

	public String getCUST_FLEX_03() {
		return CUST_FLEX_03;
	}

	public void setCUST_FLEX_03(String cUST_FLEX_03) {
		CUST_FLEX_03 = cUST_FLEX_03;
	}

	public String getCUST_FLEX_04() {
		return CUST_FLEX_04;
	}

	public void setCUST_FLEX_04(String cUST_FLEX_04) {
		CUST_FLEX_04 = cUST_FLEX_04;
	}

	public String getCUST_FLEX_05() {
		return CUST_FLEX_05;
	}

	public void setCUST_FLEX_05(String cUST_FLEX_05) {
		CUST_FLEX_05 = cUST_FLEX_05;
	}

	public String getCUST_FLEX_06() {
		return CUST_FLEX_06;
	}

	public void setCUST_FLEX_06(String cUST_FLEX_06) {
		CUST_FLEX_06 = cUST_FLEX_06;
	}

	public Date getCUST_FLEX_DATE_03() {
		return CUST_FLEX_DATE_03;
	}

	public void setCUST_FLEX_DATE_03(Date cUST_FLEX_DATE_03) {
		CUST_FLEX_DATE_03 = cUST_FLEX_DATE_03;
	}

	public Date getCUST_FLEX_DATE_04() {
		return CUST_FLEX_DATE_04;
	}

	public void setCUST_FLEX_DATE_04(Date cUST_FLEX_DATE_04) {
		CUST_FLEX_DATE_04 = cUST_FLEX_DATE_04;
	}

	public Date getCUST_FLEX_DATE_05() {
		return CUST_FLEX_DATE_05;
	}

	public void setCUST_FLEX_DATE_05(Date cUST_FLEX_DATE_05) {
		CUST_FLEX_DATE_05 = cUST_FLEX_DATE_05;
	}

	public Date getCUST_FLEX_DATE_06() {
		return CUST_FLEX_DATE_06;
	}

	public void setCUST_FLEX_DATE_06(Date cUST_FLEX_DATE_06) {
		CUST_FLEX_DATE_06 = cUST_FLEX_DATE_06;
	}

	public String getCUST_FLEX_SEL_03() {
		return CUST_FLEX_SEL_03;
	}

	public void setCUST_FLEX_SEL_03(String cUST_FLEX_SEL_03) {
		CUST_FLEX_SEL_03 = cUST_FLEX_SEL_03;
	}

	public String getCUST_FLEX_SEL_04() {
		return CUST_FLEX_SEL_04;
	}

	public void setCUST_FLEX_SEL_04(String cUST_FLEX_SEL_04) {
		CUST_FLEX_SEL_04 = cUST_FLEX_SEL_04;
	}

	public String getCUST_FLEX_SEL_05() {
		return CUST_FLEX_SEL_05;
	}

	public void setCUST_FLEX_SEL_05(String cUST_FLEX_SEL_05) {
		CUST_FLEX_SEL_05 = cUST_FLEX_SEL_05;
	}

	public String getCUST_FLEX_SEL_06() {
		return CUST_FLEX_SEL_06;
	}

	public void setCUST_FLEX_SEL_06(String cUST_FLEX_SEL_06) {
		CUST_FLEX_SEL_06 = cUST_FLEX_SEL_06;
	}

	public String getCUST_EMPLOYER_CODE() {
		return CUST_EMPLOYER_CODE;
	}

	public void setCUST_EMPLOYER_CODE(String cUST_EMPLOYER_CODE) {
		CUST_EMPLOYER_CODE = cUST_EMPLOYER_CODE;
	}

	public String getCUST_PHY_CITY_CODE() {
		return CUST_PHY_CITY_CODE;
	}

	public void setCUST_PHY_CITY_CODE(String cUST_PHY_CITY_CODE) {
		CUST_PHY_CITY_CODE = cUST_PHY_CITY_CODE;
	}

	public String getCUST_CNTCT_AREA_CODE_1() {
		return CUST_CNTCT_AREA_CODE_1;
	}

	public void setCUST_CNTCT_AREA_CODE_1(String cUST_CNTCT_AREA_CODE_1) {
		CUST_CNTCT_AREA_CODE_1 = cUST_CNTCT_AREA_CODE_1;
	}

	public String getCUST_CNTCT_AREA_CODE_2() {
		return CUST_CNTCT_AREA_CODE_2;
	}

	public void setCUST_CNTCT_AREA_CODE_2(String cUST_CNTCT_AREA_CODE_2) {
		CUST_CNTCT_AREA_CODE_2 = cUST_CNTCT_AREA_CODE_2;
	}

	public String getCUST_CNTCT_AREA_CODE_3() {
		return CUST_CNTCT_AREA_CODE_3;
	}

	public void setCUST_CNTCT_AREA_CODE_3(String cUST_CNTCT_AREA_CODE_3) {
		CUST_CNTCT_AREA_CODE_3 = cUST_CNTCT_AREA_CODE_3;
	}

	public String getCUST_CLM_CNTCT_AREA_CODE() {
		return CUST_CLM_CNTCT_AREA_CODE;
	}

	public void setCUST_CLM_CNTCT_AREA_CODE(String cUST_CLM_CNTCT_AREA_CODE) {
		CUST_CLM_CNTCT_AREA_CODE = cUST_CLM_CNTCT_AREA_CODE;
	}

	public String getCUST_ACCD_CNTCT_AREA_CODE() {
		return CUST_ACCD_CNTCT_AREA_CODE;
	}

	public void setCUST_ACCD_CNTCT_AREA_CODE(String cUST_ACCD_CNTCT_AREA_CODE) {
		CUST_ACCD_CNTCT_AREA_CODE = cUST_ACCD_CNTCT_AREA_CODE;
	}

	public String getCUST_PHY_MOB_AREA_CODE() {
		return CUST_PHY_MOB_AREA_CODE;
	}

	public void setCUST_PHY_MOB_AREA_CODE(String cUST_PHY_MOB_AREA_CODE) {
		CUST_PHY_MOB_AREA_CODE = cUST_PHY_MOB_AREA_CODE;
	}

	public String getCUST_SOCIAL_MEDIA_TYPE() {
		return CUST_SOCIAL_MEDIA_TYPE;
	}

	public void setCUST_SOCIAL_MEDIA_TYPE(String cUST_SOCIAL_MEDIA_TYPE) {
		CUST_SOCIAL_MEDIA_TYPE = cUST_SOCIAL_MEDIA_TYPE;
	}

	public String getCUST_SOCIAL_MEDIA_MAIL_ID() {
		return CUST_SOCIAL_MEDIA_MAIL_ID;
	}

	public void setCUST_SOCIAL_MEDIA_MAIL_ID(String cUST_SOCIAL_MEDIA_MAIL_ID) {
		CUST_SOCIAL_MEDIA_MAIL_ID = cUST_SOCIAL_MEDIA_MAIL_ID;
	}

	public String getCUST_AGE_ADMITTED() {
		return CUST_AGE_ADMITTED;
	}

	public void setCUST_AGE_ADMITTED(String cUST_AGE_ADMITTED) {
		CUST_AGE_ADMITTED = cUST_AGE_ADMITTED;
	}

	public String getCUST_AGE_PROOF_FLAG() {
		return CUST_AGE_PROOF_FLAG;
	}

	public void setCUST_AGE_PROOF_FLAG(String cUST_AGE_PROOF_FLAG) {
		CUST_AGE_PROOF_FLAG = cUST_AGE_PROOF_FLAG;
	}

	public String getCUST_AGE_PROOF_OTHERS() {
		return CUST_AGE_PROOF_OTHERS;
	}

	public void setCUST_AGE_PROOF_OTHERS(String cUST_AGE_PROOF_OTHERS) {
		CUST_AGE_PROOF_OTHERS = cUST_AGE_PROOF_OTHERS;
	}

	public String getCUST_FLEX_07() {
		return CUST_FLEX_07;
	}

	public void setCUST_FLEX_07(String cUST_FLEX_07) {
		CUST_FLEX_07 = cUST_FLEX_07;
	}

	public String getCUST_FLEX_08() {
		return CUST_FLEX_08;
	}

	public void setCUST_FLEX_08(String cUST_FLEX_08) {
		CUST_FLEX_08 = cUST_FLEX_08;
	}

	public String getCUST_FLEX_09() {
		return CUST_FLEX_09;
	}

	public void setCUST_FLEX_09(String cUST_FLEX_09) {
		CUST_FLEX_09 = cUST_FLEX_09;
	}

	public String getCUST_FLEX_10() {
		return CUST_FLEX_10;
	}

	public void setCUST_FLEX_10(String cUST_FLEX_10) {
		CUST_FLEX_10 = cUST_FLEX_10;
	}

	public String getCUST_REL_CODE() {
		return CUST_REL_CODE;
	}

	public void setCUST_REL_CODE(String cUST_REL_CODE) {
		CUST_REL_CODE = cUST_REL_CODE;
	}

	public String getCUST_MAIN_MEM_CODE() {
		return CUST_MAIN_MEM_CODE;
	}

	public void setCUST_MAIN_MEM_CODE(String cUST_MAIN_MEM_CODE) {
		CUST_MAIN_MEM_CODE = cUST_MAIN_MEM_CODE;
	}

	public Integer getCUST_CUT_OFF_DAY() {
		return CUST_CUT_OFF_DAY;
	}

	public void setCUST_CUT_OFF_DAY(Integer cUST_CUT_OFF_DAY) {
		CUST_CUT_OFF_DAY = cUST_CUT_OFF_DAY;
	}

	public Double getCUST_COMM_RATE() {
		return CUST_COMM_RATE;
	}

	public void setCUST_COMM_RATE(Double cUST_COMM_RATE) {
		CUST_COMM_RATE = cUST_COMM_RATE;
	}

	public String getCUST_REMARKS() {
		return CUST_REMARKS;
	}

	public void setCUST_REMARKS(String cUST_REMARKS) {
		CUST_REMARKS = cUST_REMARKS;
	}

	public Date getCUST_ID_SUB_DT() {
		return CUST_ID_SUB_DT;
	}

	public void setCUST_ID_SUB_DT(Date cUST_ID_SUB_DT) {
		CUST_ID_SUB_DT = cUST_ID_SUB_DT;
	}

	public Integer getCUST_RETD_AGE() {
		return CUST_RETD_AGE;
	}

	public void setCUST_RETD_AGE(Integer cUST_RETD_AGE) {
		CUST_RETD_AGE = cUST_RETD_AGE;
	}

	public String getCUST_ALT_EMAIL_ID_PER() {
		return CUST_ALT_EMAIL_ID_PER;
	}

	public void setCUST_ALT_EMAIL_ID_PER(String cUST_ALT_EMAIL_ID_PER) {
		CUST_ALT_EMAIL_ID_PER = cUST_ALT_EMAIL_ID_PER;
	}

	public String getCUST_ALT_MOBILE_NO() {
		return CUST_ALT_MOBILE_NO;
	}

	public void setCUST_ALT_MOBILE_NO(String cUST_ALT_MOBILE_NO) {
		CUST_ALT_MOBILE_NO = cUST_ALT_MOBILE_NO;
	}

	public String getCUST_TEL_AREA_CODE4() {
		return CUST_TEL_AREA_CODE4;
	}

	public void setCUST_TEL_AREA_CODE4(String cUST_TEL_AREA_CODE4) {
		CUST_TEL_AREA_CODE4 = cUST_TEL_AREA_CODE4;
	}

	public String getCUST_PHY_EMAIL_ID_OFF() {
		return CUST_PHY_EMAIL_ID_OFF;
	}

	public void setCUST_PHY_EMAIL_ID_OFF(String cUST_PHY_EMAIL_ID_OFF) {
		CUST_PHY_EMAIL_ID_OFF = cUST_PHY_EMAIL_ID_OFF;
	}

	public String getCUST_ALT_PHY_MOBILE_NO() {
		return CUST_ALT_PHY_MOBILE_NO;
	}

	public void setCUST_ALT_PHY_MOBILE_NO(String cUST_ALT_PHY_MOBILE_NO) {
		CUST_ALT_PHY_MOBILE_NO = cUST_ALT_PHY_MOBILE_NO;
	}

	public String getCUST_PHY_TEL_AREA_CODE2() {
		return CUST_PHY_TEL_AREA_CODE2;
	}

	public void setCUST_PHY_TEL_AREA_CODE2(String cUST_PHY_TEL_AREA_CODE2) {
		CUST_PHY_TEL_AREA_CODE2 = cUST_PHY_TEL_AREA_CODE2;
	}

	public String getCUST_EMP_EMAIL_ID() {
		return CUST_EMP_EMAIL_ID;
	}

	public void setCUST_EMP_EMAIL_ID(String cUST_EMP_EMAIL_ID) {
		CUST_EMP_EMAIL_ID = cUST_EMP_EMAIL_ID;
	}

	public String getCUST_EMP_PHONE() {
		return CUST_EMP_PHONE;
	}

	public void setCUST_EMP_PHONE(String cUST_EMP_PHONE) {
		CUST_EMP_PHONE = cUST_EMP_PHONE;
	}

	public String getCUST_EMP_AREA_CODE1() {
		return CUST_EMP_AREA_CODE1;
	}

	public void setCUST_EMP_AREA_CODE1(String cUST_EMP_AREA_CODE1) {
		CUST_EMP_AREA_CODE1 = cUST_EMP_AREA_CODE1;
	}

	public String getCUST_EMP_MOBILE_NO() {
		return CUST_EMP_MOBILE_NO;
	}

	public void setCUST_EMP_MOBILE_NO(String cUST_EMP_MOBILE_NO) {
		CUST_EMP_MOBILE_NO = cUST_EMP_MOBILE_NO;
	}

	public String getCUST_EMP_AREA_CODE2() {
		return CUST_EMP_AREA_CODE2;
	}

	public void setCUST_EMP_AREA_CODE2(String cUST_EMP_AREA_CODE2) {
		CUST_EMP_AREA_CODE2 = cUST_EMP_AREA_CODE2;
	}

	public String getCUST_COMM_ADDR_FLG() {
		return CUST_COMM_ADDR_FLG;
	}

	public void setCUST_COMM_ADDR_FLG(String cUST_COMM_ADDR_FLG) {
		CUST_COMM_ADDR_FLG = cUST_COMM_ADDR_FLG;
	}

	public String getCUST_CORR_ADDR1() {
		return CUST_CORR_ADDR1;
	}

	public void setCUST_CORR_ADDR1(String cUST_CORR_ADDR1) {
		CUST_CORR_ADDR1 = cUST_CORR_ADDR1;
	}

	public String getCUST_CORR_ADDR2() {
		return CUST_CORR_ADDR2;
	}

	public void setCUST_CORR_ADDR2(String cUST_CORR_ADDR2) {
		CUST_CORR_ADDR2 = cUST_CORR_ADDR2;
	}

	public String getCUST_CORR_ADDR3() {
		return CUST_CORR_ADDR3;
	}

	public void setCUST_CORR_ADDR3(String cUST_CORR_ADDR3) {
		CUST_CORR_ADDR3 = cUST_CORR_ADDR3;
	}

	public String getCUST_CORR_COUNTRY() {
		return CUST_CORR_COUNTRY;
	}

	public void setCUST_CORR_COUNTRY(String cUST_CORR_COUNTRY) {
		CUST_CORR_COUNTRY = cUST_CORR_COUNTRY;
	}

	public String getCUST_CORR_CITY_CODE() {
		return CUST_CORR_CITY_CODE;
	}

	public void setCUST_CORR_CITY_CODE(String cUST_CORR_CITY_CODE) {
		CUST_CORR_CITY_CODE = cUST_CORR_CITY_CODE;
	}

	public String getCUST_CORR_EMAIL_ID_OFF() {
		return CUST_CORR_EMAIL_ID_OFF;
	}

	public void setCUST_CORR_EMAIL_ID_OFF(String cUST_CORR_EMAIL_ID_OFF) {
		CUST_CORR_EMAIL_ID_OFF = cUST_CORR_EMAIL_ID_OFF;
	}

	public String getCUST_CORR_FAX_AREA_CODE() {
		return CUST_CORR_FAX_AREA_CODE;
	}

	public void setCUST_CORR_FAX_AREA_CODE(String cUST_CORR_FAX_AREA_CODE) {
		CUST_CORR_FAX_AREA_CODE = cUST_CORR_FAX_AREA_CODE;
	}

	public String getCUST_CORR_MOB_AREA_CODE() {
		return CUST_CORR_MOB_AREA_CODE;
	}

	public void setCUST_CORR_MOB_AREA_CODE(String cUST_CORR_MOB_AREA_CODE) {
		CUST_CORR_MOB_AREA_CODE = cUST_CORR_MOB_AREA_CODE;
	}

	public String getCUST_CORR_POST_BOX_NO() {
		return CUST_CORR_POST_BOX_NO;
	}

	public void setCUST_CORR_POST_BOX_NO(String cUST_CORR_POST_BOX_NO) {
		CUST_CORR_POST_BOX_NO = cUST_CORR_POST_BOX_NO;
	}

	public String getCUST_CORR_MOBILE_NO() {
		return CUST_CORR_MOBILE_NO;
	}

	public void setCUST_CORR_MOBILE_NO(String cUST_CORR_MOBILE_NO) {
		CUST_CORR_MOBILE_NO = cUST_CORR_MOBILE_NO;
	}

	public String getCUST_CORR_TEL_AREA_CODE() {
		return CUST_CORR_TEL_AREA_CODE;
	}

	public void setCUST_CORR_TEL_AREA_CODE(String cUST_CORR_TEL_AREA_CODE) {
		CUST_CORR_TEL_AREA_CODE = cUST_CORR_TEL_AREA_CODE;
	}

	public String getCUST_CORR_FAX() {
		return CUST_CORR_FAX;
	}

	public void setCUST_CORR_FAX(String cUST_CORR_FAX) {
		CUST_CORR_FAX = cUST_CORR_FAX;
	}

	public String getCUST_CORR_OFFICE_PHONE() {
		return CUST_CORR_OFFICE_PHONE;
	}

	public void setCUST_CORR_OFFICE_PHONE(String cUST_CORR_OFFICE_PHONE) {
		CUST_CORR_OFFICE_PHONE = cUST_CORR_OFFICE_PHONE;
	}

	public String getCUST_FLEX_11() {
		return CUST_FLEX_11;
	}

	public void setCUST_FLEX_11(String cUST_FLEX_11) {
		CUST_FLEX_11 = cUST_FLEX_11;
	}

	public String getCUST_FLEX_12() {
		return CUST_FLEX_12;
	}

	public void setCUST_FLEX_12(String cUST_FLEX_12) {
		CUST_FLEX_12 = cUST_FLEX_12;
	}

	public String getCUST_CORR_ADDR_FLG() {
		return CUST_CORR_ADDR_FLG;
	}

	public void setCUST_CORR_ADDR_FLG(String cUST_CORR_ADDR_FLG) {
		CUST_CORR_ADDR_FLG = cUST_CORR_ADDR_FLG;
	}

	public String getCUST_PHY_POST_BOX_NO() {
		return CUST_PHY_POST_BOX_NO;
	}

	public void setCUST_PHY_POST_BOX_NO(String cUST_PHY_POST_BOX_NO) {
		CUST_PHY_POST_BOX_NO = cUST_PHY_POST_BOX_NO;
	}

	public Double getCUST_CORR_OFFICE_PHONE1() {
		return CUST_CORR_OFFICE_PHONE1;
	}

	public void setCUST_CORR_OFFICE_PHONE1(Double cUST_CORR_OFFICE_PHONE1) {
		CUST_CORR_OFFICE_PHONE1 = cUST_CORR_OFFICE_PHONE1;
	}

	public String getCUST_CORR_MOB_AREA_CODE2() {
		return CUST_CORR_MOB_AREA_CODE2;
	}

	public void setCUST_CORR_MOB_AREA_CODE2(String cUST_CORR_MOB_AREA_CODE2) {
		CUST_CORR_MOB_AREA_CODE2 = cUST_CORR_MOB_AREA_CODE2;
	}

	public Double getCUST_OFFICE_PHONE2() {
		return CUST_OFFICE_PHONE2;
	}

	public void setCUST_OFFICE_PHONE2(Double cUST_OFFICE_PHONE2) {
		CUST_OFFICE_PHONE2 = cUST_OFFICE_PHONE2;
	}

	public String getCUST_CORR_COUNTRY_CODE() {
		return CUST_CORR_COUNTRY_CODE;
	}

	public void setCUST_CORR_COUNTRY_CODE(String cUST_CORR_COUNTRY_CODE) {
		CUST_CORR_COUNTRY_CODE = cUST_CORR_COUNTRY_CODE;
	}

	public String getCUST_PHY_COUNTRY_CODE() {
		return CUST_PHY_COUNTRY_CODE;
	}

	public void setCUST_PHY_COUNTRY_CODE(String cUST_PHY_COUNTRY_CODE) {
		CUST_PHY_COUNTRY_CODE = cUST_PHY_COUNTRY_CODE;
	}

	public String getCUST_CORR_STATE_CODE() {
		return CUST_CORR_STATE_CODE;
	}

	public void setCUST_CORR_STATE_CODE(String cUST_CORR_STATE_CODE) {
		CUST_CORR_STATE_CODE = cUST_CORR_STATE_CODE;
	}

	public String getCUST_CORR_STATE() {
		return CUST_CORR_STATE;
	}

	public void setCUST_CORR_STATE(String cUST_CORR_STATE) {
		CUST_CORR_STATE = cUST_CORR_STATE;
	}

	public String getCUST_PHY_STATE_CODE() {
		return CUST_PHY_STATE_CODE;
	}

	public void setCUST_PHY_STATE_CODE(String cUST_PHY_STATE_CODE) {
		CUST_PHY_STATE_CODE = cUST_PHY_STATE_CODE;
	}

	public String getCUST_CORR_CITY() {
		return CUST_CORR_CITY;
	}

	public void setCUST_CORR_CITY(String cUST_CORR_CITY) {
		CUST_CORR_CITY = cUST_CORR_CITY;
	}

	public String getCUST_PHY_CITY() {
		return CUST_PHY_CITY;
	}

	public void setCUST_PHY_CITY(String cUST_PHY_CITY) {
		CUST_PHY_CITY = cUST_PHY_CITY;
	}

	public String getCUST_ADMIN() {
		return CUST_ADMIN;
	}

	public void setCUST_ADMIN(String cUST_ADMIN) {
		CUST_ADMIN = cUST_ADMIN;
	}

	public String getCUST_UPDATE() {
		return CUST_UPDATE;
	}

	public void setCUST_UPDATE(String cUST_UPDATE) {
		CUST_UPDATE = cUST_UPDATE;
	}

	public String getCUST_AUTH_PERSON() {
		return CUST_AUTH_PERSON;
	}

	public void setCUST_AUTH_PERSON(String cUST_AUTH_PERSON) {
		CUST_AUTH_PERSON = cUST_AUTH_PERSON;
	}

	public String getCUST_DESIG() {
		return CUST_DESIG;
	}

	public void setCUST_DESIG(String cUST_DESIG) {
		CUST_DESIG = cUST_DESIG;
	}

	public Date getCUST_CONTRACT_DT() {
		return CUST_CONTRACT_DT;
	}

	public void setCUST_CONTRACT_DT(Date cUST_CONTRACT_DT) {
		CUST_CONTRACT_DT = cUST_CONTRACT_DT;
	}

	public String getCUST_SIGNED_CONT_YN() {
		return CUST_SIGNED_CONT_YN;
	}

	public void setCUST_SIGNED_CONT_YN(String cUST_SIGNED_CONT_YN) {
		CUST_SIGNED_CONT_YN = cUST_SIGNED_CONT_YN;
	}

	public String getCUST_SIGNED_CONT1_YN() {
		return CUST_SIGNED_CONT1_YN;
	}

	public void setCUST_SIGNED_CONT1_YN(String cUST_SIGNED_CONT1_YN) {
		CUST_SIGNED_CONT1_YN = cUST_SIGNED_CONT1_YN;
	}

	public String getCUST_SIGNED_CONT2_YN() {
		return CUST_SIGNED_CONT2_YN;
	}

	public void setCUST_SIGNED_CONT2_YN(String cUST_SIGNED_CONT2_YN) {
		CUST_SIGNED_CONT2_YN = cUST_SIGNED_CONT2_YN;
	}

	public String getCUST_AUTH_PERSON_BL() {
		return CUST_AUTH_PERSON_BL;
	}

	public void setCUST_AUTH_PERSON_BL(String cUST_AUTH_PERSON_BL) {
		CUST_AUTH_PERSON_BL = cUST_AUTH_PERSON_BL;
	}

	public String getCUST_DESIG_BL() {
		return CUST_DESIG_BL;
	}

	public void setCUST_DESIG_BL(String cUST_DESIG_BL) {
		CUST_DESIG_BL = cUST_DESIG_BL;
	}

	public String getCUST_ADDR4() {
		return CUST_ADDR4;
	}

	public void setCUST_ADDR4(String cUST_ADDR4) {
		CUST_ADDR4 = cUST_ADDR4;
	}

	public String getCUST_PHY_ADDR4() {
		return CUST_PHY_ADDR4;
	}

	public void setCUST_PHY_ADDR4(String cUST_PHY_ADDR4) {
		CUST_PHY_ADDR4 = cUST_PHY_ADDR4;
	}

	public String getCUST_NATURE_OF_WORK() {
		return CUST_NATURE_OF_WORK;
	}

	public void setCUST_NATURE_OF_WORK(String cUST_NATURE_OF_WORK) {
		CUST_NATURE_OF_WORK = cUST_NATURE_OF_WORK;
	}

	public String getCUST_PHY_STATE() {
		return CUST_PHY_STATE;
	}

	public void setCUST_PHY_STATE(String cUST_PHY_STATE) {
		CUST_PHY_STATE = cUST_PHY_STATE;
	}

	public String getCUST_VAT_CAT() {
		return CUST_VAT_CAT;
	}

	public void setCUST_VAT_CAT(String cUST_VAT_CAT) {
		CUST_VAT_CAT = cUST_VAT_CAT;
	}

	public String getCUST_BILL_YN() {
		return CUST_BILL_YN;
	}

	public void setCUST_BILL_YN(String cUST_BILL_YN) {
		CUST_BILL_YN = cUST_BILL_YN;
	}

	public String getCUST_WHT_YN() {
		return CUST_WHT_YN;
	}

	public void setCUST_WHT_YN(String cUST_WHT_YN) {
		CUST_WHT_YN = cUST_WHT_YN;
	}

	public String getCUST_AGENT_RANK_CODE_DESC() {
		return CUST_AGENT_RANK_CODE_DESC;
	}

	public void setCUST_AGENT_RANK_CODE_DESC(String cUST_AGENT_RANK_CODE_DESC) {
		CUST_AGENT_RANK_CODE_DESC = cUST_AGENT_RANK_CODE_DESC;
	}

	public String getCUST_COMP_CODE() {
		return CUST_COMP_CODE;
	}

	public void setCUST_COMP_CODE(String cUST_COMP_CODE) {
		CUST_COMP_CODE = cUST_COMP_CODE;
	}

	public String getCUST_BIRTH_PLACE() {
		return CUST_BIRTH_PLACE;
	}

	public void setCUST_BIRTH_PLACE(String cUST_BIRTH_PLACE) {
		CUST_BIRTH_PLACE = cUST_BIRTH_PLACE;
	}

}

