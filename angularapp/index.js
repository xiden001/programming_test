var express = require('express'),
  http = require('http');

var app = express()
  .use(express.bodyParser())
  .use(express.static('public'));

http.createServer(app).listen(3000, function () {
  console.log("Server ready at http://localhost:3000");
});