<<<<<<< HEAD   (7fb4df added updated code for test env)
const assert = require('assert');
const app = require('../../src/app');

describe('\'bpmnValidate\' service', () => {
	it('registered the service', () => {
		const service = app.service('bpmn-validate');

		assert.ok(service, 'Registered the service');
	});
});
=======
>>>>>>> CHANGE (c83081 added sharding code)
