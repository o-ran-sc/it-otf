<<<<<<< HEAD   (7fb4df added updated code for test env)
const assert = require('assert');
const app = require('../../src/app');

describe('\'testStrategies\' service', () => {
	it('registered the service', () => {
		const service = app.service('test-strategies');

		assert.ok(service, 'Registered the service');
	});
});
=======
>>>>>>> CHANGE (c83081 added sharding code)
