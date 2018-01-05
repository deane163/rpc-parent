package com.xiaoshu.rpc.registry;


/**
 * 
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 *
 * @Description : 定义服务注册接口方法 
 * ---------------------------------
 * @Author : deane.administrator
 * @Date : Create in 2018年1月5日上午9:51:17
 * 
 * Copyright (C)2013-2018 小树盛凯科技 All rights reserved.
 */
public interface ServiceRegistry {

	/**
	 * 
	 * @param serviceName	// 服务名称
	 * @param serviceAddress // 服务地址
	 */
	void register(String serviceName,String serviceAddress);
}
