# intpick
The integer picker. Given a sum find the two numbers that equal it.

`Note: This readme REALLY needs some work.`

## build and run
`./gradlew build && java -jar ./build/libs/intpicker-spring-boot-docker-1.0-SNAPSHOT.jar`


## request and response

```
curl -X POST \
  http://localhost:8080/api/intpicker \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{"sum":15, "count":2, "items":[ -5, 1, 3, 5, 6, 7, 20, 21]}'
```

response.

```
{
    "items": [
        0,
        6
    ],
    "sum": 15,
    "count": 2
}
```

## running the docker container
`./gradlew build docker`

and running

`docker run -p 8080:8080 -t claytantor/intpicker`

## swagger UI and Docs
The service is swagger enabled. Once the service is started you can access the docs at: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


## tests and coverage

Running the tests and coverage for junit test reports and jococo can be done with the gradle command:  `./gradlew test jacocoTestReport`

Unit test reports can be found relative to the project with the CLI command: 

`$ open ./build/reports/tests/test/index.html`

and the jacoco reports can be viewed withe CLI:  

`$ open ./build/jacoco/html/index.html`