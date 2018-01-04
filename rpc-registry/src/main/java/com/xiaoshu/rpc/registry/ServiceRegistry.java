package com.xiaoshu.rpc.registry;


public interface ServiceRegistry {

	/**
	 * 
	 * @param serviceName	// 服务名称
	 * @param serviceAddress // 服务地址
	 */
	void register(String serviceName,String serviceAddress);
}
