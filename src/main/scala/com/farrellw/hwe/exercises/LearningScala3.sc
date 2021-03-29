// Functions

// format def <function name> (parameter name: type...) : return type = { }


def squareIt(x:Int) : Int = {
  x * x
}

def cubeIt(x:Int) : Int = {x * x * x}

println(squareIt(2))

println(cubeIt(3))

def tranformInt(x: Int, f: Int => Int): Int = {
  f(x)
}

val result = tranformInt(2, cubeIt)
println(result)

tranformInt(3, x => x * x * x)

tranformInt(10, x => x/2)

tranformInt(2, x => {val y = x*2; y*y})

def upper(x: String) : String = {
  x.toUpperCase
}
println(upper("make me big please"))

println(upper("This is really a lot like javascript"))

def transformString(x: String, f: String => String): String = {
  f(x)
}

transformString("make me big please", upper)

transformString("make me big also", x => x.toUpperCase)