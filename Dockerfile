FROM openjdk:8
ADD target/employee-skill-management-0.0.1-SNAPSHOT.jar employee-skill-management-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "employee-skill-management-0.0.1-SNAPSHOT.jar"]