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
