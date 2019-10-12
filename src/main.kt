fun main(){

    //Declaring the variables of numbers which the user will insert
    var x: Int
    var y: Int

    //
    var result = 0
    var exitGame = ""
    var operand = ""

    while(exitGame != "exit") {
        println("Enter the operand: ")
        operand = readLine().toString()

        if (operand != "+" && operand != "-" && operand != "*" && operand != "/") {
            println("Operand not valid")
            break
        } else{

        println("Enter the first value: ")
        x = Integer.valueOf(readLine())

        println("Enter the second value: ")
        y = Integer.valueOf(readLine())
        if (operand == "+") {
            result = x + y
        } else if (operand == "-") {
            result = x - y
        } else if (operand == "*") {
            result = x * y
        } else if (operand == "/") {
            result = x / y
                    }
            println(result)
            println("If you want to quit write: exit")
            exitGame = readLine().toString()
        }
    }
}