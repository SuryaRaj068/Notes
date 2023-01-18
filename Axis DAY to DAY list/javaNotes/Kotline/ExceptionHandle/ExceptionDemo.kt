

fun main(){
    try{
        try{
        var data = 20/10;
        throw ArithmeticException("my exception");
        }catch(e:ArithmeticException){
            print(e);
        }
    }catch(e:ArithmeticException){
        print(e)
    }catch(e:NullPointerException){
    
    }finally{
        print("complete of program");
    }
}