# Spring_cloud

# eureka 群集服務

啟動one、two、three三個eureka註冊服務。

## eureka 生產者

```xml
// 分别以 8000 和 8001 启动实例 1 和 实例 2
java -jar eureka_producer-0.0.1-SNAPSHOT.jar --config.producer.instance=1 --server.port=8000
java -jar eureka_producer-0.0.1-SNAPSHOT.jar --config.producer.instance=2 --server.port=8001
```

接著訪問消費者```http://localhost:8988/hello/?name=windmt```即可看出是否有負載均衡
