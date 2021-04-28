FROM maocorte/alpine-oraclejdk8
VOLUME /tmp
ADD ./target/CodeSchoolService-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]