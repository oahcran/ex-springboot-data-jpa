# Spring Data JPA + Hibernate + Oracle

Use Spring Data JPA + Hibernate + Oracle in Spring Boot

## Test

Use [docker-oracle-xe-11g](https://github.com/wnameless/docker-oracle-xe-11g)

Run the following command to have Oracle Database XE server running for incoming request

```
docker run -d -p 49161:1521 -e ORACLE_ALLOW_REMOTE=true wnameless/oracle-xe-11g
```

```
curl "http://localhost:8080/create?name=1&&city=2"
user is created (id = 1)

curl "http://localhost:8080/delete?id=1"
user is deleted (id = 1)
```
