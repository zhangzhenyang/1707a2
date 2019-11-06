package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.entity.Ying;

public interface Yingmapper {

	List<Ying> queryYing(Map<String, Object> map);
void updateLable(Integer lable, Integer yid);

	Ying queryYingId(Integer yid);

	void updateYing(Map<String, Object> map);
	int delAll(String id);

}
