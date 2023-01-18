

var myarray=Array<Int>(10){0};
var myArray2=arrayOf(1,2,3,4,5);
var intArray=floatArrayOf(1f,2f,3f,4f,5f,6f);

fun main(){
    for(ele in myarray){
        println(ele)
    }
    for(ele in myArray2){
        println(ele)
    }
    print(myarray.size)
    myarray[0]=10;
    myarray.get(0);
    myarray.set(3, 25);
    var charlist=charArrayOf('c','h','a','n','d','h','a','n');
    var str=String(charlist)
    str.subSequence(5, str.length);
    
}
"surya kumar"