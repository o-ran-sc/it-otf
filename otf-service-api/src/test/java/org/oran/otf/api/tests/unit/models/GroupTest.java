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


package org.oran.otf.api.tests.unit.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.oran.otf.common.model.Group;
import org.junit.BeforeClass;
import org.junit.Test;


public class GroupTest {
  private static Group group;
  @BeforeClass
  public static void setup(){
    group = new Group();
  }
  @Test
  public void testGroupHasNameField(){
    assertThat(group).hasFieldOrProperty("groupName");
  }
  @Test
  public void testGroupHasGroupDescriptionField(){
    assertThat(group).hasFieldOrProperty("groupDescription");
  }

  @Test
  public void testGroupHasMechanizedIdsField(){
    assertThat(group).hasFieldOrProperty("mechanizedIds");
  }

  @Test
  public void testGroupHasOwnerIdField(){
    assertThat(group).hasFieldOrProperty("ownerId");
  }
}
