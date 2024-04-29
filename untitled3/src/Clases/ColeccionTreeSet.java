package Clases;

import interfaces.ColeccionInterfaz;
import java.util.Iterator;

import java.util.TreeSet;

public class ColeccionTreeSet implements ColeccionInterfaz {
        private TreeSet <Persona> treeSet;

        public ColeccionTreeSet()

             {
                 treeSet = new TreeSet<>();
             }

    @Override
    public void agregar(Persona p) {
        System.out.println( treeSet.add(p));
    }

    @Override
    public void eliminar(Persona p) {
    treeSet.remove(p);
    }

    @Override
    public boolean buscar(Persona p) {
        return treeSet.contains(p);
    }

    @Override
    public String listar() {
            String rta="";
        Iterator it=treeSet.iterator();
        while(it.hasNext())
        {
            rta+=it.next().toString();
        }
        return rta;
    }

    @Override
    public int contar() {
        return treeSet.size();
    }
}
