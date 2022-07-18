var n1 = parseInt(prompt("Enter first number"));
var n2 = prompt("Enter second number");
var evenSum = 0;
var oddSum = 0;
var str = " ";
var stt = "";
sk = "";
for (var k = n1; k <= n2; k++) {
    if (k & 1 == 0) {
        str += k + " ";
        evenSum += k ;
        sk += k.toString();
    } else {
        oddSum += k;
        stt += k + " ";
    }
}
document.write("Even num are:" + str + "= " + evenSum + "<br />");
// document.write("even sum is:" + evenSum + "<br />");
document.write("Odd num are:" + stt + "= " + oddSum);
document.write(sk);
//document.write("odd sum is:" + oddSum);