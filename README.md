## rms-mall(real-micro-services-mall) 

rms-mall(real-micro-services-mall) 真微服务商城，由于本人从网上找的一些商城项目都不算真正的微服务商城，就此想实现真正的基于
[spring-cloud-alibaba](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)
系列组件的微服务商城。计划拥有：

|   模块   |   功能  |  	端口    |
| ---- | ---- | ---- |
|   rms-mall-gateway   |   网关   |      |
|   rms-mall-authority-center   |   授权中心   |      |
|   rms-mall-goods   |   商品服务   |      |
|   rms-mall-order   |   订单服务   |      |
|   rms-mall-logistics   |   物流服务   |      |
|   rms-mall-account   |   用户服务   |      |
|   rms-mall-common   |   公共模块   |      |



库存服务，订单服务，支付服务，卡券服务，物流服务，

## 组件版本
|   Spring Cloud Alibaba Version   |    Spring Cloud Version  |  	Spring Boot Version    |
| ---- | ---- | ---- |
|   2.2.7.RELEASE   |   Spring Cloud Hoxton.SR12   |   2.3.12.RELEASE   |

## 更新

- 2022/1/20 增加nacos
- 2022/8/7 增加common模块 mvc-config模块
- 2022/8/8 增加nacos-client模块 admin模块
- 2022/8/22 增加鉴权中心模块
- 2022/10/18 增加网关模块
- 2022/10/20 增加网关模块
- 2022/10/22 增加sleuth、zipkin 分布式日志
- 2022/11/24 用户账户微服务

## todo

### 用户账户微服务

- 用户身份统一登录拦截
- 集成swagger在线文档
- 账户微服务功能设计
- 数据表orm过程
- 用户地址与余额服务接口定义
- 用户地址相关服务接口实现
- 用户地址服务接口可用性测试（测试用例）
- 用户余额相关服务接口实现
- 用户账户微服务对外HTTP接口
- 验证用户账户微服务功能可用性

### 商品微服务

### 微服务通信 Ribbon+OpenFeign

### Hystrix微服务容错

### SpringCloud Stream 消息驱动服务

### Seata 分布式事务解决方案

### 订单微服务

### 物流微服务

### SpringCloud Alibaba Sentinel 网关动态限流

### 工程部署和整体可用性验证