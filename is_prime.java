var isPrime = function(number){
    var root = sqrt(number);
    var result = "";
    var factor = 0;
    for (var i = 2; i < root + 1; i++){
        if(number % i === 0){
            if(i !== number){
               result = 'False';
            } else {
                result = 'True';
            }
        } else {
            result = 'True';
        }
    }
    return result;
};



println(isPrime(425));


//Better version (from Khan Academy)

var isPrimeA = function(inputNum){
     Asteps = Asteps+2;
     // assume inputNum is prime
     var primeCheck = true;
    // loop until test <= square root of inputNum
    var upperBound = floor(sqrt(inputNum));

    for(var test = 2; test <= upperBound; test++){
        Asteps = Asteps+3;
    // check if test divides inputNum
        if (inputNum % test === 0){
        // found a factor!
        primeCheck = false;
        }
    
    } // end of loop
    // return TRUE or FALSE
    return primeCheck;
 };
