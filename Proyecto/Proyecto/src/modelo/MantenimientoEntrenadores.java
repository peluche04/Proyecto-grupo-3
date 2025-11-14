package modelo;

import java.util.ArrayList;

public class MantenimientoEntrenadores {
    private ArrayList<RegistroEntrenadores> listaRegistroEntrenador;

    public MantenimientoEntrenadores() {
        listaRegistroEntrenador = new ArrayList<>();
    }

    public void agregarEntrenador(RegistroEntrenadores e) {
        listaRegistroEntrenador.add(e);
    }

    public ArrayList<RegistroEntrenadores> getListaRegistroEntrenadores() {
        return listaRegistroEntrenador;
    }

    public RegistroEntrenadores obtenerEntrenador(String codigo) {
        for (RegistroEntrenadores e : listaRegistroEntrenador) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public void actualizarEntrenador(String codigo, RegistroEntrenadores actualizado) {
        for (int i = 0; i < listaRegistroEntrenador.size(); i++) {
            if (listaRegistroEntrenador.get(i).getCodigo().equals(codigo)) {
                listaRegistroEntrenador.set(i, actualizado);
                break;
            }
        }
    }

    public void eliminarEntrenador(String codigo) {
        listaRegistroEntrenador.removeIf(e -> e.getCodigo().equals(codigo));
    }
}
