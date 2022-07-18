
var s = parseInt(prompt("Enter number"));
var msg = "";
for (var k = 1; k <= s; k++) {
    msg += "number is:" + k + " square is:" + (k * k) + "\n";
}
alert(msg);