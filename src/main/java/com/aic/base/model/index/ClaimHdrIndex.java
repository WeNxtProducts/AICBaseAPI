package com.aic.base.model.index;

import java.util.Date;

import org.elasticsearch.core.Nullable;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonProperty;


@Document(indexName = "claimheader")
public class ClaimHdrIndex {

    @JsonProperty("ID")
    @Nullable
    private Integer ID;

    @JsonProperty("Claim_Type")
    @Nullable
    private String Claim_Type;

    @JsonProperty("Claim_Basis")
    @Nullable
    private String Claim_Basis;

    @JsonProperty("Loss_Date")
    @Nullable
    private Date Loss_Date;

    @JsonProperty("Intimation_Date")
    @Nullable
    private Date Intimation_Date;

    @JsonProperty("Basis_Value")
    @Nullable
    private String Basis_Value;

    @JsonProperty("CH_INS_DT")
    @Nullable
    private Date CH_INS_DT;

//    @JsonProperty("CH_INS_ID")
//    @Nullable
//    private String CH_INS_ID;

    @JsonProperty("Status")
    @Nullable
    private String Status;

//    @JsonProperty("CH_STATUS_DT")
//    @Nullable
//    private Date CH_STATUS_DT;

    @JsonProperty("Reference_No")
    @Nullable
    private String Reference_No;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getClaim_Type() {
		return Claim_Type;
	}

	public void setClaim_Type(String claim_Type) {
		Claim_Type = claim_Type;
	}

	public String getClaim_Basis() {
		return Claim_Basis;
	}

	public void setClaim_Basis(String claim_Basis) {
		Claim_Basis = claim_Basis;
	}

	public Date getLoss_Date() {
		return Loss_Date;
	}

	public void setLoss_Date(Date loss_Date) {
		Loss_Date = loss_Date;
	}

	public Date getIntimation_Date() {
		return Intimation_Date;
	}

	public void setIntimation_Date(Date intimation_Date) {
		Intimation_Date = intimation_Date;
	}

	public String getBasis_Value() {
		return Basis_Value;
	}

	public void setBasis_Value(String basis_Value) {
		Basis_Value = basis_Value;
	}

	public Date getCH_INS_DT() {
		return CH_INS_DT;
	}

	public void setCH_INS_DT(Date cH_INS_DT) {
		CH_INS_DT = cH_INS_DT;
	}
//
//	public String getCH_INS_ID() {
//		return CH_INS_ID;
//	}
//
//	public void setCH_INS_ID(String cH_INS_ID) {
//		CH_INS_ID = cH_INS_ID;
//	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

//	public Date getCH_STATUS_DT() {
//		return CH_STATUS_DT;
//	}
//
//	public void setCH_STATUS_DT(Date cH_STATUS_DT) {
//		CH_STATUS_DT = cH_STATUS_DT;
//	}

	public String getReference_No() {
		return Reference_No;
	}

	public void setReference_No(String reference_No) {
		Reference_No = reference_No;
	}

}