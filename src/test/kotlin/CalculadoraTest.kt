import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    @Test
    fun somaTest() {
        assertEquals(3.0, Calculadora.soma(1.0, 2.0))
    }

    @Test
    fun subtracaoTest() {
        assertEquals(3.0, Calculadora.sub(4.0, 1.0))
    }

    @Test
    fun divisaoTest() {
        assertEquals(2.0, Calculadora.div(4.0, 2.0))
    }

    @Test
    fun multiplicacaoTest() {
        assertEquals(4.0, Calculadora.mult(4.0, 1.0))
    }
}