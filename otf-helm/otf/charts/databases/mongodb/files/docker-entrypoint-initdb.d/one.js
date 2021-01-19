sleep(12000);
use admin;
db.createUser({user: "otfuser", pwd: "Today.123", roles: [ { role: "readWrite", db: "test" } ]})
use otf;
db.users.insert({"permissions":["user"], "enabled":true, "password":"$2a$14$QWEuhquhhT.1dtVsmXq0QOxOMSmInjvQtr43Jbyz07nEeTbABdwqa", "firstName":"username", "lastname":"username", "email":"username", "isVerified":true})
db.users.insert({"permissions":["admin"], "enabled":true, "password":"$2a$14$QWEuhquhhT.1dtVsmXq0QOxOMSmInjvQtr43Jbyz07nEeTbABdwqa", "firstName":"otf", "lastname":"user", "email":"otfuser@email.com", "isVerified":true})
