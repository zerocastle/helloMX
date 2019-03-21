package com.yjc.hellomx.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.yjc.hellomx.domain.CustomerVO;
import com.yjc.hellomx.mapper.CustomerMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImplement implements CustomerService{
	//테이블 상관없이 쓰일 모든 쿼리를 담은 매퍼함수들을 등록시킨다.
	private CustomerMapper mapper;
	
	@Override
	public ArrayList<CustomerVO> getList() {
//		return mapper.getList();
		return null;
	}

	@Override
	public int insertList(CustomerVO dto) {
//		return mapper.insertList(dto);
		return 0;
	}

	@Override
	public int delete(String name) {
//		return mapper.delete(name);
		return 0;
	}

	@Override
	public CustomerVO get(String cid) {
		
		return mapper.get(cid);
	}

}
