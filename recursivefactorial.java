var factorial = function(n) {
	// base case: 
	if(n === 0){
	    return 1;
	}
	// recursive case:
	else{
	    return n * factorial(n - 1);
	}
}; 

println("The value of 0! is " + factorial(0) + ".");
println("The value of 5! is " + factorial(5) + ".");

Program.assertEqual(factorial(0), 1);
Program.assertEqual(factorial(5), 120);
Program.assertEqual(factorial(1), 1);
Program.assertEqual(factorial(2), 2);
