package modelo;

import java.util.ArrayList;

public class MantenimientoUsuario {
    private ArrayList<Usuario> listaUsuarios;

    public MantenimientoUsuario() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u) {
        listaUsuarios.add(u);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public Usuario obtenerUsuario(String dni) {
        for (Usuario u : listaUsuarios) {
            if (u.getDni().equals(dni)) return u;
        }
        return null;
    }

    public void actualizarUsuario(String dni, Usuario actualizado) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getDni().equals(dni)) {
                listaUsuarios.set(i, actualizado);
                break;
            }
        }
    }

    public void eliminarUsuario(String dni) {
        listaUsuarios.removeIf(u -> u.getDni().equals(dni));
    }
}