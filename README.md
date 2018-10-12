# Spring Data JPA + Hibernate + Oracle

Use Spring Data JPA + Hibernate + Oracle in Spring Boot

## Test

Use [docker-oracle-xe-11g](https://github.com/wnameless/docker-oracle-xe-11g) 

Run the following command to have Oracle Database XE server running for incoming request

```
docker run -d -p 49161:1521 -e ORACLE_ALLOW_REMOTE=true wnameless/oracle-xe-11g
```
