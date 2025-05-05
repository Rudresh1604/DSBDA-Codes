import scala.io.StdIn.readLine
import scala.io.StdIn.readDouble
object Calculator {
 def main(args: Array[String]): Unit = {
 var continue = true
 while (continue) {
 println("\nEnter first number:")
 val num1 = readDouble()
 println("Enter second number:")
 val num2 = readDouble()
 println("Choose operation: + - * /")
 val op = readLine()
 val result = op match {
 case "+" => num1 + num2
 case "-" => num1 - num2
 case "*" => num1 * num2
 case "/" =>
 if (num2 != 0) num1 / num2
 else {
 println("Cannot divide by zero!")
 "Undefined"
 }
 case _ =>
 println("Invalid operator.")
 "Invalid"
 }
 println(s"Result: $result")
 println("Do you want to perform another operation? (yes/no):")
 val choice = readLine().toLowerCase()
 if (choice != "yes" && choice != "y") {
 continue = false
 println("Exiting calculator. Goodbye!")
 }
 }
 }
}


object Arithmetic {
  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 5

    println(s"Addition: $a + $b = ${a + b}")
    println(s"Subtraction: $a - $b = ${a - b}")
    println(s"Multiplication: $a * $b = ${a * b}")
    println(s"Division: $a / $b = ${a / b}")
  }
}