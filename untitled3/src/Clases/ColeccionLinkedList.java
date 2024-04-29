package Clases;

import interfaces.ColeccionInterfaz;

import java.util.LinkedList;

public class ColeccionLinkedList implements ColeccionInterfaz {


    private LinkedList<Persona> list;

    public  ColeccionLinkedList()
    {
    list=new LinkedList<>();

    }
    public void agregar(Persona obj) {
        list.add(obj);
    }

    @Override
    public void eliminar(Persona obj) {
        list.remove(obj);
    }

    @Override
    public boolean buscar(Persona obj) {
        return list.contains(obj);
    }

    @Override
    public String listar() {
        String rta="";
        for(Object e: list)
        {
            rta+=e.toString();
        }
        return rta;
    }

    @Override
    public int contar() {
        return list.size();
    }

    public Persona getPrimero()
    {
        return list.getFirst();
    }
    public Persona getUltimo()
    {
        return list.getLast();
    }
}
