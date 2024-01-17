import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class Exercici3 {


    @Test
    fun calcularSumaTest() {
        assertEquals(0, calcularSuma(emptyList()), "La suma d'una llista buida ha de ser 0")
        assertEquals(5, calcularSuma(listOf(5)), "La suma d'una llista amb un sol element ha de ser l'element mateix")
        assertEquals(15, calcularSuma(listOf(1, 2, 3, 4, 5)), "La suma d'una llista de números ha de ser correcta")
        assertEquals(
            -15,
            calcularSuma(listOf(-1, -2, -3, -4, -5)),
            "La suma d'una llista de números negatius ha de ser correcta"
        )
    }

    @Test
    fun calcularMitjanaTest() {
        assertThrows<ArithmeticException> { calcularMitjana(emptyList()) }
        assertEquals(
            5.0,
            calcularMitjana(listOf(5)),
            "La mitjana d'una llista amb un sol element ha de ser el mateix element"
        )
        assertEquals(
            3.0,
            calcularMitjana(listOf(1, 2, 3, 4, 5)),
            "La mitjana d'una llista de nombres ha de ser correcta"
        )
        assertEquals(
            -3.0,
            calcularMitjana(listOf(-1, -2, -3, -4, -5)),
            "La mitjana d'una llista de nombres negatius ha de ser correcta"
        )
    }
}