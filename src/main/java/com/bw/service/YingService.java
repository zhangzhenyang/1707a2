package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.entity.Ying;

public interface YingService {

	List<Ying> queryYing(Map<String, Object> map);

	

	Ying queryYingId(Integer yid);

	void updateLable(Map<String, Object> map);



	boolean delAll(String id);

}
