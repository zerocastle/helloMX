package com.yjc.hellomx.mapper;

import java.util.ArrayList;
import com.yjc.hellomx.domain.CustomerVO;

public interface CustomerMapper {
//	@Select("select * from customer")
	public ArrayList<CustomerVO> getList();
	public int insertList(CustomerVO dto);
	public int delete(String name);
	public CustomerVO get(String cid);
}
