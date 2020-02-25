package com.fruitsalesplatform.dao;

import java.util.Map;

import com.fruitsalesplatform.entity.Retailer;


//定义 Retailer数据访sql接口
public interface RetailerDao extends BaseDao<Retailer>{
	//添加新的sql方法
	public int count(Map map);//根据条件统计数量
	
}
