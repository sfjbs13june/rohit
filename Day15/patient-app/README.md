## Build the app

``` 
mvn clean install
```

## Run the app

``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down

```

## Post

``` 
curl --location --request POST 'localhost:8083/patientdata/create/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":"123",
    "name":"rahul",
    "age":"23",
    "gender":"Male",
    "disease":"fever"
}'
```

## Get

``` 
curl -X GET http://localhost:8083/patientdata/read 
```

## Put

``` 
curl -X PUT 'http://localhost:8083/patientdata/update?id=1re07&name=Rohit' 
```

##Delete

```
curl -X DELETE 'http://localhost:8083/patientdata/delete?name=Rohit' 
curl -X DELETE 'http://localhost:8083/patientdata/deleteByDisease?disease=fever' 
```

## Show data

```
docker exec -it patient-app-mongo-1 bash

mongo

show dbs

show tables

db.Patient.find()

```


## Dockerization

### Maven
Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login

$ docker push <repository-name>/<app-name>

```

