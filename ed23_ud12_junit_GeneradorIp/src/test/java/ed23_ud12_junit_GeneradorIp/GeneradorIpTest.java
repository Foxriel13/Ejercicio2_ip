package ed23_ud12_junit_GeneradorIp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit.GeneradorIp;

public class GeneradorIpTest {
    
    @Test
    public void testGenerarNumero() {
        GeneradorIp generador = new GeneradorIp();
        for (int i = 0; i < 1000; i++) {
            int numeroGenerado = generador.generarNumero(0, 254);
            assertTrue(numeroGenerado >= 0 && numeroGenerado <= 254);
        }
    }
    
    @Test
    public void testGeneraIp() {
        GeneradorIp generador = new GeneradorIp();
        for (int i = 0; i < 1000; i++) {
            String ipGenerada = generador.generarIp();
            String[] puesto = ipGenerada.split("\\."); // Separar la dirección IP en octetos
            for (String octeto : puesto) {
                int numero = Integer.parseInt(octeto);
                assertTrue(numero >= 0 && numero <= 255); // Verificar que el número esté en el rango válido
            }
            assertFalse(ipGenerada.startsWith("0"));
            assertFalse(ipGenerada.endsWith(".0"));
        }
    }
}

