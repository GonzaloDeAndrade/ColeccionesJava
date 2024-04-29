import Clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona personita = new Persona("gonza", 30, 3030);
        Persona personita2 = new Persona("lukitas", 30, 1341);
        Persona personita3 = new Persona("nico", 50, 3413);
        ColeccionArrayList coleccArr = new ColeccionArrayList();
        ColeccionHashMap mapa = new ColeccionHashMap();
        ColeccionTreeSet treeS= new ColeccionTreeSet();
        ColeccionLinkedList list=new ColeccionLinkedList();
        //arrayList
        /*coleccArr.agregar(personita);
        coleccArr.agregar(personita2);
        coleccArr.agregar(personita3);
        System.out.println(coleccArr.listar());
        coleccArr.eliminar(personita2);
        System.out.println(coleccArr.listar());*/
        //Mapa
        /*mapa.agregar(2,personita);
        mapa.agregar(3,personita2);
        mapa.agregar(4,personita3);
        //mapa.agregar(4,personita);
        System.out.println(mapa.buscar(4));
        //System.out.println((mapa.listar()));
        System.out.println(mapa.contar());
        System.out.println(mapa.claves());
        */
        //TreeSet
       /*treeS.agregar(personita2);
        treeS.agregar(personita);
        treeS.agregar(personita3);
        System.out.println(treeS.listar());
        */
        //LinkedList
        list.agregar(personita2);
        list.agregar(personita3);
        list.agregar(personita);

        System.out.println(list.getPrimero());
        System.out.println(list.getUltimo());

        }
    }

