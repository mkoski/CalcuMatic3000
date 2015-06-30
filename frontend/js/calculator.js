function Calculate($scope, $http) {
	$http.get('http://localhost:8080/addition/1/1').
	success(function(data) {
		$scope.result = data;
	});
}