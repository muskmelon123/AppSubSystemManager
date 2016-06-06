package com.muskmelon.accountmanager;

interface IRequestIdentifyCode {
	/**
	 * 验证码获取接口
	 * @param [phoneNumber] [电话号码]
	 * @return [boolean] [true: 获取成功   false:获取失败]
	 * @see 
	 */
	public boolean requestIdentifyCode(String phoneNumber);
}
