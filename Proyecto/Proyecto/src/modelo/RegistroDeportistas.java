package modelo;

public class RegistroDeportistas extends Persona {
    private String nivel;
    private String disciplina;
    private String historialLesiones;

    public RegistroDeportistas(String nombre, String apellidos, String dni, String correo, String telefono, int edad, String sexo, String codigo,
                               String nivel, String disciplina, String historialLesiones) {
        super(nombre, apellidos, dni, correo, telefono, edad, sexo, codigo);
        this.nivel = nivel;
        this.disciplina = disciplina;
        this.historialLesiones = historialLesiones;
    }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public String getHistorialLesiones() { return historialLesiones; }
    public void setHistorialLesiones(String historialLesiones) { this.historialLesiones = historialLesiones; }
}
