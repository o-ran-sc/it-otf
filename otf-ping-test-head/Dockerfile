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

FROM python:2.7

# ARG HTTP_PROXY="localhost:8080"
# ARG HTTPS_PROXY="localhost:8080"
# ARG http_proxy="localhost:8080"
# ARG https_proxy="localhost:8080"


ENV NAMESPACE=namespace
ENV APP_NAME=otf-ping-test-head
ENV APP_VERSION=1.0

RUN python --version

ADD pip-requirements.txt pip-requirements.txt
ADD otfPingTestHead.py otfPingTestHead.py

RUN mkdir -p /otf/logs

RUN python -m pip install -r pip-requirements.txt

ENTRYPOINT ["python", "otfPingTestHead.py"]
