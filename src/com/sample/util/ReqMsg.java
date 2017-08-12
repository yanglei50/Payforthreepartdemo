package com.sample.util;

public class ReqMsg {
	private String termNo;// 终端号
	private String merNo;// 商户号
	private String signType;// 签名类型 MD5
	private String sign;// 数据的签名字符串
	private String charset;// 系统之间交互信息时使用的编码字符集 通常默认使用 UTF-8
	private String timestamp;// 请 求 系 统 时 间 格 式 ：yyyyMMddHHmmss
	private String version;// 接口程序版本，目前是 1.0

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
