package com.yjc.hellomx.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.yjc.hellomx.domain.CustomerVO;

public interface CustomerMapper {
//	@Select("select * from customer")
	public ArrayList<CustomerVO> getList();
	public int insertList(CustomerVO dto);
	public int delete(String name);
	public CustomerVO get(String cid);
	
	public CustomerVO login(@Param("cid") String cid , @Param("password") String password);
}
