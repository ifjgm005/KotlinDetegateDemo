package com.yunguo.kotlindelegatedemo

open class People(val name: String) {
    fun eat() {
        print("$name is eating")
    }

    fun sleep() {
        print("$name is sleeping")
    }
}


interface ICode {
    fun coding()
}
class Code(val name: String) : ICode {
    override fun coding() {
        print("$name is coding")
    }
}