
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

/**
 *
 * @author Debian10
 */
public class VentasTest {
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Camisa", 50.32);
        Producto producto2 = new Producto("Pantalon", 100.50);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
