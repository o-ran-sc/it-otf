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


// Initializes the `testInstances` service on path `/test-instances`
const createService = require('./messages.class');
const hooks = require('./messages.hooks');
const io = require('socket.io-client');
const socket = io();
 
module.exports = function (app) {

	// Initialize our service with any options it requires
	app.use(app.get('base-path') + 'messages', createService());

	// Get our initialized service so that we can register hooks
    const service = app.service(app.get('base-path') + 'messages');
    service.on('created', data => {
        app.io.sockets.emit('message', 'service')
    })

    

	service.hooks(hooks);
};
