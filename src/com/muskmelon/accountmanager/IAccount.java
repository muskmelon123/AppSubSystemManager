package com.muskmelon.accountmanager;

public abstract class IAccount implements ILogin, IRegister, IRequestIdentifyCode{
	IAccount iAccount;
	
	/**
	 * 配置Account adapter
	 * @param [iAccount] [iAccount实例]
	 * @see 
	 */
	public void setAccountAdapter(IAccount iAccount) {
		this.iAccount = iAccount;
	}
}
