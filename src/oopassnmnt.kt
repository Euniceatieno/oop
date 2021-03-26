fun main() {
    var output=Human("Eunice",20,56)
    output.eat(10)
    output.speak("I love Kotlin")
    output.birthday()
    var details=User("Eunice","Atieno","eunniceatieno@gmail.com","0798676088","mystar")
    println(details.firstName)
    println(details.password)

}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        var result=weight+foodWeight
        println(result)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        var humanAge=age+1
        println(humanAge)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){


}