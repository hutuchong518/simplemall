package com.simplemall.micro.serv.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.micro.serv.account.bean.Account;
import com.simplemall.micro.serv.account.bean.AccountCriteria;
import com.simplemall.micro.serv.account.dal.AccAddressMapper;
import com.simplemall.micro.serv.account.dal.AccountMapper;
import com.simplemall.micro.serv.account.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	AccountMapper accountMapper;
	
	@Autowired
	AccAddressMapper addressMapper;
	
	@Override
	public String getAccAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login(String phone, String password) {
		AccountCriteria criteria = new AccountCriteria();
		criteria.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
		List<Account> list = accountMapper.selectByExample(criteria);
		System.out.println(list.size());
		return null;
	}

	@Override
	public String signup(String phone, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}