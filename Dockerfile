FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/empty.jar /empty/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/empty/app.jar"]
