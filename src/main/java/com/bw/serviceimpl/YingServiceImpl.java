package com.bw.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.bw.entity.Ying;
import com.bw.mapper.Yingmapper;
import com.bw.service.YingService;
@Service
public class YingServiceImpl implements YingService {

	@Resource
	private Yingmapper mapper;
	public List<Ying> queryYing(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.queryYing(map);
	}
	
	public Ying queryYingId(Integer yid) {
		// TODO Auto-generated method stub
		
		return mapper.queryYingId(yid);
	}

	public void updateLable(Map<String, Object> map) {
		// TODO Auto-generated method stub
		mapper.updateYing(map);
	}

	public boolean delAll(String id) {
		// TODO Auto-generated method stub
		return mapper.delAll(id)>0?true:false;
	}
	

}
