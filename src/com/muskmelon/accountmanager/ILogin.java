package com.muskmelon.accountmanager;

interface ILogin {
	/**
	 * 账户登录
	 * @param [userName] [账户名]
	 * @param [passWord] [密码]
	 * @param [config] [配置文件]
	 * @return [boolean] [true: 登录成功   false:登录失败]
	 * @see 
	 */
	public boolean login(String userName, String passWord, Object config);
	
	/**
	 * 账户登出
	 * @return [boolean] [true: 登出成功   false:登出失败]
	 * @see 
	 */
	public boolean logout();
	
	/**
	 * 修改密码
	 * @param [newPassword] [新密码]
	 * @param [oldPassword] [旧密码]
	 * @param [config] [配置文件]
	 * @return [boolean] [true: 修改密码成功   false:修改密码失败]
	 * @see 
	 */
	public boolean modifyPassword(String newPassword, String oldPassword, Object config);
	
	/**
	 * 登录状态
	 * @return [boolean] [true: 登录中   false:未登录]
	 * @see 
	 */
	public boolean isLogin();
}
