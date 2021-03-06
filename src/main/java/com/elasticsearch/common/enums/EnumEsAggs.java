package com.elasticsearch.common.enums;

public enum EnumEsAggs {
	
	GROUPBY("groupBy"),// 分组统计
	HAVING("having"),// 与GROUPBY同时使用，控制返回组数
	LIMIT("limit"),// 与GROUPBY同时使用，控制组内返回数据条数
	SORT("sort"),// 与GROUPBY同时使用，控制组内排序，支持desc | asc
	GROUPBYDATE("groupByDate"),// 按时间分组统计、支持year、quarter、month、week、day、hour
	SIZE("size"),// 与GROUPBY同时使用，控制返回组数
	TOP_HITS("top_hits"),
	FIELD("field"),
	VALUE("value"),
	SCRIPT("script");
	
	private String opt;

	private EnumEsAggs(String opt) {
		this.opt = opt;
	}

	public String getOpt(){
		return this.opt;
	}

}
