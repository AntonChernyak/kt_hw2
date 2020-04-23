package ru.netology.hiearchy

fun main() {
    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)
    println(title.text)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
    println(readMore.text)
}