package utils;

import javax.servlet.jsp.JspWriter;

public class JSFunction {
	// 메세지창 출력 및 페이지 이동 
	public static void alertLocation(String msg, String url, JspWriter out) {
		try {
			String script = "" // 삽입할 자바 스크립트 코드
						  + "<script>"
						  + "	alert('" + msg + "');" // 메시지 출력
						  + "	location.href='" + url + "';" // 페이지 이동
						  + "</script>";
			out.println(script);
		}catch(Exception e) {
			
		}
	}
	
	public static void alertBack(String msg, JspWriter out) {
		try {
			String script = "" 
						  + "<script>"
						  + "	alert('" + msg + "');" // 메시지 출력
						  + "	history.back();"
						  + "</script>";
			out.println(script);
		}catch(Exception e) {
			
		}
	}
}
