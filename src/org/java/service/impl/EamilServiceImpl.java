package org.java.service.impl;

import java.util.List;
import java.util.Map;

import org.java.dao.EamilMapper;
import org.java.entity.Eamil;
import org.java.service.EamilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("eamilService")
public class EamilServiceImpl implements EamilService {
	
	@Autowired
	private EamilMapper eamilDao;
	
	@Override
	public int insert(Eamil eamil) {
		
		return eamilDao.insertSelective(eamil);
	}
	

	@Override
	public List<Map<String, Object>> selectAll(String userId) {
		
		return eamilDao.selectAll(userId);
	}


	@Override
	public Map<String, Object> selectByDetails(String userId,Integer eamilId) {
		
		return eamilDao.selectByDetails(userId,eamilId);
	}
}
