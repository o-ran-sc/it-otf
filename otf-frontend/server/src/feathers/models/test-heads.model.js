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



module.exports = function (app) {
	const mongooseClient = app.get('mongooseClient');
	const { Schema } = mongooseClient;
	const testHeads = new Schema({
		testHeadName: { type: String, required: true, unique: true },
		testHeadDescription: { type: String, required: true },
		testHeadType: { type: String },
		vthInputTemplate: { type: Object, default: {} },
		//vthOutputTemplate: { type: Object, default: {} },
		vendor: String,
		port: { type: String },
		hostname: { type: String },
		resourcePath: { type: String },
		creatorId: { type: Schema.Types.ObjectId, ref: 'users' },
		groupId: { type: Schema.Types.ObjectId, ref: 'groups', required: true },
		authorizationType: { type: String },
		authorizationCredential: { type: String },
		authorizationEnabled: { type: Boolean, default: false },
		isPublic: { type: Boolean }
	}, {
		shardKey: { groupId: 1 },
		timestamps: true
	});

	return mongooseClient.model('testHeads', testHeads, 'testHeads');
};