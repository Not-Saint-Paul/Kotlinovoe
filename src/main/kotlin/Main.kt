package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var usersNum = 0
    var randNum = 1

    while (usersNum != randNum) {
        print("Enter number: ")
        usersNum = readln().toInt()
        randNum = (0..10).random()

        if (usersNum < randNum) println("Your number is less then number to guess")
        else if (usersNum > randNum) println("Your number is greater then number to guess")
        else println("You guessed the number!")
    }
}