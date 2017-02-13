
String.prototype.toJadenCase = function () {

    var arr = this.split(' ');
    var ret = "";

    for (var i = 0, len = arr.length; i < len; i++) {
        ret += arr[i].charAt(0).toUpperCase() + arr[i].substr(1).toLowerCase() + " ";
    }
    
    ret = ret.substring(0,ret.length - 1);
    return ret;
};

var str = "How can mirrors be real if our eyes aren't real";
var ret = str.toJadenCase();


//Test.assertEquals(str.toJadenCase(), "How Can Mirrors Be Real If Our Eyes Aren't Real");
