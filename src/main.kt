fun main(args : Array<String>){
    println("Hello World")
var age= readLine()!!.toInt()
    var message:String
    message=if(age>18){
        "you can vote"
    }else if(age<18){
        "you cannot vote"
    }
    else
        "you can vote"
    println(message)
    println("Enter age again")
     age= readLine()!!.toInt()
    message= when {
        age>18 -> {
            "you can vote"
        }
        age<18 -> {
            "you cannot vote"
        }
        else -> "you can vote"
    }
    println(message)
}