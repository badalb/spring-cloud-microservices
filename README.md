# spring-cloud-microservices-security

Sample Spring Cloud Microsevice application with

1. Config Server for maintaining system properties
2. Zuul Proxy
3. Hystrix circuit breaker
4. Ribbon
5. Fiegn 
6. Spring Cloud Security (OAuth 2.0 with JWT)
7. Hystrix dashboard with hystrix and turbine stream

The application supports Hystrix Circuit Breaker with Fiegn and Ribbon with OAuth 2.0 with the help of 
feign-hystrix-oauth2-spring-boot-starter library

For hystrix dashboard we are exluding the stream url from security and hystrix dashboard is using turbine for aggregating stream.
