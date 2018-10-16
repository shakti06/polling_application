# polling Application
Polling application based on the voting of the questions and listing them.Any authenticated user can vote on the questions and their voting 
can be listed.

## Security mechanism
-API that registers new users with their name, username, email and password.

-API to let users log in using their username/email and password. After validating user’s credentials, the API should generate a JWT authentication token and return the token in the response.
-Configure Spring security to restrict access to protected resources

-Configure Spring security to throw a 401 unauthorized error if a client tries to access a protected resource without a valid JWT token.

-Configure Role-based Authorization to protect resources on the server

## Data Auditing
-means tracking and logging every change we do in our persisted records

-Audit class is created and implemented to the base class

-for more reference: (https://dzone.com/articles/spring-data-jpa-auditing-automatically-the-good-stuff)

## How to use:
-open the cmd

-cd the location

-type mvnw spring-boot:run

## Usuage for the api response /request cycle:
-can use postman plugin

-route to localhost://localhost:8080/api/auth/{route-path}(sigin/signup)
