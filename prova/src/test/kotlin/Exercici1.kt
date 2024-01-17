import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.security.InvalidParameterException

class Exercici1 {
    @Test
    fun `Donat un alumne amb 17 anys ha de retornar False`() {
        val edat = 17
        val result = comprobarMajorEdat(edat)
        assertFalse(result, "El resultat ha de retornar false per a menors de 18 anys")
    }

    @Test
    fun `Donat un alumne amb 17 anys ha de retornar True`() {
        val edat = 18
        val result = comprobarMajorEdat(edat)
        assertTrue(result, "El resultat ha de retornar true per als que tenen exactament 18 anys")
    }

    @Test
    fun `Donat un alumne major de 18 anys ha de retornar True`() {
        val edat = 19
        val result = comprobarMajorEdat(edat)
        assertTrue(result, "El resultat ha de retornar true per a majors de 18 anys")
    }

    @Test
    fun `Donat un alumne amb edat negativa ens ha de sortir InvalidParameterException`() {
        val edat = -1
        val ex = assertThrows<InvalidParameterException> {
            comprobarMajorEdat(edat)
        }
        assertEquals("L'edat no pot ser negativa", ex.message)
    }

    @Test
    fun `Donat un alumne amb edat 0 ens ha de sortir InvalidParameterException`() {
        val edat = 0
        val ex = assertThrows<InvalidParameterException> {
            comprobarMajorEdat(edat)
        }
        assertEquals("L'edat no pot ser negativa", ex.message)
    }
}