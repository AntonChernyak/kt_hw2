package ru.netology.profile

class Profile(
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    var status: Boolean = false,
    var avatar: Int = 0
) {
    val fullName: String = "$name $surname"
}