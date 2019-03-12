var a;

function fibcal(a) {
    if (a == 0) {
        return a;
    }

    if (a == 1) {
        return 1;
    }

    else {
        return (fibcal(a - 1) + fibcal(a - 2));
    }
}//end fibonacci function