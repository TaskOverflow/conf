# TaskOverflow
   Grails project at ISIMA by Benoît Garçon

## Configuration server

This repository simulate a configuration server. If you want to test different configurations, you just need to switch between ok/ko in the different files in data/ folder.

## Run the application

By default the server will be reachable on [http://localhost:666](http://localhost:666).

   ```
   grails war
   java "-Dgrails.env=dev" -jar .\build\libs\conf-0.1.war
   ```
   
## Configuration server Health Check
Health check is available at [http://localhost:666/health](http://localhost:666/health).

  ## Stateless application
  This application is totally stateless.

  ## Authentification mechanism
  This application is secured through spring-security-rest.

  ## Feature Flipping
  The Feature Flipping is implemented: it use the [configuration server](http://github.com/TaskOverflow/conf) of this project. To test the feature flipping on a feature, you just need to switch between 'ok' and 'ko' in the corresponding file in [conf/data/](http://github.com/TaskOverflow/conf/data). Warning: it is important to run the configuration server from root (like it is said in the corresponding README). Every five seconds the client ping each features to know if the feature is activated.
   
  ## Health check
  The complete Health Check is available at [http://localhost:8080/health](http://localhost:8080/health).
  Some simplified Health Check are available for each features (user, badge, tag, question) at http://localhost:8080/featureName/healthcheck, it is used in Circuit Breaker feature.

  ## Circuit Breaker
  The Circuit Breaker is implemented with the help of previously described feature healthcheck. Every five seconds the client ping each features to know if they respond 200 or an error. In the opened mode the circuit waits 20 seconds. If you want to play with the circuit breaker, you have to launch the server with `grails run-app` and modify the code returned by healthcheck() action of the desired controller. Or you can just break the server.

  ## Graceful Degradation
  If there is a problem, some features are simply deleted from the UI (badge, tag), other features are replaced by new third party service : when user feature is down a list of random people is displayed, when question feature is down random gif of cats are displayed instead.
