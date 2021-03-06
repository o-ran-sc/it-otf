/*  Copyright (c) 2019 AT&T Intellectual Property.                             #
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
##############################################################################*/


package org.oran.otf.camunda.configuration.listener;

import org.camunda.bpm.spring.boot.starter.event.JobExecutorStartingEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class OTFJobExecutorStartingEventListener extends JobExecutorStartingEventListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(OTFJobExecutorStartingEventListener.class);

    @Value("${otf.camunda.executors-active}")
    private boolean executorsActive;

    protected void activate() {
        if(!executorsActive){
            LOGGER.info("job executor auto start disabled. otf.camunda.executors-active: " + this.executorsActive);
            jobExecutor.shutdown();
            return;
        }
        if (!jobExecutor.isActive()) {
            jobExecutor.start();
        } else {
            LOGGER.info("job executor is already active");
        }
    }

}
