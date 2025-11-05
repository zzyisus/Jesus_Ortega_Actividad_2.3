import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    public void testAgregarStock() {
        Producto p = new Producto("Manzanas", 10);
        p.agregarStock(5);
        assertEquals(15, p.getStock(), "El stock debería ser 15 después de agregar 5.");
    }

    @Test
    public void testRestarStockCorrecto() {
        Producto p = new Producto("Peras", 10);
        boolean resultado = p.restarStock(4);
        assertTrue(resultado, "Debe permitir restar si hay stock suficiente.");
        assertEquals(6, p.getStock(), "El stock debería ser 6 después de restar 4.");
    }

    @Test
    public void testRestarStockInsuficiente() {
        Producto p = new Producto("Naranjas", 5);
        boolean resultado = p.restarStock(8);
        assertFalse(resultado, "No debe permitir restar más de lo disponible.");
        assertEquals(5, p.getStock(), "El stock debería permanecer igual.");
    }
}
