package com.frame.router.manager.enums;


/**
 * @author Chen
 * @date   Oct 1, 2019
 * @description SystemCodeEnum.java	
 */
public enum SystemCodeEnum implements BaseCodeService {

	SUCCESS(10000, "Success"),						// success
	SYSTEM_ERROR(10001, "System Error"),			// system error
	PARAM_ERROR(10002, "Parameter Error"),;			// parameter error

	private final int code;			// message
	private final String msg;		// code

	SystemCodeEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * 
	 * @param code
	 * @return
	 */
	public static SystemCodeEnum getByCode(int code) {
		for (SystemCodeEnum resultCode : SystemCodeEnum.values()) {
			if (resultCode.getCode() == code) {
				return resultCode;
			}
		}

		return null;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
