package ru.netology.hiearchy

class ViewGroup : View() {
    fun addView(view: View) {
        println("Добавлено $view")
    }
}