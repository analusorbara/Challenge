# Challenge

## Challenge1- Postman Documentation

The API and Environment are documented with Postman. To find it go to folder :Challenge1_PostmanDocumentation.

## Challenge1- Test

The API doesn´t suport all the time zone documented in https://www.timeanddate.com/time/zones/. This project help to discover all supported time zones.

## Challenge1- Webservice

This project used a Vaadin application with Spring Boot.

### Running the application

The project is a standard Maven project. To run it from the command line,
type `mvnw` (Windows), or `./mvnw` (Mac & Linux), then open
http://localhost:8080 in your browser.

You can also import the project to your IDE of choice as you would with any
Maven project. Read more on [how to set up a development environment for
Vaadin projects](https://vaadin.com/docs/latest/guide/install) (Windows, Linux, macOS).

### Deploying to Production

To create a production build, call `mvnw clean package -Pproduction` (Windows),
or `./mvnw clean package -Pproduction` (Mac & Linux).
This will build a JAR file with all the dependencies and front-end resources,
ready to be deployed. The file can be found in the `target` folder after the build completes.

Once the JAR file is built, you can run it using
`java -jar target/challenge1-1.0-SNAPSHOT.jar`

### Project structure

- `HomeView.java` in `src/main/java` contains the navigation setup (i.e., the
  side/top bar and the main menu). This setup uses
  [App Layout](https://vaadin.com/components/vaadin-app-layout).
- `views` package in `src/main/java` contains the server-side Java views of your application.
- `views` folder in `frontend/` contains the client-side JavaScript views of your application.
- `themes` folder in `frontend/` contains the custom CSS styles.

### Reference links

- http request to JSON API
https://www.twilio.com/blog/5-ways-to-make-http-requests-in-java
https://www.baeldung.com/guide-to-okhttp

- json parse
https://www.baeldung.com/jackson-object-mapper-tutorial
https://stackoverflow.com/questions/4486787/jackson-with-json-unrecognized-field-not-marked-as-ignorable

- json to java class
https://json2csharp.com/json-to-pojo

- java enum iteration
https://www.baeldung.com/java-enum-iteration

- How to use Vaadin components
https://vaadin.com/docs/v14/ds/components


## Challenge 2 - Trustly Technical Challenge
### Requirements 
- Java 11

### How to use
- Download the folder /Challenge2
- Open on IntelliJ or other Java IDE
- Run with: mvn spring-boot:run
- Open http://localhost:8080/ on any browser

### Reference links

- Guide to Mustache with Spring Boot
 https://www.baeldung.com/spring-boot-mustache
 
- Spring Boot + Mustache CRUD Example
   https://www.dariawan.com/tutorials/spring/spring-boot-mustache-crud-example/
