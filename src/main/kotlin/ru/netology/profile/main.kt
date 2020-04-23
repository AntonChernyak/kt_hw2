package ru.netology.profile

fun main() {
    val userOne = Profile(1, "qwerty", "John", "Crown")
    val userTwo = Profile(2, "ZeD", "Jack", "Sparrow")
    val userThree = Profile(3, "HarUbaTOP228", "Vova", "Shkolnikov", true, 12)

    println(userOne.fullName)
    println(userTwo.fullName)
    println(userThree.fullName)
}