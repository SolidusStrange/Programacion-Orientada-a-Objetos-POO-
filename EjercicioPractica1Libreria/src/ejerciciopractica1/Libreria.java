package ejerciciopractica1;
import java.util.ArrayList;

public class Libreria {
    // Usaremos como controlador donde almacenaremos los clientes registrados, recursos (libros, revistas, comics) y las ventas realizadas
    // Atributos
    // Usaremos metodos .add(), .get(), size(), isEmpty()
    private ArrayList<Cliente> clientes;
    private ArrayList<Recurso> recursos;
    private ArrayList<Venta> ventas;
    
    // Usamos arraylist porque permite agregar elementos de forma dinamica
    // Es mas flexible si quieres pasar colecciones predefinidas    
    
    
    // No usaremos esta version:
    /*public Liberia(ArrayList<Cliente> clientes, ArrayList<Recurso> recursos, ArrayList<Venta> ventas) {
        this.clientes = clientes;
        this.recursos = recursos;
        this.ventas = ventas;
    }
    porque es mas trabajo si empezamos de cero, porque cada vez que creemos una libreria tendriamos que crear listas new
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Recurso> recursos = new ArrayList<>();
    ArrayList<Venta> ventas = new ArrayList<>();
    Libreria libreria = new Libreria(clientes, recursos, ventas);
    */
    
    // Por lo que usaremos realmente la version sin parametros porque permite autopreparar
    public Libreria(){
        clientes = new ArrayList<>();
        recursos = new ArrayList<>();
        ventas = new ArrayList<>();
    }
    
    // Registrar cliente
    public void registrarCliente(Cliente cliente){
        if (cliente != null) {
            clientes.add(cliente);
            System.out.println("Cliente registrado correctamente.");
        }
    }
    
    // Registrar recurso
    public void registrarRecurso(Recurso recurso){
        if (recurso != null){
            recursos.add(recurso);
            System.out.println("Recurso agregado correctamente.");
        }
    }
    
    // Buscar recurso por titulo
    public void buscarRecursoPorTitulo(String titulo){
        boolean encontrado = false;
        for (Recurso r: recursos){
            if (r.getTitulo().equalsIgnoreCase(titulo)){
                r.mostrarInformacion();
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Recurso no encontrado");
        }
    }
    
    // Registrar venta
    public void registrarVenta(Venta venta){
        if (venta != null){
            ventas.add(venta);
            System.out.println("Venta registrada con éxito.");
        }
    }
    
    public Cliente buscarClientePorRut(String rut){
        for (Cliente c: clientes){
            if (c.getRut().equalsIgnoreCase(rut)){
               return c; // devuelve el cliente encontrado
            } 
        }
        return null; //Si no lo encuentra
    }
    
    // Crear metodo para emitir boleta
    /*  Pedir el RUT del cliente
        Buscar si ese cliente tiene una venta registrada
        Si la encuentra, muestra toda la informacion
            Datos de cliente
            Total de compra
            Descuento aplicado
            Total final
        Si no hay ventas para ese cliente, mostrar un mensaje
    */
    
    public void emitirBoleta(String rutCliente){
        boolean encontrado = false;
        for(Venta v: ventas) {
            if(v.getCliente().getRut().equalsIgnoreCase(rutCliente)){
                System.out.println("-----Boleta------");
                System.out.println("Cliente: " + v.getCliente().getNombre() + " " + v.getCliente().getApellidoPaterno());
                System.out.println("Alias: " + v.getCliente().getAlias());
                System.out.println("Correo: " + v.getCliente().getCorreo());
                System.out.println("------------------");
                System.out.println("Total compra: $" + v.getTotal());
                System.out.println("Descuento: " + v.getDescuento());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron ventas para el cliente con RUT: " + rutCliente);
        }
    }
            
    
}
    
   
