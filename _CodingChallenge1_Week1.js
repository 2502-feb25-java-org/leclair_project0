var a;

function fizzbuzz(a) {
    'use strict';
    if (((a % 3) === 0) && ((a % 5) === 0)) {
        return "Fizz Buzz";
    }
    
    else if((a % 3) === 0){
        return "Fizz";
    }

    else if((a % 5) === 0){
        return "Buzz";
    }
    
    else{
        return a.toStrinng();
    }
}//end fizzbuzz function
