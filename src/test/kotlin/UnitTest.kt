import org.example.deepClone.CopyUtils
import org.example.deepClone.Man
import kotlin.test.Test
import kotlin.test.assertEquals

class UnitTest {
    @Test
    fun deepCloneTest() {
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
        assertEquals(clonedAram.name, aram.name)
        assertEquals(clonedAram.age, aram.age)
        assertEquals(clonedAram.favoriteBooks, aram.favoriteBooks)
    }
}