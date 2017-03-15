# TaskOverflow
   Grails project at ISIMA by Benoit Garçon

## Configuration server

This repository simulate a configuration server. If you want to test different configurations, you just need to switch between ok/ko in the different files in data/ folder.

## Run the application

By default the server will be reachable on [http://localhost:666](http://localhost:666).

   ```
   grails war
   java "-Dgrails.env=dev" -jar .\build\libs\conf-0.1.war
   ```
   
## Health check
Health check is available at [http://localhost:666/health](http://localhost:666/health).