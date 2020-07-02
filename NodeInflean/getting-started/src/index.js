// index.js
// ES6
import _ from 'lodash';     //
// ES5
// var _ = require('lodash');


function component() {
    var element = document.createElement('div');

    /* lodash is required for the next line to work */
    element.innerHTML = _.join(['Hello', 'webpack'], ' ');
    // 문자열 'hello', 'world'를 넣어줌
    return element;
}

document.body.appendChild(component());