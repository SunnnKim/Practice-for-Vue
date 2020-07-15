const http = require('http');
const fs = require('fs');
// const mysql = require('');
const querystring = require('querystring');


var server = http.createServer(function (request, response) {
    if(request.url == '/'){
        response.writeHead(301, {Location:'/index.html'});
        response.end('Hello node.js!!');
    }
});

// 3. listen 함수로 8080 포트를 가진 서버를 실행한다. 서버가 실행된 것을 콘솔창에서 확인하기 위해 'Server is running...' 로그를 출력한다
server.listen(8090, function () {
    console.log('Server is running...');
});