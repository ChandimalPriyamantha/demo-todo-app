FROM openjdk:8
EXPOSE 8080
ADD target/demo-todo-app.jar demo-todo-app.jar
ENTRYPOINT ["java","-jar","/demo-todo-app.jar"]