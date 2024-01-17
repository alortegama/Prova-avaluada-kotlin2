import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class Exercici6 {

    @Test
    fun `Comprobar un String buit`() {
        val s = ""
        val result = convertirParaula(s)
        assertTrue(result.isEmpty(), "La cadena resultant ha de ser buida si la cadena original és buida")
    }

    @Test
    fun `Comprobar la paraula hola`() {
        val s = "hola"
        val result = convertirParaula(s)
        assertEquals(s.length, result.size, "La cadena resultant ha de tenir la mateixa longitud que la cadena original")
        assertTrue(result.all { it == '_' }, "Tots els caràcters alfabètics de la cadena resultant han de ser '_' ")
    }

    @Test
    fun `Comprobar la paraula hola!`() {
        val s = "hola!"
        val result = convertirParaula(s)
        assertEquals(s.length, result.size, "La cadena resultant ha de tenir la mateixa longitud que la cadena original")
        assertEquals("____!", String(result), "La cadena resultant ha de transformar els caràcters alfabètics en '_' i mantenir els caràcters no alfabètics")
    }

    @Test
    fun `Comprobar un text amb espais`() {
        val s = "hola mon"
        val result = convertirParaula(s)
        assertEquals(s.length, result.size, "La cadena resultant ha de tenir la mateixa longitud que la cadena original")
        assertEquals("____ ___", String(result), "La cadena resultant ha de transformar les lletres en '_' i mantenir els espais")
    }
}