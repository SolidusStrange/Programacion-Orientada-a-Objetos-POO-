
package ejerciciopractica1;
public class Venta {
    private Cliente cliente; // El cliente que realiza la compra
    private double total; // El total de la compra
    private double  descuento; // Descuento aplicado

    public Venta(Cliente cliente, double total, double descuento) {
        this.cliente = cliente;
        this.total = total;
        this.descuento = descuento; // Sin productos 0 por ahora
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    // Metodo emitir boleta que muestra nombre del cliente, total compra y descuento si es que aplica o no
    public void emitirBoleta(){
        System.out.println("----- Boleta -----");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellidoPaterno());
        if (descuento > 0){
            System.out.println("Descuento aplicado: " + descuento + "%");
        }else{
            System.out.println("Sin descuento");
        }
    }
    
    
    
    
    
    
}
