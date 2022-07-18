
var max = parseInt(-100 + "");
for (var i = 1; i <= 5; i++) {
    var v = parseInt(prompt("Enter number"));
    if (v > max) {
        max = v;
    }
}
document.write(max);