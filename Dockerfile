FROM maven

COPY src /project_dir/src
COPY pom.xml /project_dir/

WORKDIR /project_dir/
RUN mvn clean install

CMD mvn spring-boot:run
