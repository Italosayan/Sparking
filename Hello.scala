/*
BASICS
*/
val two = 1 + 1 // inmutable(python string)
var name = "steve"// mutable

println("Hello, mike")
//Blocks - Combine expressions {}
println({
  val x = 1 + 1
  x + 1
})

//Function
val add = (x: Int, y: Int) => Int = x + y
println(add(1, 2)) // 3
(x: Int) => x + 1// Anonymous Function
//Method
def add(x: Int, y: Int): Int = x + y
println(add(1, 2)) // 3

//Multiple parameter lists
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
println(addThenMultiply(1, 2)(3)) // 9

//Function Syntax
//val name = (varname1:type, ...)(varnameone: type ...)=> What does it return? type = expression
//Method Syntax
//def name(varname1:type, ...)(varnameone: type ...): What does it return? type = expression

/*
PARTIAL APPLICATION
*/