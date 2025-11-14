package modelo;

public class RegistroEntrenadores extends Persona {
    private String especialidad;
    private int anosExperiencia;
    private String certificaciones;

    public RegistroEntrenadores(String nombre, String apellidos, String dni, String correo, String telefono, int edad,
                                String sexo, String codigo, String especialidad, int anosExperiencia, String certificaciones) {
        super(nombre, apellidos, dni, correo, telefono, edad, sexo, codigo);
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
        this.certificaciones = certificaciones;
    }

    // Getters y setters
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anosExperiencia) { this.anosExperiencia = anosExperiencia; }

    public String getCertificaciones() { return certificaciones; }
    public void setCertificaciones(String certificaciones) { this.certificaciones = certificaciones; }
}
