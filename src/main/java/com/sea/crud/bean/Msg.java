package com.sea.crud.bean;
/*
 * 返回的通用类
 */

import java.util.HashMap;
import java.util.Map;

public class Msg {
	//状态码 100为成功  200为失败
	private int code;
	//提示消息
	private String msg;
	//服务器要返回给客户的数据
	private Map<String, Object> extend=new HashMap<String,Object>();
	//返回成功
	public static Msg success() {
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("返回成功");
		return result;				
	}
	//返回失败
	public static Msg fail() {
		Msg result=new Msg();
		result.setCode(200);
		result.setMsg("返回失败");
		return result;				
	}
	public Msg add(String key,Object value) {
		this.getExtend().put(key, value);
		return this;
		
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
	

}
