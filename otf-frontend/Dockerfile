#   Copyright (c) 2019 AT&T Intellectual Property.                             #
#                                                                              #
#   Licensed under the Apache License, Version 2.0 (the "License");            #
#   you may not use this file except in compliance with the License.           #
#   You may obtain a copy of the License at                                    #
#                                                                              #
#       http://www.apache.org/licenses/LICENSE-2.0                             #
#                                                                              #
#   Unless required by applicable law or agreed to in writing, software        #
#   distributed under the License is distributed on an "AS IS" BASIS,          #
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   #
#   See the License for the specific language governing permissions and        #
#   limitations under the License.                                             #
################################################################################
FROM node:8.16-alpine

ENV ENV=development
ENV NAMESPACE=namespace
ENV APP_NAME=otf-frontend
ENV APP_VERSION=1.0
ENV OTF_URL=https://localhost:32524/
ENV OTF_EMAIL=email@email.com
ENV AUTHENTICATION_SECRET=/ytoYB+iD5HUuDLmeqStcoUPwqw=
ENV SERVICEAPI_URL=https://localhost:32303/otf/api/
ENV SERVICEAPI_URIEXECUTETESTINSTANCE=testInstance/execute/v1/id/
ENV SERVICEAPI_AAFID=username
ENV SERVICEAPI_AAFPASSWORD=password
ENV CAMUNDAAPI_URL=https://localhost:31313/
ENV CAMUNDAAPI_AAFID=username
ENV CAMUNDAAPI_AAFPASSWORD=password
ENV MONGO_BASEURL=localhost:27017/
ENV MONGO_DBOTF=otf
ENV MONGO_REPLICASET=rs0
ENV MONGO_USERNAME=username
ENV MONGO_PASSWORD=password
#ENV HTTP_PROXY=http://sub.proxy.att.com:8080
#ENV HTTPS_PROXY=http://sub.proxy.att.com:8080

ARG HTTP_PROXY="http://proxy.conexus.svc.local:3128" 
ARG HTTPS_PROXY="http://proxy.conexus.svc.local:3128" 
ARG NO_PROXY="npmjs.org,github.com"
ARG http_proxy="http://proxy.conexus.svc.local:3128" 
ARG https_proxy="http://proxy.conexus.svc.local:3128"
ARG no_proxy="npmjs.org,github.com"

RUN npm config set unsafe-perm true
RUN npm cache clean --force
RUN npm config set registry https://registry.npmjs.org/
RUN node -v

COPY . /home/node
WORKDIR /home/node

RUN mkdir -p /otf/logs

#RUN npm install webpack
#RUN npm install webpack webpack-dev-server 
RUN npm i -g webpack
RUN npm i -g webpack-dev-server
RUN npm i -g --unsafe-perm @angular/cli@6.2.9 
RUN npm install --save-dev @angular-devkit/build-angular
RUN npm install --unsafe-perm
RUN npm run-script build

ENTRYPOINT [ "npm", "start" ]
