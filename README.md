# intpick
The integer picker. Given a sum find the two numbers that equal it.

`Note: This readme REALLY needs some work.`

## build and run
`./gradlew build && java -jar ./build/libs/intpicker-spring-boot-docker-1.0-SNAPSHOT.jar`


## request and response

```
curl -X POST \
  http://localhost:8080/intpicker \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{"sum":15,"items":[ -5, 1, 5, 6, 10, 21]}'
```

response.

```
{
    "1": 2,
    "2": 4
}
```

## running the docker container
`./gradlew build docker`

and running

`docker run -p 8080:8080 -t claytantor/intpicker`

## swagger UI and Docs
The service is swagger enabled. Once the service is started you can access the docs at: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)