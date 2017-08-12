package com.sample.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RspMsg {
	@JsonProperty(" BANK_ID")
	private String sign;
	@JsonProperty(" BANK_ID")
	private String retCode;
	@JsonProperty(" BANK_ID")
	private String signType;
	@JsonProperty(" BANK_ID")
	private String retMsg;

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSign() {
		return this.sign;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetCode() {
		return this.retCode;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getSignType() {
		return this.signType;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

	public String getRetMsg() {
		return this.retMsg;
	}

}
