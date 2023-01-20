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
Save Data:

curl --location --request POST 'localhost:8081/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=69830D4381FE8A8620CD4F3A846E9641' \
--data-raw '{
"id" : "121",
"name" : "rohit",
"age" : "25",
"gender" : "Male",
"disease" : "Dengue"
}'

curl --location --request PUT 'localhost:8081/patient/update?disease=fever'