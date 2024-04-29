package Clases;

import interfaces.ColeccionInterfaz;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ColeccionHashSet implements ColeccionInterfaz{

    private HashSet<Persona>hashSet;

    public ColeccionHashSet()
    {
        hashSet=new HashSet<>();
    }

    @Override
    public void agregar(Persona persona) {
        hashSet.add(persona);
    }

    @Override
    public void eliminar(Persona persona) {
        hashSet.remove(persona);
    }

    @Override
    public boolean buscar(Persona persona) {
        return hashSet.contains(persona);
    }

    @Override
    public String listar() {
        String rta="";
        Iterator it=hashSet.iterator();
        while(it.hasNext())
        {
            rta+=it.next().toString();
        }
        return rta;
    }

    @Override
    public int contar() {
        return 0;
    }
}
