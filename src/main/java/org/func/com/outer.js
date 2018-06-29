function outer() {
    var x = 11;
    function inner() {
        x = x + 1;
        console.log(x);
    }

    return inner;
}


var test = outer();
