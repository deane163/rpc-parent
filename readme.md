## RPC简单实现

- 1、集成 Zookeeper 注册中心， 将Server端接口服务注册到 Zookeeper上面

- 2、集成 Netty 网络通信框架， 提高网络传输性能

- 3、使用JDK 动态代理， 依赖于接口

- 4、测试使用了 CGlib 动态代理

- 5、实现传输的序列号和反序列化