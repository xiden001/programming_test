'use strict';

module.exports = function (grunt) {
	
grunt.loadNpmTasks('grunt-karma');

grunt.initConfig({
karma: {  
  unit: {
    options: {
      frameworks: ['jasmine'],
      singleRun: true,
      browsers: ['PhantomJS'],
      files: [
        'bower_components/angular/angular.js',
        'bower_components/angular-mocks/angular-mocks.js',
        'bower_components/angular-pouchdb/angular-pouchdb.min.js',
        'public/js/lib/pouchdb.min.js',
        'public/js/controllers/*.js'
      ]
    }
  }
},

concat: {  
  options: {},
  dist: {
    files: {
      'public/js/app.js': [
         'js/**/*.js',
         '!public/js/controllers/*.tests.js'
       ]
    }
  }
},

 // The actual grunt server settings
    connect: {
      options: {
        port: 9000,
        // Change this to '0.0.0.0' to access the server from outside.
        hostname: 'localhost',
        livereload: 35729
      }
    },
      test: {
        options: {
          port: 9001,
          
        }
      }
});




grunt.registerTask('test', [  
  'karma'
]);

};