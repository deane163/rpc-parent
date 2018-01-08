/**
 * 
 */
package com.xiaoshu.rpc.registry.zookeeper;

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
 * @Description : 常量配置，需要注册到的Zookeeper文件夹地址
 * ---------------------------------
 * @Author : deane.administrator
 * @Date : Create in 2018年1月6日 下午4:29:18
 * 
 * Copyright (C)2013-2018 小树盛凯科技 All rights reserved.
 */
public interface Constant {
    
    int ZK_SESSION_TIMEOUT = 5000;
    int ZK_CONNECTION_TIMEOUT = 1000;
    
    String ZK_REGISTRY_PATH = "/registry";
}
