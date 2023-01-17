## Create the Springboot project using :
https://start.spring.io/

## Build the project using command :
``` 
mvn clean install
```

## Run the application using command :
``` 
mvn spring-boot:run
```

## Test the application :
```
curl --location --request GET 'localhost:8081/welcome?name=rohit'

curl --location --request GET 'localhost:8081/send/rohit'
```