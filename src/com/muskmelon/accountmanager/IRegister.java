package com.muskmelon.accountmanager;

interface IRegister {

	/**
	 * 账户注册
	 * @param [userName] [账户名]
	 * @param [passWord] [密码]
	 * @param [config] [配置文件]
	 * @return [boolean] [true: 注册成功   false:注册失败]
	 * @see 
	 */
	public boolean register(String userName, String passWord, Object config);
}
