angular.module('airline', ['ExampleAppy'])
	.config(airlineRouter);

function airlineRouter ($routeProvider) {
	$routeProvider
		.when('/', {templateUrl: 'partials/destinations.html',
		 controller: 'ExampleAppy'})
		
}
