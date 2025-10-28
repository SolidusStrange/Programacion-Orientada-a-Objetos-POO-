package videoteca;

public class Usuario implements Mostrable{
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String correo;
    private String alias;
    private String password;

    public Usuario(String rut, String nombre, String apellidoPaterno, String correo, String alias, String password) {
        if (rut.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty() || correo.isEmpty() || alias.isEmpty() || password.isEmpty()){
            throw new IllegalArgumentException("No pueden estar vacios");
        }
            
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.correo = correo;
        this.alias = alias;
        this.password = generarPassword();
    }

    
    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getCorreo() {
        return correo;
    }
    public String getAlias() {
        return alias;
    }
    public String getPassword() {
        return password;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    private String generarPassword(){
        String parte1 = nombre.substring(0,2);
        String parte2 = apellidoPaterno.substring(apellidoPaterno.length()-1);
        String parte3 = rut.substring(0, 5);
        return parte1 + parte2 + parte3;
    }

    // Metodo sobreescrito de interface
    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario: "+ nombre + " " + apellidoPaterno + " (" + alias + ")");
        System.out.println("Correo: " + correo);
        System.out.println("Rut: " + rut);
        System.out.println("Password: " + password);
        System.out.println("------------------------");
    }
    
    
}
