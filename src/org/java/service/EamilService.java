package org.java.service;

import java.util.List;
import java.util.Map;

import org.java.entity.Eamil;

public interface EamilService {
	
	int insert(Eamil eamil);
	
	List<Map<String, Object>> selectAll(String userId);
	
	Map<String, Object> selectByDetails(String userId,Integer eamilId);
}
