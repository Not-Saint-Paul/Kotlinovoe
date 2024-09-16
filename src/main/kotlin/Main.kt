package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num = 1.0
    var sum = 0.0
    var mean = 0.0
    var numberOfNumbers = 0

    println("Enter numbers below (Enter 0 = stop input):")
    while (num != 0.0) {
        num = readln().toDouble()
        sum += num
        ++numberOfNumbers
    }

    mean = sum / numberOfNumbers
    print("Number of numbers: $numberOfNumbers \nSum of numbers: $sum \nArithmetic mean of numbers: $mean")
}