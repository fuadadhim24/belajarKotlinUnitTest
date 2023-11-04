import org.junit.jupiter.api.Test  // Mengimpor modul tes JUnit
import org.junit.jupiter.api.Assertions.*  // Mengimpor asersi dari JUnit

class CalculatorTest {  // Kelas yang digunakan untuk menguji Calculator
    @Test
    fun `Test calculator can subtract two numbers`() {  // Fungsi pengujian untuk menguji pengurangan dua angka menggunakan kalkulator
        val calculator = Calculator()  // Membuat objek Calculator
        assertEquals(5, calculator.sub(15, 10))  // Memeriksa apakah hasil pengurangan 15 dan 10 adalah 5
    }
}
