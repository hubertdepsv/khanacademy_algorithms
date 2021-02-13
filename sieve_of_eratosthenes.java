/*
 * Sieve of Eratosthenes Algorithm
 *
 * Input: upperBound (how far we look for primes)
 */
var sieve = function(upperBound) {

// ignore all input less than 2
    if (upperBound < 2){
        return;
    }
    
// build array to mark numbers with
var isComposite = [upperBound];

// array to hold primes (HOW DID I DECIDE THIS SIZE?)
var primes = [upperBound/log(upperBound)];

// mark 0, 1 as not prime
isComposite[0] = 1;
isComposite[1] = 1;

// loop from 2 to sqrt(upperBound)
for (var m = 2; m*m <= upperBound; m++){
    // if prime (ie !== 1)
    if (isComposite[m] !== 1){
      // now mark off all multiples starting at m^2
      for (var z = m*m; z <= upperBound; z += m){
        // mark position z as composite (ie. === 1) 
        isComposite[z] = 1;
      }
    }
}
// END OF SIEVE

// This is just a rough way to store primes in
// a separate array (this can be improved)
var p = 0;
// print all primes by scanning array
for (var h = 0; h <= upperBound; h++){
    // when you find a unmarked number
    if (isComposite[h] !== 1){
    // put it in the prime array
    primes[p] = h;
    // increment to next cell in array
    p++;
    }
}

Copyright Kan Academy
