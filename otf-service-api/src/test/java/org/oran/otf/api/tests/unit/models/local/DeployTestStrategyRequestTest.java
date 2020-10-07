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


package org.oran.otf.api.tests.unit.models.local;

import org.oran.otf.common.model.local.DeployTestStrategyRequest;
import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;

public class DeployTestStrategyRequestTest {
  private static DeployTestStrategyRequest deployTestStrategyRequest;

  @BeforeClass
  public static void setup(){
    deployTestStrategyRequest = new DeployTestStrategyRequest();
  }
  @Test
  public void testDeployTestStrategyRequestHasTestDefinitionDeployerIdField(){
    Assertions.assertThat(deployTestStrategyRequest).hasFieldOrProperty("testDefinitionDeployerId");
  }
  @Test
  public void testDeployTestStrategyRequestHasTestDefinitionIdField(){
    Assertions.assertThat(deployTestStrategyRequest).hasFieldOrProperty("TestDefinitionId");
  }
  @Test
  public void testDeployTestStrategyRequestHasDefinitionIdField(){
    Assertions.assertThat(deployTestStrategyRequest).hasFieldOrProperty("DefinitionId");
  }

}
