package Clases;
import interfaces.ColeccionInterfaz;

import java.util.ArrayList;


public class ColeccionArrayList implements ColeccionInterfaz {


    private ArrayList<Persona> arreglo;

    public ColeccionArrayList() {
        arreglo = new ArrayList<>();
    }

    @Override
    public void agregar(Persona persona) {
        arreglo.add(persona);

    }

    @Override
    public void eliminar(Persona obj) {
        arreglo.remove(obj);

    }

    @Override
    public boolean buscar(Persona obj) {
       return arreglo.contains(obj);
    }

    @Override
    public String listar() {
        String rta="";
        for(Persona e: arreglo)
        {

            rta+=e.toString();
        }
        return rta;
    }

    @Override
    public int contar() {
        return arreglo.size();
    }
}
