import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class Exercici4 {

    @Test
    fun `Comprobar una llista buida`() {
        val nums = emptyList<Int>()
        val result = transformarNumeros(nums)
        assertTrue(
            result.isEmpty(),
            "La llista transformada ha de continuar estant buida si la llista original és buida."
        )
    }

    @Test
    fun `Tots els elements son parells`() {
        val nums = listOf(2, 4, 6, 8)
        val expected = listOf(4, 8, 12, 16)
        val result = transformarNumeros(nums)
        assertEquals(expected, result, "Tots els nombres parells haurien de duplicar-se.")
    }

    @Test
    fun `Tots els elements son senars`() {
        val nums = listOf(1, 3, 5, 7)
        val expected = listOf(3, 9, 15, 21)
        val result = transformarNumeros(nums)
        assertEquals(expected, result, "Tots els nombres senars haurien de triplicar-se.")
    }

    @Test
    fun `Elements combinats`() {
        val nums = listOf(1, 2, 3, 4, 5, 6)
        val expected = listOf(3, 4, 9, 8, 15, 12)
        val result = transformarNumeros(nums)
        assertEquals(
            expected,
            result,
            "Els nombres parells s'haurien de duplicar i els números senars s'haurien de triplicar."
        )
    }
}