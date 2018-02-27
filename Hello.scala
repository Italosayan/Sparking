println("Hello, mike")
//Blocks - Combine expressions {}
println({
  val x = 1 + 1
  x + 1
})

//Function
val add = (x: Int, y: Int) => x + y
println(add(1, 2)) // 3

//Method
def add(x: Int, y: Int): Int = x + y
println(add(1, 2)) // 3

//Multiple parameter lists
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
println(addThenMultiply(1, 2)(3)) // 9

//Def syntax
//def name(varname1:type, ...)(varnameone: type ...): What does it return? type = expression