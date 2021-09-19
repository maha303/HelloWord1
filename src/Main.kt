import java.lang.Exception
import kotlin.text.toInt

fun main(){

    print("Enter your age :   ")
   
    try { 
        var age = readLine()!!.toInt()
        if (age > 18 ){
        println("Welcome")
    }
    else
        println("You are not old enough")

    }catch (e:Exception){
        println( "Error")
    }
    

}
