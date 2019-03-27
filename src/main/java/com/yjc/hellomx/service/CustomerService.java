package com.yjc.hellomx.service;

import java.util.ArrayList;

import com.yjc.hellomx.domain.CustomerVO;

public interface CustomerService {
	public ArrayList<CustomerVO> getList();
	public int insertList(CustomerVO dto);
	public int delete(String name);
	public CustomerVO get(String cid);
	
	public CustomerVO login(String cid,String password);
}
