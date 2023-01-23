# Create project

``` 
https://start.spring.io/
```

# Build the project

``` 
mvn clean install
```

# Run application

``` 
mvn spring-boot:run
```

# Testing the application

Post = curl --location --request POST 'localhost:8082/patient/save'

Put = curl --location --request PUT 'localhost:8082/patient/update?disease=fever&age=25'


```

### Security for application

```

curl --location --request POST 'localhost:8082/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=859FD3BF8F9F574F3215F239FCB63F67' \
--data-raw '{
"id" : "pat01",
"name": "pat_test",
"age" : "30",
"gender" : "Male",
"disease" : "Malaria"
}'

curl --location --request PUT 'localhost:8082/patient/update?disease=fever&age=23' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=F3FB8FBD82D6E23E0993383A88990B9A' \
--data-raw '{
"id" : "pat01",
"name": "pat_test",
"age" : "30",
"gender" : "Male",
"disease" : "Malaria"
}'

