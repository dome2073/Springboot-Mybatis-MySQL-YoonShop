package com.yoonshop.shop.utils;

public class Script {
	
	public static String back(String msg) {
		StringBuffer sb = new StringBuffer();
		sb.append("<script>");
		sb.append("alert('" + msg + "');");
		sb.append("history.back();");
		sb.append("</script>");
		
		return sb.toString();
	}

	public static String hrefWithMsg(String msg, String location) {
		StringBuffer sb = new StringBuffer();
		sb.append("<script>");
		sb.append("alert('" + msg + "');");
		sb.append("location.href='" + location + "'");
		sb.append("</script>");

		return sb.toString();
	}

	public static String href(String location) {
		StringBuffer sb = new StringBuffer();
		sb.append("<script>");
		sb.append("location.href='" + location + "'");
		sb.append("</script>");

		return sb.toString();
	}
}