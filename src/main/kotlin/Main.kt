package org.example.deepClone

fun main() {
    println("Deep-clone!")
    val aram = Man(
        name = "Aram",
        age = 31,
        favoriteBooks = mutableListOf(
            "Total Money Makeover",
            "Kotlin in Action",
            "Richest Man in Babylon"
        )
    )
    val clonedAram = CopyUtils.deepCopy(aram)
    println("name: ${clonedAram.name}")
    println("age: ${clonedAram.age}")
    println("favorite books: ${clonedAram.favoriteBooks}")
}

internal class Man(var name: String?, var age: Int, var favoriteBooks: MutableList<String?>?)
internal object CopyUtils {
    fun deepCopy(obj: Man): Man {
        println("deepCopy() -->")
        return Man(
            name = obj.name,
            age = obj.age,
            favoriteBooks = obj.favoriteBooks
        )
    }
}