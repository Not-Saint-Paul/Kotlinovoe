package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter number below")
    var number = readln()
    println("First digit: " + number.first() + "\nLast digit: " + number.last())
}