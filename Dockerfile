FROM openjdk:11
EXPOSE 8080
ADD target/course-management-api.jar course-management-api.jar
ENTRYPOINT ["java","-jar","/course-management-api.jar"]