import java.lang.Exception
import kotlin.text.toInt

fun main(){

    print("Enter your age :   ")
    var age = readLine()!!.toInt()
    try {
        age!!.toInt()

    }catch (e:Exception){
        println( "Error")
    }
    if (age > 18 ){
        println("Welcome")
    }
    else
        println("You are not old enough")

}