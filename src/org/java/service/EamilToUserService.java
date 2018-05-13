package org.java.service;

import java.util.Map;

import org.java.entity.Emailtouser;

public interface EamilToUserService {
	
	int insert(Emailtouser emailtouser);
	
	int updateByEmailId(Emailtouser record);
	
	int updateDelEamilId(Emailtouser record);
}
