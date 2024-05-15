package com.aic.base.commonUtils;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lm_customer")
public class LM_CUSTOMER {

	@Id
	@Column(name = "cust_code")
	private String custCode;

	@Column(name = "cust_class")
	private String cust_class;

	@Column(name = "cust_type")
	private String cust_type;

	@Column(name = "cust_name")
	private String cust_name;

	@Column(name = "cust_short_name")
	private String cust_short_name;

	@Column(name = "cust_dob")
	private LocalDateTime cust_dob;

	@Column(name = "cust_catg_code")
	private String cust_catg_code;

	@Column(name = "cust_addr1")
	private String cust_addr1;

	@Column(name = "cust_addr2")
	private String cust_addr2;

	@Column(name = "cust_addr3")
	private String cust_addr3;

	@Column(name = "cust_contact")
	private String cust_contact;

	@Column(name = "cust_phone")
	private String cust_phone;

	@Column(name = "cust_city")
	private String cust_city;

	@Column(name = "cust_country")
	private String cust_country;

	@Column(name = "cust_mar_status")
	private String cust_mar_status;

	@Column(name = "cust_salutation")
	private String cust_salutation;

	@Column(name = "cust_ml_name")
	private String cust_ml_name;

	@Column(name = "cust_ml_short_name")
	private String cust_ml_short_name;

	@Column(name = "cust_ml_addr1")
	private String cust_ml_addr1;

	@Column(name = "cust_ml_addr2")
	private String cust_ml_addr2;

	@Column(name = "cust_ml_addr3")
	private String cust_ml_addr3;

	@Column(name = "cust_ml_contact")
	private String cust_ml_contact;

	@Column(name = "cust_ml_phone")
	private String cust_ml_phone;

	@Column(name = "cust_ml_city")
	private String cust_ml_city;

	@Column(name = "cust_ml_country")
	private String cust_ml_country;

	@Column(name = "cust_frz_flag")
	private String cust_frz_flag;

	@Column(name = "cust_ins_dt")
	private LocalDateTime cust_ins_dt;

	@Column(name = "cust_ins_id")
	private String cust_ins_id;

	@Column(name = "cust_mod_dt")
	private LocalDateTime cust_mod_dt;

	@Column(name = "cust_mod_id")
	private String cust_mod_id;

	@Column(name = "cust_national_id")
	private String cust_national_id;

	@Column(name = "cust_credit_days")
	private Double cust_credit_days;

	@Column(name = "cust_occupation")
	private String cust_occupation;

	@Column(name = "cust_mobile_no")
	private String cust_mobile_no;

	@Column(name = "cust_qualfn")
	private String cust_qualfn;

	@Column(name = "cust_eff_fm_dt")
	private LocalDateTime cust_eff_fm_dt;

	@Column(name = "cust_eff_to_dt")
	private LocalDateTime cust_eff_to_dt;

	@Column(name = "cust_agency_name")
	private String cust_agency_name;

	@Column(name = "cust_agent_rank_code")
	private String cust_agent_rank_code;

	@Column(name = "cust_lcn_no")
	private String cust_lcn_no;

	@Column(name = "cust_lic_start_dt")
	private LocalDateTime cust_lic_start_dt;

	@Column(name = "cust_lic_end_dt")
	private LocalDateTime cust_lic_end_dt;

	@Column(name = "cust_lcn_reg_dt")
	private LocalDateTime cust_lcn_reg_dt;

	@Column(name = "cust_lcn_status")
	private String cust_lcn_status;

	@Column(name = "cust_spouse_name")
	private String cust_spouse_name;

	@Column(name = "cust_status")
	private String cust_status;

	@Column(name = "cust_flex_01")
	private String cust_flex_01;

	@Column(name = "cust_flex_02")
	private String cust_flex_02;

	@Column(name = "cust_flex_03")
	private String cust_flex_03;

	@Column(name = "cust_flex_04")
	private String cust_flex_04;

	@Column(name = "cust_flex_05")
	private String cust_flex_05;

	@Column(name = "cust_flex_06")
	private String cust_flex_06;

	@Column(name = "cust_flex_07")
	private String cust_flex_07;

	@Column(name = "cust_flex_08")
	private String cust_flex_08;

	@Column(name = "cust_flex_09")
	private String cust_flex_09;

	@Column(name = "cust_flex_10")
	private String cust_flex_10;

	@Column(name = "cust_employer_code")
	private String cust_employer_code;

	@Column(name = "cust_comp_code")
	private String cust_comp_code;

	@Column(name = "CUST_FIRST_NAME")
	private String CUST_FIRST_NAME;

	@Column(name = "CUST_MIDDLE_NAME")
	private String CUST_MIDDLE_NAME;

	@Column(name = "CUST_SUR_NAME")
	private String CUST_SUR_NAME;

	@Column(name = "CUST_PHY_ADDR1")
	private String CUST_PHY_ADDR1;

	@Column(name = "CUST_PHY_ADDR2")
	private String CUST_PHY_ADDR2;

	@Column(name = "CUST_PHY_ADDR3")
	private String CUST_PHY_ADDR3;

	@Column(name = "CUST_PHY_PHONE")
	private String CUST_PHY_PHONE;

	@Column(name = "CUST_PHY_CONTACT")
	private String CUST_PHY_CONTACT;

	@Column(name = "CUST_PHY_CONTACT2")
	private String CUST_PHY_CONTACT2;

	@Column(name = "CUST_PHY_FAX")
	private String CUST_PHY_FAX;

	@Column(name = "CUST_PHY_AREA")
	private String CUST_PHY_AREA;

	@Column(name = "CUST_PHY_REGION")
	private String CUST_PHY_REGION;

	@Column(name = "CUST_PHY_COUNTRY")
	private String CUST_PHY_COUNTRY;

	@Column(name = "CUST_CONTACT2")
	private String CUST_CONTACT2;

	@Column(name = "CUST_CONTACT3")
	private String CUST_CONTACT3;

	@Column(name = "CUST_CLM_CONTACT")
	private String CUST_CLM_CONTACT;

	@Column(name = "CUST_ACNT_CONTACT")
	private String CUST_ACNT_CONTACT;

	@Column(name = "CUST_CONTACT1_LIC_NO")
	private String CUST_CONTACT1_LIC_NO;

	@Column(name = "CUST_CONTACT2_LIC_NO")
	private String CUST_CONTACT2_LIC_NO;

	@Column(name = "CUST_CONTACT3_LIC_NO")
	private String CUST_CONTACT3_LIC_NO;

	@Column(name = "CUST_CLM_CONTACT_LIC_NO")
	private String CUST_CLM_CONTACT_LIC_NO;

	@Column(name = "CUST_ACNT_CONTACT_LIC_NO")
	private String CUST_ACNT_CONTACT_LIC_NO;

	@Column(name="CUST_ID_TYPE")
	private String CUST_ID_TYPE;
	
	@Column(name="CUST_REF_ID1")
	private String CUST_REF_ID1;
	
	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getCust_class() {
		return cust_class;
	}

	public void setCust_class(String cust_class) {
		this.cust_class = cust_class;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_short_name() {
		return cust_short_name;
	}

	public void setCust_short_name(String cust_short_name) {
		this.cust_short_name = cust_short_name;
	}

	public LocalDateTime getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(LocalDateTime cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_catg_code() {
		return cust_catg_code;
	}

	public void setCust_catg_code(String cust_catg_code) {
		this.cust_catg_code = cust_catg_code;
	}

	public String getCust_addr1() {
		return cust_addr1;
	}

	public void setCust_addr1(String cust_addr1) {
		this.cust_addr1 = cust_addr1;
	}

	public String getCust_addr2() {
		return cust_addr2;
	}

	public void setCust_addr2(String cust_addr2) {
		this.cust_addr2 = cust_addr2;
	}

	public String getCust_addr3() {
		return cust_addr3;
	}

	public void setCust_addr3(String cust_addr3) {
		this.cust_addr3 = cust_addr3;
	}

	public String getCust_contact() {
		return cust_contact;
	}

	public void setCust_contact(String cust_contact) {
		this.cust_contact = cust_contact;
	}

	public String getCust_phone() {
		return cust_phone;
	}

	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	public String getCust_country() {
		return cust_country;
	}

	public void setCust_country(String cust_country) {
		this.cust_country = cust_country;
	}

	public String getCust_mar_status() {
		return cust_mar_status;
	}

	public void setCust_mar_status(String cust_mar_status) {
		this.cust_mar_status = cust_mar_status;
	}

	public String getCust_salutation() {
		return cust_salutation;
	}

	public void setCust_salutation(String cust_salutation) {
		this.cust_salutation = cust_salutation;
	}

	public String getCust_ml_name() {
		return cust_ml_name;
	}

	public void setCust_ml_name(String cust_ml_name) {
		this.cust_ml_name = cust_ml_name;
	}

	public String getCust_ml_short_name() {
		return cust_ml_short_name;
	}

	public void setCust_ml_short_name(String cust_ml_short_name) {
		this.cust_ml_short_name = cust_ml_short_name;
	}

	public String getCust_ml_addr1() {
		return cust_ml_addr1;
	}

	public void setCust_ml_addr1(String cust_ml_addr1) {
		this.cust_ml_addr1 = cust_ml_addr1;
	}

	public String getCust_ml_addr2() {
		return cust_ml_addr2;
	}

	public void setCust_ml_addr2(String cust_ml_addr2) {
		this.cust_ml_addr2 = cust_ml_addr2;
	}

	public String getCust_ml_addr3() {
		return cust_ml_addr3;
	}

	public void setCust_ml_addr3(String cust_ml_addr3) {
		this.cust_ml_addr3 = cust_ml_addr3;
	}

	public String getCust_ml_contact() {
		return cust_ml_contact;
	}

	public void setCust_ml_contact(String cust_ml_contact) {
		this.cust_ml_contact = cust_ml_contact;
	}

	public String getCust_ml_phone() {
		return cust_ml_phone;
	}

	public void setCust_ml_phone(String cust_ml_phone) {
		this.cust_ml_phone = cust_ml_phone;
	}

	public String getCust_ml_city() {
		return cust_ml_city;
	}

	public void setCust_ml_city(String cust_ml_city) {
		this.cust_ml_city = cust_ml_city;
	}

	public String getCust_ml_country() {
		return cust_ml_country;
	}

	public void setCust_ml_country(String cust_ml_country) {
		this.cust_ml_country = cust_ml_country;
	}

	public String getCust_frz_flag() {
		return cust_frz_flag;
	}

	public void setCust_frz_flag(String cust_frz_flag) {
		this.cust_frz_flag = cust_frz_flag;
	}

	public LocalDateTime getCust_ins_dt() {
		return cust_ins_dt;
	}

	public void setCust_ins_dt(LocalDateTime cust_ins_dt) {
		this.cust_ins_dt = cust_ins_dt;
	}

	public String getCust_ins_id() {
		return cust_ins_id;
	}

	public void setCust_ins_id(String cust_ins_id) {
		this.cust_ins_id = cust_ins_id;
	}

	public LocalDateTime getCust_mod_dt() {
		return cust_mod_dt;
	}

	public void setCust_mod_dt(LocalDateTime cust_mod_dt) {
		this.cust_mod_dt = cust_mod_dt;
	}

	public String getCust_mod_id() {
		return cust_mod_id;
	}

	public void setCust_mod_id(String cust_mod_id) {
		this.cust_mod_id = cust_mod_id;
	}

	public String getCust_national_id() {
		return cust_national_id;
	}

	public void setCust_national_id(String cust_national_id) {
		this.cust_national_id = cust_national_id;
	}

	

	public Double getCust_credit_days() {
		return cust_credit_days;
	}

	public void setCust_credit_days(Double cust_credit_days) {
		this.cust_credit_days = cust_credit_days;
	}

	public String getCust_occupation() {
		return cust_occupation;
	}

	public void setCust_occupation(String cust_occupation) {
		this.cust_occupation = cust_occupation;
	}

	public String getCust_mobile_no() {
		return cust_mobile_no;
	}

	public void setCust_mobile_no(String cust_mobile_no) {
		this.cust_mobile_no = cust_mobile_no;
	}

	public String getCust_qualfn() {
		return cust_qualfn;
	}

	public void setCust_qualfn(String cust_qualfn) {
		this.cust_qualfn = cust_qualfn;
	}

	public LocalDateTime getCust_eff_fm_dt() {
		return cust_eff_fm_dt;
	}

	public void setCust_eff_fm_dt(LocalDateTime cust_eff_fm_dt) {
		this.cust_eff_fm_dt = cust_eff_fm_dt;
	}

	public LocalDateTime getCust_eff_to_dt() {
		return cust_eff_to_dt;
	}

	public void setCust_eff_to_dt(LocalDateTime cust_eff_to_dt) {
		this.cust_eff_to_dt = cust_eff_to_dt;
	}

	public String getCust_agency_name() {
		return cust_agency_name;
	}

	public void setCust_agency_name(String cust_agency_name) {
		this.cust_agency_name = cust_agency_name;
	}

	public String getCust_agent_rank_code() {
		return cust_agent_rank_code;
	}

	public void setCust_agent_rank_code(String cust_agent_rank_code) {
		this.cust_agent_rank_code = cust_agent_rank_code;
	}

	public String getCust_lcn_no() {
		return cust_lcn_no;
	}

	public void setCust_lcn_no(String cust_lcn_no) {
		this.cust_lcn_no = cust_lcn_no;
	}

	public LocalDateTime getCust_lic_start_dt() {
		return cust_lic_start_dt;
	}

	public void setCust_lic_start_dt(LocalDateTime cust_lic_start_dt) {
		this.cust_lic_start_dt = cust_lic_start_dt;
	}

	public LocalDateTime getCust_lic_end_dt() {
		return cust_lic_end_dt;
	}

	public void setCust_lic_end_dt(LocalDateTime cust_lic_end_dt) {
		this.cust_lic_end_dt = cust_lic_end_dt;
	}

	public LocalDateTime getCust_lcn_reg_dt() {
		return cust_lcn_reg_dt;
	}

	public void setCust_lcn_reg_dt(LocalDateTime cust_lcn_reg_dt) {
		this.cust_lcn_reg_dt = cust_lcn_reg_dt;
	}

	public String getCust_lcn_status() {
		return cust_lcn_status;
	}

	public void setCust_lcn_status(String cust_lcn_status) {
		this.cust_lcn_status = cust_lcn_status;
	}

	public String getCust_spouse_name() {
		return cust_spouse_name;
	}

	public void setCust_spouse_name(String cust_spouse_name) {
		this.cust_spouse_name = cust_spouse_name;
	}

	public String getCust_status() {
		return cust_status;
	}

	public void setCust_status(String cust_status) {
		this.cust_status = cust_status;
	}

	public String getCust_flex_01() {
		return cust_flex_01;
	}

	public void setCust_flex_01(String cust_flex_01) {
		this.cust_flex_01 = cust_flex_01;
	}

	public String getCust_flex_02() {
		return cust_flex_02;
	}

	public void setCust_flex_02(String cust_flex_02) {
		this.cust_flex_02 = cust_flex_02;
	}

	public String getCust_flex_03() {
		return cust_flex_03;
	}

	public void setCust_flex_03(String cust_flex_03) {
		this.cust_flex_03 = cust_flex_03;
	}

	public String getCust_flex_04() {
		return cust_flex_04;
	}

	public void setCust_flex_04(String cust_flex_04) {
		this.cust_flex_04 = cust_flex_04;
	}

	public String getCust_flex_05() {
		return cust_flex_05;
	}

	public void setCust_flex_05(String cust_flex_05) {
		this.cust_flex_05 = cust_flex_05;
	}

	public String getCust_flex_06() {
		return cust_flex_06;
	}

	public void setCust_flex_06(String cust_flex_06) {
		this.cust_flex_06 = cust_flex_06;
	}

	public String getCust_flex_07() {
		return cust_flex_07;
	}

	public void setCust_flex_07(String cust_flex_07) {
		this.cust_flex_07 = cust_flex_07;
	}

	public String getCust_flex_08() {
		return cust_flex_08;
	}

	public void setCust_flex_08(String cust_flex_08) {
		this.cust_flex_08 = cust_flex_08;
	}

	public String getCust_flex_09() {
		return cust_flex_09;
	}

	public void setCust_flex_09(String cust_flex_09) {
		this.cust_flex_09 = cust_flex_09;
	}

	public String getCust_flex_10() {
		return cust_flex_10;
	}

	public void setCust_flex_10(String cust_flex_10) {
		this.cust_flex_10 = cust_flex_10;
	}

	public String getCust_employer_code() {
		return cust_employer_code;
	}

	public void setCust_employer_code(String cust_employer_code) {
		this.cust_employer_code = cust_employer_code;
	}

	public String getCust_comp_code() {
		return cust_comp_code;
	}

	public void setCust_comp_code(String cust_comp_code) {
		this.cust_comp_code = cust_comp_code;
	}

	public String getCUST_FIRST_NAME() {
		return CUST_FIRST_NAME;
	}

	public void setCUST_FIRST_NAME(String cUST_FIRST_NAME) {
		CUST_FIRST_NAME = cUST_FIRST_NAME;
	}

	public String getCUST_MIDDLE_NAME() {
		return CUST_MIDDLE_NAME;
	}

	public void setCUST_MIDDLE_NAME(String cUST_MIDDLE_NAME) {
		CUST_MIDDLE_NAME = cUST_MIDDLE_NAME;
	}

	public String getCUST_SUR_NAME() {
		return CUST_SUR_NAME;
	}

	public void setCUST_SUR_NAME(String cUST_SUR_NAME) {
		CUST_SUR_NAME = cUST_SUR_NAME;
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

	public String getCUST_PHY_PHONE() {
		return CUST_PHY_PHONE;
	}

	public void setCUST_PHY_PHONE(String cUST_PHY_PHONE) {
		CUST_PHY_PHONE = cUST_PHY_PHONE;
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

	public String getCUST_CONTACT2() {
		return CUST_CONTACT2;
	}

	public void setCUST_CONTACT2(String cUST_CONTACT2) {
		CUST_CONTACT2 = cUST_CONTACT2;
	}

	public String getCUST_CONTACT3() {
		return CUST_CONTACT3;
	}

	public void setCUST_CONTACT3(String cUST_CONTACT3) {
		CUST_CONTACT3 = cUST_CONTACT3;
	}

	public String getCUST_CLM_CONTACT() {
		return CUST_CLM_CONTACT;
	}

	public void setCUST_CLM_CONTACT(String cUST_CLM_CONTACT) {
		CUST_CLM_CONTACT = cUST_CLM_CONTACT;
	}

	public String getCUST_ACNT_CONTACT() {
		return CUST_ACNT_CONTACT;
	}

	public void setCUST_ACNT_CONTACT(String cUST_ACNT_CONTACT) {
		CUST_ACNT_CONTACT = cUST_ACNT_CONTACT;
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

	public String getCUST_CLM_CONTACT_LIC_NO() {
		return CUST_CLM_CONTACT_LIC_NO;
	}

	public void setCUST_CLM_CONTACT_LIC_NO(String cUST_CLM_CONTACT_LIC_NO) {
		CUST_CLM_CONTACT_LIC_NO = cUST_CLM_CONTACT_LIC_NO;
	}

	public String getCUST_ACNT_CONTACT_LIC_NO() {
		return CUST_ACNT_CONTACT_LIC_NO;
	}

	public void setCUST_ACNT_CONTACT_LIC_NO(String cUST_ACNT_CONTACT_LIC_NO) {
		CUST_ACNT_CONTACT_LIC_NO = cUST_ACNT_CONTACT_LIC_NO;
	}

	public String getCUST_ID_TYPE() {
		return CUST_ID_TYPE;
	}

	public void setCUST_ID_TYPE(String cUST_ID_TYPE) {
		CUST_ID_TYPE = cUST_ID_TYPE;
	}

	public String getCUST_REF_ID1() {
		return CUST_REF_ID1;
	}

	public void setCUST_REF_ID1(String cUST_REF_ID1) {
		CUST_REF_ID1 = cUST_REF_ID1;
	}
	
	

}
