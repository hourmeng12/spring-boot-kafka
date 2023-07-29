# Spring Boot with Kafka

![SpringBoot](https://img.shields.io/badge/Spring_Boot-18181b?style=for-the-badge&logo=springboot)
![ApacheKafka](https://img.shields.io/badge/Apache_Kafka-fff?style=for-the-badge&logo=apachekafka&logoColor=231F20)

An example Spring Boot project built with Apache Kafka.

## Setup

Run docker compose file `zk-single-kafka-single.yml` in detach mode (in terminal)

```bash
docker compose -f zk-single-kafka-single.yml up -d 
```

- This will set up zookeeper and kafka in the local machine
- The Apache Kafka server will be `localhost:9092`

Execute command from kafka in docker

```bash
docker exec -it kafka1 /bin/sh
```

Log message from kafka `topic` = `log`
```bash
kafka-console-consumer --topic log --from-beginning --bootstrap-server localhost:9092
```

`application.yml` connect to kafka server & set server port to `8080`

```yaml
server:
  port: 8080
spring:
  kafka:
    bootstrap-servers: localhost:9092
```

Run the project with maven or on your ide

```bash
./mvnw.cmd
```

## Meta

Hourmeng Khy