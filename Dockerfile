FROM dockerfile/java:oracle-java8
MAINTAINER gongchengdong <gongchengdong@news.com>

COPY target/demo-micro-service-0.1.jar /data/demo-micro-service-0.1.jar

CMD ["java", "-jar", "demo-micro-service-0.1.jar"]