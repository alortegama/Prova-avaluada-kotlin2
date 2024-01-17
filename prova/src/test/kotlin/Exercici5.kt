import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class Exercici5 {

    @Test
    fun `Filtrar una llista buida`() {
        val nums = emptyList<Int>()
        val result = filtrarMenorsQueMax(nums, 5)
        assertTrue(result.isEmpty(), "La llista ha de continuar estant buida si la llista original és buida")
    }

    @Test
    fun `Tots els elements menors de max (5)`() {
        val nums = listOf(1, 2, 3, 4)
        val max = 5
        val result = filtrarMenorsQueMax(nums, max)
        assertEquals(nums, result, "Si tots els elements són menors que max, tots haurien de estar a la llista de resultats.")
    }

    @Test
    fun `Alguns elements mes petits de max(5)`() {
        val nums = listOf(1, 2, 3, 4, 5, 6)
        val max = 5
        val expected = listOf(1, 2, 3, 4)
        val result = filtrarMenorsQueMax(nums, max)
        assertEquals(expected, result, "Només els elements menors que max haurien de estar a la llista de resultats.")
    }

    @Test
    fun `Tots els elements majors de max(5)`() {
        val nums = listOf(5, 6, 7, 8, 9, 10)
        val max = 5
        val result = filtrarMenorsQueMax(nums, max)
        assertTrue(result.isEmpty(), "Si cap element és menor que max, la llista de resultats ha de ser buida.")
    }
}