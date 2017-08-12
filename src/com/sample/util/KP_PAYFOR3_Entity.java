package com.sample.util;

import java.util.*;
import java.sql.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class KP_PAYFOR3_Entity {
	private static ObjectMapper mapper = new ObjectMapper();
	static {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		mapper.setDateFormat(dateFormat);
	}
	@JsonProperty(" PAYFOR_ID")
	public int PAYFOR_ID;// ID;
	@JsonProperty(" MERCHANT_ID")
	public String MERCHANT_ID;// 商户ID;
	@JsonProperty(" APP_ID")
	public String APP_ID;// 应用APPID;
	@JsonProperty(" TOTAL_FEE")
	public int TOTAL_FEE;// 请求代付金额;
	@JsonProperty(" ACCOUNT_NAME")
	public String ACCOUNT_NAME;// 开户人姓名;
	@JsonProperty(" ACCOUNT_NO")
	public String ACCOUNT_NO;// 开户人账户;
	@JsonProperty(" BANKBRANCH")
	public String BANKBRANCH;// 支行名称;
	@JsonProperty(" BANKCODE")
	public String BANKCODE;// 联行号;
	@JsonProperty(" BANKADDRESS")
	public String BANKADDRESS;// 支行地址;
	@JsonProperty(" BANKTYPE")
	public String BANKTYPE;// 结算账户性质 0：对私 1： 对公;
	@JsonProperty(" REMARK")
	public String REMARK;// 备注;
	@JsonProperty(" MERCHANT_ORDER_NO")
	public String MERCHANT_ORDER_NO;// 商户订单号;
	@JsonProperty(" CHANNEL")
	public int CHANNEL;// 通道号;

	public void setPAYFOR_ID(int PAYFOR_ID) {
		this.PAYFOR_ID = PAYFOR_ID;
	}

	public int getPAYFOR_ID() {
		return PAYFOR_ID;
	}

	public void setMERCHANT_ID(String MERCHANT_ID) {
		if (MERCHANT_ID == null) {
			MERCHANT_ID = "";
		}
		this.MERCHANT_ID = MERCHANT_ID;
	}

	public String getMERCHANT_ID() {
		return MERCHANT_ID;
	}

	public void setAPP_ID(String APP_ID) {
		if (APP_ID == null) {
			APP_ID = "";
		}
		this.APP_ID = APP_ID;
	}

	public String getAPP_ID() {
		return APP_ID;
	}

	public void setTOTAL_FEE(int TOTAL_FEE) {
		this.TOTAL_FEE = TOTAL_FEE;
	}

	public int getTOTAL_FEE() {
		return TOTAL_FEE;
	}

	public void setACCOUNT_NAME(String ACCOUNT_NAME) {
		if (ACCOUNT_NAME == null) {
			ACCOUNT_NAME = "";
		}
		this.ACCOUNT_NAME = ACCOUNT_NAME;
	}

	public String getACCOUNT_NAME() {
		return ACCOUNT_NAME;
	}

	public void setACCOUNT_NO(String ACCOUNT_NO) {
		if (ACCOUNT_NO == null) {
			ACCOUNT_NO = "";
		}
		this.ACCOUNT_NO = ACCOUNT_NO;
	}

	public String getACCOUNT_NO() {
		return ACCOUNT_NO;
	}

	public void setBANKBRANCH(String BANKBRANCH) {
		if (BANKBRANCH == null) {
			BANKBRANCH = "";
		}
		this.BANKBRANCH = BANKBRANCH;
	}

	public String getBANKBRANCH() {
		return BANKBRANCH;
	}

	public void setBANKCODE(String BANKCODE) {
		if (BANKCODE == null) {
			BANKCODE = "";
		}
		this.BANKCODE = BANKCODE;
	}

	public String getBANKCODE() {
		return BANKCODE;
	}

	public void setBANKADDRESS(String BANKADDRESS) {
		if (BANKADDRESS == null) {
			BANKADDRESS = "";
		}
		this.BANKADDRESS = BANKADDRESS;
	}

	public String getBANKADDRESS() {
		return BANKADDRESS;
	}

	public void setBANKTYPE(String BANKTYPE) {
		if (BANKTYPE == null) {
			BANKTYPE = "";
		}
		this.BANKTYPE = BANKTYPE;
	}

	public String getBANKTYPE() {
		return BANKTYPE;
	}

	public void setREMARK(String REMARK) {
		if (REMARK == null) {
			REMARK = "";
		}
		this.REMARK = REMARK;
	}

	public String getREMARK() {
		return REMARK;
	}

	public void setMERCHANT_ORDER_NO(String MERCHANT_ORDER_NO) {
		if (MERCHANT_ORDER_NO == null) {
			MERCHANT_ORDER_NO = "";
		}
		this.MERCHANT_ORDER_NO = MERCHANT_ORDER_NO;
	}

	public String getMERCHANT_ORDER_NO() {
		return MERCHANT_ORDER_NO;
	}

	public void setCHANNEL(int CHANNEL) {
		this.CHANNEL = CHANNEL;
	}

	public int getCHANNEL() {
		return CHANNEL;
	}

	public String toJson() throws JsonGenerationException, JsonMappingException, IOException {
		return mapper.writeValueAsString(this);
	}

	public static KP_PAYFOR3_Entity fromJson(String json) throws JsonParseException, JsonMappingException, IOException {
		if (json == null) {
			return null;
		} else {
			return mapper.readValue(json, KP_PAYFOR3_Entity.class);
		}
	}
}
