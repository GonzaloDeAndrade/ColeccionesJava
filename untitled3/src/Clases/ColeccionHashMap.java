package Clases;
import java.util.Iterator;
import interfaces.ColeccionInterfaz;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ColeccionHashMap  {

    private Map<Integer,Object>mapa;

    public ColeccionHashMap()
    {
        mapa=new HashMap<>();
    }


    public void agregar(int key,Object obj) {
        mapa.put(key,obj);
    }


    public void eliminar(int key) {
        mapa.remove(key);
    }


    public Object buscar(int id) {
        return mapa.get(id);
    }


    public String listar() {
        String rta="";
        Iterator it=mapa.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry me=(Map.Entry) it.next();
            rta+=me.getKey()+"-"+me.getValue();
        }

        return rta;
    }
    public String claves()
    {
        return mapa.keySet().toString();
    }

    public int contar() {
        return mapa.size();
    }
}
