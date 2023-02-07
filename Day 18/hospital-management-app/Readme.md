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

# DoctorController

# POST
```
curl --location --request POST 'localhost:8080/doctor/save'
```
# GET
```
curl --location --request GET 'localhost:8080/doctor/doctorappointment?doctorName=Dr.rajesh' 
```

# PatientController

# POST
```
curl --location --request POST 'localhost:8080/patient/Save' \
--header 'Content-Type: application/json' \
--data-raw '{
"appointmentId" : "105",
"patientName":"Ram",
"doctorName":"Dr.rakesh",
"date":"12th march",
"prescription":
{
"prescriptionId":"pres13",
"appointmentId":"102",
"description":"He had fever",
"patientName":"Ram",
"doctorName":"Dr.rakesh"
}
}'
```

# GET

```
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=Ram'
```

# PrescriptionController

# POST
```
curl --location --request POST 'localhost:8080/prescription/saveprescription' \
--header 'Content-Type: application/json' \
--data-raw '{
"prescriptionId":"pres123",
"appointmentId":"101",
"description":"he had fever",
"patientName":"Raman",
"doctorName":"Dr.rakesh"
}'
```

# GET
```
curl --location --request GET 'localhost:8080/prescription/viewprescription'
```

# Show data

```
docker exec -it hospital-management-app-mongo-1 bash

mongo

show dbs

show tables

db.Hospital-management-app.find()

```