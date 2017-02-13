var format = function (str, obj) {
    var util = require('util');
    
    var arr = str.split(" ");

    var ret = "";

    for(var i in arr){
        if(arr[i].search("{") >= 0 && arr[i].search("}")>=0)
        {
            var el = arr[i].substring(arr[i].search("{")+1, arr[i].search("}"));
            
            if(util.isArray(obj))
                var a = obj[el];
            else
                var a = obj[el];
            
            if(a == null || a == undefined){
                ret = ret + arr[i] + " ";  
            }
            else
                ret = ret + arr[i].replace("{"+el+"}",a) + " ";

        }
        else
            ret = ret + arr[i] + " ";
    }
    
    return ret.substr(0,ret.length-1);
    



    

    /*if(util.isArray(obj)){
        for(i=0;i<obj.length;i++){
            str = str.replace("{"+ i +"}",obj[i]);
            //str.replace(new RegExp("{"+ i +"}", 'g'), obj[i]);
        }   
    }
    else
    {
        for(var k in obj){
            target.replace(new RegExp("{"+ k +"}",'g' ), obj[k]);
            //str = str.replace("{"+ k +"}",obj[k]);
        }       
    }

    return str;*/

};

ret = format('Hello {0} - {foobar} make me {2} {1} - I\'m full..', ['Jack', 'sandwiches', 0]);
//ret2 =format('Hello {foo} - {foobar} make me a {bar}... {foo}!!?', { bar : 'sandwich {foo}', foo : 'Jack' });