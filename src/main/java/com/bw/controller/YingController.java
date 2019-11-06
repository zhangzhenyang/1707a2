package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Ying;
import com.bw.service.YingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class YingController {

	@Resource
	private YingService service;
	@RequestMapping("/list")
	public String list(@RequestParam(defaultValue="1")Integer pageNum,Model model,String yname,String dy,Integer years,String startdate,String enddate,Integer minprice,Integer maxprice,Integer mintime,Integer maxtime){
		
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("yname", yname);
		map.put("dy", dy);
		map.put("years", years);
		map.put("startdate", startdate);
		map.put("enddate", enddate);
		map.put("maxprice", maxprice);
		map.put("minprice", minprice);
		map.put("maxtime", maxtime);
		map.put("mintime", mintime);
		PageHelper.startPage(pageNum, 2);
		List<Ying> list=service.queryYing(map);
		PageInfo<Ying> page = new  PageInfo<Ying>(list);
		model.addAttribute("page", page);
		return "list";
	}
	@RequestMapping("update")
	public String update(Integer yid){
		Ying ying=service.queryYingId(yid);
		Integer  lable = ying.getLable();
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("lable", lable);
		map.put("yid", yid);
		service.updateLable(map);
		return "redirect:list";
	}
	@RequestMapping("delAll")
	@ResponseBody
	public boolean del(String id){
		boolean flg=service.delAll(id);
		return flg;
		
	}
}
