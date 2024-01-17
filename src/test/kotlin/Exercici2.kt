import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Exercici2 {


    @Test
    fun `Comprobar llargada de la llista`() {
        val max = 100
        val expectedSize = max / 3
        val llista = multipleDeTres(max)
        assertEquals(expectedSize, llista.size, "La llista ha de contenir $expectedSize elements")
    }

    @Test
    fun `Comprobar que tots els elements de la llista generada son multiples de 3`() {
        val max = 100
        val llista = multipleDeTres(max)
        for (i in llista) {
            assertTrue(i % 3 == 0, "Tots els elements han de ser múltiples de tres")
        }
    }

    @Test
    fun `El primer element de la llista ha de ser un 3`() {
        val max = 100
        val llista = multipleDeTres(max)
        assertEquals(3, llista.first(), "El primer element de la llista, $llista[0], ha de ser 3")
        assertTrue(
            llista.last() <= max && llista.last() % 3 == 0,
            "L'últim element de la llista, $llista[${llista.size - 1}], ha de ser $max o menys i hauria d'estar dividit per 3 sense residu"
        )
    }
}