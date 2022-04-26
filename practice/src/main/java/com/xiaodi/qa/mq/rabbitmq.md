
# 非springboot集成
# 5种工作模式:https://www.cnblogs.com/wujiaofen/p/11084249.html
## 拉取镜像：docker pull rabbitmq:management
## 运行：docker run -d -p 5672:5672 -p 15672:15672 --name rabbitmq rabbitmq:management

### http://localhost:15672/#/
### 账号密码: guest/guest

# springboot集成
## 参考https://www.cnblogs.com/personblog/p/14251641.html
### 消费者用注解@RabbitListener



