# TaskOverflow

## Configuration server

This repository simulate a configuration server. If you want to test different configurations, you just need to change the configuration server url in the client.

You just have to choose a constant in app.js.

``` javascript
.constant("CONF_SERVER_URL", "https://raw.githubusercontent.com/TaskOverflow/conf/master/allok/")       // if you want to test with all features
//.constant("CONF_SERVER_URL", "https://raw.githubusercontent.com/TaskOverflow/conf/master/alldown/")   // if you want to test without features
```

### allok
Contain a valid state for all features.

### alldown
Contain a invalid state for all features.