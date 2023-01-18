


fun main(){

 var myfunction : (Int) -> Unit={i:Int -> println(i)}
    dataFormat({data1:String,data2:String->"$ $data1 $ $data2"})
//     myfunctiondemo(20,30)
    addAll(10,20,myfunction)
//     var demo: (Int,Int)->Unit={i:Int,j:Int->print(i+j)};
//     demo(10,20)
 }
var demo: (Int,Int)->Unit={i:Int,j:Int->print(i+j)};
var myfunctiondemo:(Int,Int) -> Unit={i:Int,j:Int -> print(i+j)}

fun addAll(num:Int,num1:Int,myfunction:(Int)->Unit){
    myfunction(num+num1);
    myfunctiondemo(20,30);
}

fun dataFormat(mydemo:(String,String)->Unit){
    val format1:(String,String)->String={data1,data2->"$ $data1 $ $data2"}
    print(format1("demo","demo1"));
}
// inlinefunction

