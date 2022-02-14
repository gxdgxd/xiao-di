

# 生产者
## Future<RecordMetadata> res = kafkaTemplate1.send(new ProducerRecord<>(topicName, partition, env, JSON.toJSONString(reportRecord)));

## @Bean(name = "kafkaTemplate1")
      public KafkaProducer<String, String> kafkaTemplate1(@Value("${spring.kafka.producer.servers}") String servers,
                                                          @Value("${spring.kafka.producer.acks}") String acks,
                                                          @Value("${spring.kafka.producer.retries}") String retries,
                                                          @Value("${spring.kafka.producer.buffer-memory}") Long memory,
                                                          @Value("${spring.kafka.producer.key-serializer}") String keySerializer,
                                                          @Value("${spring.kafka.producer.value-serializer}") String valueSerializer) {
          Properties props = new Properties();
          //broker地址
          props.put("bootstrap.servers", servers);
          //请求时候需要验证
          props.put("acks", acks);
          //请求失败时候需要重试
          props.put("retries", retries);
          //内存缓存区大小
          props.put("buffer.memory", memory);
          //指定消息key序列化方式
          props.put("key.serializer", keySerializer);
          //指定消息本身的序列化方式
          props.put("value.serializer", valueSerializer);
          KafkaProducer<String, String> producer = new KafkaProducer<>(props);
          return producer;
      }
      
# 消费者     @KafkaListener(topics = {"${spring.kafka.consumer.topic}"}, groupId = "${spring.kafka.consumer.group-id}")
