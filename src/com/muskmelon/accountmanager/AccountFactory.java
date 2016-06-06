package com.muskmelon.accountmanager;

public class AccountFactory {
	public static IAccount create() {
		return new AccountImpl();
	}
}
