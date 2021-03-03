## SpringCloud

该项目为springcloud-neflix的测试项目,主要测试各组件的使用

-   springcloud为一三节点的Eureka Server集群,内有三份配置文件
-   basicservice是一简单的服务提供者,模拟单点服务
-   basicserviceinvoker为调用上述服务的Eureka Client,这里使用了Fegin简化http请求.
    -   实际上我们可以用RestTemplate去访问Eureka Server的 `/eureka/apps`来拉取服务列表,或是访问`/eureka/apps/${servicename}`来获取某一服务的详细信息
    -   basicserviceinvoker配置了hystrix断路器



