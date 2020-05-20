FROM java:8
ADD target/*.jar app.jar
VOLUME /temp
ENTRYPOINT ["java","-jar","app.jar"]