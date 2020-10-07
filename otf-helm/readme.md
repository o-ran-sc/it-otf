Open Test Framework 

Use these heml charts to deploy otf

#Mongo
helm install otf/charts/databases/mongo

#SQL
helm install otf/charts/databases/mysqldb -f otf/values.yaml
