sleep(12000);
admin = db.getSiblingDB('admin');
admin.createUser({user: "your-mongo-username", pwd: "your-mongo-password", roles: [ { role: "readWriteAnyDatabase", db: "admin" } ]});
otf= db.getSiblingDB('otf');
//add default group
otf.groups.insert({ "_id" : ObjectId("604901d4498e3a006261b1e6"), "mechanizedIds" : [], "groupName" : "otf", "parentGroupId" : null, "ownerId" : ObjectId("6048fed6bdc2a67d6e9c7fc2"), "groupDescription" : "otf", "roles" : [ { "permissions" : [ "management", "write", "delete", "read", "execute" ], "roleName" : "admin" }, { "permissions" : [ "read" ], "roleName" : "user" }, { "permissions" : [ "write", "delete", "read", "execute" ], "roleName" : "developer" } ], "members" : [ { "roles" : [ "admin", "user", "developer" ], "userId" : ObjectId("6048fed6bdc2a67d6e9c7fc1") }, { "roles" : [ "admin", "user", "developer" ], "userId" : ObjectId("6048fed6bdc2a67d6e9c7fc2") } ] });
otf.users.insert({"_id": ObjectId("6048fed6bdc2a67d6e9c7fc1"),"permissions":["user"], "enabled":true, "password":"$2a$14$QWEuhquhhT.1dtVsmXq0QOxOMSmInjvQtr43Jbyz07nEeTbABdwqa", "firstName":"username", "lastName":"username", "email":"username", "isVerified":true});
otf.users.insert({"_id": ObjectId("6048fed6bdc2a67d6e9c7fc2"),"permissions":["admin"], "enabled":true, "password":"$2a$14$QWEuhquhhT.1dtVsmXq0QOxOMSmInjvQtr43Jbyz07nEeTbABdwqa", "firstName":"otf", "lastName":"user", "email":"otfuser@email.com", "defaultGroup" : ObjectId("604901d4498e3a006261b1e6"), "isVerified":true});
