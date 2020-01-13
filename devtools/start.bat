@echo off
::cd D:\workProject\bushu
start cmd /c "title EurekaServer- && java -jar eureka-0.0.1-SNAPSHOT.jar"
start cmd /c "title SpringConfig- && java -jar SpringConfig-0.0.1-SNAPSHOT.jar"
start cmd /c "title SpringZuul- && java -jar SpringZuul-0.0.1-SNAPSHOT.jar --spring.cloud.config.server.native.searchLocations=file:D:/fangwenzheng/springcloud/configRepo"
@pause