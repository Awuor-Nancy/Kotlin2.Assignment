fun main() {
    var total = add(2,7,9,3)
    println(total)

    var y= quotient(30,7.2F)
    println(y)

    var n =greeting("Ada")
    println(n)

    var f =aboutme("I am Not gullible")
    println(f)

}

fun add(x:Int,y:Int,z:Int,w:Int) :Int {
    var sum=x+y+z+w
    return sum
}

fun quotient(a:Int, b:Float) :Float {
    var remainder= a%b
    return remainder

}
fun greeting(name:String) :String {
    var name ="Hello $name"
    return name

}
fun aboutme(name:String) :String{
    var name= "I am Not gullible"
    return name
}