# Springboot_Microservices
Sample built with spring framwork.

* ##### Note - Project is built with H2 Memory database and data will be seeded using [data.sql](https://github.com/kansujiya/SpringbootMicroServices/blob/main/SpringbootMicroservice/src/main/resources/data.sql)  on app start.

## Table of contents
* [Technologies](#technologies)
* [Sample](#samples)
* [Setup](#setup)
* [APIs Documentations](#apis)


## Technologies

Project is created with:
* Java: 8
* Springboot: 2.4.3
* H2 Database
* Swagger

## Samples

Different examples:
* How to access envoirment variable | HomeController
* Sample Rest services with JPA | Session & Speaker Controller
* Versioning | VersionController 
* API filtering |  ApiFilter
* Custom Exception Handling | ExceptionResponse
* Swagger2 | SwaggerConfig 

## Setup
* Import the project as maven project
* Application will run on port number 80
* H2 console link - http://127.0.0.1:80/h2-console/
* Actuator Link(Health Check) - http://127.0.0.1:80/actuator
* Swagger - http://127.0.0.1:80/api-docs

## APIs Documentations

* [API Documentation](https://documenter.getpostman.com/view/2141799/Tz5jcz6t)

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/5d0d8f5cfd0e70f85bab)
