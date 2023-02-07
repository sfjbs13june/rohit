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

curl --location --request GET 'localhost:8080/doctor/doctorappointment?doctorName=Dr.rajesh' \
--header 'Content-Type: application/json' \
--data-raw '{
"appointmentId" : "102",
"patientName":"Raman",
"doctorName":"Dr.pandey",
"date":"25thfeb",
"prescription":
{
"prescriptionId":"pres13",
"appointmentId":"102",
"description":"He had diaria",
"patientName":"Raman",
"doctorName":"Dr.pandey"
}
}'

## Show data

```
docker exec -it hospital-app-management-1 bash

mongo

show dbs

show tables

db.Hospital-management-app.find()

```