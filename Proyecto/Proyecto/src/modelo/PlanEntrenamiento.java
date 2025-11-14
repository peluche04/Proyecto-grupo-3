package modelo;

public class PlanEntrenamiento {
    private String codigoPlan;
    private Usuario deportista;
    private RegistroEntrenadores entrenador;
    private String ejercicios;
    private int duracionSemanas;
    private String nivelIntensidad;

    public PlanEntrenamiento(String codigoPlan, Usuario deportista, RegistroEntrenadores entrenador, String ejercicios, int duracionSemanas, String nivelIntensidad) {
        this.codigoPlan = codigoPlan;
        this.deportista = deportista;
        this.entrenador = entrenador;
        this.ejercicios = ejercicios;
        this.duracionSemanas = duracionSemanas;
        this.nivelIntensidad = nivelIntensidad;
    }

    public void asignarDeportista(Usuario d) { this.deportista = d; }
    public void asignarEntrenador(RegistroEntrenadores e) { this.entrenador = e; }
    public void crearPlan() { /* lógica */ }
    public void modificarPlan() { /* lógica */ }

    // Getters y setters
    public String getCodigoPlan() { return codigoPlan; }
    public void setCodigoPlan(String codigoPlan) { this.codigoPlan = codigoPlan; }

    public Usuario getDeportista() { return deportista; }
    public RegistroEntrenadores getEntrenador() { return entrenador; }

    public String getEjercicios() { return ejercicios; }
    public void setEjercicios(String ejercicios) { this.ejercicios = ejercicios; }

    public int getDuracionSemanas() { return duracionSemanas; }
    public void setDuracionSemanas(int duracionSemanas) { this.duracionSemanas = duracionSemanas; }

    public String getNivelIntensidad() { return nivelIntensidad; }
    public void setNivelIntensidad(String nivelIntensidad) { this.nivelIntensidad = nivelIntensidad; }
}
