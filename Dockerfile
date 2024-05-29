FROM openjdk:17-jdk

WORKDIR / app

COPY ./ app

EXPOSE 8080

CMD ["java","-jar"]