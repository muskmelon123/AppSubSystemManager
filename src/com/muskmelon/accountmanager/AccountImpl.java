package com.muskmelon.accountmanager;

class AccountImpl extends IAccount{

	@Override
	public boolean login(String userName, String passWord, Object config) {
		// TODO Auto-generated method stub
		return super.iAccount.login(userName, passWord, config);
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return super.iAccount.logout();
	}

	@Override
	public boolean modifyPassword(String newPassword, String oldPassword,
			Object config) {
		// TODO Auto-generated method stub
		return super.iAccount.modifyPassword(newPassword, oldPassword, config);
	}

	@Override
	public boolean isLogin() {
		// TODO Auto-generated method stub
		return super.iAccount.isLogin();
	}

	@Override
	public boolean register(String userName, String passWord, Object config) {
		// TODO Auto-generated method stub
		return super.iAccount.register(userName, passWord, config);
	}

	@Override
	public boolean requestIdentifyCode(String phoneNumber) {
		// TODO Auto-generated method stub
		return super.iAccount.requestIdentifyCode(phoneNumber);
	}

}
