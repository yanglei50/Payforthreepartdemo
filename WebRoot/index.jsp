<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.sample.util.*"%>
<%@page import="org.apache.commons.codec.binary.Base64"%>
<%@page import="com.sample.util.*"%>
<%@page import="net.sf.json.JSONArray"%>
<%@page import="net.sf.json.JSONObject"%>
<%
	try {
//		String url = "https://df.kehanpay.com/Payforward/payfor";
		String url = "http://localhost:6000/Payforward/payfor";
		String keystr = "123456789012345678901234";//24位
		/*			String username = "贵军";
		String AccountNo = "6226228900553886";*/

	String username = "杨磊";
		String AccountNo = "6226090104107582";
		String JSONStr = "";
		String js_str = "";
		//ArrayList<KP_PAYFOR3_Entity> entity_list = new ArrayList();
		js_str += "[";
		for (int i = 0; i < 2; i++) {
			KP_PAYFOR3_Entity payfor_entity = new KP_PAYFOR3_Entity();
			payfor_entity.setMERCHANT_ID("MC_877940764183629824");// 商户ID;
			payfor_entity.setAPP_ID("17710116299");// 应用APPID;
			payfor_entity.setTOTAL_FEE(1);// 请求代付金额;

			byte[] keybyte_3d = keystr.getBytes();//key for 3ds

			String username_1 = EncryptUtil.DataEncrypt(keybyte_3d, username);
			payfor_entity.setACCOUNT_NAME(username_1);//bytep[]转换为String
			System.out.println(
					payfor_entity.getACCOUNT_NAME() + "---" + payfor_entity.getACCOUNT_NAME().length());

			String AccountNo_1 = EncryptUtil.DataEncrypt(keybyte_3d, AccountNo);
			payfor_entity.setACCOUNT_NO(AccountNo_1);//bytep[]转换为String// 开户人账户;
/*			payfor_entity.setBANKBRANCH("中国民生银行东莞分行");// 支行名称;
			payfor_entity.setBANKCODE("308100005027");// 联行号;
			payfor_entity.setBANKADDRESS("莞太路63号鸿福广场首层");// 支行地址;*/
			payfor_entity.setBANKBRANCH("招商银行股份有限公司北京分行营业部");// 支行名称;
			payfor_entity.setBANKCODE("308100005027");// 联行号;
			payfor_entity.setBANKADDRESS("北京市国际企业金融大厦 A 座北京市复兴门内大街 156 号");// 支行地址;
			payfor_entity.setBANKTYPE("1");// 结算账户性质 0：对私 1： 对公;
			payfor_entity.setCHANNEL(1);//
			payfor_entity.setREMARK("");// 备注;
			payfor_entity.setMERCHANT_ORDER_NO(JsonUtil.GetRandomBusinessCode());// 商户订单号;
			js_str += payfor_entity.toJson() + ",";
			//entity_list.add(payfor_entity);
		}
		if (js_str.endsWith(","))
			js_str = js_str.substring(0, js_str.length() - 1);
		js_str += "]";
		//js_str = JsonUtil.javaList2JsonList(entity_list);
		System.out.println(js_str);//payfor_entity.toJson());
		String result = HttpRequest.httpPostWithJSON(url, js_str);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<input name="jsonstr" type="hidden" value="<%=result%>">
	<br>
</body>
</html>
<%
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>