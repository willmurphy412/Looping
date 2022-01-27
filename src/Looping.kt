fun main() {
    var userInput: Int

    val opt1 = "White Bread, Ham, Cheese"
    val opt2 = "White Bread, Jelly, Peanut Butter"
    val opt3 = "White Bread, Meatball, Provolone"
    val opt4 = "Multigrain, Ham, Cheese"
    val opt5 = "Multigrain, Jelly, Peanut Butter"
    val opt6 = "Multigrain, Meatball, Provolone"

    //Takes input from user and checks if it's valid
    do{
        println("Please enter the number of the desired selection below:")
        println("""
            1)$opt1
            2)$opt2
            3)$opt3
            4)$opt4
            5)$opt5
            6)$opt6
            
            7)Exit
        """.trimIndent())
        print("Enter Choice Here: ")
        userInput = readLine()!!.toInt()
        if(userInput < 1 || userInput > 7)
            println("Sorry that is not a valid input. Please try a again")
    }while(userInput < 1 || userInput > 7)

    //Displays user's selection
    if(userInput == 1)
        println("You have selected: $opt1")
    else if(userInput == 2)
        println("You have selected: $opt2")
    else if(userInput == 3)
        println("You have selected: $opt3")
    else if(userInput == 4)
        println("You have selected: $opt4")
    else if(userInput == 5)
        println("You have selected: $opt5")
    else if(userInput == 6)
        println("You have selected: $opt6")
    else
        println("Have a Great Day!")

}