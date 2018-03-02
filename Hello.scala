/*
BASICS
*/
val two = 1 + 1 
// inmutable(python string)
var name = "steve"
// mutable

println("Hello, mike")
//Blocks - Combine expressions {}
println({
  val x = 1 + 1
  x + 1
})

//Function
//Object with apply method.
val add = (x: Int, y: Int) => x + y
println(add(1, 2)) // 3
(x: Int) => x + 1// Anonymous Function

//Method
def add(x: Int, y: Int): Int = x + y
println(add(1, 2)) // 3

//Multiple parameter lists
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
println(addThenMultiply(1, 2)(3)) // 9

//Function Syntax
//val name = (varname1:type, ...)(varnameone: type ...)=> What does it return? expression
//Method Syntax
//def name(varname1:type, ...)(varnameone: type ...): What does it return? type = expression

/*
2.0
*/

//Partial Application
val add = (x: Int, y: Int) => x + y
val add2 = add(2, _:Int)
add2(10) // 12 

//Curried functions(So that I can define using a parameter)
//Requires method: why?? TODO
def add(x: Int, y: Int): Int = x + y
val curriedAdd = (add _).curried
val addTwo = curriedAdd(2)
addTwo(4)// 6

//Variable length arguments
def capitalizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}
capitalizeAll("rarity", "applejack") // ArrayBuffer(Rarity, Applejack)

//Classes
class Calculator(brand: String) {
	def add(m: Int, n: Int): Int = m + n
	/**
	A constructor.
	*/
	val color: String = if (brand == "TI") {
		"blue"
	} else if (brand == "HP") {
		"black"
	} else {
		"white"
	}

}//defined class Calculator

val calc = new Calculator("HP")
calc.add(1, 2) //Int = 3
calc.color//String = black

//Inheritance
class ScientificCalculator(brand: String) extends Calculator(brand) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

//Traits
//traits are collections of fields and behaviors that you can extend or mixin to your classes.

trait Car {
  val brand: String
}

trait Shiny {
  val shineRefraction: Int
}
