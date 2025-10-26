
package ejerciciopractica1;
public class Cliente implements Mostrable{
    // Atributos (encapsulados)
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String alias;
    private String correo;
    private String password;
    
    // Constructor (para acceder a los datos)

    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String alias, String correo, String password) {
        if (rut.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || alias.isEmpty() || correo.isEmpty() || password.isEmpty()){
            throw new IllegalArgumentException("Ningun campo puede estar vacio");
        }
            
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.alias = alias;
        this.correo = correo;
        this.password = generarPassword();
    }
    
    // Getters y Setters (encapsulación)
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

    public String getApellidoMaterno() { return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }

    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getPassword() { return password; }
    
    // Metodo para generar contraseña automaticametne
    private String generarPassword(){
        String parte1 = nombre.substring(0,2);
        String parte2 = apellidoPaterno.substring(apellidoPaterno.length()-1);
        String parte3 = apellidoMaterno.substring(apellidoMaterno.length()-1);
        String parte4 = rut.substring(0,5);
        return parte1 + parte2 + parte3 + parte4;
    }
    
    // Implementación del metodo interfaz
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Cliente: " + nombre + apellidoPaterno + " (" + alias + ")");
        System.out.println("Correo: " + correo);
        System.out.println("RUT: " + rut);
        System.out.println("Password" + password);
        System.out.println("----------------------------------");
    }
}

