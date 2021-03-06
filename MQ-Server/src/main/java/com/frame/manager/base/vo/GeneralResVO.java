package com.frame.manager.base.vo;

import java.io.Serializable;


/**
 * 通用返回结果类
 * @author Yanfa-0509
 * @date 2018年10月22日 下午2:21:25
 * @Title GeneralResVO 	
 * @Description：
 * @param <T>
 */
public class GeneralResVO<T> implements Serializable {

	private static final long serialVersionUID = -3737235852895882876L;

	public int code;
	public String msg;
	public T result;

	public GeneralResVO() {
		msg = "";
		result = null;
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

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public static GeneralResVO returnSuccessResult(Object result)
			throws InstantiationException, IllegalAccessException {

		GeneralResVO res = new GeneralResVO();
		res.setCode(10000);
		res.setMsg("success");
		res.setResult(result);
		return res;
	}

	public static GeneralResVO returnErrorResult(Object result)
			throws InstantiationException, IllegalAccessException {

		GeneralResVO res = new GeneralResVO();
		res.setCode(10002);
		res.setMsg("failure");
		res.setResult(result);
		return res;
	}
}
