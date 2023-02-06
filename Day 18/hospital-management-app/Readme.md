# Create the Spring boot application using :
```
https://start.spring.io/
```
# build the project :
```
mvn clean install
```
# Run the app
``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down
```
