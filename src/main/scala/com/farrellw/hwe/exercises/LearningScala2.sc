//Flow control

//If / else

if (1>3) println("Impossible") else println("The World makes sense")

if (1 > 3) {
  println("Impossible")
  println("Really")
} else {
  println("the world makes sense.")
  println("still.")
}

// Matching
val number = 2

number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}

for (x <- 1 to 4){
  val squared = x * x
  println(squared)
}

var x = 10

while (x >= 0){
  println(x)
  x -= 1
}

x = 0

do{ println(x); x+= 1} while (x <=10)

// Expressions

{ val x = 10; x + 20;}

println({val x = 10; x + 20})

var y =0
println(y)
var x = 1
for (i <-1 to 9){
  println(x)
  val temp = x
  x +=y
  y = temp
}