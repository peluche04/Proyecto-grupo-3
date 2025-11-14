package modelo;

import java.util.ArrayList;

public class MantenimientoDeportistas {
    private ArrayList<RegistroDeportistas> listaRegistroDeportista;

    public MantenimientoDeportistas() {
        listaRegistroDeportista = new ArrayList<>();
    }

    public void agregarDeportista(RegistroDeportistas d) {
        listaRegistroDeportista.add(d);
    }

    public ArrayList<RegistroDeportistas> getListaRegistroDeportistas() {
        return listaRegistroDeportista;
    }

    public RegistroDeportistas obtenerDeportista(String codigo) {
        for (RegistroDeportistas d : listaRegistroDeportista) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    public void actualizarDeportista(String codigo, RegistroDeportistas actualizado) {
        for (int i = 0; i < listaRegistroDeportista.size(); i++) {
            if (listaRegistroDeportista.get(i).getCodigo().equals(codigo)) {
                listaRegistroDeportista.set(i, actualizado);
                break;
            }
        }
    }

    public void eliminarDeportista(String codigo) {
        listaRegistroDeportista.removeIf(d -> d.getCodigo().equals(codigo));
    }
}

