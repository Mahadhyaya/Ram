function fun(n) {
// alert("msg");
if (n < 2) {
    return n;
}
st = fun(n - 2) + fun(n - 1);
return st;
}

