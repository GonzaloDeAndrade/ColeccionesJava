package interfaces;

import Clases.Persona;

public interface ColeccionInterfaz {

    void agregar(Persona p);
    void eliminar(Persona p);
    boolean buscar(Persona p);

    String listar();

    int contar();


}