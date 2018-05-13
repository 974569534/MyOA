package org.java.service.impl;


import org.java.dao.EmailtouserMapper;
import org.java.entity.Emailtouser;
import org.java.service.EamilToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("eamilToUserService")
public class EamilToUserServiceImpl implements EamilToUserService{
	
	@Autowired
	private EmailtouserMapper emailDao;
	
	
	@Override
	public int insert(Emailtouser emailtouser) {
		
		return emailDao.insert(emailtouser);
	}


	@Override
	public int updateByEmailId(Emailtouser record) {
		
		return emailDao.updateByEamilId(record);
	}


	@Override
	public int updateDelEamilId(Emailtouser record) {
		
		return emailDao.updateDelEamilId(record);
	}


	
	

}
