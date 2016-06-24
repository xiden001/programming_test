angular.module('ExampleApp', ['pouchdb'])

.factory('pouchService', function() {
  var res = false;  
  var db = new PouchDB('dbname');

  var saveNew = function(){ 
  
   db.put({
  _id: 'mydoc',
  title: 'Heroes'
}, function(err, response) {
  if (err) { return console.log(err); }
  // handle response
  res = true;
});

return res;
}


return res;
});






function DestinationsCtrl ($scope) {
 	
}