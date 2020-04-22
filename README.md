# hello-spring-cloud
学习Spring Cloud - 2020-04-22

## 补全

补全`hello-spring-cloud-config`中`application.yml`中配置的地址、用户名和密码

## 启动顺序

1. Eureka 注册与发现
2. Config 分布式配置中心
3. zipkin 链路追踪
4. admin 就是spring-boot-admin
5. ServiceAdmin服务提供者
6. feign 服务消费者
7. zuul API网关

## 关于zipkin
1. 创建的`hello-spring-cloud-zpkin`工程启动报错，百度后得知`spring boot 2.x`与`zipkin`整合,官方不推荐自行定制编译，直接使用编译好的jar包。原来可以通过`@EnablezipkinServer`注解，现在不行了。下载jar包：https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/

   选择后缀为-exec.jar通过`java -jar xxxx`启动。本次使用的是`zipkin-server-2.12.9-exec.jar`

  PS：这样的话就不知道如何在application.yml中配置spring-boot-admin进行服务监控。