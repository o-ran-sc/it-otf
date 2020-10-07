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


package org.oran.otf.common.utility.database;

import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public class Generic {

  public static <T> boolean identifierExistsInCollection(
      MongoRepository<T, String> repository, ObjectId identifier) {
    return repository.findById(identifier.toString()).isPresent();
  }

  public static <T> T findByIdGeneric(MongoRepository<T, String> repository, ObjectId identifier) {
    Optional<T> optionalObj = repository.findById(identifier.toString());
    return optionalObj.orElse(null);
  }


}
