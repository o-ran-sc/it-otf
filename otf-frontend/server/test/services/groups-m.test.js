<<<<<<< HEAD   (7fb4df added updated code for test env)
const assert = require('assert');
const app = require('../../src/app');

describe('\'groupsM\' service', () => {
	it('registered the service', () => {
		const service = app.service('groups-m');

		assert.ok(service, 'Registered the service');
	});
});
=======
>>>>>>> CHANGE (c83081 added sharding code)
