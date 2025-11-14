
package modelo;


public class Usuario {
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;
    private String horario;
    private String sexo;
    private String entrenadorAsignado;

    public Usuario(String dni, String nombre, String apellido, String celular, String horario, String sexo, String entrenadorAsignado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.horario = horario;
        this.sexo = sexo;
        this.entrenadorAsignado = entrenadorAsignado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEntrenadorAsignado() {
        return entrenadorAsignado;
    }

    public void setEntrenadorAsignado(String entrenadorAsignado) {
        this.entrenadorAsignado = entrenadorAsignado;
    }
    
    
}
