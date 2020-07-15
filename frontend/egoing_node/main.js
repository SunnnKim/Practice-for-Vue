var http = require('http');
var fs = require('fs');
var url = require('url');
var qs = require('querystring')

var app = http.createServer(function (request, response) {
    var _url = request.url;

    var queryData  = url.parse( _url, true).query;


    if (_url == '/') {
        _url = '/index.html';
    }
    if (_url == '/favicon.ico') {
        return response.writeHead(404);
    }
    if(_url == '/creat_process'){
        var body = '';
        request.on('data', function(data){
            body += data
            console.log(data)
        })
        request.on('end', function(){
            var query = qs.parse(body)
            console.log(query)
        })
        response.writeHead(200);
        response.end('success');
        return;
    }
else{

    response.writeHead(200);
    response.end(fs.readFileSync(__dirname + _url));
    
}
});
app.listen(3000);
