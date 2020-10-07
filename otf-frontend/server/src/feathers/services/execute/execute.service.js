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


// Initializes the `groups` service on path `/groups`
const createService = require('./execute.class');
const hooks = require('./execute.hooks');

module.exports = function (app) {
	const paginate = app.get('paginate');

	const options = {
		app,
		paginate
	};

	app.use(app.get('base-path') + 'execute', createService(options));

	const service = app.service(app.get('base-path') + 'execute');

	service.hooks(hooks);
};
