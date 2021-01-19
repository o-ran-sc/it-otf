const fs = require('fs');
const { execSync } = require('child_process');
const path = './ng-add-pug-loader.js';

try {
    if (!fs.existsSync(path)) {
        console.log('ng add ng-cli-pug-loader@0.1.7')
        execSync('ng add ng-cli-pug-loader@0.1.7');
    }
    console.log('node ' + path);
    execSync('node ' + path);

} catch (err) {
    console.log(err);
}
