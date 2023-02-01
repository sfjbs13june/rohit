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
curl --request POST 'http://localhost:8080/hospital/create' --header 'Content-Type: application/json' --data-raw '{"id": "Rohit","id": "1re206","city": "Bangalore"}'
```

## Get

``` 
curl -X GET http://localhost:8080/hospital/read 
```

## Put

``` 
curl -X PUT 'http://localhost:8080/hospital/update?id=1re07&name=Rohit' 
```

##Delete

```
curl -X DELETE 'http://localhost:8080/hospital/delete?name=Rohit' 
```

## Show data

```
docker exec -it hospital-app-mongo-1 bash

mongo

show dbs

show tables

db.Hospital.find()

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

